<%-- 
    Document   : homepageheader
    Created on : Oct 7, 2021, 8:23:35 PM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>        
        <!-- Web-Fonts -->
        <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
              rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
              rel="stylesheet">
        <!-- //Web-Fonts -->
        <!-- Bootsrap -->
        <link rel="stylesheet" href="css/bootstrap.css">

        <!-- Font awesome -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Owl carousel -->
        <link rel="stylesheet" href="css/owl.carousel.css">

        <!-- Template main Css -->
        <link rel="stylesheet" href="css/style.css">

        <!-- Modernizr -->
        <script src="js/modernizr.js"></script>

    </head>

    <body>
        <header class="main-header">
            <nav class="navbar navbar-static-top">
                <div class="navbar-top">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-6 col-xs-12">
                                <ul class="list-unstyled list-inline header-contact">
                                    <li> <i class="fa fa-phone"></i> 
                                        <a href="tel:">Ha Noi, Viet Nam </a> 
                                    </li>
                                    <li> <i class="fa fa-phone"></i> 
                                        <a href="tel:">+84 963 974 475 </a> 
                                    </li>
                                    <li> <i class="fa fa-envelope"></i> 
                                        <a href="mailto:ducnthe153062@gmail.com">ducnthe153062@gmail.com</a> 
                                    </li>
                                </ul> <!-- /.header-contact  -->
                            </div>
                        </div>
                    </div>
                </div>

                <div class="navbar-main">
                    <div class="container">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <h1>
                                <a class="logo" href="homepage" style="text-decoration: none">
                                    Children Care
                                </a>
                            </h1>
                        </div>

                        <div id="navbar" class="navbar-collapse collapse pull-right">
                            <ul class="nav navbar-nav">
                                <li><a href="homepage">Home</a></li>
                                <li><a href="#">About</a></li>
                                <li class="has-child"><a href="servicelist">Services</a></li>
                                <li><a href="#">Reservation</a></li>
                                <li><a href="#">Contact</a></li>
                                <li><a href="BlogsListServlet">Blogs</a></li>
                                <li class="has-child">
                                    <form action="HomePage" method="POST">
                                        <button class='has-child' style="color: blue" name="service" type="submit" value="profile">
                                                <p class="navbar-brand " style="color: white"><%=(request.getAttribute("Name_of_User") == null || request.getAttribute("Name_of_User").toString().length() == 0)
                                                    ? "Login"
                                                    : "" + request.getAttribute("Name_of_User")%></p>
                                            <input name="userId1" value="${userId}" hidden="true"></button>
                                    </form>
                                </li>
                            </ul>                             
                        </div> <!-- /#navbar -->

                    </div> <!-- /.container -->

                </div> <!-- /.navbar-main -->

            </nav> 

        </header> <!-- /. main-header -->



        <!--  Scripts
   ================================================== -->

        <!-- jQuery -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script>
            window.jQuery || document.write('<script src="assets/js/jquery-1.11.1.min.js"><\script>');
        </script>

        <!-- Bootsrap javascript file -->
        <script src="js/bootstrap.min.js"></script>

        <!-- owl carouseljavascript file -->
        <script src="js/owl.carousel.min.js"></script>

        <!-- Template main javascript -->
        <script src="js/main.js"></script>


    </body>
</html>