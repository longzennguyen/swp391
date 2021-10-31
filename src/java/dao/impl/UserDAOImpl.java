/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-05    1.0        DucNT           First Version<br>
 */
package dao.impl;

import dao.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import entity.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class implements from class interface IUserDAO <br>
 * This class contains method to query select data from the table User join with
 * table Role and Status.<br>
 * There are get all User, get User detail, get all user by word search, Edit
 * user by ID and get number of page for list of user
 *
 * @author DucNT
 */
public class UserDAOImpl extends DBContext implements IUserDAO {

    /**
     * Get all Users in the database
     *
     *
     * @return a list <code>User</code> object
     * @throws Exception
     */
    @Override
    public ArrayList<User> getAllUsers() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from "
                + "([Users] join [Role] on [Users].role_id = [Role].role_id "
                + "join StatusData on [Users].status_id = StatusData.status_id)"
                + " ORDER BY [users_id] ASC";
        ArrayList<User> users = new ArrayList<>();

        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("users_id");
                String userName = rs.getString("first_name") + " " + rs.getString("last_name");
                String phone = rs.getString("phone");
                String gender;
                if (rs.getString("gender").equals("1")) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }
                String email = rs.getString("email");
                String address = rs.getString("address");
                String role = rs.getString("role_name");
                String status = rs.getString("status_name");
                User user = new User(id, userName, gender, email, phone, address, role, status);
                users.add(user);
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return users;
    }

    /**
     * Get User detail by ID in the database
     *
     *
     * @param id
     * @return a <code>User</code>
     * @throws Exception
     */
    @Override
    public User getUserDetailImg(int id) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from \n"
                + "([Users] \n"
                + "join [Role] on [Users].role_id = [Role].role_id \n"
                + "join StatusData on [Users].status_id = StatusData.status_id) \n"
                + "where [Users].users_id = ?"
                + " ORDER BY [users_id] ASC";
        User user = null;

        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                String userName = rs.getString("first_name") + " " + rs.getString("last_name");
                String phone = rs.getString("phone");
                String dob = rs.getString("dob");
                String gender;
                if (rs.getString("gender").equals("1")) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }
                String email = rs.getString("email");
                String address = rs.getString("address");
                String role = rs.getString("role_name");
                String status = rs.getString("status_name");
                //String img = "img/" + rs.getString("avatar");
                String img = getImagePath() + rs.getString("role_avatar");
                user = new User(id, userName, gender, email, phone, address, role, status, dob, img);
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return user;
    }

    /**
     * Get User list by name, email, phone in the database
     *
     *
     * @param word
     * @return a <code>User</code>
     * @throws Exception
     */
    @Override
    public ArrayList<User> getUserListByString(String word) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select *\n"
                + "from ([Users] \n"
                + "join [Role] on [Users].role_id = [Role].role_id \n"
                + "join StatusData on [Users].status_id = StatusData.status_id) \n"
                + "where CONCAT( first_name, ' ', last_name) like ? \n"
                + "or [Users].phone like ? \n"
                + "or [Users].email like ?"
                + " ORDER BY [users_id] ASC";
        ArrayList<User> users = new ArrayList<>();

        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + word + "%");
            ps.setString(2, "%" + word + "%");
            ps.setString(3, "%" + word + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("users_id");
                String userName = rs.getString("first_name") + " " + rs.getString("last_name");
                String phone = rs.getString("phone");
                String gender;
                if (rs.getString("gender").equals("1")) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }
                String email = rs.getString("email");
                String address = rs.getString("address");
                String role = rs.getString("role_name");
                String status = rs.getString("status_name");
                User user = new User(id, userName, gender, email, phone, address, role, status);
                users.add(user);
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return users;
    }

    /**
     * Edit User Role and Status
     *
     *
     * @param id
     * @param role_id
     * @param status_id
     */
    @Override
    public void editUserByID(int id, int role_id, int status_id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "update [Users]\n"
                + "set [Users].role_id = ?, [Users].status_id = ?\n"
                + "where [Users].users_id = ? ";
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, role_id);
            ps.setInt(2, status_id);
            ps.setInt(3, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            try {
                throw e;
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                closePreparedStatement(ps);
                closeConnection(conn);
            } catch (Exception ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * Get number of pages in pagination
     *
     *
     * @param pageSize
     * @return
     * @throws java.lang.Exception
     */
    @Override
    public int getNumberOfPages(int pageSize) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(users_id) as number FROM [Users] ";
        try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            rs = statement.executeQuery();

            while (rs.next()) {
                int number = rs.getInt("number");
                if (number % pageSize == 0) {
                    return number / pageSize;
                } else {
                    return number / pageSize + 1;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        return -1;
    }

    /**
     * Get all User in the database and paging
     *
     * @param pageSize it is an int number.
     * @param pageIndex it is an int number.
     * @return a list <code>User</code> object
     * @throws Exception
     */
    @Override
    public ArrayList<User> getAllUserPaging(int pageSize, int pageIndex) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "with UserbyRole as\n"
                + "(select tb1.users_id,tb1.first_name,tb1.last_name,tb1.email,tb1.phone,tb1.address,\n"
                + "tb1.gender, tb1.dob,tb1.role_id,tb2.role_name,tb1.status_id,tb3.status_name\n"
                + "from ([Users] as tb1\n"
                + "INNER JOIN [Role] as tb2 on tb1.role_id = tb2.role_id \n"
                + "INNER JOIN StatusData as tb3 on tb1.status_id = tb3.status_id) \n"
                + ")\n"
                + "SELECT * FROM (\n"
                + "SELECT ROW_NUMBER()\n"
                + "OVER(ORDER BY users_id) as Number,* \n"
                + "FROM UserbyRole )as dbNumber \n"
                + "where Number between ? and ?";

        ArrayList<User> users = new ArrayList<>();
        try {
            int from = pageSize * (pageIndex - 1) + 1;
            int to = pageSize * pageIndex;

            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, from);
            statement.setInt(2, to);
            rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("users_id");
                String userName = rs.getString("first_name") + " " + rs.getString("last_name");
                String phone = rs.getString("phone");
                String gender;
                if (rs.getString("gender").equals("1")) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }
                String email = rs.getString("email");
                String address = rs.getString("address");
                String role = rs.getString("role_name");
                String status = rs.getString("status_name");
                User user = new User(id, userName, gender, email, phone, address, role, status);
                users.add(user);

            }
            return users;
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
    }

    /**
     * Add new User to database
     *
     * @param user_id
     * @param first_name
     * @param last_name
     * @param phone
     * @param email
     * @param address
     * @param dob
     * @param role_id
     * @param status_id
     * @param gender
     * @throws Exception
     */
    @Override
    public void addNewUser(int user_id, String first_name, String last_name, String phone, String email, String address, String dob, int role_id, int status_id, int gender) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO [dbo].[Users]([users_id],[first_name],[last_name],[gender],[email],[phone],[address],[created_at],[role_id],[status_id],[dob])\n"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, user_id);
            ps.setString(2, first_name);
            ps.setString(3, last_name);
            ps.setInt(4, gender);
            ps.setString(5, email);
            ps.setString(6, phone);
            ps.setString(7, address);
            ps.setInt(9, role_id);
            ps.setInt(10, status_id);
            ps.setString(8, "");
            ps.setString(11, dob);
            ps.executeUpdate();
        } catch (SQLException e) {
            try {
                throw e;
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                closePreparedStatement(ps);
                closeConnection(conn);
            } catch (Exception ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<User> getAllUserPagingbyWord(String word, int pageSize, int pageIndex) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "with UserbyRole as\n"
                + "(select tb1.users_id,tb1.first_name,tb1.last_name,tb1.email,tb1.phone,tb1.[address],tb1.gender,\n"
                + "tb1.dob,tb1.role_id,tb2.role_name,tb1.status_id,tb3.status_name\n"
                + "from (Users as tb1\n"
                + "INNER JOIN [Role] as tb2 on tb1.role_id = tb2.role_id \n"
                + "INNER JOIN StatusData as tb3 on tb1.status_id = tb3.status_id) \n"
                + ")\n"
                + "SELECT * FROM (\n"
                + "SELECT ROW_NUMBER()\n"
                + "OVER(ORDER BY users_id) as Number,* FROM UserbyRole \n"
                + "where \n"
                + "(CONCAT( first_name, ' ', last_name) like ? \n"
                + "or\n"
                + "phone like ? \n"
                + "or email like ? ))as dbNumber "
                + "where Number between ? and ?";
        ArrayList<User> users = new ArrayList<>();
        try {
            int from = pageSize * (pageIndex - 1) + 1;
            int to = pageSize * pageIndex;

            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + word + "%");
            statement.setString(2, "%" + word + "%");
            statement.setString(3, "%" + word + "%");
            statement.setInt(4, from);
            statement.setInt(5, to);
            rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("users_id");
                String userName = rs.getString("first_name") + " " + rs.getString("last_name");
                String phone = rs.getString("phone");
                String gender;
                if (rs.getString("gender").equals("1")) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }
                String email = rs.getString("email");
                String address = rs.getString("address");
                String role = rs.getString("role_name");
                String status = rs.getString("status_name");
                User user = new User(id, userName, gender, email, phone, address, role, status);
                users.add(user);
            }
            return users;
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }

    }

    @Override
    public int getNumberOfPagesSearch(int pageSize, String word) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(users_id) as number from\n"
                + "(Users as tb1\n"
                + "INNER JOIN [Role] as tb2 on tb1.role_id = tb2.role_id \n"
                + "INNER JOIN StatusData as tb3 on tb1.status_id = tb3.status_id) \n"
                + "where \n"
                + "(CONCAT(first_name, ' ', last_name) like ? \n"
                + "or\n"
                + "phone like ? \n"
                + "or email like ?)";
        try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + word + "%");
            statement.setString(2, "%" + word + "%");
            statement.setString(3, "%" + word + "%");
            rs = statement.executeQuery();

            while (rs.next()) {
                int number = rs.getInt("number");
                if (number % pageSize == 0) {
                    return number / pageSize;
                } else {
                    return number / pageSize + 1;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        return -1;
    }

    @Override
    public User getUserByEmailAndPwd(String username, String password) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from Users join [Role] on Users.role_id = [Role].role_id"
                + " where email= ? and password= ?";
        User user = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                int userID = Integer.parseInt(rs.getString("users_id"));
                String userName = rs.getString("first_name") + " " + rs.getString("last_name");
                String phone = rs.getString("phone");
                String dob = rs.getString("dob");
                String gender;
                if (rs.getString("gender").equals("1")) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }
                String email = rs.getString("email");
                String address = rs.getString("address");
                int role = Integer.parseInt(rs.getString("role_id"));
                String img = getImagePath() + rs.getString("role_avatar");
                //int user_id, String name, String gender, String email, String phone, String address, String role, String dob, String img, int role_id, String password
                user = new User(userID, userName, gender, email, phone, address, dob, img, role, password);
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return user;

    }

    @Override
    public boolean checkUserExisted(String email) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from users where email = '" + email + "'";
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            conn = getConnection();
            if (!rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return false;
    }

    @Override
    public void registerAccount(int user_id, String first_name, String last_name, String phone, String email, String address, String dob, int role_id, int status_id, int gender, String password) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "INSERT INTO Users(Users_id, first_name, last_name, gender, email, phone, address,\n"
                + "				 created_at, role_id,password,status_id,dob)\n"
                + "	VALUES(" + user_id + ", '" + first_name + "','" + last_name + "','" + gender + "','" + email + "','" + phone + "','" + address + "','" + dob + "',1,'" + password + "',1,'" + dob + "')";
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            conn = getConnection();

        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
    }

    @Override
    public void updatePassword(String email, String password) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //cai ham nay lam gi a

    }

    @Override
    public User getByEmail(String email) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> getAllCustomerPaging(int pageSize, int pageIndex) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM (SELECT ROW_NUMBER()OVER(ORDER BY users_id) as Number,* \n"
                + "FROM [Users] where [Users].role_id = 5)as dbNumber where Number between ? and ?";
        ArrayList<User> users = new ArrayList<>();
        try {
            int from = pageSize * (pageIndex - 1) + 1;
            int to = pageSize * pageIndex;

            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, from);
            statement.setInt(2, to);
            rs = statement.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUser_id(rs.getInt("users_id"));
                user.setName(rs.getString("first_name") + " " + rs.getString("last_name"));
                user.setPhone(rs.getString("phone"));
                if (rs.getString("gender").equals("1")) {
                    user.setGender("Male");
                } else {
                    user.setGender("Female");
                }
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setRole_id(rs.getInt("role_id"));
                users.add(user);
            }
            return users;
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }

    }

    @Override
    public int getNumberOfPageCustomer(int pageSize) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(users_id) as number FROM [Users] where [Users].role_id = 5";
        try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            rs = statement.executeQuery();
            while (rs.next()) {
                int number = rs.getInt("number");
                if (number % pageSize == 0) {
                    return number / pageSize;
                } else {
                    return number / pageSize + 1;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        return -1;
    }

//    public static void main(String[] args) throws Exception {
//        UserDAOImpl dao = new UserDAOImpl();
//        ArrayList<User> users = dao.getAllCustomerPagingbyWord(3, 1, "an");      
//        for (User user : users) {
//            System.out.println(user.getName());
//        }
//        
//    }

    @Override
    public User getCustomerByID(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfPageCustomerSearch(int pageSize, String word) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(users_id) as number from [Users]\n"
                + "where [Users].role_id = 5 \n"
                + "and (CONCAT( [Users].first_name, ' ', [Users].last_name) like ? \n"
                + "or\n"
                + "[Users].phone like ? \n"
                + "or [Users].email like ?)";
        try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + word + "%");
            statement.setString(2, "%" + word + "%");
            statement.setString(3, "%" + word + "%");
            rs = statement.executeQuery();
            while (rs.next()) {
                int number = rs.getInt("number");
                if (number % pageSize == 0) {
                    return number / pageSize;
                } else {
                    return number / pageSize + 1;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        return -1;
    }

    @Override
    public ArrayList<User> getAllCustomerPagingbyWord(int pageSize, int pageIndex, String word) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM (SELECT ROW_NUMBER()OVER(ORDER BY users_id) as Number,* \n"
                + "FROM [Users] where [Users].role_id = 5 \n"
                + "and (CONCAT( [Users].first_name, ' ', [Users].last_name) like ? \n"
                + "or \n"
                + "[Users].phone like ? \n"
                + "or [Users].email like ? ))\n"
                + "as dbNumber where Number between ? and ?";
        ArrayList<User> users = new ArrayList<>();
        try {
            int from = pageSize * (pageIndex - 1) + 1;
            int to = pageSize * pageIndex;

            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + word + "%");
            statement.setString(2, "%" + word + "%");
            statement.setString(3, "%" + word + "%");
            statement.setInt(4, from);
            statement.setInt(5, to);
            rs = statement.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUser_id(rs.getInt("users_id"));
                user.setName(rs.getString("first_name") + " " + rs.getString("last_name"));
                user.setPhone(rs.getString("phone"));
                if (rs.getString("gender").equals("1")) {
                    user.setGender("Male");
                } else {
                    user.setGender("Female");
                }
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setRole_id(rs.getInt("role_id"));
                users.add(user);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        return users;
    }
}
