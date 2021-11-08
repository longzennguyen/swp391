/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-30    1.0        LongNVSE04068          First Version<br>
 */
package controller;

import dao.DBContext;
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

/**				
 * The class contains method insert users in database to check login success				
 * Users table all data will be normalized 	
 * The method will update password to user with email inputed		
 *				
 * @author longnv				
 */
@WebServlet(name = "ResetPass", urlPatterns = {"/ResetPass"})
public class ResetPasswordController extends HttpServlet {

    private DBContext db = new DBContext();
    private Connection con;
    private PreparedStatement st;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods. get request and parameter , process reset password and print
     * notification
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
        System.out.println("Service in resetP: " + service);
        System.out.println("code in attribute: " + request.getParameter("codere"));
        System.out.println("email in attribute: " + request.getParameter("emailr1"));
//        request.getSession().getAttribute(service)
        if (service.equals("reset_p")) {
            //update pass
            String code = request.getParameter("codere").trim();
            String codeInput = request.getParameter("code").trim();
            String pass = request.getParameter("passwordr").trim();
            String repass = request.getParameter("repasswordr").trim();
            System.out.println("p1: " + pass + " \t p2: " + repass);
            String email = request.getParameter("emailr1").trim();
            System.out.println("email just get: " + email);
            if (code.equals(codeInput) && pass.equals(repass)) {
                System.out.println("code valid");
                System.out.println("Reset pass function");
//                String pass = request.getParameter("passwordr");
                System.out.println("Pass: " + pass);
                System.out.println("Attri: " + request.getAttribute("emailr"));
//                String email = request.getAttribute("emailr").toString();
                System.out.println("email: " + email);
                String sql = "update users set password ='" + pass + "' where email = '" + email + "'";
                try {
                    con = db.getConnection();
                    ResultSet rs;
                    st = con.prepareStatement(sql);
                    rs = st.executeQuery();
                    System.out.println("sql: " + sql);
                    con.close();
                } catch (Exception e) {
                }
                response.setContentType("text/html");

                //show error
                PrintWriter pw = response.getWriter();
                // System.out.println("yah2");
                pw.println("<script type=\"text/javascript\">");
                //System.out.println("yah3");
                pw.println("alert('Change password successful!');"); //show alert
                System.out.println("yah4");
                pw.println("</script>");
                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                rd.include(request, response);
            } else {
                System.out.println("Code invalid");
                //set attribute
                request.setAttribute("code_reset", code);
                request.setAttribute("emailr", email);
                request.setAttribute("error_code", "Your code incorrect!!");
                RequestDispatcher rd = request.getRequestDispatcher("/NewPassword.jsp");
                rd.include(request, response);
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
