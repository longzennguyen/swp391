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
        <title>Blog List</title>
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
        <%
            if (request.getAttribute("blogList") == null) {
                response.sendRedirect("bloglist");
            }
        %>
        
        <%@include file="homepageheader.jsp"%>

        <div class="breadcrumb-agile ">
            <div aria-label="breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item">
                        <a href="homepage">Home</a>
                    </li>
                    <li class="breadcrumb-item active" aria-current="page">Blog List</li>
                </ol>
            </div>                     
        </div>

        <div class="main-container">
            <div class="our-causes fadeIn animated">
                <div class="container">
                    <h2 class="title-style-1">Blog List<span class="title-under"></span></h2>
                    <div class="row">
                        
                        <c:forEach var="name" items="${blogList}">
                            <div class="col-md-3 col-sm-6" style="max-width: 300px">
                                <div class="cause" style="height: 410px">
                                    <input type="text" name="blog_id" value="${name.post_id}" hidden="true"/>
                                    <img src="${name.image}" alt="" class="cause-img" style="width: 250px; height: 150px; margin-left: 7px">
                                    <h4 class="cause-title" style="height: 20px">
                                        <a href="blogdetail?id=${name.post_id}">${name.title}</a>
                                    </h4>
                                    <div class="cause-details" style="padding-top: 15px; margin-top: 20px">
                                        ${name.description}.
                                        ${name.description}.
                                        ${name.description}.
                                        ${name.description}.
                                    </div>
                                    <div class="text-center">
                                        <a class="btn btn-primary" href="blogdetail?id=${name.post_id}">Detail</a>
                                    </div>
                                </div> <!-- /.cause -->

                            </div> 
                        </c:forEach>
                    </div>

                </div>

            </div> <!-- /.our-causes -->

        </div> <!-- /.main-container  -->


        <div class="container">
            <ul class="pagination">
                <c:if test="${page != 1}">
                    <li class="icon">
                        <a href="bloglist?page=${page-1}">Previous</a>
                    </li>
                </c:if>
                <c:forEach var="i" begin="1" end="${numberPage}">
                    <c:choose>
                        <c:when test="${page eq i}">
                            <li class="page-item active"><a class="page-link">
                                    ${i} <span class="sr-only">(current)</span></a>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <li class="page-item">
                                <a href="bloglist?page=${i}">${i}</a>
                            </li>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
                <!-- If page != Last display Next -->            
                <c:if test="${page lt numberPage}">
                    <li class="icon">
                        <a  href="bloglist?page=${page+1}">Next</a>
                    </li>
                </c:if>
            </ul>
        </div>

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
