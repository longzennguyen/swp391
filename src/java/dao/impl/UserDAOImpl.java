/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-21    1.0        DucNT           First Version<br>
 */
package dao.impl;

import controller.LoginController;
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
        DBContext_Postgresql db = new DBContext_Postgresql();
        String sql = "SELECT COUNT(users_id) as number FROM [Users] ";
        try {
            conn = db.getConnection();
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

    /**
     * create new usser
     *
     * @param uid
     * @param pwd
     */
    @Override
    public User getUserByEmailAndPwd(String uid, String pwd) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs;
        String sql = "select * from Users where email='" + uid + "' and password='" + pwd + "'";
        System.out.println("SQL get user: " + sql);
        User user = new User();
        DBContext_Postgresql db = new DBContext_Postgresql();
        try {
            con = db.getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            if (!rs.next()) {
                System.out.println("Khong tim thay tk111");
                return null;
            } else {
                System.out.println("Prepare get object");

                rs = st.executeQuery();
                while (rs.next()) {
                    System.out.println("Name of User: " + rs.getString("first_name") + " roleid: " + rs.getString("role_id"));
                    user.setUser_id(rs.getInt("users_id"));
                    user.setName(rs.getString("first_name") + " " + rs.getString("last_name"));
                    user.setRole_id(rs.getInt("role_id"));
                    user.setAddress(rs.getString("address"));
//                    request.setAttribute("user", user);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi");
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return user;
    }

    @Override
    public boolean checkUserExisted(String email) {
        String sql = "select * from users where email = '" + email + "'";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs;
        DBContext_Postgresql db = new DBContext_Postgresql();
        try {
            con = db.getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            if (!rs.next()) {
                return true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Not found user");
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    @Override
    public void registerAccount(int user_id, String fname, String lname, String phone, String email, String address, String dob, int role_id, int status_id, int gender, String password) throws Exception {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs;
        DBContext_Postgresql db = new DBContext_Postgresql();
        try {
            con = db.getConnection();
            st = con.prepareStatement("select max(users_id) from users");
            rs = st.executeQuery();
            int maxID = 0;
            if (rs.next()) {
                maxID = rs.getInt("max") + 1;
            } else {
                maxID = 0;
            }
            System.out.println("new ID : " + maxID);
            String sql = "INSERT INTO Users(Users_id, first_name, last_name, gender, email, phone, address,\n"
                    + "				 created_at, role_id,password,status_id,dob)\n"
                    + "	VALUES(" + maxID + ", '" + fname + "','" + lname + "','" + gender + "','" + email + "','" + phone + "','" + address + "','" + dob + "',1,'" + password + "',1,'" + dob + "')";
            System.out.println("sql: " + sql);
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            System.out.println("Insert success");
            con.close();
        } catch (Exception e) {
            System.out.println("Not found user or error to insert");
        }
    }

    /**
     * process reset password by email
     *
     * @param email
     * @param password
     */
    @Override
    public void updatePassword(String email, String password) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs;
        DBContext_Postgresql db = new DBContext_Postgresql();
        String sql = "update users set password ='" + password + "' where email = '" + email + "'";
        try {
            con = db.getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            System.out.println("sql: " + sql);
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public User getByEmail(String email) {
        User user = new User();
        String sql = "select * from users where email = '" + email + "'";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs;
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            if (!rs.next()) {
                System.out.println("Khong tim thay tk111");
                return null;
            } else {
                System.out.println("Prepare get object");

                rs = st.executeQuery();
                while (rs.next()) {
                    System.out.println("Name of User: " + rs.getString("first_name") + " roleid: " + rs.getString("role_id"));
                    user.setUser_id(rs.getInt("users_id"));
                    user.setName(rs.getString("first_name") + " " + rs.getString("last_name"));
                    user.setRole_id(rs.getInt("role_id"));
                    user.setAddress(rs.getString("address"));
//                    request.setAttribute("user", user);
                }
            }
            System.out.println("sql: " + sql);
        } catch (Exception e) {
            System.out.println("error : " + e);
            return null;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return user;
    }

}
