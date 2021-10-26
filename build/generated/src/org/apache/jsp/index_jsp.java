package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.servlet.http.*;
import javax.servlet.*;

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
      out.write("        <script src=\"https://smtpjs.com/v3/smtp.js\"></script>  \r\n");
      out.write("        <script src=\r\n");
      out.write("                \"https://smtpjs.com/v3/smtp.js\">\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function sendEmail1() {\r\n");
      out.write("                Email.send({\r\n");
      out.write("                    Host: \"smtp.gmail.com\",\r\n");
      out.write("                    Username: \"longnvse04068@gmail.com\",\r\n");
      out.write("                    Password: \"zeny@1234\",\r\n");
      out.write("                    To: 'longzenbiker@gmail.com',\r\n");
      out.write("                    From: \"longnvse04068@gmail.com\",\r\n");
      out.write("                    Subject: \"Sending Email using javascript\",\r\n");
      out.write("                    Body: \"Well that was easy!!\",\r\n");
      out.write("                })\r\n");
      out.write("                        .then(function (message) {\r\n");
      out.write("                            alert(\"mail sent successfully\")\r\n");
      out.write("                        });\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-image: url('https://images.pexels.com/photos/3662667/pexels-photo-3662667.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940'); background-size: 100%;\">\r\n");
      out.write("\r\n");
      out.write("        <main class=\"page login-page\">\r\n");
      out.write("            <section class=\"clean-block clean-form dark\">\r\n");
      out.write("                <div class=\"container\" style=\"margin-top: 5%\">\r\n");
      out.write("                    <div class=\"block-heading\">\r\n");
      out.write("                        <!--<h2 class=\"text-info\">Dịch vụ chăm sóc sức khoẻ cho trẻ</h2>-->\r\n");
      out.write("                        <h2 class=\"text-info\">Đăng nhập</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form action=\"login\" method=\"POST\">\r\n");
      out.write("                        <div class=\"form-group\"><label for=\"email\">Email</label><input placeholder=\"Email\" class=\"form-control item\" type=\"email\" name=\"uid\" required></div>\r\n");
      out.write("                        <div class=\"form-group\"><label for=\"password\">Mật khẩu</label><input placeholder=\"Mật khẩu\" class=\"form-control\" type=\"password\" name=\"pwd\" required pattern=\"^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,12}$\"></div>\r\n");
      out.write("                        <!--<p class=\"form-group\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginfail1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>-->\r\n");
      out.write("                        <p style=\"color: red\">");
      out.print(request.getAttribute("loginfail1") == null ? "" : request.getAttribute("loginfail1"));
      out.write("</p>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <div class=\"form-check\"><label class=\"form-check-label\" for=\"checkbox\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginfail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\" style=\"margin-top: 10px\">\r\n");
      out.write("                            <div class=\"col-10\" style=\"text-align: right\" >\r\n");
      out.write("                                <p style=\"margin-right: 10%\">Đã có tài khoản?<a onclick=\"document.getElementById('resetpass').style.display = 'block'\" style=\"color: blue\">Quên mật khẩu?</a></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <button class=\"btn btn-primary btn-block\" type=\"submit\" style=\"margin-top: 10px\">Đăng nhập</button></div>\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <button type=\"button\" style=\"margin-top: 10px\" class=\"btn btn-primary btn-block\" data-toggle=\"modal\" data-target=\".bd-example-modal-lg\">Đăng ký</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--                            <div class=\"col-md-6\">\r\n");
      out.write("                                                            <button type=\"button\" style=\"margin-top: 10px\" class=\"btn btn-primary btn-block\" data-toggle=\"modal\" data-target=\"#resetpass\">Quên mật khẩu</button>\r\n");
      out.write("                                                        </div>-->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </main>\r\n");
      out.write("        <div class=\"modal fade bd-example-modal-lg\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myExtraLargeModalLabel\" aria-hidden=\"true\" style=\"width: 90%\">\r\n");
      out.write("            <div class=\"modal-dialog modal-lg\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h5 class=\"modal-title\">Đăng ký</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <form action=\"RegisterAccount\" method=\"POST\">\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">First Name</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"First Name\" class=\"form-control\" type=\"text\" name=\"first_name\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Last Name</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"Last Name\" class=\"form-control\" type=\"text\" name=\"last_name\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Email</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"Email\" class=\"form-control\" type=\"text\" name=\"username\" required>\r\n");
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
      out.write("                                    <label class=\"col-2 col-form-label\">Mật khẩu</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"Mật khẩu\" class=\"form-control\" type=\"password\" name=\"password\" id=\"password\" onkeyup=\"validatePassword()\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Xác thực mật khẩu</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"Xác thực\" class=\"form-control\" type=\"password\" name=\"repassword\" id=\"confirm_password\" onkeyup=\"validatePassword()\" required>\r\n");
      out.write("                                        <small id=\"validatePassword\" class=\"form-text text-muted\"></small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Ngày sinh</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input class=\"form-control\" type=\"date\" name=\"date\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Số điện thoại</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"Số điện thoại\" class=\"form-control\" type=\"number\" name=\"phone\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Giới tính</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                            <label class=\"form-check-label\">\r\n");
      out.write("                                                <input class=\"form-check-input\" type=\"radio\" name=\"gender\" value=\"1\"> Đàn ông\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                            <label class=\"form-check-label\">\r\n");
      out.write("                                                <input class=\"form-check-input\" type=\"radio\" name=\"gender\" value=\"0\"> Phụ nữ\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                                <label class=\"col-2 col-form-label\">Địa chỉ</label>\r\n");
      out.write("                                <div class=\"col-10\">\r\n");
      out.write("                                    <input placeholder=\"Địa chỉ\" class=\"form-control\" type=\"text\" name=\"address\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-primary\">Register</button>-->\r\n");
      out.write("                            <div class=\"modal-footer\" >\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Đóng</button>\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\" name=\"action\" value=\"submit\" >Đăng ký</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--modal reset password-->\r\n");
      out.write("        <div class=\"modal\" id=\"resetpass\" aria-hidden=\"true\" style=\"width: 90%\">\r\n");
      out.write("            <div class=\"modal-dialog modal-lg\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h5 class=\"modal-title\">Reset Mật Khẩu</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <form action=\"ResetPassword\" method=\"POST\">\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Email</label>\r\n");
      out.write("                                    <div class=\"col-10 input-group\">\r\n");
      out.write("                                        <input placeholder=\"Email\" class=\"form-control\" type=\"text\" name=\"email123123\" required>\r\n");
      out.write("                                        <button class=\"col-sm-4 \" type=\"submit\" style=\"width: 20px;background-color: forestgreen; color: white;border-radius: 4px;\" name=\"service\" value=\"sendmail\">\r\n");
      out.write("                                            Gửi code\r\n");
      out.write("                                        </button>\r\n");
      out.write("<!--                                        <div class=\"col-10\">\r\n");
      out.write("                                            <small id=\"checkDuplicateUser\" class=\"form-text text-muted\"></small>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </div>-->\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("<!--                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Mã Code</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"Mã code\" class=\"form-control\" type=\"number\" name=\"code\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Mật khẩu mới</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"Mật khẩu mới\" class=\"form-control\" type=\"password\" name=\"passwordr\" id=\"passwordr\" onkeyup=\"validatePasswordr()\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Xác thực mật khẩu</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"Xác thực\" class=\"form-control\" type=\"password\" name=\"repasswordr\" id=\"confirm_passwordr\" onkeyup=\"validatePasswordr()\" required>\r\n");
      out.write("                                        <small id=\"validatePassword\" class=\"form-text text-muted\"></small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>-->\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-primary\">Register</button>-->\r\n");
      out.write("<!--                            <div class=\"modal-footer\" >\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\" onclick=\"document.getElementById('resetpass').style.display = 'none'\">Đóng</button>\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\" name=\"action\" value=\"submit\" >Đăng ký</button>\r\n");
      out.write("                            </div>-->\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script >\r\n");
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
      out.write("            var validatePassword4 = function () {\r\n");
      out.write("                if (document.getElementById('passwordr').value == '' && document.getElementById('confirm_passwordr').value == '') {\r\n");
      out.write("                    document.getElementById('validatePasswordr').innerHTML = '';\r\n");
      out.write("                } else if (document.getElementById('passwordr').value == document.getElementById('confirm_passwordr').value) {\r\n");
      out.write("                    document.getElementById('validatePasswordr').innerHTML = 'Password Matching';\r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById('validatePasswordr').innerHTML = 'Password Not Matching';\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            function sendEmail() {\r\n");
      out.write("                let code = 12345;\r\n");
      out.write("//                console.log(\"Email input: \", document.getElementById(\"email123123\").value, \" - \", document.getElementById(\"email123123\").value);\r\n");
      out.write("                console.log(\"run mail\");\r\n");
      out.write("                Email.send({\r\n");
      out.write("                    Host: \"smtp.gmail.com\",\r\n");
      out.write("                    Username: \"longnvse04068@gmail.com\",\r\n");
      out.write("                    Password: \"zeny@1234\",\r\n");
      out.write("                    To: \"longzenbiker@gmail.com\",\r\n");
      out.write("                    From: \"longnvse04068@gmail.com\",\r\n");
      out.write("                    Subject: \"Code Reset Password\",\r\n");
      out.write("                    Body: \"hi\",\r\n");
      out.write("                }).then(\r\n");
      out.write("                        message => alert(\"Gửi mã xác thực thành công , vui lòng kiểm tra email!\\n \", res)\r\n");
      out.write("//                }\r\n");
      out.write("                ).catch(err => {\r\n");
      out.write("                    message => alert(\"Không thể gửi mail!\")\r\n");
      out.write("                });\r\n");
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
        out.write("                                                if(document.getElementById('checkDuplicateUser').innerHTML == 'Da ton tai');\r\n");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty duplicateUser}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                if(document.getElementById('checkDuplicateUser').innerHTML == 'Da ton tai');\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
