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


        <!-- Carousel-->
        <div id="homeCarousel" class="carousel carousel-home" data-ride="carousel">
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src="img/home-slider-1.jpg" alt="">
                    <div class="container">
                        <div class="carousel-caption">
                            <h2 class="carousel-title  ">If your children need help</h2>
                            <h4 class="carousel-subtitle  ">Use our services</h4>
                            <a href="servicelist.jsp" class="btn btn-lg btn-secondary hidden-xs">VIEW NOW</a>
                        </div> <!-- /.carousel-caption -->
                    </div>
                </div> <!-- /.item -->
            </div>
        </div> <!-- /.carousel -->



        <div class="section-home about-us fadeIn animated">
            <div class="container">
                <h2 class="title-style-1">Our Popular Services <span class="title-under"></span></h2>
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <div class="cause">
                            <img src="img/cause-hunger.jpg" alt="" class="cause-img">
                            <div class=" cause-progress" style="text-align: center; background: #144d7b">
                                <h4 style="color: white">Price: 500$</h4>
                            </div>
                            <h4 class="cause-title"><a href="#">HUNGER AND POVERTY </a></h4>
                            <div class="cause-details">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.
                            </div>
                            <div class="btn-holder text-center">
                                <a href="#" class="btn btn-primary" >Detail</a>
                            </div>
                        </div> <!-- /.service -->
                    </div> 

                    <div class="col-md-3 col-sm-6">
                        <div class="cause">
                            <img src="img/cause-hunger.jpg" alt="" class="cause-img">
                            <div class=" cause-progress" style="text-align: center; background: #144d7b">
                                <h4 style="color: white">Price: 500$</h4>
                            </div>
                            <h4 class="cause-title"><a href="#">HUNGER AND POVERTY </a></h4>
                            <div class="cause-details">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.
                            </div>
                            <div class="btn-holder text-center">
                                <a href="#" class="btn btn-primary" >Detail</a>
                            </div>
                        </div> <!-- /.service -->
                    </div> 
                    <div class="col-md-3 col-sm-6">
                        <div class="cause">
                            <img src="img/cause-hunger.jpg" alt="" class="cause-img">
                            <div class=" cause-progress" style="text-align: center; background: #144d7b">
                                <h4 style="color: white">Price: 500$</h4>
                            </div>
                            <h4 class="cause-title"><a href="#">HUNGER AND POVERTY </a></h4>
                            <div class="cause-details">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.
                            </div>
                            <div class="btn-holder text-center">
                                <a href="#" class="btn btn-primary">Detail</a>
                            </div>
                        </div> <!-- /.service -->
                    </div> 
                    <div class="col-md-3 col-sm-6">
                        <div class="cause">
                            <img src="img/cause-hunger.jpg" alt="" class="cause-img">
                            <div class=" cause-progress" style="text-align: center; background: #144d7b">
                                <h4 style="color: white">Price: 500$</h4>
                            </div>
                            <h4 class="cause-title"><a href="#">HUNGER AND POVERTY </a></h4>
                            <div class="cause-details">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.
                            </div>
                            <div class="btn-holder text-center">
                                <a href="#" class="btn btn-primary">Detail</a>
                            </div>
                        </div> <!-- /.service -->
                    </div> 
                </div>
                <div class="btn-holder text-center">
                    <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#donateModal">View All Services</a>
                </div>
            </div>
        </div> <!-- /.our-services -->    

        
        
        
        <%@include file="homepagefooter.jsp"%>
























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
