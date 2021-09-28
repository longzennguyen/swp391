/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
 *
 * @author Admin
 */
@WebServlet(name = "ResetPass", urlPatterns = {"/ResetPass"})
public class ResetPass extends HttpServlet {

    DBContext db = new DBContext();
    Connection con;
    PreparedStatement st;

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
        System.out.println("Service in resetP: " + service);
        System.out.println("code in attribute: " + request.getParameter("codere"));
        System.out.println("email in attribute: " + request.getParameter("emailr1"));
//        request.getSession().getAttribute(service)
        if (service.equals("reset_p")) {
            //update pass
            String code = request.getParameter("codere");
            String codeInput = request.getParameter("code");
            String pass = request.getParameter("passwordr");
            String repass = request.getParameter("repasswordr");
            System.out.println("p1: " + pass + " \t p2: " + repass);
            String email = request.getParameter("emailr1");
            System.out.println("email just get: "+email);
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
                } catch (Exception e) {
                }
                response.setContentType("text/html");

                //// System.out.println("yah1");
                PrintWriter pw = response.getWriter();
                // System.out.println("yah2");
                pw.println("<script type=\"text/javascript\">");
                //System.out.println("yah3");
                pw.println("alert('Thay đổi mật khẩu thành công!');"); //show alert
                System.out.println("yah4");
                pw.println("</script>");
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.include(request, response);
            } else {
                System.out.println("Code invalid");
                request.setAttribute("code_reset", code);
                request.setAttribute("emailr", email);
                request.setAttribute("error_code", "Mã code không đúng hoặc mật khẩu không khớp,vui lòng kiểm tra lại!");
                RequestDispatcher rd = request.getRequestDispatcher("/NewPassword.jsp");
                rd.include(request, response);
            }
        } else if (service.equals("close")) {
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
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
