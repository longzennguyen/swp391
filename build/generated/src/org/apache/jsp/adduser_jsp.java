package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adduser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/admin.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"sidebar\">\r\n");
      out.write("        <a class=\"active\" href=\"admin.jsp\">Children Care</a>\r\n");
      out.write("        <a href=\"#general\">General</a>\r\n");
      out.write("        <a href=\"userlist.jsp\">User List</a>\r\n");
      out.write("        <a href=\"#usercontrol\">System Management</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-light sticky-top\" style=\"background-color: #373B88;\">\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>      \r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                <button class=\"btn  my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("            </form>\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                Administrator\r\n");
      out.write("            </a>\r\n");
      out.write("              <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Profile</a>\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Settings</a>\r\n");
      out.write("                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Logout</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <form action=\"\">\r\n");
      out.write("        <div class=\"container rounded bg-white mt-5 mb-5\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-5 border-right\">\r\n");
      out.write("                    <div class=\"p-3 py-5\">\r\n");
      out.write("                        <div class=\"d-flex justify-content-between align-items-center mb-3\">\r\n");
      out.write("                            <h4 class=\"text-right\">User Profile</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row mt-2\">\r\n");
      out.write("                            <div class=\"col-md-6\"><label class=\"labels\">First Name</label><input type=\"text\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\r\n");
      out.write("                            <div class=\"col-md-6\"><label class=\"labels\">Last Name</label><input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row mt-3\">\r\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Mobile Number</label><input type=\"text\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\r\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Email</label><input type=\"text\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\r\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Address</label><input type=\"text\" class=\"form-control\" placeholder=\"\" value=\"\"></div>                            \r\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Birthday</label><input type=\"date\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\r\n");
      out.write("                            <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Role: </label>\r\n");
      out.write("                                <select name=\"type\">\r\n");
      out.write("                                    <option>Customer</option>\r\n");
      out.write("                                    <option>Nurse</option>\r\n");
      out.write("                                    <option>Doctor</option>\r\n");
      out.write("                                    <option>Manager</option>\r\n");
      out.write("                                    <option>Administrator</option>\r\n");
      out.write("                                </select>                                \r\n");
      out.write("                            </div> \r\n");
      out.write("                            <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Gender: </label>                                \r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"0\" checked /> Male\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"1\" /> Female\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Status: </label>                                \r\n");
      out.write("                                <input type=\"radio\" name=\"status\" value=\"0\" checked /> Enable\r\n");
      out.write("                                <input type=\"radio\" name=\"status\" value=\"1\" /> Disable\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Avatar</label><input type=\"file\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\r\n");
      out.write("\r\n");
      out.write("                        </div>                                                                    \r\n");
      out.write("                    </div>                  \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"p-3 py-5\">\r\n");
      out.write("                        <div class=\"d-flex justify-content-between align-items-center mb-3\">\r\n");
      out.write("                            <h4 class=\"text-right\">User Account</h4>\r\n");
      out.write("                        </div>                        \r\n");
      out.write("                        <div class=\"col-md-12\"><label class=\"labels\">Username</label><input type=\"text\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\r\n");
      out.write("                        <div class=\"col-md-12\"><label class=\"labels\">Password</label><input type=\"password\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\r\n");
      out.write("                        <div class=\"col-md-12\"><label class=\"labels\">Re-enter Password</label><input type=\"password\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mt-5 text-center col-md-10\"><button class=\"btn btn-primary profile-button\" type=\"submit\">Save Profile</button></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
