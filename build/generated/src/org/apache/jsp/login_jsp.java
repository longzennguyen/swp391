package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />     \n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"css/newstyle.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!--js-->\n");
      out.write("        <script src=\"js/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <!--icons-css-->\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <!--Google Fonts-->\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--static chart-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login-page\" style=\"background-image: url(img/background.jpg);\">\n");
      out.write("            <div class=\"login-main\">\n");
      out.write("                <div class=\"login-head\">\n");
      out.write("                    <h1>Login</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"login-block\">\n");
      out.write("                    <form action=\"login\" method=\"POST\"> \n");
      out.write("                        <input type=\"text\" name=\"uid\" placeholder=\"Email\" required=\"\">\n");
      out.write("                        <input type=\"password\" name=\"pwd\" class=\"lock\" placeholder=\"Password\">\n");
      out.write("                        <div class=\"forgot-top-grids\">\n");
      out.write("                            <div class=\"forgot-grid\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\" id=\"brand1\" value=\"\">\n");
      out.write("                                        <label for=\"brand1\"><span></span>Remember me</label>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"forgot\">\n");
      out.write("                                <a data-toggle=\"modal\" data-target=\"#myModal\">Forgot password?</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" name=\"Sign In\" value=\"Login\">\n");
      out.write("                        <h3>Not a member?<a href=\"signup.jsp\"> Sign up now</a></h3>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    <h5><a href=\"homepage\">Go Back to Home</a></h5>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--inner block end here-->\n");
      out.write("        <div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\">Reset password</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form action=\"\">\n");
      out.write("                            <label>Enter your email address</label>\n");
      out.write("                            <input placeholder=\"Email\" class=\"form-control\" type=\"text\" name=\"email123123\" required>\n");
      out.write("                            <input type=\"submit\" name=\"service\" value=\"Send verification code\" style=\"margin-top: 20px; background-color: deepskyblue;\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--scrolling js-->\n");
      out.write("        <script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("        <!--//scrolling js-->\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <!-- mother grid end here-->\n");
      out.write("    </body>\n");
      out.write("\n");
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
