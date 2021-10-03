package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import dao.DBContext_Postgresql;
import java.sql.Connection;
import java.io.PrintWriter;

public final class changPass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://smtpjs.com/v3/smtp.js\"></script>  \n");
      out.write("        <script src=\n");
      out.write("                \"https://smtpjs.com/v3/smtp.js\">\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\">Thay đổi Mật Khẩu</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form action=\"changPassword\" method=\"POST\">\n");
      out.write("                        <div>\n");
      out.write("                            <p style=\"color: red; width: 90%; margin-left: 19%\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error_code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <input hidden=\"true\" name=\"codere\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${code_reset}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <input hidden=\"true\" name=\"emailr1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emailr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <label class=\"col-2 col-form-label\">Email</label>\n");
      out.write("                                <div class=\"col-10\">\n");
      out.write("                                    <input placeholder=\"Email\" class=\"form-control\" type=\"email\" name=\"email\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <!--<div class=\"row\">-->\n");
      out.write("\n");
      out.write("                                <!--</div>-->\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label class=\"col-2 col-form-label\">Mật khẩu cũ</label>\n");
      out.write("                                <div class=\"col-10\">\n");
      out.write("                                    <input placeholder=\"Mật khẩu mới\" class=\"form-control\" type=\"password\" name=\"oldpass\" id=\"oldpass\" onkeyup=\"validatePasswordr()\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label class=\"col-2 col-form-label\">Mật khẩu mới</label>\n");
      out.write("                                <div class=\"col-10\">\n");
      out.write("                                    <input placeholder=\"Mật khẩu mới\" class=\"form-control\" type=\"password\" name=\"passwordr\" id=\"passwordr\" onkeyup=\"validatePasswordr()\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group row\">\n");
      out.write("                                <label class=\"col-2 col-form-label\">Xác thực mật khẩu</label>\n");
      out.write("                                <div class=\"col-10\">\n");
      out.write("                                    <input placeholder=\"Xác thực\" class=\"form-control\" type=\"password\" name=\"repasswordr\" id=\"repasswordr\" onkeyup=\"validatePasswordr()\">\n");
      out.write("                                    <small id=\"validatePasswordr\" class=\"form-text text-muted\"></small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                                    <button type=\"submit\" class=\"btn btn-primary\">Register</button>-->\n");
      out.write("                        <div class=\"modal-footer\" >\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-secondary\" data-dismiss=\"modal\" name=\"service\" value=\"close\">Quay lại</button>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\" name=\"service\" value=\"change\"\n");
      out.write("                                    >Khôi phục</button>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            var validatePasswordr = function () {\n");
      out.write("                if (document.getElementById('password').value == '' && document.getElementById('confirm_password').value == '') {\n");
      out.write("                    document.getElementById('validatePassword').innerHTML = '';\n");
      out.write("                } else if (document.getElementById('password').value == document.getElementById('confirm_password').value) {\n");
      out.write("                    document.getElementById('validatePassword').innerHTML = 'Password Matching';\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById('validatePassword').innerHTML = 'Password Not Matching';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
