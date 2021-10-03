package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import dao.DBContext_Postgresql;

public final class UserProfile_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Document</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">    \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/userprofile.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        String email, dob, firstName, lastName, gender, phone, address;
        DBContext_Postgresql db = new DBContext_Postgresql();
        Connection con;
        PreparedStatement st;
        String userId = request.getAttribute("userId").toString();
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
                address  = rs.getString("address");
                System.out.println("email: "+email+"\nphone: "+phone+"\naddress: "+address);
                request.setAttribute("gender", gender);
                request.setAttribute("firstName", firstName);
                request.setAttribute("lastName", lastName);
                request.setAttribute("phone", phone);
                request.setAttribute("address", address);
                request.setAttribute("email", email);
                request.setAttribute("dob", rs.getString("created_at"));
            }
        } catch (Exception e) {
            System.out.println("Loi get user");
        }

    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"sidebar\">\r\n");
      out.write("            <a class=\"active\" href=\"admin.jsp\">Children Care</a>\r\n");
      out.write("            <a href=\"#general\">General</a>\r\n");
      out.write("            <a href=\"userlist.jsp\">User List</a>\r\n");
      out.write("            <a href=\"userprofile.jsp\">System Management</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <nav class=\"navbar navbar-expand-md navbar-light sticky-top\" style=\"background-color: #373B88;\">\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>      \r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                    <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("                        <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                        <button class=\"btn  my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                            Customer\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Profile</a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Settings</a>\r\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Logout</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class=\"container rounded bg-white mt-5 mb-5\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-3 border-right\">\r\n");
      out.write("                        <div class=\"d-flex flex-column align-items-center text-center p-3 py-5\"><img class=\"rounded-circle mt-5\" width=\"150px\" src=\"img/avatar.JPEG\"><span class=\"font-weight-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><span class=\"text-black-50\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><span> </span></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-5 border-right\">\r\n");
      out.write("                        <div class=\"p-3 py-5\">\r\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center mb-3\">\r\n");
      out.write("                                <h4 class=\"text-right\">Trang cá nhân</h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row mt-2\">\r\n");
      out.write("                                <div class=\"col-md-6\"><label class=\"labels\">First Name: </label><h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5></div>\r\n");
      out.write("                                <div class=\"col-md-6\"><label class=\"labels\">Last Name: </label><h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row mt-3\">\r\n");
      out.write("                                <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Số điện thoại: </label><h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5></div>\r\n");
      out.write("                                <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Email: </label><h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5></div>\r\n");
      out.write("                                <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Địa chỉ: </label><h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5></div>                            \r\n");
      out.write("                                <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Ngày sinh: </label><h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5></div>\r\n");
      out.write("                                <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Role: </label> <h5>Customer</h5></div>                                                         \r\n");
      out.write("                                <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Giới tính: </label> <h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5></div>                             \r\n");
      out.write("                                <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Trạng thái: </label><h5>Active</h5></div>                             \r\n");
      out.write("                            </div>                                                                    \r\n");
      out.write("                        </div>                  \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mt-5 text-center col-md-10\">\r\n");
      out.write("                        <a href=\"userlist.jsp\"><button class=\"btn btn-primary profile-button\" type=\"button\">Trở về</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
