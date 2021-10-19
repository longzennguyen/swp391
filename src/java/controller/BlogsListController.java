/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BlogsDAO;
import dao.DBContext_Postgresql;
import entity.Blogs;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author longzennguyen
 */
@WebServlet(name = "BlogsListServlet", urlPatterns = {"/BlogsListServlet"})
public class BlogsListController extends HttpServlet {

    private PreparedStatement st;
    private Connection con;
    private DBContext_Postgresql db = new DBContext_Postgresql();

    /**
     * get list blog
     * @return list Blogs
     */
    public List<Blogs> getListBlog() {
//        String sql = "select * from post";
//        List<Blogs> listBlog = new ArrayList<Blogs>();
//        try {
//            con = db.getConnection();
//            st = con.prepareStatement(sql);
//            ResultSet rs = null;
//            ResultSet rsID = null;
//            String maxID = "select max(post_id) from post";
//            rsID = con.prepareStatement(maxID).executeQuery();
//
//            rs = st.executeQuery();
//            while (rs.next()) {
//                Blogs blog = new Blogs();
//                blog.setPost_id(rs.getInt("post_id"));
//                blog.setCategory_id(rs.getInt("category_id"));
//                blog.setCreated_at(rs.getString("created_at"));
//                blog.setCreated_by(rs.getInt("created_by"));
//                blog.setDescription(rs.getString("description"));
//                blog.setImage(rs.getString("image"));
//                blog.setStatus_id(rs.getInt("status_id"));
//                blog.setTitle(rs.getString("title"));
//                blog.setUpdated_at(rs.getString("updated_at"));
//                listBlog.add(blog);
//            }
//        } catch (Exception ex) {
//            System.out.println("Errror: " + ex);
//        }
//        System.out.println("Size of blog: " + listBlog.get(0).toString());
//        return listBlog;
        BlogsDAO blogsDAO = new BlogsDAO();
        return blogsDAO.getListBlog();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String service = request.getParameter("service");
        System.out.println("Service: " + service);
        if (service == null || service.length() == 0) {
            request.setAttribute("listBlog", getListBlog());
            request.getRequestDispatcher("/BlogList.jsp").forward(request, response);
        } else if (service.equals("detail")) {
            Blogs blog = new Blogs();
            try {
                con = db.getConnection();
                st = con.prepareStatement("select * from post where post_id = " + request.getParameter("blog_id"));
                ResultSet rs = null;
                rs = st.executeQuery();
                while (rs.next()) {
                    blog.setDescription(rs.getString("description"));
                    blog.setTitle(rs.getString("title"));
                }
                request.setAttribute("description", blog.getDescription());
                request.setAttribute("title", blog.getTitle());

                request.getRequestDispatcher("/BlogDetail.jsp").forward(request, response);
                con.close();
            } catch (Exception e) {
                System.out.println("Error Get blog detail: " + e);
            }

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
