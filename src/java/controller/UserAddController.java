/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-01    1.0        DucNT           First Version<br>
 */
package controller;

import dao.impl.UserDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * doGet:<br>
 * - Get the form in jsp <br>
 * doPost <br>
 * - Add new user to database <br>
 *
 * @author DucNT
 */
@WebServlet(name = "UserAddController", urlPatterns = {"/useradd"})
public class UserAddController extends HttpServlet {

    /**
     * Handle for this for <code>POST</code> method
     * 
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
            out.println("<title>Servlet UserAddController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserAddController at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("adduser.jsp").forward(request, response);
    }

    /**
     * Get <code>User</code> information then add to database
     * 
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
            String first_name = request.getParameter("first_name");
            String last_name = request.getParameter("last_name");
            int user_id = Integer.parseInt(request.getParameter("user_id"));
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String date1 = request.getParameter("dob");
            String old_pattern = "yyyy-MM-dd";
            String new_pattern = "MM-dd-yyyy";
            SimpleDateFormat oldSDF = new SimpleDateFormat(old_pattern);
            SimpleDateFormat newSDF = new SimpleDateFormat(new_pattern);
            Date date = oldSDF.parse(date1);
            String dob = newSDF.format(date);
            String address = request.getParameter("address");
            int role_id = Integer.parseInt(request.getParameter("role_id"));
            int gender = Integer.parseInt(request.getParameter("gender"));
            int status_id = Integer.parseInt(request.getParameter("status_id"));        
            
            UserDAOImpl userDAO = new UserDAOImpl();
            try {
                userDAO.addNewUser(user_id, first_name, last_name, phone, email, address, dob, role_id, status_id, gender);
                response.sendRedirect("userlist");
            } catch (Exception ex) {
                Logger.getLogger(UserAddController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ParseException ex) {
            Logger.getLogger(UserAddController.class.getName()).log(Level.SEVERE, null, ex);
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
