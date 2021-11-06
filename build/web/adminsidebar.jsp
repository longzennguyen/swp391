<%-- 
    Document   : adminsidebar
    Created on : Nov 5, 2021, 12:38:52 PM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <div class="sidebar-menu" style="background-color: #2e6da4">
            <div class="logo"> <a href="#" class="sidebar-icon" style="background-color: #1290f8"> <span class="fa fa-bars"></span> </a> <a href="#"> <span id="logo" ></span> 
                    <!--<img id="logo" src="" alt="Logo"/>--> 
                </a> </div>		  
            <div class="menu">
                <ul id="menu" >
                    <li id="menu-home" ><a href="admin.jsp"><i class="fa fa-tachometer"></i><span>Dashboard</span></a></li>
                    <!--                        <li><a href="#"><i class="fa fa-cogs"></i><span>Components</span><span class="fa fa-angle-right" style="float: right"></span></a>
                                                <ul>
                                                    <li><a href="grids.html">Grids</a></li>
                                                    <li><a href="portlet.html">Portlets</a></li>		            
                                                </ul>
                                            </li>-->
                    <!--                        <li id="menu-comunicacao" ><a href="#"><i class="fa fa-book nav_icon"></i><span>Element</span><span class="fa fa-angle-right" style="float: right"></span></a>
                                                <ul id="menu-comunicacao-sub" >
                                                    <li id="menu-mensagens" style="width: 120px" ><a href="buttons.html">Buttons</a>		              
                                                    </li>
                                                    <li id="menu-arquivos" ><a href="typography.html">Typography</a></li>
                                                    <li id="menu-arquivos" ><a href="icons.html">Icons</a></li>
                                                </ul>
                                            </li>-->
                    <li><a href="userlist"><i class="fa fa-users"></i><span>Users</span></a></li>
                    <li><a href="#"><i class="fa fa-cogs"></i><span>Settings</span></a></li>
<!--                    <li><a href="feedbacklist"><i class="fa fa-star-half-o"></i><span>Feedbacks</span></a></li>
                    <li><a href="#"><i class="fa fa-list-alt"></i><span>Posts</span></a></li>-->
                    <!--                        <li id="menu-academico" ><a href="#"><i class="fa fa-file-text"></i><span>Pages</span><span class="fa fa-angle-right" style="float: right"></span></a>
                                                <ul id="menu-academico-sub" >
                                                    <li id="menu-academico-boletim" ><a href="login.html">Login</a></li>
                                                    <li id="menu-academico-avaliacoes" ><a href="signup.html">Sign Up</a></li>		           
                                                </ul>
                                            </li>-->

                    <!--                        <li><a href="charts.html"><i class="fa fa-bar-chart"></i><span>Charts</span></a></li>-->
                    <!--                        <li><a href="#"><i class="fa fa-envelope"></i><span>Mailbox</span><span class="fa fa-angle-right" style="float: right"></span></a>
                                                <ul id="menu-academico-sub" >
                                                    <li id="menu-academico-avaliacoes" ><a href="inbox.html">Inbox</a></li>
                                                    <li id="menu-academico-boletim" ><a href="inbox-details.html">Compose email</a></li>
                                                </ul>
                                            </li>-->
                    <!--                        <li><a href="#"><i class="fa fa-cog"></i><span>System</span><span class="fa fa-angle-right" style="float: right"></span></a>
                                                <ul id="menu-academico-sub" >
                                                    <li id="menu-academico-avaliacoes" ><a href="404.html">404</a></li>
                                                    <li id="menu-academico-boletim" ><a href="blank.html">Blank</a></li>
                                                </ul>
                                            </li>-->
                    <!--                        <li><a href="#"><i class="fa fa-shopping-cart"></i><span>E-Commerce</span><span class="fa fa-angle-right" style="float: right"></span></a>
                                                <ul id="menu-academico-sub" >
                                                    <li id="menu-academico-avaliacoes" ><a href="product.html">Product</a></li>
                                                    <li id="menu-academico-boletim" ><a href="price.html">Price</a></li>
                                                </ul>
                                            </li>-->
                </ul>
            </div>
        </div>
        <script>
            var toggle = true;

            $(".sidebar-icon").click(function () {
                if (toggle)
                {
                    $(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
                    $("#menu span").css({"position": "absolute"});
                } else
                {
                    $(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
                    setTimeout(function () {
                        $("#menu span").css({"position": "relative"});
                    }, 400);
                }
                toggle = !toggle;
            });
        </script>
        <!--scrolling js-->
        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!--//scrolling js-->
        <script src="js/bootstrap.js"></script>
        <!-- mother grid end here-->
    </body>
</html>
