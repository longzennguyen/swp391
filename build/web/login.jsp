<%-- 
    Document   : login
    Created on : Nov 3, 2021, 10:59:38 AM
    Author     : ROG STRIX
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>

    <head>
        <title>Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />     
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
        <!-- Custom Theme files -->
        <link href="css/newstyle.css" rel="stylesheet" type="text/css" media="all" />
        <!--js-->
        <script src="js/jquery-2.1.1.min.js"></script>
        <!--icons-css-->
        <link href="css/font-awesome.css" rel="stylesheet">
        <!--Google Fonts-->
        <link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>
        <!--static chart-->
    </head>

    <body>
        <div class="login-page" style="background-image: url(img/background.jpg);">
            <div class="login-main">
                <div class="login-head">
                    <h1>Login</h1>
                </div>
                <div class="login-block">
                    <form action="login" method="POST"> 
                        <input type="text" name="uid" placeholder="Email" required="">
                        <input type="password" name="pwd" class="lock" placeholder="Password">
                        <div class="forgot-top-grids">
                            <div class="forgot-grid">
                                <ul>
                                    <li>
                                        <input type="checkbox" id="brand1" value="">
                                        <label for="brand1"><span></span>Remember me</label>
                                    </li>
                                </ul>
                            </div>
                            <div class="forgot">
                                <a data-toggle="modal" data-target="#myModal">Forgot password?</a>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <input type="submit" name="Sign In" value="Login">
                        <h3>Not a member?<a href="signup.jsp"> Sign up now</a></h3>

                    </form>
                    <h5><a href="homepage">Go Back to Home</a></h5>
                </div>
            </div>
        </div>
        
        <!--inner block end here-->
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Reset password</h4>
                    </div>
                    <div class="modal-body">
                        <form action="">
                            <label>Enter your email address</label>
                            <input placeholder="Email" class="form-control" type="text" name="email123123" required>
                            <input type="submit" name="service" value="Send verification code" style="margin-top: 20px; background-color: deepskyblue;">
                        </form>
                    </div>

                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>

            </div>
        </div>
        <!--scrolling js-->
        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!--//scrolling js-->
        <script src="js/bootstrap.js"></script>
        <!-- mother grid end here-->
    </body>

</html>
