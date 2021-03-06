/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-28    1.0        DucNT           First Version<br>
 */
package controller;

import dao.impl.BlogDAOImpl;
import dao.impl.ServiceDAOImpl;
import dao.impl.UserDAOImpl;
import entity.Blogs;
import entity.Service;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * processRequest:<br>
 * - Processes requests for both HTTP <code>GET</code> and <code>POST</code>
 * methods <br>
 * doGet <br>
 * - Get top 4 <code>Service</code> from database then display <br>
 * - Get top 4 new <code>Blogs</code> from database then display <br>
 * - Get 5 new <code>User</code> from database then display <br>
 * doPost  <br>
 * - Handles the HTTP <code>POST</code> method  <br>
 *
 * @author DucNT
 */
public class DashboardController extends HttpServlet {
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DashboardController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DashboardController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        try {
            ServiceDAOImpl serviceDAO = new ServiceDAOImpl();
            ArrayList<Service> serviceListTop;
            serviceListTop = serviceDAO.getTopServices();
            
            BlogDAOImpl blogDAO = new BlogDAOImpl();
            ArrayList<Blogs> blogListTop;
            blogListTop = blogDAO.getTopBlogs();
            
            UserDAOImpl userDAO = new UserDAOImpl();
            ArrayList<User> customerList = userDAO.getAllUserPaging(4, 3);
            
            request.setAttribute("serviceListTop", serviceListTop);
            request.setAttribute("blogListTop", blogListTop);
            request.setAttribute("customerList", customerList);
            request.getRequestDispatcher("admin.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
