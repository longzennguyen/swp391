/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-26    1.0        LongNVSE04068          First Version<br>
 */
package controller;

import dao.DBContext_Postgresql;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**				
 * The class contains method find select,insert users to database				
 * Users table all data will be normalized 	
 * The method wil return User Object to check user existed when register , insert new User to Users table		
 *				
 * @author longnv				
 */
@WebServlet(name = "RegisterAccount", urlPatterns = {"/RegisterAccount"})
public class RegisterAccountController extends HttpServlet {

    private DBContext_Postgresql db = new DBContext_Postgresql();
    private Connection con;
    private PreparedStatement st;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods. get parameter to register user
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
            //get parameter
            String email = request.getParameter("username");
            String password = request.getParameter("password");
            String fname = request.getParameter("first_name");
            String lname = request.getParameter("last_name");
            String dob = request.getParameter("date");
            String gender = request.getParameter("gender");
            String address = request.getParameter("address");
            String phoneNum = request.getParameter("phone");
            String date2 = null;
            try {
                SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-mm-dd");
//                date2 = dt1.format(dob);
                System.out.println("date2: " + date2);
            } catch (Exception ex) {
                System.out.println("Error convert date");
                Logger.getLogger(RegisterAccountController.class.getName()).log(Level.SEVERE, null, ex);
            }

//=======
            String action = request.getParameter("action");
            System.out.println("Action get : " + action);
            if (action != null && action.equals("submit")) {
                if (checkAccountValid(email)) {
                    //email not existed
                    //create user
                    System.out.println("valid");

                    ResultSet rs = null;
                    try {
                        con = db.getConnection();
                        st = con.prepareStatement("select max(users_id) from users");
                        rs = st.executeQuery();
                        int maxID = 0;
                        if (rs.next()) {
                            maxID = rs.getInt("max") + 1;
                        } else {
                            maxID = 0;
                        }
                        System.out.println("new ID : " + maxID);
                        String sql = "INSERT INTO Users(Users_id, first_name, last_name, gender, email, phone, address,\n"
                                + "				 created_at, role_id,password,status_id,dob)\n"
                                + "	VALUES(" + maxID + ", '" + fname + "','" + lname + "','" + gender + "','" + email + "','" + phoneNum + "','" + address + "','" + dob + "',1,'" + password + "',1,'" + dob + "')";
                        System.out.println("sql: " + sql);
                        st = con.prepareStatement(sql);
                        rs = st.executeQuery();
                        System.out.println("Insert success");
                        con.close();
                    } catch (Exception e) {
                        System.out.println("Not found user or error to insert");
                    }
                    // System.out.println("yah");
                    response.setContentType("text/html");

                    //// System.out.println("yah1");
                    PrintWriter pw = response.getWriter();
                    // System.out.println("yah2");
                    pw.println("<script type=\"text/javascript\">");
                    //System.out.println("yah3");
                    pw.println("alert('Tạo tài khoản thành công!');"); //show alert
                    System.out.println("yah4");
                    pw.println("</script>");
                    System.out.println("yah5");
                    RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                    System.out.println("yah6");
                    rd.include(request, response);
                } else {
                    //email existed -> reject request

                    System.out.println("invalid");
                    response.setContentType("text/html");
                    PrintWriter pw = response.getWriter();
                    pw.println("<script type=\"text/javascript\">");
                    pw.println("alert('Email đã tồn tại , vui lòng kiểm tra lại!');");
                    pw.println("</script>");
                    RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                    rd.include(request, response);
                }
            }
        }
    }

    public boolean checkAccountValid(String email) {
        String sql = "select * from users where email = '" + email + "'";
        ResultSet rs = null;
        try {
            con = db.getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            if (!rs.next()) {
                return true;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Not found user");
        }
        return false;
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
        String action = request.getParameter("action");
        System.out.println("Action : " + action);

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
