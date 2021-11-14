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
        <title>Service List</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
        <!-- Custom Theme files -->      
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
        <!--js-->
        <script src="js/jquery-2.1.1.min.js"></script> 
        <!--icons-css-->
        <link rel="stylesheet" href="css/fontawesome-all.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/font-awesome.css">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <!--Google Fonts-->
        <link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>
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

                        <c:forEach var="i" items="${serviceList}">
                            <div class="col-md-4 col-sm-6">
                                <div class="cause">
                                    <img src="${i.img}" alt="" class="cause-img" style="width: 250px; height: 150px; margin-left: 7px">
                                    <div class=" cause-progress" style="text-align: center; background: #144d7b">
                                        <h4 style="color: white">Price: $${i.price}</h4>
                                    </div>
                                    <div class=" cause-progress" style="text-align: center">
                                        <a href="servicedetail?id=${i.service_id}"><h4 style="font-weight: bold"> ${i.title}</h4></a>
                                    </div>                                  
                                    <div class="cause-details">
                                        ${i.description}
                                    </div>
                                    <div class="text-center">
                                        <a  href="${pageContext.request.contextPath}/service/add-to-cart?id=${i.service_id}" class="btn btn-primary">Buy</a>
                                        <a href="feedback.jsp" class="btn btn-primary">Feedback</a>
                                    </div>
                                </div> <!-- /.cause -->
                            </div>  
                        </c:forEach>                                                                            
                    </div>                    
                    <div class="row col-lg-2" style="margin-left: 30px; border-width:1px;border-style:solid; border-color:#144d7b">
                        <form class="input-group text-center" style="display: inline-block" action="servicesearch?page=1" method="POST">
                            <input type="text" class="form-control rounded" placeholder="Search" aria-label="Search" name ="word" style="margin-top: 10px"/>
                            <button type="submit" class="btn btn-outline-primary" style="background-color: #0076a3; color: white;margin-top: 10px">Search</button>
                        </form>
                        <a><h4 style="font-weight: bold">Medical Care</h4></a>
                        <a><h4 style="font-weight: bold">Surgery</h4></a>
                        <a><h4 style="font-weight: bold">Other Medical</h4></a>
                    </div>
                </div>
            </div> <!-- /.our-causes -->
        </div>

        <div class="container" style="margin-bottom: 50px; padding-bottom: 80px">
            <ul class="pagination" style="font-family: 'Work Sans', sans-serif;">
                <c:if test="${page != 1}">
                    <li class="icon">
                        <a href="servicelist?page=${page-1}"><span class="fa fa-angle-left"></span>Previous</a>
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
                                <a href="servicelist?page=${i}">${i}</a>
                            </li>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
                <!-- If page != Last display Next -->            
                <c:if test="${page lt numberPage}">
                    <li class="icon">
                        <a  href="servicelist?page=${page+1}"> Next<span class="fa fa-angle-right"></span></a>
                    </li>
                </c:if>
            </ul>           
        </div>


        <%@include file="homepagefooter.jsp"%>

        <!-- jQuery -->
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
        <!-- mother grid end here-->
    </body>
</html>
