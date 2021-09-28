/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class RegisterAccount extends HttpServlet {

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
                Logger.getLogger(RegisterAccount.class.getName()).log(Level.SEVERE, null, ex);
            }

//=======
            String action = request.getParameter("action");
            System.out.println("Action get : " + action);
            if (action != null && action.equals("submit")) {
                if (check_Account_valid(email)) {
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
                                + "				 created_at, role_id)\n"
                                + "	VALUES(" + maxID + ", '" + fname + "','" + lname + "','" + gender + "','" + email + "','" + phoneNum + "','" + address + "','" + dob + "',1)";
                        System.out.println("sql: " + sql);
                        st = con.prepareStatement(sql);
                        rs = st.executeQuery();

                    } catch (Exception e) {
                        System.out.println("Not found user");
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
//                    request.getRequestDispatcher("/index.jsp").forward(request, response);
//                    String msg = "hihi";
//                    out.println("<script type=\"text/javascript\">");
//                    out.println("alert('User or password incorrect');");
//                    out.println("location='index.jsp';");
//                    out.println("</script>");
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

    public boolean check_Account_valid(String email) {
        String sql = "select * from users where email = '" + email + "'";
        ResultSet rs = null;
        try {
            con = db.getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            if (!rs.next()) {
                return true;
            }
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
