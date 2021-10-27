/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.DBContext;
import dao.IBlogDAO;
import entity.Blogs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ROG STRIX
 */
public class BlogDAOImpl extends DBContext implements IBlogDAO {

    @Override
    public ArrayList<Blogs> getListBlog() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from Post";

        ArrayList<Blogs> listBlog = new ArrayList<>();
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Blogs blog = new Blogs();
                blog.setPost_id(rs.getInt("post_id"));
                blog.setCategory_id(rs.getInt("category_id"));
                blog.setCreated_at(rs.getString("created_at"));
                blog.setCreated_by(rs.getInt("created_by"));
                blog.setDescription(rs.getString("description"));
                blog.setImage(getImagePath() + "Blog/" + rs.getString("image"));
                blog.setStatus_id(rs.getInt("status_id"));
                blog.setTitle(rs.getString("title"));
                blog.setUpdated_at(rs.getString("updated_at"));
                listBlog.add(blog);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Errror: " + ex);
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        System.out.println("Size of blog: " + listBlog.get(0).toString());
        return listBlog;
    }

    @Override
    public Blogs getBlogByID(int id) throws Exception{
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from Post where [Post].post_id = ?";
        Blogs blog = new Blogs();
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                blog.setDescription(rs.getString("description"));
                blog.setTitle(rs.getString("title"));
                blog.setDetail(rs.getString("detail"));
                blog.setImage(getImagePath() + "Blog/" + rs.getString("image"));
                blog.setCreated_at(rs.getString("created_at"));
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return blog;
    }

    @Override
    public ArrayList<Blogs> getTopBlogs() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select top 4 * from Post";

        ArrayList<Blogs> listBlog = new ArrayList<>();
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Blogs blog = new Blogs();
                blog.setPost_id(rs.getInt("post_id"));
                blog.setCategory_id(rs.getInt("category_id"));
                blog.setCreated_at(rs.getString("created_at"));
                blog.setCreated_by(rs.getInt("created_by"));
                blog.setDescription(rs.getString("description"));
                blog.setImage(getImagePath() + "Blog/" + rs.getString("image"));
                blog.setStatus_id(rs.getInt("status_id"));
                blog.setTitle(rs.getString("title"));
                blog.setUpdated_at(rs.getString("updated_at"));
                listBlog.add(blog);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Errror: " + ex);
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        System.out.println("Size of blog: " + listBlog.get(0).toString());
        return listBlog;
    }

    @Override
    public ArrayList<Blogs> getBlogsPaging(int pageSize, int pageIndex) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM (SELECT ROW_NUMBER()OVER(ORDER BY post_id) as Number,* "
                + "FROM [Post])as dbNumber where Number between ? and ?";
        ArrayList<Blogs> blogs = new ArrayList<>();

        try {
            int from = pageSize * (pageIndex - 1) + 1;
            int to = pageSize * pageIndex;

            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, from);
            ps.setInt(2, to);
            rs = ps.executeQuery();
            while (rs.next()) {
                Blogs blog = new Blogs();
                blog.setPost_id(rs.getInt("post_id"));
                blog.setCategory_id(rs.getInt("category_id"));
                blog.setCreated_at(rs.getString("created_at"));
                blog.setCreated_by(rs.getInt("created_by"));
                blog.setDescription(rs.getString("description"));
                blog.setImage(getImagePath() + "Blog/" + rs.getString("image"));
                blog.setStatus_id(rs.getInt("status_id"));
                blog.setTitle(rs.getString("title"));
                blog.setUpdated_at(rs.getString("updated_at"));
                blogs.add(blog);
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return blogs;
    }

    
    @Override
    public int getNumberOfPages(int pageSize) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(post_id) as number FROM [Post]";
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

    public static void main(String[] args) {
        BlogDAOImpl dao = new BlogDAOImpl();
        try {
            Blogs blog = dao.getBlogByID(1);
            System.out.println(blog.getDetail());
        } catch (Exception ex) {
            Logger.getLogger(BlogDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
