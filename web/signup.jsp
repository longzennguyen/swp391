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
                    <form action="RegisterAccount" method="POST">
                        <div class="form-group row">
                            <label style="color: #0f98ce;">First name:</label>
                            <input minlength="3" maxlength="20" type="text" name="first_name" placeholder="First name" required="">
                            <p style="color: red"><%=request.getAttribute("error_FName") == null ? "" : request.getAttribute("error_FName")%></p>
                        </div>
                        <div class="form-group row">
                            <label style="color: #0f98ce;">Last name:</label>
                            <input type="text" minlength="3" maxlength="20" name="last_name" placeholder="Last name" required="">
                            <p style="color: red"><%=request.getAttribute("error_LName") == null ? "" : request.getAttribute("error_LName")%></p>
                        </div>
                        <div class="form-group row">
                            <label style="color: #0f98ce;">Email: </label>
                            <input maxlength="50" type="text" name="username" placeholder="Email" required="">
                            <p style="color: red"><%=request.getAttribute("error_Email") == null ? "" : request.getAttribute("error_Email")%></p>
                        </div>
                        <div class="form-group row">
                            <label style="color: #0f98ce;">Password</label>
                            <input minlength="8" maxlength="20" type="password" name="password" id="password" class="lock" placeholder="Password" required="" onkeyup="validatePassword()">
                            <p style="color: red"><%=request.getAttribute("error_Password") == null ? "" : request.getAttribute("error_Password")%></p>
                        </div>
                        <div class="form-group row">
                            <label style="color: #0f98ce;">Re-enter password</label>
                            <input type="password" name="re-password" id="re-password" class="lock" placeholder="Re-enter Password" required="" onkeyup="validatePassword()">
                            <small id="validatePassword" class="form-text text-muted"></small>
                        </div>
                        <div class="form-group row">
                            <label style="color: #0f98ce;margin-top: 10px">Phone</label>
                            <input minlength="10" maxlength="13" type="number" name="phone" class="form-control" placeholder="Phone" required="">
                            <p style="color: red"><%=request.getAttribute("error_Phone") == null ? "" : request.getAttribute("error_Phone")%></p>
                        </div>
                        <div class="form-group row">
                            <label style="color: #0f98ce; margin-top: 20px">Address</label>
                            <input maxlength="200" type="text" name="address" class="lock" required="" placeholder="Address">
                            <p style="color: red"><%=request.getAttribute("error_Address") == null ? "" : request.getAttribute("error_Address")%></p>
                        </div>
                        <div class="form-group row">
                            <label style="color: #0f98ce;">Date of Birth: </label>
                            <input type="date" name="date">
                        </div>
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
                        <div class="col-md-12 text-center" >
                            <button type="submit" id="submit" style="width: 50%" class="btn btn-primary" name="action" value="submit">Register</button>
                        </div>
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
        <script>
                                var validatePassword = function () {
                                    if (document.getElementById('password').value == '' && document.getElementById('re-password').value == '') {
                                        document.getElementById('validatePassword').innerHTML = '';
                                    } else if (document.getElementById('password').value == document.getElementById('re-password').value) {
                                        document.getElementById('validatePassword').innerHTML = 'Password Matching';
                                    } else {
                                        document.getElementById('validatePassword').innerHTML = 'Password Not Matching';
                                    }
                                }
        </script>
    </body>
</html>
