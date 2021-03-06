/*			
 * Copyright(C) 2005, Morses Club of London Scottish Bank.			
 * T.NET:			
 *  Transport and Information Network			
 *			
 * Record of change:			
 * DATE            Version             AUTHOR           DESCRIPTION			
 * 2021-10-27      1.0                 LongNVSE04068    change password
 */
package controller;

import dao.DBContext_Postgresql;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Process change password, check user existed in <br>changPass.jsp</br>
 *
 * @author longzennguyen
 */
@WebServlet(name = "changPassword", urlPatterns = {"/changPassword"})
public class ChangePasswordController extends HttpServlet {

    private DBContext_Postgresql db = new DBContext_Postgresql();
    private Connection con;
    private PreparedStatement st;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods. Check service and process request
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
        if (service.equals("change")) {
            String email = request.getParameter("email");
            String newPass = request.getParameter("passwordr");
            String confirmedPass = request.getParameter("repasswordr");
            User user = new User();
            if (!newPass.equals(confirmedPass)) {
                request.setAttribute("error_code", "Th??ng tin nh???p ch??a ch??nh x??c , vui l??ng ki???m tra l???i!");
                RequestDispatcher rd = request.getRequestDispatcher("/changPass.jsp");
                rd.include(request, response);
            } else {
                System.out.println("Not valid pass");
                System.out.println("Email: " + email);
                String sql = "select * from users where email ='" + email + "'";
                System.out.println("sqllll: " + sql);
                ResultSet rs = null;
                ResultSet rs1 = null;
                try {
                    con = db.getConnection();
                    st = con.prepareStatement(sql);
                    System.out.println("Yah");
                    rs = st.executeQuery();
                    System.out.println("Executed");
                    if (!rs.next()) {
                        System.out.println("Executed");
                        request.setAttribute("error_code", "Email kh??ng t???n t???i!");
                        user = null;
                        RequestDispatcher rd = request.getRequestDispatcher("/changPass.jsp");
                        rd.include(request, response);
                    } else {
                        System.out.println("Have user");
                        rs = st.executeQuery();
                        while (rs.next()) {
                            sql = "update users set password='" + newPass + "' where email='" + email + "'";
                            System.out.println("sql: " + sql);
                            st = con.prepareStatement(sql);
                            try {

                                rs1 = st.executeQuery();
                            } catch (Exception e) {
                            }
                            response.setContentType("text/html");

                            //// System.out.println("yah1");
                            PrintWriter pw = response.getWriter();
                            // System.out.println("yah2");
                            pw.println("<script type=\"text/javascript\">");
                            //System.out.println("yah3");
                            pw.println("alert('?????i m???t kh???u th??nh c??ng!');"); //show alert
                            System.out.println("yah4");
                            pw.println("</script>");
                            System.out.println("yah5");
                            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                            rd.include(request, response);
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Eror");
                    System.out.println("e: " + e);
                }finally{
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChangePasswordController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } else if (service.equals("close")) {
            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
            rd.include(request, response);
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
