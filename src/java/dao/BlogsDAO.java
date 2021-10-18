/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Blogs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author longzennguyen
 */
public class BlogsDAO {
    PreparedStatement st;
    Connection con;
    DBContext_Postgresql db = new DBContext_Postgresql();
    /*
        Get Blog List
    */
    public List<Blogs> getListBlog() {
        String sql = "select * from post";
        List<Blogs> listBlog = new ArrayList<Blogs>();
        try {
            con = db.getConnection();
            st = con.prepareStatement(sql);
            ResultSet rs = null;
            ResultSet rsID = null;
            String maxID = "select max(post_id) from post";
            rsID = con.prepareStatement(maxID).executeQuery();

            rs = st.executeQuery();
            while (rs.next()) {
                Blogs blog = new Blogs();
                blog.setPost_id(rs.getInt("post_id"));
                blog.setCategory_id(rs.getInt("category_id"));
                blog.setCreated_at(rs.getString("created_at"));
                blog.setCreated_by(rs.getInt("created_by"));
                blog.setDescription(rs.getString("description"));
                blog.setImage(rs.getString("image"));
                blog.setStatus_id(rs.getInt("status_id"));
                blog.setTitle(rs.getString("title"));
                blog.setUpdated_at(rs.getString("updated_at"));
                listBlog.add(blog);
            }
        } catch (Exception ex) {
            System.out.println("Errror: " + ex);
        }
        System.out.println("Size of blog: " + listBlog.get(0).toString());
        return listBlog;
    }
}
