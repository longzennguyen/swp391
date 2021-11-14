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
        <link rel="stylesheet" href="css/feedback.css">
        <!-- Modernizr -->
        <script src="js/modernizr.js"></script>
        <link href="//fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
    </head>
    <body style="background-image: url(img/background.jpg);">
        <%@include file="homepageheader.jsp"%>
        

        <h1 class="agile_head text-center" style="color: #00aced">Feedback For Our Service</h1>
        <div class="w3layouts_main wrap">
            <h3>Please help us to serve you better by taking a couple of minutes. </h3>
            <form action="feedback" method="post" class="agile_form">
                <h2>How satisfied were you about our Service?</h2>
                <ul class="agile_info_select">
                    <li><input type="radio" name="star" id="excellent" value="5"> 
                        <label for="excellent">excellent</label>
                        <div class="check"></div>
                    </li>
                    <li><input type="radio" name="star" id="good" value="4"> 
                        <label for="good"> good</label>
                        <div class="check "></div>
                    </li>
                    <li><input type="radio" name="star" id="neutral" value="3"> 
                        <label for="neutral">neutral</label>
                        <div class="check "></div>
                    </li>
                    <li><input type="radio" name="star" id="poor" value="2"> 
                        <label for="poor">poor</label>
                        <div class="check"></div>
                    </li>
                    <li><input type="radio" name="vstar" id="poor" value="1"> 
                        <label for="poor">very bad</label>
                        <div class="check"></div>
                    </li>
                </ul>	  
                <h2>If you have specific feedback, please write to us...</h2>
                <textarea placeholder="Additional comments" class="w3l_summary" name="content"  required=""></textarea>           
                <input type="submit" value="send" class="agileinfo" />
            </form>
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
