/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DBContext_Postgresql;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "HomePage", urlPatterns = {"/HomePage"})
public class HomePageControllerAAAA extends HttpServlet {

    private DBContext_Postgresql db = new DBContext_Postgresql();
    private Connection con;
    private PreparedStatement st;

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
        if (service.equals("profile")) {
            String email, dob, firstName, lastName, gender, phone, address;
            service = service == null ? "profile" : service;
            String userId = request.getParameter("userId1");
            String sql = "select * from users where users_id=" + userId;
            System.out.println("sql in profile: " + sql);
            ResultSet rs = null;
            try {
                con = db.getConnection();
                st = con.prepareStatement(sql);
                rs = st.executeQuery();
                while (rs.next()) {
                    email = rs.getString("email");
                    gender = rs.getBoolean("gender") == true ? "Female" : "Male";
                    firstName = rs.getString("first_name");
                    lastName = rs.getString("last_name");
                    phone = rs.getString("phone");
                    address = rs.getString("address");
                    System.out.println("email: " + email + " gender: " + gender + " phone: " + phone);
                }
                System.out.println("before set att");
                request.setAttribute("userId", userId);
                System.out.println("before navigaste");
               RequestDispatcher rd = request.getRequestDispatcher("/UserProfile_1.jsp");
                rd.include(request, response);
            } catch (Exception e) {
                System.out.println("Loi get user");
            }finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HomePageControllerAAAA.class.getName()).log(Level.SEVERE, null, ex);
                }
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
