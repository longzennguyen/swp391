/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DBContext_Postgresql;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.User;

/**
 * Sub controller to process reset password
 *
 * @author longzennguyen
 */
@WebServlet(name = "ResetPassword", urlPatterns = {"/ResetPassword"})
public class ResetPasswordSubController extends HttpServlet {

    private DBContext_Postgresql db = new DBContext_Postgresql();
    private Connection con;
    private PreparedStatement st;

    /**
     * update pass
     * @param userid
     * @param newPass 
     */
    public void resetPassword(long userid, String newPass) {
        String sql = "update users set password='" + newPass + "' where users_id=" + userid;
        ResultSet rs = null;
        try {
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            con.close();
        } catch (Exception e) {

        }

    }

    /**
     * genarate code with length is 5 character number
     *
     * @return code
     */
    protected String genCode() {
        Random ran = new Random();
        String code = "";
        while (code.length() < 5) {
            code += ran.nextInt(9);
        }
        return code;
    }

    /**
     * Config smtp and send code to email input
     *
     * @param emailto
     * @return
     * @throws AddressException
     * @throws MessagingException
     */
    protected String sendmMail(String emailto) throws AddressException, MessagingException {
        System.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        String to = emailto;
        String from = "longnvse04068@gmail.com";
        String host = "smtp.gmail.com";//smtp.gmail.com
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        final String password = "zeny@1234";
        char[] ch = new char[password.length()];
        for (int i = 0; i < password.length(); i++) {
            ch[i] = password.charAt(i);
        }
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        };
        Session session = Session.getInstance(properties, auth);
        Message msg = new MimeMessage(session);
        final String subject = "Validation Code";
        msg.setFrom(new InternetAddress(from));
        msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
        msg.addHeader("format", "flowed");
        msg.addHeader("Content-Transfer-Encoding", "8bit");
        msg.setFrom(new InternetAddress(from));
        msg.setReplyTo(InternetAddress.parse(from, false));
        msg.setSubject(subject);
//        Random ran = new Random();
        String code = genCode();
//        while (code.length() < 5) {
//            code += ran.nextInt(9);
//        }
        msg.setText("Your code is " + code);

        msg.setSentDate(new Date());
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
        System.out.println("code: " + code);
        // sends the e-mail
        Transport.send(msg);
        return code;
    }

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
        System.out.println("Service: " + service);
        if (service.equals("reset_pass")) {
            String userid = userid = request.getParameter("userid").trim();;
            String newPass = newPass = request.getParameter("newpass").trim();;
            resetPassword(Long.valueOf(userid), newPass);
            response.setContentType("text/html");

            //// System.out.println("yah1");
            PrintWriter pw = response.getWriter();
            // System.out.println("yah2");
            pw.println("<script type=\"text/javascript\">");
            //System.out.println("yah3");
            pw.println("alert('Đổi mật khẩu thành công!');"); //show alert
            System.out.println("yah4");
            pw.println("</script>");
            System.out.println("yah5");
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            System.out.println("yah6");
            rd.include(request, response);
        } else if (service.equals("sendmail")) {
            System.out.println("ahahahaa");
//            try {
            String email = request.getParameter("email123123");
            User user = new User();
            try {
                con = db.getConnection();
                String sql = "select * from users where email ='" + email + "'";
                ResultSet rs;
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
                        user.setUser_id(rs.getInt("users_id"));
                        user.setName(rs.getString("first_name") + " " + rs.getString("last_name"));
                        user.setRole_id(rs.getInt("role_id"));
                        user.setAddress(rs.getString("address"));
                        request.setAttribute("user", user);
                    }
                }
                if (user == null) {
                    response.setContentType("text/html");

                    //// System.out.println("yah1");
                    PrintWriter pw = response.getWriter();
                    // System.out.println("yah2");
                    pw.println("<script type=\"text/javascript\">");
                    //System.out.println("yah3");
                    pw.println("alert('Email không tồn tại, Vui lòng kiểm tra lại!');"); //show alert
                    System.out.println("yah4");
                    pw.println("</script>");
                    System.out.println("yah5");
                    RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                    System.out.println("navigate to new password page");
                    rd.include(request, response);
                } else {
                    String code = sendmMail(email);
                    request.setAttribute("code", code);
                    System.out.println("Just save code to attribute : " + request.getAttribute("code"));
                    request.setAttribute("code_reset", code);
                    request.setAttribute("emailr", request.getParameter("email123123"));
                    response.setContentType("text/html");

                    //// System.out.println("yah1");
                    PrintWriter pw = response.getWriter();
                    // System.out.println("yah2");
                    pw.println("<script type=\"text/javascript\">");
                    //System.out.println("yah3");
                    pw.println("alert('Mã xác thực đã được gửi về mail.Vui lòng kiểm tra mail!');"); //show alert
                    System.out.println("yah4");
                    pw.println("</script>");
//                    request.getRequestDispatcher("/NewPassword.jsp").forward(request, response);
//                    response.sendRedirect(request.getContextPath()+ "/NewPassword.jsp");
                    RequestDispatcher rd = request.getRequestDispatcher("/NewPassword.jsp");

                    rd.include(request, response);
                }
            } catch (Exception ex) {
                response.setContentType("text/html");

                //// System.out.println("yah1");
                PrintWriter pw = response.getWriter();
                // System.out.println("yah2");
                pw.println("<script type=\"text/javascript\">");
                //System.out.println("yah3");
                pw.println("alert('Loi gui mail!');"); //show alert
                System.out.println("yah4");
                pw.println("</script>");
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.include(request, response);
                Logger.getLogger(ResetPasswordSubController.class.getName()).log(Level.SEVERE, null, ex);
            }

//            } catch (MessagingException ex) {
//                
//            }
//            } catch (MessagingException ex) {
//                
//            }
        }
//        else if (service.equals("reset_p")) {
//            //update pass
//            System.out.println("Reset pass function");
//            String pass = request.getParameter("passwordr");
//            System.out.println("Pass: " + pass);
//            System.out.println("Attri: " + request.getAttribute("emailr"));
//            String email = request.getAttribute("emailr").toString();
//            System.out.println("email: " + email);
//            String sql = "update users set password ='" + pass + "' where email = '" + email + "'";
//            try {
//                con = db.getConnection();
//                ResultSet rs;
//                st = con.prepareStatement(sql);
//                rs = st.executeQuery();
//            } catch (Exception e) {
//            }
//            response.setContentType("text/html");
//
//            //// System.out.println("yah1");
//            PrintWriter pw = response.getWriter();
//            // System.out.println("yah2");
//            pw.println("<script type=\"text/javascript\">");
//            //System.out.println("yah3");
//            pw.println("alert('Thay đổi mật khẩu thành công!');"); //show alert
//            System.out.println("yah4");
//            pw.println("</script>");
//            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
//            rd.include(request, response);
//        }

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
