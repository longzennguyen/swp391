package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managerheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"css/newstyle.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("        <!--js-->\n");
      out.write("        <script src=\"js/jquery-2.1.1.min.js\"></script> \n");
      out.write("        <!--icons-css-->\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("        <!--Google Fonts-->\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header-main\">\n");
      out.write("            <div class=\"header-left\">\n");
      out.write("                <div class=\"logo-name\">\n");
      out.write("                    <a href=\"index.html\"> <h1>Administrator</h1> \n");
      out.write("                        <!--<img id=\"logo\" src=\"\" alt=\"Logo\"/>--> \n");
      out.write("                    </a> \t\t\t\t\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("                <!--search-box-->\n");
      out.write("                <!-- <div class=\"search-box\">\n");
      out.write("                        <form>\n");
      out.write("                                <input type=\"text\" placeholder=\"Search...\" required=\"\">\t\n");
      out.write("                                <input type=\"submit\" value=\"\">\t\t\t\t\t\n");
      out.write("                        </form>\n");
      out.write("                </div>//end-search-box -->\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-right\">\t\t\t\t\t\t\t\n");
      out.write("                <div class=\"profile_details\">\t\t\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"dropdown profile_details_drop\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                <div class=\"profile_img\">\t\n");
      out.write("                                    <span class=\"prfil-img\"><img src=\"images/p1.png\" alt=\"\"> </span> \n");
      out.write("                                    <div class=\"user-name\">\n");
      out.write("                                        <p>Duke</p>\n");
      out.write("                                        <span>Administrator</span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <i class=\"fa fa-angle-down lnr\"></i>\n");
      out.write("                                    <i class=\"fa fa-angle-up lnr\"></i>\n");
      out.write("                                    <div class=\"clearfix\"></div>\t\n");
      out.write("                                </div>\t\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu drp-mnu\">\n");
      out.write("                                <li> <a href=\"#\"><i class=\"fa fa-cog\"></i> Settings</a> </li> \n");
      out.write("                                <li> <a href=\"#\"><i class=\"fa fa-user\"></i> Profile</a> </li> \n");
      out.write("                                <li> <a href=\"#\"><i class=\"fa fa-sign-out\"></i> Logout</a> </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"> </div>\t\t\t\t\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"> </div>\t\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
