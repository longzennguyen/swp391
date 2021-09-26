/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserModel;

/**
 *
 * @author Admin
 */
public class LoginSvlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginSvlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginSvlet at " + request.getContextPath() + "</h1>");
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
        System.out.println("Do Post Login");
        log("abcbcbc");
        UserModel user = new UserModel();
        //get email and password
        String uid = request.getParameter("uid");
        String pwd = request.getParameter("pwd");
        //get connection
        try {
            con = db.getConnection();
            System.out.println("Connect Success");
        } catch (Exception ex) {
            System.out.println("Connect fail!");
            Logger.getLogger(LoginSvlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "select * from Users where email='" + uid + "' and password='" + pwd + "'";
        //get data
        ResultSet rs = null;
        try {
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            if (!rs.next()) {
                System.out.println("Khong tim thay tk111");
                user = null;
            } else {
                System.out.println("Prepare get object");

                rs = st.executeQuery();
                while (rs.next()) {
                    System.out.println("Name of User: " + rs.getString("first_name") + " roleid: " + rs.getString("role_id"));

                    user.setUser_id(rs.getLong("users_id"));
                    user.setName(rs.getString("first_name") + " " + rs.getString("last_name"));
                    user.setRoleid(rs.getLong("role_id"));
                    user.setAddress(rs.getString("address"));
                    request.setAttribute("user", user);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi");
            Logger.getLogger(LoginSvlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        log("abababa");
        //        user.setRoleid(2);
        //        user = null;
        //check role and navigate
        System.out.println("Do Post Login2");
        if (user == null) {
            System.out.println("Do Post Login3");
            log("abababa1");
            String loginfail = "Tên đăng nhập hoặc mật khẩu không chính xác, vui lòng kiểm tra lại!";
            request.setAttribute("loginfail1", loginfail);
            System.out.println("url : " + request.getContextPath() + "/index.htm");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
//            response.sendRedirect(request.getContextPath()+"/index.htm");
            System.out.println("Attri bute>>>> " + request.getAttribute("loginfail1"));
        } else if (user.getRoleid() == 1) {

            log("abababa2");
            response.sendRedirect("/HomePage.jsp");
        } else if (user.getRoleid() == 2) {

            log("abababa3");
            request.getSession().setAttribute("user", user);
            request.getSession().setAttribute("userId", user.getUser_id());
//            response.sendRedirect("login");
            response.sendRedirect(request.getContextPath() + "/HomePage.jsp");
//            request.getRequestDispatcher("HomePage").forward(request, response);
        } else if (user.getRoleid() == 3) {
            System.out.println("Name of user: " + user.getName());
            request.setAttribute("Name_of_User", user.getName());
            System.out.println("Username att: " + request.getAttribute("Name_of_User"));
            //save user information
            request.getSession().setAttribute("user", user);
            request.getSession().setAttribute("userId", user.getUser_id());
//            response.sendRedirect("login");
            request.getRequestDispatcher("/HomePage.jsp").forward(request, response);
//            response.sendRedirect(request.getContextPath() + "/HomePage.jsp");
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
