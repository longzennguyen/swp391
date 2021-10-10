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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("        <section class=\"login_part section_padding \" style=\"background-color: #EDF6E5;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row align-items-center\">\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                    <div class=\"login_part_text text-center\">\n");
      out.write("                        <div class=\"login_part_text_iner\">\n");
      out.write("                            <h2>Bạn mới biết đến cửa hàng của chúng tôi?</h2>\n");
      out.write("                            <p>Sẽ có những ưu đãi riêng vô cùng hấp dẫn cho thành viên mới!</p>\n");
      out.write("                            <a href=\"checkout.jsp\" class=\"btn_3\">Đăng ký ngay</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                    <div class=\"login_part_form\">\n");
      out.write("                        <div class=\"login_part_form_iner\">\n");
      out.write("                            <h3>Đăng nhập</h3>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <form class=\"row contact_form\" action=\"#\" method=\"post\" novalidate=\"novalidate\">\n");
      out.write("                                <div class=\"col-md-12 form-group p_star\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" value=\"\"\n");
      out.write("                                        placeholder=\"Tên đăng nhập\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12 form-group p_star\">\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" value=\"\"\n");
      out.write("                                        placeholder=\"Mật khẩu\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12 form-group\">\n");
      out.write("                                    <div class=\"creat_account d-flex align-items-center\">\n");
      out.write("                                        <input type=\"checkbox\" id=\"f-option\" name=\"selector\">\n");
      out.write("                                        <label for=\"f-option\">Nhớ tài khoản</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button type=\"submit\" value=\"submit\" class=\"btn_3\">\n");
      out.write("                                        Đăng nhập\n");
      out.write("                                    </button>\n");
      out.write("                                    <a class=\"lost_pass\" href=\"#\">Quên mật khẩu?</a>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
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
