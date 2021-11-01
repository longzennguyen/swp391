<%-- 
    Document   : customerdetail
    Created on : Oct 29, 2021, 1:33:13 PM
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
    <body onload="onLoad()">
        <%@include file="homepageheader.jsp"%>

    <center>
        <div style="padding: 20px; margin-bottom: 50px">
            <div class="text-center">
                <h2 >Customer Profile</h2>
            </div>
            <form method="POST" action="customeredit">
            <div class="container rounded bg-white mt-5 mb-5">
                <div class="row">
                    <div class="col-md-6 border-right">
                        <div class="p-3 py-5">
                            <div class="row mt-3">
                                <div class="col-md-12" style="margin-top: 20px;"><label class="labels">Full Name</label>
                                    <input type="text" id = "Input" class="form-control text-center" placeholder="${data.name}"  readonly>
                                </div>
                                <div class="col-md-12" style="margin-top: 20px;"><label class="labels">Mobile Number</label>
                                    <input type="text" id = "Input" class="form-control text-center" placeholder="${data.phone}"  readonly>
                                </div>
                                <div class="col-md-12" style="margin-top: 20px;"><label class="labels">Email</label>
                                    <input type="text" id = "Input" class="form-control text-center" placeholder="${data.email}"  readonly>
                                </div>
                                <div class="col-md-12" style="margin-top: 20px;"><label class="labels">Address</label>
                                    <input type="text" id = "Input" class="form-control text-center" placeholder="${data.address}"  readonly>
                                </div>
                                <div class="col-md-12" style="margin-top: 20px;"><label class="labels">Birthday</label>
                                    <input type="text" id = "Input" class="form-control text-center" placeholder="${data.dob}" readonly>
                                </div>                                

                            </div>
                        </div>
                    </div>

                    <div class="col-md-6">
                        <div class="p-3 py-5" >
                            <div class="col-md-12" style="margin-top: 20px;"><label class="labels">User ID: </label>
                                <input type="text" class="form-control text-center" name="user_id" placeholder="${data.user_id}" disabled="">
                            </div>

                            <div class="col-md-12" style="margin-top: 20px;"><label class="labels">Role: </label>
                                <input type="text" class="form-control text-center" placeholder="${data.role}" disabled="">
                            </div>
                            <div class="col-md-12" style="margin-top: 20px;"><label class="labels"> Status: </label>
                                <input type="text" class="form-control text-center Input"  placeholder="${data.status}" disabled="">
                            </div>                             
                        </div>
                    </div>
                </div>
            </div>
            <div class="text-center" style="margin-top: 50px">
                <input class="btn btn-primary" type="submit" id="submit" value="Submit"> 
            </div>                  
            </form>                
            <div class="text-center" style="margin-top: 50px">
                <a href="customerlist?page=1&word=" class="btn btn-primary">Back to Customer list</a>
                <button class="btn btn-primary" onclick = "Run()" id="edit">Edit this Customer Information</button>                
            </div>
                            
                            
        
        </div>

    </center>







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


    <script>
                    $(document).ready(function () {
                        $("#edit").click(function () {
                            $('input').attr('readonly', false);
                        });
                    });
    </script>

    <script>
        function Run() {
            var x = document.getElementById("submit");
            if (x.style.display === "none") {
                x.style.display = "inline-block";
                x.className = "text-center btn btn-primary";
            } 
        }
    </script>
    
    <script>
        function onLoad() {
            var x = document.getElementById("submit");
            x.style.display = "none";
        }
    </script>

</body>
</html>
