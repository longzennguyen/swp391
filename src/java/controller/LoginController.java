/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-27    1.0        LongNVSE04068          First Version<br>
 */
package controller;

import dao.impl.UserDAOImpl;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**				
 * The class contains method find select users in database to check login success				
 * Users table all data will be normalized 	
 * The method wil return User Object to check user existed when login		
 *				
 * @author longnv				
 */
public class LoginController extends HttpServlet {

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
            out.println("<title>Servlet LoginController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginController at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
            //get parameter in <br>Login</br>
            String uid = request.getParameter("uid").trim();
            String pwd = request.getParameter("pwd").trim();
            UserDAOImpl userDAO = new UserDAOImpl();
            //check user existed
            User user = userDAO.getUserByEmailAndPwd(uid, pwd);
            request.setAttribute("user", user);
            if (user == null) {
                //not existed
                System.out.println("Do Post Login3");
                String loginfail = "Tên đăng nhập hoặc mật khẩu không chính xác, vui lòng kiểm tra lại!";
                request.setAttribute("loginfail1", loginfail);
                System.out.println("url : " + request.getContextPath() + "/login.jsp");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
                System.out.println("Attri bute>>>> " + request.getAttribute("loginfail1"));
            } 
            else if (user.getRole_id() == 5) {
                //existed and role id = 5
                System.out.println("Name of user: " + user.getName());
                request.setAttribute("Name_of_User", user.getName());
                System.out.println("Username att: " + request.getAttribute("Name_of_User"));
                //save user information
                request.getSession().setAttribute("user", user);
                request.getSession().setAttribute("userId", user.getUser_id());
                response.sendRedirect("homepage");
                //request.getRequestDispatcher("homepage").forward(request, response);
            } 
            else if (user.getRole_id() == 2) {
                //existed and role id = 2
                response.sendRedirect(request.getContextPath() + "/Manager.jsp");
                request.getSession().setAttribute("user", user);
                request.getSession().setAttribute("userId", user.getUser_id());
            } 
            else if (user.getRole_id() == 1) {
                //existed and role id = 1
                response.sendRedirect(request.getContextPath() + "/admin.jsp");
                request.getSession().setAttribute("user", user);
                request.getSession().setAttribute("userId", user.getUser_id());
            } 
            else if (user.getRole_id() == 3) {
                //existed and role id = 3
                response.sendRedirect(request.getContextPath() + "/staff.jsp");
                request.getSession().setAttribute("user", user);
                request.getSession().setAttribute("userId", user.getUser_id());
            }
            else if (user.getRole_id() == 4) {
                //existed and role id = 4
                response.sendRedirect(request.getContextPath() + "/staff.jsp");
                request.getSession().setAttribute("user", user);
                request.getSession().setAttribute("userId", user.getUser_id());
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
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
