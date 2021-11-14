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

import dao.impl.UserDAOImpl;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ROG STRIX
 */
public class CustomerEditController extends HttpServlet {

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
            out.println("<title>Servlet CustomerEditController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CustomerEditController at " + request.getContextPath() + "</h1>");
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
        UserDAOImpl userDAO = new UserDAOImpl();
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            // get all User detail by ID from database
            User user = userDAO.getUserDetailImg(id);
            request.setAttribute("data", user);
            request.getRequestDispatcher("customeredit.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(CustomerEditController.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            String first_name = request.getParameter("firstName").trim();
            String last_name = request.getParameter("lastName").trim();
            int user_id = Integer.parseInt(request.getParameter("userID").trim());
            String phone = request.getParameter("phone").trim();
            String email = request.getParameter("email").trim();
            String date1 = request.getParameter("dob");
            String old_pattern = "yyyy-MM-dd";
            String new_pattern = "MM-dd-yyyy";
            SimpleDateFormat oldSDF = new SimpleDateFormat(old_pattern);
            SimpleDateFormat newSDF = new SimpleDateFormat(new_pattern);
            Date date = oldSDF.parse(date1);
            String dob = newSDF.format(date);
            String address = request.getParameter("address").trim();
            UserDAOImpl userDAO = new UserDAOImpl();
            userDAO.editUserByID(user_id, first_name, last_name, address, email, phone, dob);                                  
            response.sendRedirect("customerdetail?id=" + user_id);
        } catch (ParseException ex) {
            Logger.getLogger(CustomerEditController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
