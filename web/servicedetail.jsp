<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : servicedetail
    Created on : Oct 14, 2021, 9:08:44 PM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Service Detail</title>
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
                        <a href="servicelist">Service List</a>
                    </li>
                    <li class="breadcrumb-item active" aria-current="page">Service Detail</li>
                </ol>
            </div>                     
        </div>

        <div class="page-heading text-center">
            <h1 class="page-title" style="color: #0076a3">${data.title}</h1>
        </div>
        <div class="main-container" style="margin-top: -100px">

            <div class="container">

                <div class="row">

                    <div class="col-md-12 fadeIn animated">
                        <p>
                            ${data.description}
                        </p>

                    </div>
                    <center>
                        <img src="${data.img}" alt="" style="max-width: 700px; max-height: 500px; ">
                    </center>
                </div>

                <div class="row fadeIn animated">

                    <div class="col-md-6">

                        <h2 class="title-style-2"> Service Category <span class="title-under"></span></h2>                        
                        <p>
                            <c:if test="${data.category_id == 1}">
                            <p style="font-weight: bold; font-size: 20px">
                                Medical Care
                            </p>
                        </c:if>
                        <c:if test="${data.category_id == 2}">
                            <p style="font-weight: bold; font-size: 20px">
                                Surgery
                            </p>
                        </c:if>
                        <c:if test="${data.category_id == 3}">
                            <p style="font-weight: bold; font-size: 20px">
                                Other Medical
                            </p>
                        </c:if>
                        </p>

                    </div>

                    <div class="col-md-6">

                        <h2 class="title-style-2"> Service Price <span class="title-under"></span></h2>
                        <p style="font-weight: bold; font-size: 20px">
                            Price: $${data.price}
                        </p>

                    </div>

                </div>
                <br/>
                <br/>
                <div class="row">

                    <div class="col-md-12 fadeIn animated">
                        <p>
                            ${data.description}
                            ${data.description}
                            <br/>
                            ${data.description}
                            ${data.description}
                        </p>
                    </div>
                </div>
                <br/>
                <br/>
                <div class="text-center">
                    <a href="${pageContext.request.contextPath}/service/add-to-cart?id=${data.service_id}" class="btn btn-primary">Buy Now</a>
                    <a href="#" class="btn btn-primary">Feedback</a>
                </div>        



            </div>
        </div>



        <%@include file="homepagefooter.jsp"%>
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
