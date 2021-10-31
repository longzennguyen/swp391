<%-- 
    Document   : admin
    Created on : Sep 20, 2021, 3:27:07 PM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Manager</title>
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
        
        <div class="content text-center" style="margin-top: 50px">
            <h2>Manager Page</h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Unde eaque molestias, fugit obcaecati labore repellat recusandae quod. Enim consequatur fuga temporibus optio aliquam molestiae dicta ullam cupiditate? Tempore, doloribus aliquam?</p>
        </div> 
        <div style="padding-bottom: 400px; margin-left: 50px; margin-right: 50px">
            <table class="table" style="margin-top: 10px">
                <thead>
                    <tr>
                        <th scope="col">No.</th>
                        <th scope="col"></th>
                        <th scope="col">Name of Function</th>
                        <th scope="col"></th>
                        <th scope="col">Option</th>
                        <th scope="col"></th>
                        <th scope="col"></th>
                        <th scope="col"></th>
                    </tr>
                </thead>

                <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td></td>
                            <td>Post List</td>
                            <td></td>
                            <td><button><a href="#">Detail</a></button></td>
                            <td></td>
                            <td></td>
                            <td></td>                    
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td></td>
                            <td>Service List</td>
                            <td></td>
                            <td><button><a href="#">Detail</a></button></td>
                            <td></td>
                            <td></td>
                            <td></td>                    
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td></td>
                            <td>Customer List</td>
                            <td></td>
                            <td><button><a href="customerlist?page=1&word=">Detail</a></button></td>
                            <td></td>
                            <td></td>
                            <td></td>                    
                        </tr>
                        <tr>
                            <th scope="row">4</th>
                            <td></td>
                            <td>Feedback List</td>
                            <td></td>
                            <td><button><a href="feedbacklist">Detail</a></button></td>
                            <td></td>
                            <td></td>
                            <td></td>                    
                        </tr>
                        <tr>
                            <th scope="row">5</th>
                            <td></td>
                            <td>Sider List</td>
                            <td></td>
                            <td><button><a href="#">Detail</a></button></td>
                            <td></td>
                            <td></td>
                            <td></td>                    
                        </tr>
                </tbody>
            </table>
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