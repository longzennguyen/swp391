package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepagefooter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!-- Web-Fonts -->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <!-- //Web-Fonts -->\n");
      out.write("        <!-- Bootsrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\n");
      out.write("        <!-- Font awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Owl carousel -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("\n");
      out.write("        <!-- Template main Css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("        <!-- Modernizr -->\n");
      out.write("        <script src=\"js/modernizr.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer class=\"main-footer\">\n");
      out.write("\n");
      out.write("            <div class=\"footer-top\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"footer-main\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("\n");
      out.write("                            <div class=\"footer-col\">\n");
      out.write("\n");
      out.write("                                <h4 class=\"footer-title\">About Children Care <span class=\"title-under\"></span></h4>\n");
      out.write("\n");
      out.write("                                <div class=\"footer-content\">\n");
      out.write("\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>ChildrenCare </strong> is ..... ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.\n");
      out.write("                                    </p> \n");
      out.write("\n");
      out.write("                                    <p>\n");
      out.write("                                        ILorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.\n");
      out.write("                                    </p>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"footer-col\">\n");
      out.write("                                <h4 class=\"footer-title\">Chính sách<span class=\"title-under\"></span></h4>\n");
      out.write("                                <div class=\"footer-content\">\n");
      out.write("                                    <ul class=\"tweets list-unstyled\">\n");
      out.write("                                        <li class=\"tweet\"><a href=\"#\">Chính sách 1</a></li>\n");
      out.write("                                        <li class=\"tweet\"><a href=\"#\">Chính sách 2</a></li>\n");
      out.write("                                        <li class=\"tweet\"><a href=\"#\">Chính sách 3</a></li>\n");
      out.write("                                        <li class=\"tweet\"><a href=\"#\">Chính sách 4</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"footer-col\">\n");
      out.write("                                <h4 class=\"footer-title\">Contact us <span class=\"title-under\"></span></h4>\n");
      out.write("                                <div class=\"footer-content\">\n");
      out.write("                                    <ul class=\"tweets list-unstyled\">\n");
      out.write("                                        <li class=\"tweet\">Facebook:   <a href=\"#\">Nguyễn Tiến Đức</a></li>\n");
      out.write("                                        <li class=\"tweet\">Email:   <a href=\"#\">ducnthe153062@fpt.edu.vn</a></li>\n");
      out.write("                                        <li class=\"tweet\">Phone Number:   <a href=\"#\">+84 963 974 475</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer-bottom\">\n");
      out.write("\n");
      out.write("                <div class=\"container text-right\">\n");
      out.write("                    ChildrenCare @ copyrights 2021 - by DucNT\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </footer> <!-- main-footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--  Scripts\n");
      out.write("   ================================================== -->\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            window.jQuery || document.write('<script src=\"assets/js/jquery-1.11.1.min.js\"><\\script>');\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- Bootsrap javascript file -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- owl carouseljavascript file -->\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template main javascript -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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
