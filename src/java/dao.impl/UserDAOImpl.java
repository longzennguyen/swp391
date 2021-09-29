/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-21    1.0        DucNT           First Version<br>
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import entity.User;
import java.sql.SQLException;

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
                + "join StatusData on [User].status_id = StatusData.status_id)";
        ArrayList<User> users = new ArrayList<>();

        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("user_id");
                String userName = rs.getString("first_name") + " " + rs.getString("last_name");
                String phone = rs.getString("phone");
                String gender = rs.getString("gender");
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
    public User getUserDetail(int id) throws Exception {
       Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from \n" +
                        "([User] \n" +
                        "join [Role] on [User].role_id = [Role].role_id \n" +
                        "join StatusData on [User].status_id = StatusData.status_id) \n" +
                        "where [User].user_id = ?";
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
                String gender = null;
                if(rs.getString("gender").equals("1")){
                    gender = "Male";
                }
                else{
                    gender = "Female";
                }
                String email = rs.getString("email");
                String address = rs.getString("address");
                String role = rs.getString("role_name");
                String status = rs.getString("status_name");
                user = new User(id, userName, gender, email, phone, address, role, status, dob);
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

    
    
    
    public static void main(String[] args) throws Exception {
        UserDAOImpl dao = new UserDAOImpl();
        User user = dao.getUserDetail(2);        
        System.out.println(user.getName() + ", " + user.getGender() + ", " + user.getRole() + ", " + user.getStatus() + ", " + user.getDob());
    }
}
