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
      out.write("                        <!--<h2 class=\"text-info\">D???ch v??? ch??m s??c s???c kho??? cho tr???</h2>-->\r\n");
      out.write("                        <h2 class=\"text-info\">Login</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form action=\"login\" method=\"POST\">\r\n");
      out.write("                        <div class=\"form-group\"><label for=\"email\">Email</label><input placeholder=\"Email\" class=\"form-control item\" type=\"email\" name=\"uid\" required></div>\r\n");
      out.write("                        <div class=\"form-group\"><label for=\"password\">Password</label><input placeholder=\"M???t kh???u\" class=\"form-control\" type=\"password\" name=\"pwd\" ></div>\r\n");
      out.write("<!--                        required pattern=\"^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,12}$\"-->\r\n");
      out.write("\r\n");
      out.write("<!--<p class=\"form-group\">");
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
      out.write("                                <p style=\"margin-right: 10%\">Already have an account?<a onclick=\"document.getElementById('resetpass').style.display = 'block'\" style=\"color: blue\">Forgot password?</a></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <button class=\"btn btn-primary btn-block\" type=\"submit\" style=\"margin-top: 10px\">Log In</button></div>\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <button type=\"button\" style=\"margin-top: 10px\" class=\"btn btn-primary btn-block\" data-toggle=\"modal\" data-target=\".bd-example-modal-lg\">Create new Account</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--                            <div class=\"col-md-6\">\r\n");
      out.write("                                                            <button type=\"button\" style=\"margin-top: 10px\" class=\"btn btn-primary btn-block\" data-toggle=\"modal\" data-target=\"#resetpass\">Qu??n m???t kh???u</button>\r\n");
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
      out.write("                        <h5 class=\"modal-title\">????ng k??</h5>\r\n");
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
      out.write("                                    <label class=\"col-2 col-form-label\">M???t kh???u</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"M???t kh???u\" class=\"form-control\" type=\"password\" name=\"password\" id=\"password\" onkeyup=\"validatePassword()\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">X??c th???c m???t kh???u</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"X??c th???c\" class=\"form-control\" type=\"password\" name=\"repassword\" id=\"confirm_password\" onkeyup=\"validatePassword()\" required>\r\n");
      out.write("                                        <small id=\"validatePassword\" class=\"form-text text-muted\"></small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Ng??y sinh</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input class=\"form-control\" type=\"date\" name=\"date\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">S??? ??i???n tho???i</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"S??? ??i???n tho???i\" class=\"form-control\" type=\"number\" name=\"phone\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Gi???i t??nh</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                            <label class=\"form-check-label\">\r\n");
      out.write("                                                <input class=\"form-check-input\" type=\"radio\" name=\"gender\" value=\"1\"> ????n ??ng\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                            <label class=\"form-check-label\">\r\n");
      out.write("                                                <input class=\"form-check-input\" type=\"radio\" name=\"gender\" value=\"0\"> Ph??? n???\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                                <label class=\"col-2 col-form-label\">?????a ch???</label>\r\n");
      out.write("                                <div class=\"col-10\">\r\n");
      out.write("                                    <input placeholder=\"?????a ch???\" class=\"form-control\" type=\"text\" name=\"address\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-primary\">Register</button>-->\r\n");
      out.write("                            <div class=\"modal-footer\" >\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">????ng</button>\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\" name=\"action\" value=\"submit\" >????ng k??</button>\r\n");
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
      out.write("                        <h5 class=\"modal-title\">Reset M???t Kh???u</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <form action=\"ResetPassword\" method=\"POST\">\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">Email</label>\r\n");
      out.write("                                    <div class=\"col-10 input-group\">\r\n");
      out.write("                                        <input placeholder=\"Email\" class=\"form-control\" type=\"text\" name=\"email123123\" required>\r\n");
      out.write("                                        <button class=\"col-sm-4 \" type=\"submit\" style=\"width: 20px;background-color: forestgreen; color: white;border-radius: 4px;\" name=\"service\" value=\"sendmail\">\r\n");
      out.write("                                            G???i code\r\n");
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
      out.write("                                    <label class=\"col-2 col-form-label\">M?? Code</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"M?? code\" class=\"form-control\" type=\"number\" name=\"code\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">M???t kh???u m???i</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"M???t kh???u m???i\" class=\"form-control\" type=\"password\" name=\"passwordr\" id=\"passwordr\" onkeyup=\"validatePasswordr()\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group row\">\r\n");
      out.write("                                    <label class=\"col-2 col-form-label\">X??c th???c m???t kh???u</label>\r\n");
      out.write("                                    <div class=\"col-10\">\r\n");
      out.write("                                        <input placeholder=\"X??c th???c\" class=\"form-control\" type=\"password\" name=\"repasswordr\" id=\"confirm_passwordr\" onkeyup=\"validatePasswordr()\" required>\r\n");
      out.write("                                        <small id=\"validatePassword\" class=\"form-text text-muted\"></small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>-->\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-primary\">Register</button>-->\r\n");
      out.write("<!--                            <div class=\"modal-footer\" >\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\" onclick=\"document.getElementById('resetpass').style.display = 'none'\">????ng</button>\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\" name=\"action\" value=\"submit\" >????ng k??</button>\r\n");
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
      out.write("                        message => alert(\"G???i m?? x??c th???c th??nh c??ng , vui l??ng ki???m tra email!\\n \", res)\r\n");
      out.write("//                }\r\n");
      out.write("                ).catch(err => {\r\n");
      out.write("                    message => alert(\"Kh??ng th??? g???i mail!\")\r\n");
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
