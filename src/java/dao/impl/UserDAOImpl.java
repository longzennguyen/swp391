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
 * This class contains method to query select data from the table User join with table Role and Status.<br>
 * There are get all User, get User detail, get all user by word search,
 * Edit user by ID and get number of page for list of user
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
                + "([User] join [Role] on [User].role_id = [Role].role_id "
                + "join StatusData on [User].status_id = StatusData.status_id)"
                + " ORDER BY [user_id] ASC";
        ArrayList<User> users = new ArrayList<>();

        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("user_id");
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
                + "([User] \n"
                + "join [Role] on [User].role_id = [Role].role_id \n"
                + "join StatusData on [User].status_id = StatusData.status_id) \n"
                + "where [User].user_id = ?"
                + " ORDER BY [user_id] ASC";
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
                + "from ([User] \n"
                + "join [Role] on [User].role_id = [Role].role_id \n"
                + "join StatusData on [User].status_id = StatusData.status_id) \n"
                + "where CONCAT( first_name, ' ', last_name) like ? \n"
                + "or [User].phone like ? \n"
                + "or [User].email like ?"
                + " ORDER BY [user_id] ASC";
        ArrayList<User> users = new ArrayList<>();

        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + word + "%");
            ps.setString(2, "%" + word + "%");
            ps.setString(3, "%" + word + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("user_id");
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

        String sql = "update [User]\n"
                + "set [User].role_id = ?, [User].status_id = ?\n"
                + "where [User].user_id = ? ";
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

        String sql = "SELECT COUNT(user_id) as number FROM [User] ";
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
                + "(select tb1.user_id,tb1.first_name,tb1.last_name,tb1.email,tb1.phone,tb1.address,\n"
                + "tb1.gender, tb1.dob,tb1.role_id,tb2.role_name,tb1.status_id,tb3.status_name\n"
                + "from ([User] as tb1\n"
                + "INNER JOIN [Role] as tb2 on tb1.role_id = tb2.role_id \n"
                + "INNER JOIN StatusData as tb3 on tb1.status_id = tb3.status_id) \n"
                + ")\n"
                + "SELECT * FROM (\n"
                + "SELECT ROW_NUMBER()\n"
                + "OVER(ORDER BY user_id) as Number,* \n"
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
                int id = rs.getInt("user_id");
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
}