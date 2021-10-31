<%-- 
    Document   : feedbackdetail
    Created on : Oct 29, 2021, 12:57:38 AM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback Detail</title>
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
            <h1 class="page-title" style="color: #0076a3">Feedback Detail</h1>
        </div>
        
        <div class="main-container" style="margin-top: -100px">

            <div class="container">

                <div class="row fadeIn animated">

                    <div class="col-md-6">

                        <h2 class="title-style-2"> Feedback by: <span class="title-under"></span></h2>                        
                        <p style="font-weight: bold; font-size: 20px">
                            ${data.created_by}
                        </p>

                    </div>

                    <div class="col-md-6">

                        <h2 class="title-style-2"> Created at: <span class="title-under"></span></h2>
                        <p style="font-weight: bold; font-size: 20px">
                            ${data.created}
                        </p>

                    </div>

                </div>
                <br/>
                <br/>
                <h2>Content: </h2>
                <div class="row">

                    <div class="col-md-12 fadeIn animated">
                        <p>
                            ${data.content}
                        </p>
                    </div>
                </div>
                <h2>Number of Stars: ${data.starno}</h2>                      
                <br/>
                <br/>
                <div class="text-center">
                    <a href="feedbacklist" class="btn btn-primary">Back to List</a>
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
