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
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>        \n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <nav class=\"navbar navbar-static-top\">\n");
      out.write("                <div class=\"navbar-top\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6 col-xs-12\">\n");
      out.write("                                <ul class=\"list-unstyled list-inline header-contact\">\n");
      out.write("                                    <li> <i class=\"fa fa-phone\"></i> \n");
      out.write("                                        <a href=\"tel:\">Ha Noi, Viet Nam </a> \n");
      out.write("                                    </li>\n");
      out.write("                                    <li> <i class=\"fa fa-phone\"></i> \n");
      out.write("                                        <a href=\"tel:\">+84 963 974 475 </a> \n");
      out.write("                                    </li>\n");
      out.write("                                    <li> <i class=\"fa fa-envelope\"></i> \n");
      out.write("                                        <a href=\"mailto:ducnthe153062@gmail.com\">ducnthe153062@gmail.com</a> \n");
      out.write("                                    </li>\n");
      out.write("                                </ul> <!-- /.header-contact  -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"navbar-main\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <h1>\n");
      out.write("                                <a class=\"logo\" href=\"homepage.jsp\" style=\"text-decoration: none\">\n");
      out.write("                                    Children Care\n");
      out.write("                                </a>\n");
      out.write("                            </h1>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"navbar\" class=\"navbar-collapse collapse pull-right\">\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li><a class=\"is-active\" href=\"homepage.jsp\">Home</a></li>\n");
      out.write("                                <li><a href=\"#\">About</a></li>\n");
      out.write("                                <li class=\"has-child\"><a href=\"#\">Services</a>\n");
      out.write("                                    <ul class=\"submenu\">\n");
      out.write("                                        <li class=\"submenu-item\"><a href=\"servicelist.jsp\">All Service</a></li>\n");
      out.write("                                        <li class=\"submenu-item\"><a href=\"#\">Service 2</a></li>\n");
      out.write("                                        <li class=\"submenu-item\"><a href=\"#\">Service 3 </a></li>\n");
      out.write("                                        <li class=\"submenu-item\"><a href=\"#\">Service 4</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"#\">Reservation</a></li>\n");
      out.write("                                <li><a href=\"#\">Contact</a></li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"login.jsp\">LOGIN</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>                             \n");
      out.write("                        </div> <!-- /#navbar -->\n");
      out.write("\n");
      out.write("                    </div> <!-- /.container -->\n");
      out.write("\n");
      out.write("                </div> <!-- /.navbar-main -->\n");
      out.write("\n");
      out.write("            </nav> \n");
      out.write("\n");
      out.write("        </header> <!-- /. main-header -->\n");
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
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Carousel-->\n");
      out.write("        <div id=\"homeCarousel\" class=\"carousel carousel-home\" data-ride=\"carousel\">\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                <div class=\"item active\">\n");
      out.write("                    <img src=\"img/home-slider-1.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h2 class=\"carousel-title  \">If your children need help</h2>\n");
      out.write("                            <h4 class=\"carousel-subtitle  \">Use our services</h4>\n");
      out.write("                            <a href=\"servicelist.jsp\" class=\"btn btn-lg btn-secondary hidden-xs\">VIEW NOW</a>\n");
      out.write("                        </div> <!-- /.carousel-caption -->\n");
      out.write("                    </div>\n");
      out.write("                </div> <!-- /.item -->\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- /.carousel -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"section-home about-us fadeIn animated\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2 class=\"title-style-1\">Our Popular Services <span class=\"title-under\"></span></h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"cause\">\n");
      out.write("                            <img src=\"img/cause-hunger.jpg\" alt=\"\" class=\"cause-img\">\n");
      out.write("                            <div class=\" cause-progress\" style=\"text-align: center; background: #144d7b\">\n");
      out.write("                                <h4 style=\"color: white\">Price: 500$</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <h4 class=\"cause-title\"><a href=\"#\">HUNGER AND POVERTY </a></h4>\n");
      out.write("                            <div class=\"cause-details\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"btn-holder text-center\">\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary\" >Detail</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div> <!-- /.service -->\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"cause\">\n");
      out.write("                            <img src=\"img/cause-hunger.jpg\" alt=\"\" class=\"cause-img\">\n");
      out.write("                            <div class=\" cause-progress\" style=\"text-align: center; background: #144d7b\">\n");
      out.write("                                <h4 style=\"color: white\">Price: 500$</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <h4 class=\"cause-title\"><a href=\"#\">HUNGER AND POVERTY </a></h4>\n");
      out.write("                            <div class=\"cause-details\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"btn-holder text-center\">\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary\" >Detail</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div> <!-- /.service -->\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"cause\">\n");
      out.write("                            <img src=\"img/cause-hunger.jpg\" alt=\"\" class=\"cause-img\">\n");
      out.write("                            <div class=\" cause-progress\" style=\"text-align: center; background: #144d7b\">\n");
      out.write("                                <h4 style=\"color: white\">Price: 500$</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <h4 class=\"cause-title\"><a href=\"#\">HUNGER AND POVERTY </a></h4>\n");
      out.write("                            <div class=\"cause-details\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"btn-holder text-center\">\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary\">Detail</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div> <!-- /.service -->\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"cause\">\n");
      out.write("                            <img src=\"img/cause-hunger.jpg\" alt=\"\" class=\"cause-img\">\n");
      out.write("                            <div class=\" cause-progress\" style=\"text-align: center; background: #144d7b\">\n");
      out.write("                                <h4 style=\"color: white\">Price: 500$</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <h4 class=\"cause-title\"><a href=\"#\">HUNGER AND POVERTY </a></h4>\n");
      out.write("                            <div class=\"cause-details\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"btn-holder text-center\">\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary\">Detail</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div> <!-- /.service -->\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"btn-holder text-center\">\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#donateModal\">View All Services</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- /.our-services -->    \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
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
