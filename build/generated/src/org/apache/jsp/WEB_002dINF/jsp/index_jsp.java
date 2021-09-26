package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login/ Register</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-image: url('https://images.pexels.com/photos/6393146/pexels-photo-6393146.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940'); background-size: 100%;\">\r\n");
      out.write("        <main class=\"page login-page\">\r\n");
      out.write("            <section class=\"clean-block clean-form dark\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"block-heading\">\r\n");
      out.write("                        <h2 class=\"text-info\">Log In</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form action=\"LoginSvlet\" method=\"POST\">\r\n");
      out.write("                        <div class=\"form-group\"><label for=\"email\">Username1111111</label><input placeholder=\"Email\" class=\"form-control item\" type=\"email\" name=\"uid\" required></div>\r\n");
      out.write("                        <div class=\"form-group\"><label for=\"password\">Password</label><input placeholder=\"Password\" class=\"form-control\" type=\"password\" name=\"pwd\" required pattern=\"^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,12}$\"></div>\r\n");
      out.write("                        <p class=\"form-group\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginfail1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <div class=\"form-check\"><label class=\"form-check-label\" for=\"checkbox\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginfail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label></div>\r\n");
      out.write("                        </div><button class=\"btn btn-primary btn-block\" type=\"submit\">Log In</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary btn-block\" data-toggle=\"modal\" data-target=\".bd-example-modal-lg\">Register</button></form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </main>\r\n");
      out.write("        <!--        <div>\r\n");
      out.write("                    <form action=\"login\" method=\"POST\">\r\n");
      out.write("                        <p>Username <input type=\"text\" name=\"uid\" required>\r\n");
      out.write("                        <p>Password <input type=\"password\" name=\"pwd\" required>\r\n");
      out.write("                        <p><input type=\"submit\" value=\"Login\" class=\"btn btn-primary\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>-->\r\n");
      out.write("        <!--\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\".bd-example-modal-lg\">Register</button>-->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"modal fade bd-example-modal-lg\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myExtraLargeModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog modal-lg\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h5 class=\"modal-title\" >Register</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <form action=\"add\" name=\"register\" id=\"register\" method=\"POST\">\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Full Name</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" name=\"fullname\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Username</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" name=\"username\" required>\r\n");
      out.write("                                        <div class=\"col-10\">\r\n");
      out.write("                                            <small id=\"checkDuplicateUser\" class=\"form-text text-muted\"></small>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Password</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input class=\"form-control\" type=\"password\" name=\"password\" id=\"password\" onkeyup=\"validatePassword()\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Re-enter Password</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input class=\"form-control\" type=\"password\" name=\"repassword\" id=\"confirm_password\" onkeyup=\"validatePassword()\" required>\r\n");
      out.write("                                        <small id=\"validatePassword\" class=\"form-text text-muted\"></small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Date of Birth</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input class=\"form-control\" type=\"date\" name=\"date\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Phone</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input class=\"form-control\" type=\"number\" name=\"phone\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Gender</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                            <label class=\"form-check-label\">\r\n");
      out.write("                                                <input class=\"form-check-input\" type=\"radio\" name=\"gender\" value=\"1\"> Male\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                            <label class=\"form-check-label\">\r\n");
      out.write("                                                <input class=\"form-check-input\" type=\"radio\" name=\"gender\" value=\"0\"> Female\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                                <label class=\"col-2 col-form-label\">Address</label>\r\n");
      out.write("                                <div class=\"col-10\">\r\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"address\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-primary\">Register</button>-->\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" onclick=\"submitRegister()\">Register</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            function submitRegister() {\r\n");
      out.write("                document.getElementById(\"register\").submit();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            var validatePassword = function () {\r\n");
      out.write("                if (document.getElementById('password').value == '' && document.getElementById('confirm_password').value == '') {\r\n");
      out.write("                    document.getElementById('validatePassword').innerHTML = '';\r\n");
      out.write("                } else if (document.getElementById('password').value == document.getElementById('confirm_password').value) {\r\n");
      out.write("                    document.getElementById('validatePassword').innerHTML = 'Password Matching';\r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById('validatePassword').innerHTML = 'Password Not Matching';\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            var checkDuplicateUser = function() {\r\n");
      out.write("            \r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty duplicateUser}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                if(                             document.getElementById('checkDuplicateUser').innerHTML = 'Da ton tai');\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
