package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/homepageheader.jsp");
    _jspx_dependants.add("/homepagefooter.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\n");
      out.write("        <!-- Owl carousel -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("\n");
      out.write("        <!-- Template main Css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("        <!-- Modernizr -->\n");
      out.write("        <script src=\"js/modernizr-2.6.2.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>        \r\n");
      out.write("        <!-- Web-Fonts -->\r\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- //Web-Fonts -->\r\n");
      out.write("        <!-- Bootsrap -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Font awesome -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Owl carousel -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Template main Css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Modernizr -->\r\n");
      out.write("        <script src=\"js/modernizr.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <header class=\"main-header\">\r\n");
      out.write("            <nav class=\"navbar navbar-static-top\">\r\n");
      out.write("                <div class=\"navbar-top\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-6 col-xs-12\">\r\n");
      out.write("                                <ul class=\"list-unstyled list-inline header-contact\">\r\n");
      out.write("                                    <li> <i class=\"fa fa-phone\"></i> \r\n");
      out.write("                                        <a href=\"tel:\">Ha Noi, Viet Nam </a> \r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li> <i class=\"fa fa-phone\"></i> \r\n");
      out.write("                                        <a href=\"tel:\">+84 963 974 475 </a> \r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li> <i class=\"fa fa-envelope\"></i> \r\n");
      out.write("                                        <a href=\"mailto:ducnthe153062@gmail.com\">ducnthe153062@gmail.com</a> \r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul> <!-- /.header-contact  -->\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"navbar-main\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"navbar-header\">\r\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <h1>\r\n");
      out.write("                                <a class=\"logo\" href=\"homepage\" style=\"text-decoration: none\">\r\n");
      out.write("                                    Children Care\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"navbar\" class=\"navbar-collapse collapse pull-right\">\r\n");
      out.write("                            <ul class=\"nav navbar-nav\">\r\n");
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("\r\n");
      out.write("                            </ul>                             \r\n");
      out.write("                        </div> <!-- /#navbar -->\r\n");
      out.write("\r\n");
      out.write("                    </div> <!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("                </div> <!-- /.navbar-main -->\r\n");
      out.write("\r\n");
      out.write("            </nav> \r\n");
      out.write("\r\n");
      out.write("        </header> <!-- /. main-header -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--  Scripts\r\n");
      out.write("   ================================================== -->\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            window.jQuery || document.write('<script src=\"assets/js/jquery-1.11.1.min.js\"><\\script>');\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootsrap javascript file -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- owl carouseljavascript file -->\r\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Template main javascript -->\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <div id=\"homeCarousel\" class=\"carousel slide carousel-home\" data-ride=\"carousel\">\n");
      out.write("            <!-- Indicators -->\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#homeCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#homeCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#homeCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\n");
      out.write("                <div class=\"item active\">\n");
      out.write("\n");
      out.write("                    <img src=\"img/home-slider-4.jpg\" alt=\"\" style=\"width: 1920px;height: 580px\">\n");
      out.write("\n");
      out.write("                    <div class=\"container\">\n");
      out.write("\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("\n");
      out.write("                            <h2 class=\"carousel-title bounceInDown animated slow\">Believe in our Service</h2>\n");
      out.write("                            <h4 class=\"carousel-subtitle bounceInUp animated slow \">We won't let you down</h4>\n");
      out.write("                            <a href=\"servicelist\" class=\"btn btn-lg btn-secondary hidden-xs bounceInUp animated slow\" >View Service</a>\n");
      out.write("\n");
      out.write("                        </div> <!-- /.carousel-caption -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div> <!-- /.item -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"item \">\n");
      out.write("\n");
      out.write("                    <img src=\"img/home-slider-3.jpg\" alt=\"\" style=\"width: 1920px;height: 580px\">\n");
      out.write("\n");
      out.write("                    <div class=\"container\">\n");
      out.write("\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("\n");
      out.write("                            <h2 class=\"carousel-title bounceInDown animated slow\">Together we can improve our lives</h2>\n");
      out.write("                            <h4 class=\"carousel-subtitle bounceInUp animated slow\"> So let's do it!</h4>\n");
      out.write("                            <a href=\"bloglist\" class=\"btn btn-lg btn-secondary hidden-xs bounceInUp animated\">Read Blog</a>\n");
      out.write("\n");
      out.write("                        </div> <!-- /.carousel-caption -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div> <!-- /.item -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"item \">\n");
      out.write("\n");
      out.write("                    <img src=\"img/home-slider-1.jpg\" alt=\"\" style=\"width: 1920px;height: 580px\">\n");
      out.write("\n");
      out.write("                    <div class=\"container\">\n");
      out.write("\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("\n");
      out.write("                            <h2 class=\"carousel-title bounceInDown animated slow\" >Wanna know about us?</h2>\n");
      out.write("                            <h4 class=\"carousel-subtitle bounceInUp animated slow\">You can view our information</h4>\n");
      out.write("                            <a href=\"about.jsp\" class=\"btn btn-lg btn-secondary hidden-xs bounceInUp animated slow\">View Now</a>\n");
      out.write("\n");
      out.write("                        </div> <!-- /.carousel-caption -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div> <!-- /.item -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <a class=\"left carousel-control\" href=\"#homeCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("<!--                <span class=\"fa fa-angle-left\" aria-hidden=\"true\"></span>-->\n");
      out.write("<!--                <span class=\"sr-only\">Previous</span>-->\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <a class=\"right carousel-control\" href=\"#homeCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("<!--                <span class=\"fa fa-angle-right\" aria-hidden=\"true\"></span>-->\n");
      out.write("<!--                <span class=\"sr-only\">Next</span>-->\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("        </div><!-- /.carousel -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"section-home about-us\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2 class=\"title-style-1\">Our Popular Services <span class=\"title-under\"></span></h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("                        <a href=\"servicelist\" class=\"btn btn-primary\">View All Services</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div> <!-- /.our-services --> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"section-home about-us\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2 class=\"title-style-1\">Our Blogs <span class=\"title-under\"></span></h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                    <div class=\"btn-holder text-center\">\n");
      out.write("                        <a href=\"bloglist\" class=\"btn btn-primary\">View All Blogs</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div> <!-- /.our-services --> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <!-- Web-Fonts -->\r\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("        <!-- //Web-Fonts -->\r\n");
      out.write("        <!-- Bootsrap -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Font awesome -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Owl carousel -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Template main Css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Modernizr -->\r\n");
      out.write("        <script src=\"js/modernizr.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <footer class=\"main-footer\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"footer-top\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"footer-main\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"footer-col\">\r\n");
      out.write("\r\n");
      out.write("                                <h4 class=\"footer-title\">About Children Care <span class=\"title-under\"></span></h4>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"footer-content\">\r\n");
      out.write("\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        <strong>ChildrenCare </strong> is ..... ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.\r\n");
      out.write("                                    </p> \r\n");
      out.write("\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        ILorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.\r\n");
      out.write("                                    </p>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"footer-col\">\r\n");
      out.write("                                <h4 class=\"footer-title\">Policies<span class=\"title-under\"></span></h4>\r\n");
      out.write("                                <div class=\"footer-content\">\r\n");
      out.write("                                    <ul class=\"tweets list-unstyled\">\r\n");
      out.write("                                        <li class=\"tweet\"><a href=\"#\">Privacy Policy 1</a></li>\r\n");
      out.write("                                        <li class=\"tweet\"><a href=\"#\">Privacy Policy 2</a></li>\r\n");
      out.write("                                        <li class=\"tweet\"><a href=\"#\">Privacy Policy 3</a></li>\r\n");
      out.write("                                        <li class=\"tweet\"><a href=\"#\">Privacy Policy 4</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"footer-col\">\r\n");
      out.write("                                <h4 class=\"footer-title\">Contact us <span class=\"title-under\"></span></h4>\r\n");
      out.write("                                <div class=\"footer-content\">\r\n");
      out.write("                                    <ul class=\"tweets list-unstyled\">\r\n");
      out.write("                                        <li class=\"tweet\">Facebook:   <a href=\"#\">Nguyen Tien Duc</a></li>\r\n");
      out.write("                                        <li class=\"tweet\">Email:   <a href=\"#\">ducnthe153062@fpt.edu.vn</a></li>\r\n");
      out.write("                                        <li class=\"tweet\">Phone Number:   <a href=\"#\">+84 963 974 475</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clearfix\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"footer-bottom\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container text-right\">\r\n");
      out.write("                    ChildrenCare @ copyrights 2021 - by DucNT\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </footer> <!-- main-footer -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--  Scripts\r\n");
      out.write("   ================================================== -->\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            window.jQuery || document.write('<script src=\"assets/js/jquery-1.11.1.min.js\"><\\script>');\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootsrap javascript file -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- owl carouseljavascript file -->\r\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Template main javascript -->\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            window.jQuery || document.write('<script src=\"js/jquery-1.11.1.min.js\"><\\script>');\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <li><a href=\"homepage\">Home</a></li>\r\n");
        out.write("                                    <li><a href=\"about.jsp\">About</a></li>\r\n");
        out.write("                                    <li class=\"has-child\"><a href=\"servicelist\">Services</a></li>\r\n");
        out.write("                                    <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/reservation\">Reservation</a></li>\r\n");
        out.write("                                    <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/bloglist\">Blog</a></li>\r\n");
        out.write("\r\n");
        out.write("                                    <li>\r\n");
        out.write("                                        <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/login\">Login</a>\r\n");
        out.write("                                    </li>  \r\n");
        out.write("                                ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty user && user.getRole_id() == 5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <li><a href=\"homepage\">Home</a></li>\r\n");
        out.write("                                    <li><a href=\"about.jsp\">About</a></li>\r\n");
        out.write("                                    <li class=\"has-child\"><a href=\"servicelist\">Services</a></li>\r\n");
        out.write("                                    <li><a  href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/reservation\">Reservation</a></li>\r\n");
        out.write("                                    <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/bloglist\">Blog</a></li>                                  \r\n");
        out.write("                                    <li class=\"has-child\"><a href=\"#\">Hello, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>                                       \r\n");
        out.write("                                        <ul class=\"submenu\">\r\n");
        out.write("                                            <li class=\"submenu-item\"><a href=\"userprofile?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.user_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Profile</a></li>\r\n");
        out.write("                                            <li class=\"submenu-item\"><a href=\"logout\">Log Out</a></li>\r\n");
        out.write("                                        </ul>\r\n");
        out.write("                                    </li>\r\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty user && user.getRole_id() == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <li><a href=\"Manager.jsp\">Manager</a></li>\r\n");
        out.write("                                    <li><a href=\"feedbacklist\">Feedback</a></li>\r\n");
        out.write("                                    <li class=\"has-child\"><a href=\"servicelist\">Services</a></li>\r\n");
        out.write("                                    <li><a href=\"#\">Posts</a></li>\r\n");
        out.write("                                    <li><a href=\"customerlist?word=\">Customer</a></li>                                   \r\n");
        out.write("                                    <li class=\"has-child\"><a href=\"#\">Hello, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\r\n");
        out.write("                                        <ul class=\"submenu\">\r\n");
        out.write("                                            <li class=\"submenu-item\"><a href=\"userprofile?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.user_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Profile</a></li>\r\n");
        out.write("                                            <li class=\"submenu-item\"><a href=\"logout\">Log Out</a></li>\r\n");
        out.write("                                        </ul>\r\n");
        out.write("                                    </li>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${serviceListTop}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"col-md-3 col-sm-6\">\n");
          out.write("                            <div class=\"cause\">\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" class=\"cause-img\" style=\"width: 250px; height: 150px; margin-left: 7px\">\n");
          out.write("                                <div class=\" cause-progress\" style=\"text-align: center; background: #144d7b\">\n");
          out.write("                                    <h4 style=\"color: white\">Price: $");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\" cause-progress\" style=\"text-align: center\">\n");
          out.write("                                    <a href=\"servicedetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.service_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><h4 style=\"font-weight: bold\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4></a>\n");
          out.write("                                </div>                                  \n");
          out.write("                                <div class=\"cause-details\">\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"text-center\">\n");
          out.write("                                    <a href=\"servicedetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.service_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-primary\">Detail</a>\n");
          out.write("                                </div>\n");
          out.write("                            </div> <!-- /.cause -->\n");
          out.write("                        </div>  \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("o");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${blogListTop}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"col-md-3 col-sm-6\">\n");
          out.write("                            <div class=\"cause\" style=\"background-color: #0076a3; color: white\">\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" class=\"cause-img\" style=\"width: 250px; height: 150px; margin-left: 7px; margin-top: 20px\">\n");
          out.write("                                <h4 class=\"cause-title\" style=\"color: white;margin-top: 20px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                <div class=\"cause-details\" style=\"margin-top: 20px\">\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    <br/>\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"btn-holder text-center\">\n");
          out.write("                                    <a href=\"blogdetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.post_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-primary\" >Read now</a>\n");
          out.write("                                </div>\n");
          out.write("                            </div> <!-- /.service -->\n");
          out.write("                        </div> \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
