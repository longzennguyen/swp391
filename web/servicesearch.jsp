<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : servicelist
    Created on : Oct 7, 2021, 9:20:04 PM
    Author     : ROG STRIX
--%>

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
        <div class="breadcrumb-agile ">
            <div aria-label="breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item">
                        <a href="homepage">Home</a>
                    </li>
                    <li class="breadcrumb-item active" aria-current="page">Service List</li>
                </ol>
            </div>                     
        </div>    

        <div class="main-container">
            <div >
                <div class="container">
                    <h2 class="title-style-1">OUR SERVICES<span class="title-under"></span></h2>
                    <div class="row col-md-10 col-sm-12">
                        <c:if test="${empty serviceList}">
                            <h1>Service not found<h1>
                                </c:if>
                                <c:forEach var="i" items="${serviceList}">
                                    <div class="col-md-4 col-sm-6">
                                        <div class="cause">
                                            <img src="${i.img}" alt="" class="cause-img" style="width: 250px; height: 150px; margin-left: 7px">
                                            <div class=" cause-progress" style="text-align: center; background: #144d7b">
                                                <h4 style="color: white">Price: $${i.price}</h4>
                                            </div>
                                            <div class=" cause-progress" style="text-align: center">
                                                <a href="servicedetail?id="${i.service_id}"><h4 style="font-weight: bold"> ${i.title}</h4></a>
                                            </div>                                  
                                            <div class="cause-details">
                                                ${i.description}
                                            </div>
                                            <div class="text-center">
                                                <a href="#" class="btn btn-primary">Buy</a>
                                                <a href="#" class="btn btn-primary">Feedback</a>
                                            </div>
                                        </div> <!-- /.cause -->
                                    </div>  
                                </c:forEach>                                                                            
                                </div>                    
                                <div class="row col-lg-2" style="margin-left: 30px; border-width:1px;border-style:solid; border-color:#144d7b">
                                    <form class="input-group text-center" style="display: inline-block" >
                                        <input type="text" class="form-control rounded" name ="word" placeholder="Search" aria-label="Search" style="margin-top: 10px" action="servicesearch?page=1" method="POST"/>
                                        <button type="submit" class="btn btn-outline-primary" style="background-color: #0076a3; color: white;margin-top: 10px">Search</button>
                                    </form>
                                    <a href="#"><h4 style="font-weight: bold">Medical Care</h4></a>
                                    <a href="#"><h4 style="font-weight: bold">Surgery</h4></a>
                                    <a href="#"><h4 style="font-weight: bold">Other Medical</h4></a>
                                </div>

                                </div>

                                </div> <!-- /.our-causes -->


                                <div class="container">
                                    <ul class="pagination">
                                        <c:if test="${page != 1}">
                                            <li class="icon">
                                                <a href="servicesearch?page=${page-1}&word=${word}">Previous</a>
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
                                                        <a href="servicesearch?page=${i}&word=${word}">${i}</a>
                                                    </li>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:forEach>
                                        <!-- If page != Last display Next -->            
                                        <c:if test="${page lt numberPage}">
                                            <li class="icon">
                                                <a  href="servicesearch?page=${page+1}&word=${word}">Next</a>
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
