package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservationDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reservation.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"bodyLayout1\">\n");
      out.write("            <button id=\"backToHomepage\">Trở về trang chủ</button>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"col-1\">STT</td>\n");
      out.write("                    <td class=\"col-2\">Dịch vụ</td>\n");
      out.write("                    <td class=\"col-3\">Bảng Giá</td>\n");
      out.write("                    <td class=\"col-4\">Số lượng</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"col-1\">1</td>\n");
      out.write("                    <td class=\"col-2\">\n");
      out.write("                        <img src=\"img/service_image1.png\" style=\"width: 60%\">\n");
      out.write("                        </br>\n");
      out.write("                        <p>Dịch vụ chăm sóc trẻ sơ sinh</p>\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"col-3\">1.000.000đ</td>\n");
      out.write("                    <td class=\"col-4\">1</td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"col-1\">2</td>\n");
      out.write("                    <td class=\"col-2\">\n");
      out.write("                        <img src=\"img/service_image1.png\" style=\"width: 60%\">\n");
      out.write("                        </br>\n");
      out.write("                        <p>Dịch vụ lấy mẫu xét nghiệm tại nhà</p></td>\n");
      out.write("                    <td class=\"col-3\">1.000.000đ</td>\n");
      out.write("                    <td class=\"col-4\">1</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bodyLayout2\">\n");
      out.write("            <h2>Tổng giá tiền dịch vụ:</h2>\n");
      out.write("            <button id=\"continue\" class=\"continue\">Tiếp tục</button>\n");
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
