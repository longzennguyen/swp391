<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : homepage
    Created on : Oct 7, 2021, 9:36:00 PM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <!-- //Web-Fonts -->
        <!-- Bootsrap -->
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

        <%@include file="homepageheader.jsp"%>
        <div id="homeCarousel" class="carousel slide carousel-home" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#homeCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#homeCarousel" data-slide-to="1"></li>
                <li data-target="#homeCarousel" data-slide-to="2"></li>
                <li data-target="#homeCarousel" data-slide-to="3"></li>
            </ol>

            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="img/home-slider-4.jpg" alt="" style="width: 1920px;height: 580px">
                    <div class="container">
                        <div class="carousel-caption">
                            <h2 class="carousel-title bounceInDown animated slow">Believe in our Service</h2>
                            <h4 class="carousel-subtitle bounceInUp animated slow ">We won't let you down</h4>
                            <a href="servicelist" class="btn btn-lg btn-secondary hidden-xs bounceInUp animated slow" >View Service</a>
                        </div> <!-- /.carousel-caption -->
                    </div>
                </div> <!-- /.item -->


                <div class="item ">

                    <img src="img/home-slider-3.jpg" alt="" style="width: 1920px;height: 580px">

                    <div class="container">

                        <div class="carousel-caption">

                            <h2 class="carousel-title bounceInDown animated slow">Together we can improve our lives</h2>
                            <h4 class="carousel-subtitle bounceInUp animated slow"> So let's do it!</h4>
                            <a href="bloglist" class="btn btn-lg btn-secondary hidden-xs bounceInUp animated">Read Blog</a>

                        </div> <!-- /.carousel-caption -->

                    </div>

                </div> <!-- /.item -->


                <div class="item ">

                    <img src="img/home-slider-1.jpg" alt="" style="width: 1920px;height: 580px">

                    <div class="container">

                        <div class="carousel-caption">

                            <h2 class="carousel-title bounceInDown animated slow" >Wanna know about us?</h2>
                            <h4 class="carousel-subtitle bounceInUp animated slow">You can view our information</h4>
                            <a href="about.jsp" class="btn btn-lg btn-secondary hidden-xs bounceInUp animated slow">View Now</a>

                        </div> <!-- /.carousel-caption -->

                    </div>

                </div> <!-- /.item -->
                
                <div class="item ">

                    <img src="img/home-slider-1.jpg" alt="" style="width: 1920px;height: 580px">

                    <div class="container">

                        <div class="carousel-caption">

                            <h2 class="carousel-title bounceInDown animated slow" >Wanna know about us?</h2>
                            <h4 class="carousel-subtitle bounceInUp animated slow">You can view our information</h4>
                            <a href="about.jsp" class="btn btn-lg btn-secondary hidden-xs bounceInUp animated slow">View Now</a>

                        </div> <!-- /.carousel-caption -->

                    </div>

                </div> <!-- /.item -->

            </div>

            <a class="left carousel-control" href="#homeCarousel" role="button" data-slide="prev">
                <span class="fa fa-angle-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>

            <a class="right carousel-control" href="#homeCarousel" role="button" data-slide="next">
                <span class="fa fa-angle-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>

        </div><!-- /.carousel -->





        <div class="section-home about-us">
            <div class="container">
                <h2 class="title-style-1">Our Popular Services <span class="title-under"></span></h2>
                <div class="row">
                    <c:forEach var="i" items="${serviceListTop}">
                        <div class="col-md-3 col-sm-6">
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
                                    <a href="servicedetail?id=${i.service_id}" class="btn btn-primary">Detail</a>
                                </div>
                            </div> <!-- /.cause -->
                        </div>  
                    </c:forEach>

                    <div class="text-center">
                        <a href="servicelist" class="btn btn-primary">View All Services</a>
                    </div>

                </div>
            </div> <!-- /.our-services --> 
        </div>

        <div class="section-home about-us">
            <div class="container">
                <h2 class="title-style-1">Our Blogs <span class="title-under"></span></h2>
                <div class="row">
                    <c:forEach var="o" items="${blogListTop}">
                        <div class="col-md-3 col-sm-6">
                            <div class="cause" style="background-color: #0076a3; color: white">
                                <img src="${o.image}" alt="" class="cause-img" style="width: 250px; height: 150px; margin-left: 7px; margin-top: 20px">
                                <h4 class="cause-title" style="color: white;margin-top: 20px">${o.title}</h4>
                                <div class="cause-details" style="margin-top: 20px">
                                    ${o.description}.
                                    ${o.description}.
                                    ${o.description}
                                    <br/>
                                    ${o.description}.
                                    ${o.description}.
                                    ${o.description}
                                </div>
                                <div class="btn-holder text-center">
                                    <a href="blogdetail?id=${o.post_id}" class="btn btn-primary" >Read now</a>
                                </div>
                            </div> <!-- /.service -->
                        </div> 
                    </c:forEach> 
                    <div class="btn-holder text-center">
                        <a href="bloglist" class="btn btn-primary">View All Blogs</a>
                    </div>
                </div>
            </div> <!-- /.our-services --> 
        </div>


        <%@include file="homepagefooter.jsp"%>






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
