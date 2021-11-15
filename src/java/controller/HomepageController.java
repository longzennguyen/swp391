/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-15    1.0        DucNT           First Version<br>
 */
package controller;

import dao.impl.BlogDAOImpl;
import dao.impl.ServiceDAOImpl;
import entity.Blogs;
import entity.Service;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Process:<br>
 * - Get top service in home page<br>
 * - Get top blogs in home page<br>
 * - Get link share<br>
 *
 * @author DucNT
 */
/**
 * doGet:<br>
 * - Get data of <code>User</code> in the database then display in jsp <br>
 * doPost: <br>
 * - Handles the HTTP <code>POST</code> method <br>
 * processRequest: <br>
 * - Get top <code>Service</code> then display in home page<br>
 * - Get top <code>Blog</code> then display in home page<br>
 *
 * @author DucNT
 */
public class HomepageController extends HttpServlet {

    /**
     * Get top 4 <code>Service</code> from database then display to jsp page
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
        try {
            
            ServiceDAOImpl serviceDAO = new ServiceDAOImpl();
            ArrayList<Service> serviceListTop;
            serviceListTop = serviceDAO.getTopServices();
            
            BlogDAOImpl blogDAO = new BlogDAOImpl();
            ArrayList<Blogs> blogListTop;
            blogListTop = blogDAO.getTopBlogs();
            
            request.setAttribute("serviceListTop", serviceListTop);
            request.setAttribute("blogListTop", blogListTop);
            request.getRequestDispatcher("homepage.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(HomepageController.class.getName()).log(Level.SEVERE, null, ex);
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
