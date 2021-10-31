<%-- 
    Document   : customerlist
    Created on : Oct 29, 2021, 1:05:51 PM
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
        <title>Customer List</title>
        <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
              rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
              rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
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


        <div class="content" style="margin-top: 50px;margin-bottom: 400px; padding-left: 30px; padding-right: 30px">
            <h1 class="text-center" style="margin-left: 20px">Customer List</h1>
            <div class="dropdown">
                <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Dropdown Example
                    <span class="caret"></span></button>
                <ul class="dropdown-menu">
                    <input class="form-control" id="myInput" type="text" placeholder="Search..">
                    <li><a href="#">HTML</a></li>
                    <li><a href="#">CSS</a></li>
                    <li><a href="#">JavaScript</a></li>
                    <li><a href="#">jQuery</a></li>
                    <li><a href="#">Bootstrap</a></li>
                    <li><a href="#">Angular</a></li>
                </ul>
            </div>
            <form class="form-inline my-2 my-lg-0" style="float: right; padding-bottom: 20px;" action="customerlist?page=1&word=${word}"> 
                <input class="form-control mr-sm-2" type="search" placeholder="${word}" aria-label="Search" name="word">
                <input class="btn  my-2 my-sm-0" type="submit" value="Search">
            </form>

            <table class="table " style="margin-top: 40px">
                <thead>
                    <tr>
                        <th scope="col">Customer ID</th>
                        <th scope="col">Customer Name</th>
                        <th scope="col">Email</th>
                        <th scope="col">Phone</th>
                        <th scope="col"></th>
                    </tr>
                </thead>

                <c:if test="${empty customerList}">
                    <td>Customer not found</td>
                </c:if>
                <tbody>               
                    <c:forEach var="o" items="${customerList}">
                        <tr>                           
                            <th scope="row">${o.user_id}</th>
                            <td>${o.name}</td>
                            <td>${o.email}</td>
                            <td>${o.phone}</td>
                            <td></td>
                            <td>
                                <button><a href="customerdetail?id=${o.user_id}">Detail</a></button>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>


            <div class="container">
                <ul class="pagination">
                    <c:if test="${page != 1}">
                        <li class="icon">
                            <a href="customerlist?page=${page-1}&word=${word}">Previous</a>
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
                                    <a href="customerlist?page=${i}&word=${word}">${i}</a>
                                </li>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <!-- If page != Last display Next -->            
                    <c:if test="${page lt numberPage}">
                        <li class="icon">
                            <a  href="customerlist?page=${page+1}&word=${word}">Next</a>
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
        <script>
            $(document).ready(function () {
                $("#myInput").on("keyup", function () {
                    var value = $(this).val().toLowerCase();
                    $(".dropdown-menu li").filter(function () {
                        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                    });
                });
            });
        </script>
    </body>
</html>
