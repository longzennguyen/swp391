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
        <title>Blog Detail</title>
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

        <div class="breadcrumb-agile ">
            <div aria-label="breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item">
                        <a href="homepage">Home</a>
                    </li>
                    <li class="breadcrumb-item">
                        <a href="bloglist">Blog List</a>
                    </li>
                    <li class="breadcrumb-item active" aria-current="page">Blog Detail</li>
                </ol>
            </div>                     
        </div>

        <div class="page-heading text-center">
            <h1 class="page-title" style="color: #0076a3">${data.title}</h1>
        </div>
        <div class="main-container" style="margin-top: -100px">

            <div class="container">

                <div class="row">                                       
                    <center>
                        <img src="${data.image}" alt="" style="width: 800px; height: 400px; ">
                    </center>
                </div>
                    <br/>
                    <br/>
                <div class="col-md-6">
                        <p style="font-weight: bold; font-size: 20px">
                          Created at: ${data.created_at}
                        </p>

                 </div>   
                <br/>
                <br/>
                <div class="row">

                    <div class="col-md-12 fadeIn animated">
                        <p>
                            ${data.detail}
                            <br/>
                            <br/>
                            ${data.detail}
                            <br/>
                            <br/>
                            ${data.detail}
                            <br/>
                            ${data.detail}
                        </p>
                    </div>
                </div>
                <br/>
                <br/>    
                <div class="text-center">
                    <a href="bloglist" class="btn btn-primary">Read more</a>
                </div>   


            </div>
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
