<%-- 
    Document   : register
    Created on : Oct 8, 2021, 1:23:51 PM
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
        <!--
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        -->
    </head>
    <body>
        <%@include file="homepageheader.jsp"%>
        <section class="checkout_area section_padding">
            <div class="container">
                <div class="login_part_form" style="background-color: #0076a3; padding: 20px;">
                    <div class="row">
                        <div class="col-lg-8">
                            <h3 style="color:white; margin-bottom: 30px">Register </h3>
                            <form class="row contact_form" action="#" method="post" novalidate="novalidate">

                                <div class="col-md-6 form-group p_star">
                                    <input type="text" class="form-control" id="name" name="username" placeholder="Tên đăng nhập"  />
                                    <!--                    <span class="placeholder" data-placeholder="Tên đăng nhập hoặc Email"></span>-->
                                </div>
                                <div class="col-md-6 form-group p_star">
                                    <input type="password" class="form-control" id="password" name="password" value="" placeholder="Mật khẩu" />
                                    <!--            <span class="placeholder" data-placeholder="Mật khẩu"></span>-->
                                </div> 
                                <div class="col-md-6 form-group p_star">             
                                    <input type="text" class="form-control" id="first" name="firstname" />
                                    <span class="placeholder" data-placeholder="Họ"></span>
                                </div>
                                <div class="col-md-6 form-group p_star">
                                    <input type="text" class="form-control" id="last" name="lastname" placeholder="Tên" />
                                </div>
                                <div class="col-md-6 form-group p_star">
                                    <input type="text" class="form-control" id="number" name="phone" placeholder="Số điện thoại" />
                                    <!--                <span class="placeholder" data-placeholder="Số điện thoại"></span>-->
                                </div>
                                <div class="col-md-6 form-group p_star">
                                    <input type="text" class="form-control" id="gender" name="gender" placeholder="Nam/Nữ" />
                                    <!--                <span class="placeholder" data-placeholder="Nam/Nữ"></span>-->
                                </div>  
                                <div class="col-md-6 form-group p_star">
                                    <input type="text" class="form-control" id="email" name="compemailany" placeholder="Email" />
                                    <!--                <span class="placeholder" data-placeholder="Địa chỉ Email"></span>-->
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="add1" name="add1" placeholder="Địa chỉ"/>
                                    <!--                <span class="placeholder" data-placeholder="Địa chỉ"></span>-->
                                </div>
                                <div class="col-md-12 form-group">
                                    <div class="creat_account">
                                        <input type="submit" value="Đăng ký ngay" />
                                    </div>
                                </div>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <%@include file="homepagefooter.jsp"%>
    </body>
</html>
