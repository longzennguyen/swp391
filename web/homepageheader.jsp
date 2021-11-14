<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- Font awesome -->
        <link rel="stylesheet" href="css/fontawesome-all.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/font-awesome.css">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <!-- Owl carousel -->
        <link rel="stylesheet" href="css/owl.carousel.css">
        <!-- Template main Css -->
        <link rel="stylesheet" href="css/style.css">
        <!-- Modernizr -->
        <script src="js/jquery-2.1.1.min.js"></script> 
        <!--Google Fonts-->
        <link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>

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
                                <c:if test="${empty user}">
                                    <li><a href="homepage">Home</a></li>
                                    <li><a href="about.jsp">About</a></li>
                                    <li class="has-child"><a href="servicelist">Services</a></li>
                                    <li><a href="${pageContext.request.contextPath}/reservation">Reservation</a></li>
                                    <li><a href="${pageContext.request.contextPath}/bloglist">Blog</a></li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/login">Login</a>
                                    </li>  
                                </c:if>

                                <c:if test="${not empty user && user.getRole_id() == 5}">
                                    <li><a href="homepage">Home</a></li>
                                    <li><a href="about.jsp">About</a></li>
                                    <li class="has-child"><a href="servicelist">Services</a></li>
                                    <li><a href="${pageContext.request.contextPath}/reservation">Reservation</a></li>
                                    <li><a href="${pageContext.request.contextPath}/bloglist">Blog</a></li>                                  
                                    <li class="has-child"><a href="#">Hello, ${user.name}</a>                                       
                                        <ul class="submenu">
                                            <li class="submenu-item"><a href="userprofile?id=${user.user_id}">Profile</a></li>
                                            <li class="submenu-item"><a href="logout">Log Out</a></li>
                                        </ul>
                                    </li>
                                </c:if>


                                <c:if test="${not empty user && user.getRole_id() == 2}">
                                    <li><a href="Manager.jsp">Manager</a></li>
                                    <li><a href="feedbacklist">Feedback</a></li>
                                    <li class="has-child"><a href="servicelist">Services</a></li>
                                    <li><a href="#">Posts</a></li>
                                    <li><a href="customerlist?word=">Customer</a></li>                                   
                                    <li class="has-child"><a href="#">Hello, ${user.name}</a>
                                        <ul class="submenu">
                                            <li class="submenu-item"><a href="userprofile?id=${user.user_id}">Profile</a></li>
                                            <li class="submenu-item"><a href="logout">Log Out</a></li>
                                        </ul>
                                    </li>
                                </c:if>    

                            </ul>                             
                        </div> <!-- /#navbar -->

                    </div> <!-- /.container -->

                </div> <!-- /.navbar-main -->

            </nav> 

        </header> <!-- /. main-header -->



        <!--  Scripts
   ================================================== -->

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script>
            window.jQuery || document.write('<script src="js/jquery-1.11.1.min.js"><\script>');
        </script>

        <!-- Bootsrap javascript file -->
        <script src="js/bootstrap.min.js"></script>

        <!-- owl carouseljavascript file -->
        <script src="js/owl.carousel.min.js"></script>

        <!-- Template main javascript -->
        <script src="js/main.js"></script>
        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!--//scrolling js-->
        <script src="js/bootstrap.js"></script>


    </body>
</html>