<%-- 
    Document   : about
    Created on : Oct 27, 2021, 9:49:30 PM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About</title>
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
        <div class="page-heading text-center">
            <h1 class="page-title" style="color: #0076a3">ABOUT US</h1>
        </div>

        <div class="main-container">

            <div class="container">

                <div class="row fadeIn animated">

                    <div class="col-md-6">

                        <img src="img/hinh2.png" alt="" class="img-responsive" style="margin-top: 10px">

                    </div>

                    <div class="col-md-6">

                        <h2 class="title-style-2">CHILDREN CARE PROJECT TEAM <span class="title-under"></span></h2>

                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus, nulla quae possimus id fugit totam perspiciatis ad consequatur natus dolores unde ipsa, architecto, dignissimos corrupti explicabo provident debitis suscipit, beatae!
                        </p>

                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Modi pariatur, voluptatum molestiae voluptas ducimus tempora numquam eligendi quos, quia aut quidem et, odio deleniti amet natus accusamus fugit! Temporibus, tenetur.
                        </p>

                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Esse voluptatem, ea, quisquam vero ullam nesciunt recusandae expedita similique nisi! Ducimus, reiciendis, quia. Explicabo minima error excepturi minus, aperiam illum fugit.
                        </p>

                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Modi pariatur, voluptatum molestiae voluptas ducimus tempora numquam eligendi quos, quia aut quidem et, odio deleniti amet natus accusamus fugit! Temporibus, tenetur.
                        </p>

                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Esse voluptatem, ea, quisquam vero ullam nesciunt recusandae expedita similique nisi! Ducimus, reiciendis, quia. Explicabo minima error excepturi minus, aperiam illum fugit , quia. Explicabo minima error excepturi minus, aperiam illum fugit.

                        </p>

                    </div>

                </div> <!-- /.row -->

            </div>


            <div class="our-team animate-onscroll fadeIn">

                <div class="container">

                    <h2 class="title-style-1">Our Team <span class="title-under"></span></h2>

                    <div class="row">
                        <c:forEach begin="1" end="4">
                            <div class="col-md-3 col-sm-6">

                            <div class="team-member">

                                <div class="thumnail">

                                    <img src="img/hinh1.png" alt="" class="cause-img">

                                </div>



                                <h4 class="member-name"><a href="#">Nguyen Tien Duc</a></h4>

                                <div class="member-position">
                                    CO-FOUNDER
                                </div>
                            </div> <!-- /.team-member -->

                        </div>
                        </c:forEach>   

                    </div> <!-- /.row -->

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
