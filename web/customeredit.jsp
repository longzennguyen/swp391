<%-- 
    Document   : customeredit
    Created on : Nov 14, 2021, 8:56:21 PM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Customer Detail</title>
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
                    <%@include file="managerheader.jsp"%>
                    <!--inner block start here-->
                    <div class="inner-block">
                        <div class="blank">
                            <div class="content text-center" style="">
                                <h2 style="color: #1290f8">Customer Profile Edit</h2>
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
                                        <div class="tab-content pt-2">
                                            <div class="profile-edit pt-3" id="profile-edit" style="margin-top: 20px">
                                                <!-- Profile Edit Form -->
                                                <h3 class="card-title">Profile Edit</h3>
                                                <form action="customeredit" method="POST">
                                                    <div class="row mb-3">
                                                        <div class="col-md-4 col-lg-3 col-form-label" style="margin-top: 20px">
                                                            <label class="labels" style="text-decoration: none">User ID: </label>                                                   
                                                        </div>
                                                        <div class="col-md-8 col-lg-9" style="margin-top: 20px">
                                                            <input name="userID" type="text" class="form-control"  value="${data.user_id}" readonly>
                                                            
                                                        </div> 
                                                    </div>

                                                    <div class="row mb-3" style="margin-top: 20px">
                                                        <label for="firstName" class="col-md-4 col-lg-3 col-form-label">First Name</label>
                                                        <div class="col-md-8 col-lg-9">
                                                            <input name="firstName" type="text" class="form-control"
                                                                   pattern="[A-Za-z]{1,25}"
                                                                   title="Contain letter only"
                                                                   value="${data.name}" required>
                                                        </div>
                                                    </div>
                                                    <div class="row mb-3" style="margin-top: 20px">
                                                        <label for="fullName" class="col-md-4 col-lg-3 col-form-label">Last Name</label>
                                                        <div class="col-md-8 col-lg-9">
                                                            <input name="lastName" minlength="1" maxlength="25" type="text" class="form-control"  value="${data.name}" required>
                                                        </div>
                                                    </div>
                                                    <div class="row mb-3" style="margin-top: 20px">
                                                        <label for="Address" class="col-md-4 col-lg-3 col-form-label">Address</label>
                                                        <div class="col-md-8 col-lg-9">
                                                            <input name="address" minlength="1" maxlength="50" type="text" class="form-control"  value="${data.address}" required>
                                                        </div>
                                                    </div>

                                                    <div class="row mb-3"style="margin-top: 20px">
                                                        <label for="Phone" class="col-md-4 col-lg-3 col-form-label">Phone</label>
                                                        <div class="col-md-8 col-lg-9">
                                                            <input name="phone"  type="text" class="form-control" value="${data.phone}" 
                                                                   pattern="[0-9]{10,13}"
                                                                   title="Phone number length is from 10 to 13 and contain only number!"
                                                                   required>
                                                        </div>
                                                    </div>
                                                    <div class="row mb-3"style="margin-top: 20px">
                                                        <label for="Email" class="col-md-4 col-lg-3 col-form-label">Email</label>
                                                        <div class="col-md-8 col-lg-9">
                                                            <input name="email" type="email" class="form-control" value="${data.email}"
                                                                   pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
                                                                   title="Please enter right email pattern: example@gmail.com"
                                                                   required>
                                                        </div>
                                                    </div>
                                                    <div class="row mb-3"style="margin-top: 20px">
                                                        <label for="Email" class="col-md-4 col-lg-3 col-form-label">Date of Birth</label>
                                                        <div class="col-md-8 col-lg-9">
                                                            <input name="dob" type="date" class="form-control" value="${data.dob}" >
                                                        </div>
                                                    </div>
                                                    <div class="row mb-3" >
                                                        <div class="col-md-4 col-lg-3 col-form-label" style="margin-top: 20px">
                                                            <label class="labels" style="text-decoration: none">Customer Status </label>                                                   
                                                        </div>
                                                        <div class="col-md-8" style="margin-top: 20px">
                                                            <h4>${data.status}</h4>                                                   
                                                        </div> 
                                                    </div>    

                                                    <div class="text-center"style="margin-top: 20px">
                                                        <a href="customerlist?page=1&word="><button class="btn btn-primary profile-button" type="button">Back to List</button></a>
                                                        <button type="submit" class="btn btn-primary">Save Changes</button>
                                                    </div>

                                                </form><!-- End Profile Edit Form -->

                                                <!-- End Profile Edit Form -->

                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>


                        </div>
                    </div>
                </div>
            </div>
            <!--slider menu-->
            <%@include file="sidermenu.jsp"%>
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
