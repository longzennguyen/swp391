<%-- 
    Document   : FeedbackList
    Created on : 26-10-2021, 23:44:16
    Author     : longzennguyen
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Feedback List</title>
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
    <body>
        <%@include file="homepageheader.jsp"%>

        <div class="content" style="margin-top: 50px;margin-bottom: 400px">
            <!--form class="form-inline my-2 my-lg-0" style="float: right; padding-bottom: 20px;" action="FeedbackController?page=1" method="POST"> 
                <input class="form-control mr-sm-2" type="search" placeholder="Search name, email, phone" aria-label="Search" name="word">
                <input class="btn  my-2 my-sm-0" type="submit" value="Search">
            </form-->

            <h1 class="text-center" style="margin-left: 20px">Feedback List</h1>

            <table class="table " style="margin-top: 40px">
                <thead>
                    <tr>
                        <th scope="col"></th>
                        <th scope="col">FeedBack ID</th>
                        <th scope="col">Created</th>
                        <th scope="col">Updated</th>
                        <th scope="col">Created by User ID</th>
                        <th scope="col">Reservation ID</th>
                        <th scope="col">star no</th>
                        <th scope="col"></th>
                    </tr>
                </thead>

                <c:if test="${empty feedbackList}">
                    <td>Feedback not found</td>
                </c:if>

                <tbody>               
                    <c:forEach var="o" items="${feedbackList}">
                        <tr>
                            <td></td>
                            <th scope="row">${o.feedback_id}</th>
                            <td>${o.created}</td>
                            <td>${o.updated}</td>
                            <td>${o.created_by}</td>
                            <td>${o.reservation_id}</td>
                            <td>${o.starno}</td>
                            <td>
                                <button><a href="feedbackdetail?id=${o.feedback_id}">Detail</a></button>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>


            <div class="container">
                <ul class="pagination">
                    <c:if test="${page != 1}">
                        <li class="icon">
                            <a href="feedbacklist?page=${page-1}">Previous</a>
                        </li>
                    </c:if>
                    <c:forEach var="i" begin="1" end="${numberPage}">
                        <c:choose>
                            <c:when test="${page eq i}">
                                <li class="page-item active"><a class="page-link">
                                        ${i} <span class="sr-only">(current)</span></a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="page-item">
                                    <a href="feedbacklist?page=${i}">${i}</a>
                                </li>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <!-- If page != Last display Next -->            
                    <c:if test="${page lt numberPage}">
                        <li class="icon">
                            <a  href="feedbacklist?page=${page+1}">Next</a>
                        </li>
                    </c:if>
                </ul>
            </div>
        </div>                     


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
    </body>
</html>

