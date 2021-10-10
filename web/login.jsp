<%-- 
    Document   : login
    Created on : Oct 8, 2021, 12:40:03 PM
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
        <section class="login_part section_padding " style="background-color: #115c9b; padding-top:20px">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-lg-6 col-md-6">
                        <div class="login_part_text text-center" style="background: white">
                            <div class="login_part_text_iner" style="color: #1290f8">
                                <h2 style="color: #1290f8">First time use our website?</h2>
                                <p style="color: #1290f8; margin-bottom: 20px">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at eros rutrum turpis viverra elementum semper quis ex. Donec lorem nulla, aliquam quis neque vel, maximus lacinia urna.</p>
                                <a href="register.jsp" class="btn_3" style="background-color: #1290f8; padding: 10px; margin-top: 20px">Register Now</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="login_part_form">
                            <div class="login_part_form_iner">
                                <h3 style="color: white;">Log In</h3>
                                <!--Login Section-->
                                <form class="row contact_form" action="#" method="post" novalidate="novalidate">
                                    <div class="col-md-12 form-group ">
                                        <label style="color: white ">Username: </label>
                                        <input type="text" class="form-control" id="name" name="name" >
                                    </div>
                                    <div class="col-md-12 form-group ">
                                        <label style="color: white ">Password: </label>
                                        <input type="password" class="form-control" id="password" name="password" >
                                    </div>
                                    <div class="col-md-12 form-group">
                                        <div class="creat_account d-flex align-items-center">
                                            <input type="checkbox" id="f-option" name="selector">
                                            <label for="f-option" style="color: white">Remember me</label>
                                        </div>
                                        <button type="submit" value="submit" class="btn_3" style="padding: 10px; margin-top: 20px">
                                            Log in
                                        </button>
                                        <a class="lost_pass" href="#" style="color: white">Forget password?</a>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
         <%@include file="homepagefooter.jsp"%>
    </body>
</html>
