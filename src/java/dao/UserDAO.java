/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author ROG STRIX
 */
public class UserDAO {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public UserDAO(){

    }

    public List<User> UserList(){        
        List<User> users= new ArrayList<>();
        User user = null;
            try {
                conn = new DBContext().connection;               
                ps = conn.prepareStatement("select * from User");
                rs = ps.executeQuery();
                while(rs.next()){
                    user = new User();
                    user.setUid(rs.getInt("user_id"));
                    user.setName(rs.getString("first_name") + rs.getString("last_name"));
                    user.setPhone(rs.getString("phone"));
                    user.setEmail(rs.getString("email"));
                    user.setAddress(rs.getString("address"));
                    user.setRole_id(rs.getInt("role_id"));
                    user.setStatus(rs.getBoolean("status"));
                    users.add(user);
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            } 
        return users;
    }
}
