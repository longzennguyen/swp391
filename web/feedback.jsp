<%-- 
    Document   : feedback
    Created on : Nov 1, 2021, 1:19:42 PM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback Page</title>
        <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
              rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
              rel="stylesheet">
<!--        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
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
        

        <div class="main-container fadeIn animated">
            <div class="container">
                <div class="row">

                    <div class="col-md-7 col-sm-12 col-form">

                        <h2 class="title-style-2">Feedback Form <span class="title-under"></span></h2>

                        <form action="php/mail.php" class="contact-form ajax-form">

                            <div class="row">

                                <div class="form-group col-md-6">
                                    <input type="text" name="name" class="form-control" placeholder="Name*" required>
                                </div>

                                <div class="form-group col-md-6">
                                    <input type="email" name="email" class="form-control" placeholder="E-mail*" required>
                                </div>

                            </div>

                            <div class="form-group">
                                <textarea name="message" rows="5" class="form-control" placeholder="Content*" required></textarea>
                            </div>

                            <div class="form-group alerts">

                                <div class="alert alert-success" role="alert">

                                </div>

                                <div class="alert alert-danger" role="alert">

                                </div>

                            </div>	

                            <div class="form-group">
                                <button type="submit" class="btn btn-primary pull-right">Send feedback</button>
                            </div>

                            <div class="clearfix"></div>

                        </form>

                    </div>

                    <div class="col-md-4 col-md-offset-1 col-contact">

                        <h2 class="title-style-2"> OUR CONTACTS <span class="title-under"></span></h2>
                        <p>
                            <b>Children Care</b> ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla .
                        </p>

                        <div class="contact-items">

                            <ul class="list-unstyled contact-items-list">
                                <li class="contact-item"> <span class="contact-icon"> <i class="fa fa-map-marker"></i></span> Ha Noi, Viet Nam</li>
                                <li class="contact-item"> <span class="contact-icon"> <i class="fa fa-phone"></i></span> +84 963 974 475</li>

                                <li class="contact-item"> <span class="contact-icon"> <i class="fa fa-envelope"></i></span> ducnthe153062@fpt.edu.vn</li>
                            </ul>
                        </div>



                    </div>

                </div> <!-- /.row -->


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
        <!--        <script>
                    $(document).ready(function () {
                        $("#myInput").on("keyup", function () {
                            var value = $(this).val().toLowerCase();
                            $(".dropdown-menu li").filter(function () {
                                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                            });
                        });
                    });
                </script>-->
    </body>
</html>
