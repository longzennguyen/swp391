<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : admin
    Created on : Sep 20, 2021, 3:27:07 PM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Administrator</title>
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
                    <div class="inner-block">
                        <div class="blank">
                            <section class="section dashboard">
                                <div class="row">
                                    <!-- Left side columns -->
                                    <div class="col-lg-8">
                                        <div class="row">
                                            <!-- Customers Card -->

                                            <!-- Reports -->


                                            <!-- Recent Sales -->
                                            <div class="col-12">
                                                <div class="card recent-sales">

                                                   

                                                    <div class="card-body">
                                                        <h1 class="card-title" style="margin-left: 10px">New User</h1>

                                                        <table class="table table-borderless datatable">
                                                            <thead>
                                                                <tr>
                                                                    <th scope="col">ID</th>
                                                                    <th scope="col">Full Name</th>
                                                                    <th scope="col">Email</th>
                                                                    <th scope="col">Phone</th>
                                                                    <th scope="col">Status</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <c:forEach var="u" items="${customerList}">   
                                                                <tr>
                                                                    <th scope="row"><a href="#">${u.user_id}</a></th>
                                                                    <td>${u.name}</td>
                                                                    <td>${u.email}</td>
                                                                    <td>${u.phone}</td>
                                                                    <td><span class="badge bg-success">${u.status}</span></td>
                                                                </tr>
                                                                </c:forEach>
                                                                
                                                         
                                                           
                                                                
                                                            </tbody>
                                                        </table>

                                                    </div>

                                                </div>
                                            </div><!-- End Recent Sales -->

                                            <!-- Top Selling -->
                                            <div class="col-12">
                                                <div class="card top-selling">

                                                    <div class="card-body pb-0">
                                                        <h1 class="card-title" style="margin-left: 10px">Top Service</h1>

                                                        <table class="table table-borderless">
                                                            <thead>
                                                                <tr>
                                                                    <th scope="col">Preview</th>
                                                                    <th scope="col">Product</th>
                                                                    <th scope="col">Price</th>
                                                                    
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <c:forEach var="i" items="${serviceListTop}">
                                                                <tr>
                                                                    <th scope="row"><a href="#"><img src="${i.img}" alt="" style="width: 80px;height:50px"></a></th>
                                                                    <td><a href="#" class="text-primary fw-bold">${i.title}</a></td>
                                                                    <td>$${i.price}</td>
                                                                    
                                                                </tr>   
                                                                </c:forEach>
                                                            </tbody>
                                                        </table>

                                                    </div>

                                                </div>
                                            </div><!-- End Top Selling -->

                                        </div>
                                    </div><!-- End Left side columns -->

                                    <!-- Right side columns -->
                                    <div class="col-lg-4">                                    
                                        <!-- Budget Report -->
                                        <div class="card">                                                                                                                         
                                        <!-- News & Updates Traffic -->
                                        <div class="card">                                           
                                            <div class="card-body pb-0">
                                                <h5 class="card-title">News &amp; Blogs</h5>
                                                <c:forEach var="o" items="${blogListTop}">
                                                    <div class="news" style="margin-top: 10px">
                                                    <div class="post-item clearfix">                                                       
                                                        <h4><a href="#">${o.title}</a></h4>
                                                        <p>${o.description}...</p>
                                                    </div>                                                   
                                                </div><!-- End sidebar recent posts-->
                                                </c:forEach>
                                               

                                            </div>
                                        </div><!-- End News & Updates -->

                                    </div><!-- End Right side columns -->

                                </div>
                            </section>




                        </div>
                    </div>

                    <!--inner block end here-->
                </div>
            </div>
            <!--slider menu-->
            <%@include file="adminsidebar.jsp"%>
            <div class="clearfix"> </div>
        </div>

        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!--//scrolling js-->
        <script src="js/bootstrap.js"></script>
        <script>
                                                    function sortTable(n) {
                                                        var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
                                                        table = document.getElementById("myTable");
                                                        switching = true;
                                                        // Set the sorting direction to ascending:
                                                        dir = "asc";
                                                        /* Make a loop that will continue until
                                                         no switching has been done: */
                                                        while (switching) {
                                                            // Start by saying: no switching is done:
                                                            switching = false;
                                                            rows = table.rows;
                                                            /* Loop through all table rows (except the
                                                             first, which contains table headers): */
                                                            for (i = 1; i < (rows.length - 1); i++) {
                                                                // Start by saying there should be no switching:
                                                                shouldSwitch = false;
                                                                /* Get the two elements you want to compare,
                                                                 one from current row and one from the next: */
                                                                x = rows[i].getElementsByTagName("TD")[n];
                                                                y = rows[i + 1].getElementsByTagName("TD")[n];
                                                                /* Check if the two rows should switch place,
                                                                 based on the direction, asc or desc: */
                                                                if (dir == "asc") {
                                                                    if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
                                                                        // If so, mark as a switch and break the loop:
                                                                        shouldSwitch = true;
                                                                        break;
                                                                    }
                                                                } else if (dir == "desc") {
                                                                    if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
                                                                        // If so, mark as a switch and break the loop:
                                                                        shouldSwitch = true;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            if (shouldSwitch) {
                                                                /* If a switch has been marked, make the switch
                                                                 and mark that a switch has been done: */
                                                                rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
                                                                switching = true;
                                                                // Each time a switch is done, increase this count by 1:
                                                                switchcount++;
                                                            } else {
                                                                /* If no switching has been done AND the direction is "asc",
                                                                 set the direction to "desc" and run the while loop again. */
                                                                if (switchcount == 0 && dir == "asc") {
                                                                    dir = "desc";
                                                                    switching = true;
                                                                }
                                                            }
                                                        }
                                                    }
        </script>

        <!-- mother grid end here-->
    </body>
</html>