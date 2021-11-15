<%-- 
    Document   : managerheader
    Created on : Nov 3, 2021, 11:33:18 AM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager Page</title>
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
                            <div class="content text-center" style="margin-top: 50px">
                                <h2 style="color: #1290f8">Manager Page</h2>
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
                                            <td><button><a href="sliderlist">Detail</a></button></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>                    
                                        </tr>
                                    </tbody>
                                </table>
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

        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!--//scrolling js-->
        <script src="js/bootstrap.js"></script>
        <!-- mother grid end here-->

    </body>
</html>
