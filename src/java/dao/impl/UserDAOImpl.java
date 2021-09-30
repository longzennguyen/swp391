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
 *
 * @author ROG STRIX
 */
public class UserDAOImpl extends DBContext implements IUserDAO {

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

    public static void main(String[] args) throws Exception {
        UserDAOImpl dao = new UserDAOImpl();     
        dao.editUserByID(1, 5, 1);
    }
}
