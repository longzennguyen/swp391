<%-- 
    Document   : sliderdetail
    Created on : Nov 15, 2021, 8:29:11 AM
    Author     : ROG STRIX
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Slider Detail</title>
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
                                <h2 style="color: #1290f8">Sliders Detail</h2>
                            </div> 
                            <div class="main-container">
                                <img src="${data.detail}" alt="" style="width: 100%">


                            </div> <!-- /.main-container  -->
                            <div class="mt-5 text-center col-md-10" style="margin-top: 20px; padding-bottom:50px">
                                <a href="sliderlist"><button class="btn btn-primary profile-button" type="button">Back to List</button></a>
                            </div>
                        </div>
                    </div>
                    <!--inner block end here-->



                </div>
            </div>



            <!--slider menu-->
            <%@include file="sidermenu.jsp"%>            
            <div class="clearfix"> </div>
        </div>
        <!--scrolling js-->
        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!--//scrolling js-->
        <script src="js/bootstrap.js"></script>
        <!-- mother grid end here-->


    </body>
</html>

</body>
</html>
