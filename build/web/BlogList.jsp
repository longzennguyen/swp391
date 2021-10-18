<%-- 
    Document   : BlogList
    Created on : Oct 14, 2021, 8:36:24 PM
    Author     : Macbook Air M1
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="entity.Blogs"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="dao.DBContext_Postgresql"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <%@include file="homepageheader.jsp"%>
        <form action="BlogsListServlet" action="POST">
            <div class="main-container">
                <div class="our-causes fadeIn animated">
                    <div class="container">
                        <h2 class="title-style-1">Blog List<span class="title-under"></span></h2>

                        <div class="row">
                            <c:forEach var="name" items="${listBlog}">
                                <div class="col-md-3 col-sm-6">
                                    <div class="cause">
                                        <input type="text" name="blog_id" value="${name.post_id}" hidden="true"/>
                                        <img src="img/cause-hunger.jpg" alt="" class="cause-img">
                                        <h4 class="cause-title"><a href="#">${name.title}</a></h4>
                                        <div class="cause-details">
                                            ${name.description}
                                        </div>
                                        <div class="btn-holder text-center">
                                            <button type="submit" class="btn btn-primary" name="service" value="detail">Detail</a>
                                        </div>
                                    </div> <!-- /.cause -->

                                </div> 
                            </c:forEach>
                        </div>


                    </div>

                </div> <!-- /.our-causes -->

            </div> <!-- /.main-container  -->
        </form>
        <%@include file="homepagefooter.jsp"%>



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
