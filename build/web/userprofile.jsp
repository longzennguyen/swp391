<%-- 
    Document   : userprofile
    Created on : Sep 24, 2021, 9:26:05 AM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Admin User Detail</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
        <!-- Custom Theme files -->
        <link href="css/newstyle.css" rel="stylesheet" type="text/css" media="all"/>

        <!--js-->
        <script src="js/jquery-2.1.1.min.js"></script> 
        <!--icons-css-->
        <link rel="stylesheet" href="css/fontawesome-all.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/font-awesome.css">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <!--Google Fonts-->
        <link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <div class="page-container">	
            <div class="left-content">
                <div class="mother-grid-inner">
                    <!--header start here-->
                    <%@include file="header.jsp"%>
                    <!--inner block start here-->
                    <div class="inner-block "">
                        <div class="blank">
                            <div class="content text-center" style="">
                                <h2 style="color: #1290f8">User Profile</h2>
                            </div>
                            <div class="col-md-4 text-center" >
                                <div class="card">
                                    <div class="card-body profile-card pt-4 d-flex flex-column align-items-center" style="margin: 10px">
                                        <img src="${data.img}" alt="Profile" class="rounded-circle" style="width: 150px;margin-top: 30px">
                                        <h2 style="margin-top: 30px; color: #1290f8" >${data.name}</h2>
                                        <h3 style="padding-bottom: 20px; margin-top: -30px">${data.role}</h3>
                                    </div>
                                </div>
                            </div>

                            <div class="col-md-8">
                                <div class="card">
                                    <div class="card-body pt-3">
                                        <!-- Bordered Tabs -->
                                        <ul class="nav nav-tabs nav-tabs-bordered">                                           
                                            <li class="nav-item">
                                                <button class="nav-link" data-toggle="tab" data-target="#profile-overview"
                                                        style="background: none; border: none; padding: 10px;">Overview</button>
                                            </li>
                                            <li class="nav-item">

                                                <button class="nav-link"
                                                        style="background: none; border: none;padding: 10px">
                                                    <a href="useredit?id=${data.user_id}">Edit Profile</a>
                                                </button>

                                            </li>
                                        </ul>
                                        <div class="tab-content pt-2">
                                            <div class="profile-overview" id="profile-overview" >
                                                <h3 class="card-title">About</h3>
                                                <p class="small fst-italic" style="margin-top: 10px; font-style: italic">Sunt est soluta temporibus accusantium neque nam 
                                                    maiores cumque temporibus. Tempora libero non est unde veniam est qui dolor.
                                                    Ut sunt iure rerum quae quisquam autem eveniet perspiciatis odit. 
                                                    Fuga sequi sed ea saepe at unde.</p>
                                                <h3 class="card-title" style="margin-top: 20px">Profile detail</h3>
                                                <div class="row">
                                                    <div class="col-md-4" style="margin-top: 20px">
                                                        <label class="labels" style="text-decoration: none; color: #115c9b">Full name: </label>                                                   
                                                    </div>
                                                    <div class="col-md-8" style="margin-top: 20px">
                                                        <h4>${data.name}</h4>                                                   
                                                    </div>                                                                                                
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-4" style="margin-top: 20px">
                                                        <label class="labels" style="text-decoration: none; color: #115c9b">Mobile Number:  </label>                                                   
                                                    </div>
                                                    <div class="col-md-6" style="margin-top: 20px">
                                                        <h4>${data.phone}</h4>                                                   
                                                    </div>                                                 
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-4" style="margin-top: 20px">
                                                        <label class="labels" style="text-decoration: none; color: #115c9b">Email:  </label>                                                   
                                                    </div>
                                                    <div class="col-md-6" style="margin-top: 20px">
                                                        <h4>${data.email}</h4>                                                   
                                                    </div>                                                 
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-4" style="margin-top: 20px">
                                                        <label class="labels" style="text-decoration: none; color: #115c9b">Address:  </label>                                                   
                                                    </div>
                                                    <div class="col-md-6" style="margin-top: 20px">
                                                        <h4>${data.address}</h4>                                                   
                                                    </div>                                                 
                                                </div>

                                                <div class="row">
                                                    <div class="col-md-4" style="margin-top: 20px">
                                                        <label class="labels" style="text-decoration: none; color: #115c9b">Date of Birth:  </label>                                                   
                                                    </div>
                                                    <div class="col-md-6" style="margin-top: 20px">
                                                        <h4>${data.dob}</h4>                                                   
                                                    </div>                                                 
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-4" style="margin-top: 20px">
                                                        <label class="labels" style="text-decoration: none; color: #115c9b">Gender:   </label>                                                   
                                                    </div>
                                                    <div class="col-md-6" style="margin-top: 20px">
                                                        <h4>${data.gender}</h4>                                                   
                                                    </div>                                                 
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div class="mt-5 text-center col-md-10" style="margin-top: 20px; padding-bottom:50px">
                                <a href="userlist"><button class="btn btn-primary profile-button" type="button">Back to List</button></a>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <!--slider menu-->
            <%@include file="adminsidebar.jsp"%>
            <div class="clearfix"> </div>
        </div>

        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!--//scrolling js-->
        <script src="js/bootstrap.min.js"></script>
        <!-- mother grid end here-->
        <script>
            $(".nav .nav-link").on("load", function () {
                $(".nav").find(".active").removeClass("active");
                $(this).addClass("active");
            });
        </script>

    </body>
</html>
