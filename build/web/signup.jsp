<%-- 
    Document   : signup
    Created on : Nov 3, 2021, 11:07:55 AM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sign up</title>
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
        <div class="signup-page-main" style="background-image: url(img/background.jpg);">
            <div class="signup-main">
                <div class="signup-head">
                    <h1>Sign Up</h1>
                </div>
                <div class="signup-block">
                    <form>
                        <label style="color: #0f98ce;">First name:</label>
                        <input type="text" name="fname" placeholder="First name" required="">
                        <p style="color: red; margin-bottom: 10px; margin-top: -15px;">Error</p>
                        <label style="color: #0f98ce;">Last name:</label>
                        <input type="text" name="lname" placeholder="Last name" required="">
                        <p style="color: red; margin-bottom: 10px; margin-top: -15px;">Error</p>
                        <label style="color: #0f98ce;">Email: </label>
                        <input type="text" name="email" placeholder="Email" required="">
                        <p style="color: red; margin-bottom: 10px; margin-top: -15px;">Error</p>
                        <label style="color: #0f98ce;">Password</label>
                        <input type="password" name="password" class="lock" placeholder="Password">
                        <p style="color: red; margin-bottom: 10px; margin-top: -15px;">Error</p>
                        <label style="color: #0f98ce;">Re-enter password</label>
                        <input type="password" name="re-password" class="lock" placeholder="Re-enter Password">
                        <p style="color: red; margin-bottom: 10px; margin-top: -15px;">Error</p>
                        <label style="color: #0f98ce;">Phone</label>
                        <input type="text" name="phone" class="lock" placeholder="Phone">
                        <p style="color: red; margin-bottom: 10px; margin-top: -15px;">Error</p>
                        <label style="color: #0f98ce;">Address</label>
                        <input type="text" name="address" class="lock" placeholder="Address">
                        <p style="color: red; margin-bottom: 10px; margin-top: -15px;">Error</p>
                        <label style="color: #0f98ce;">Date of Birth: </label>
                        <input type="date" name="dob">
                        <br/>
                        <div style="margin-top: 20px;">
                            <label style="color: #0f98ce;">Gender: </label>
                            <input class="form-check-input" type="radio" name="gender" value="1"> Male
                            <input class="form-check-input" type="radio" name="gender" value="0"> Female
                        </div>



                        <div class="forgot-top-grids">
                            <div class="forgot-grid">
                                <ul>
                                    <li>
                                        <input type="checkbox" id="brand1" value="">
                                        <label for="brand1"><span></span>I agree to the terms</label>
                                    </li>
                                </ul>
                            </div>

                            <div class="clearfix"> </div>
                        </div>
                        <input type="submit" name="Sign In" value="Sign up">
                    </form>
                    <div class="sign-down">
                        <h4>Already have an account? <a href="login.jsp" style="color: #0f98ce; font-family: 'Carrois Gothic', sans-serif; border-radius: 3px;border: none;
                                                        outline: none;"> Login here.</a></h4>
                        <h5><a href="homepage">Go Back to Home</a></h5>
                    </div>
                </div>
            </div>
        </div>

        <!--inner block end here-->
        <!--scrolling js-->
        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!--//scrolling js-->
        <script src="js/bootstrap.js"></script>
        <!-- mother grid end here-->
    </body>
</html>
