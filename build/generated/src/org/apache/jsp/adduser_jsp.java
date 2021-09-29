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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("        <a class=\"active\" href=\"admin.jsp\">Children Care</a>\n");
      out.write("        <a href=\"#general\">General</a>\n");
      out.write("        <a href=\"userlist.jsp\">User List</a>\n");
      out.write("        <a href=\"#usercontrol\">System Management</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-light sticky-top\" style=\"background-color: #373B88;\">\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>      \n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                <button class=\"btn  my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                Administrator\n");
      out.write("            </a>\n");
      out.write("              <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Profile</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Settings</a>\n");
      out.write("                <div class=\"dropdown-divider\"></div>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Logout</a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <form action=\"\">\n");
      out.write("        <div class=\"container rounded bg-white mt-5 mb-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 border-right\">\n");
      out.write("                    <div class=\"p-3 py-5\">\n");
      out.write("                        <div class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                            <h4 class=\"text-right\">User Profile</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row mt-2\">\n");
      out.write("                            <div class=\"col-md-6\"><label class=\"labels\">First Name</label><input type=\"text\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\n");
      out.write("                            <div class=\"col-md-6\"><label class=\"labels\">Last Name</label><input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row mt-3\">\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Mobile Number</label><input type=\"text\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Email</label><input type=\"text\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Address</label><input type=\"text\" class=\"form-control\" placeholder=\"\" value=\"\"></div>                            \n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Birthday</label><input type=\"date\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\n");
      out.write("                            <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Role: </label>\n");
      out.write("                                <select name=\"type\">\n");
      out.write("                                    <option>Customer</option>\n");
      out.write("                                    <option>Nurse</option>\n");
      out.write("                                    <option>Doctor</option>\n");
      out.write("                                    <option>Manager</option>\n");
      out.write("                                    <option>Administrator</option>\n");
      out.write("                                </select>                                \n");
      out.write("                            </div> \n");
      out.write("                            <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Gender: </label>                                \n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"0\" checked /> Male\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"1\" /> Female\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-12\" style=\"margin-top: 20px\"><label class=\"labels\">Status: </label>                                \n");
      out.write("                                <input type=\"radio\" name=\"status\" value=\"0\" checked /> Enable\n");
      out.write("                                <input type=\"radio\" name=\"status\" value=\"1\" /> Disable\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-12\" style=\"margin-top: 20px\">\n");
      out.write("                                <label class=\"labels\">Avatar</label><input type=\"file\" class=\"form-control\" placeholder=\"\" value=\"\" accept=\"image/*\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>                                                                    \n");
      out.write("                    </div>                  \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"p-3 py-5\">\n");
      out.write("                        <div class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                            <h4 class=\"text-right\">User Account</h4>\n");
      out.write("                        </div>                        \n");
      out.write("                        <div class=\"col-md-12\"><label class=\"labels\">Username</label><input type=\"text\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\n");
      out.write("                        <div class=\"col-md-12\"><label class=\"labels\">Password</label><input type=\"password\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\n");
      out.write("                        <div class=\"col-md-12\"><label class=\"labels\">Re-enter Password</label><input type=\"password\" class=\"form-control\" placeholder=\"\" value=\"\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mt-5 text-center col-md-12\"><button class=\"btn btn-primary profile-button\" type=\"submit\">Save Profile</button></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
