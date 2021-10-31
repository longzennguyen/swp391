<%-- 
    Document   : homepage
    Created on : Oct 7, 2021, 9:36:00 PM
    Author     : ROG STRIX
--%>

<%@page import="entity.dto.ReservationDto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RESERVATION</title>
        <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
              rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
              rel="stylesheet">
        <!-- //Web-Fonts -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
        <style>
            .container-fluid {
                min-height: 600px;
            }
            input[type=text] {
                width: 60%;
                box-sizing: border-box;
                border: 2px solid #ccc;
                border-radius: 4px;
                font-size: 16px;
                background-color: white;
                background-image: url('searchicon.png');
                background-position: 10px 10px;
                background-repeat: no-repeat;
                padding: 4px 10px 4px 10px;
                -webkit-transition: width 0.4s ease-in-out;
                transition: width 0.4s ease-in-out;
            }

        </style>
    </head>
    <body>
        <jsp:include page="../homepageheader.jsp" >
            <jsp:param name ="active" value="reservation"/>
        </jsp:include>
        <div class="container-fluid">
            <label style="font-size: 20px;color:#454545">>>RESERVATION INFROMATION:</label>

            <br>
            <div style="color: black;text-align: center">
                <form action="${pageContext.request.contextPath}/reservation" method="POST">
                    <input type="text" name="keyword" placeholder="Type here to search in your Reservation ..." value="${keyword}">
                    <button type="submit" style="padding: 6px 15px;background-color:#1f76bd; border: none;border-radius: 5px;color: white">Search</button>
                </form>
            </div>
            <br>
            <form action="${pageContext.request.contextPath}/reservation/contract" method="POST">
                <table class="table table-striped" style="border: 2px solid #ddd">
                    <thead>
                        <tr style="background-color: #c4c4c4">
                            <th style="width: 5%">ID</th>
                            <th style="width: 18%">TITLE</th>
                            <th style="width: 8%">PRICE(VND)</th>
                            <th style="width: 8%;text-align: center">QUANTITY</th>
                            <th style="width: 10%">TOTAL COST(VND)</th>
                            <th style="width: 8%"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:set var = "totalAmount" value = "0" />
                        <c:forEach  var="item"  items="${data}">
                            <tr>
                                <td>${item.getId()}</td>
                                <td>${item.serviceTitle}</td>
                                <td>${item.servicePrice}</td>
                                <td style="text-align: center;"><input style="width: 60%" type="number" min="0" max="100" value="${item.quantity}" name="QUANTITY-${item.getId()}"></td>
                                <td><fmt:formatNumber type = "number" 
                                                  groupingUsed = "false" value = "${item.servicePrice * item.quantity}" /></td>
                                <td><a href="${pageContext.request.contextPath}/reservation/delete?id=${item.getId()}"><i class="fa fa-trash-o"  style="font-size:24px; color: red"></i></a></td>
                            </tr>
                            <c:set var = "totalAmount" value = "${(item.servicePrice * item.quantity) + totalAmount}" />
                        </c:forEach>
                    </tbody>
                </table>
                <br>
                <div style="background-color: white;text-align: center;margin-top: 10px;">
                    <label style="font-size: 17px">RESERVATION SUMMARY</label>
                    <br>
                    <div style="border: 2px solid #115c9b; width: 50%; height: 200px; margin: auto;align-self: center">
                        <br>
                        <div style="font-size: 20px">
                            <label style="text-decoration: underline;">Number of Selected: </label>
                            <label>${data.size()} </label>
                            <br>
                            <label style="text-decoration: underline">TOTAL: </label>
                            <label><fmt:formatNumber type = "number" 
                                              groupingUsed = "false" value = "${totalAmount}" /> (VND)</label>
                            <br>
                        </div>
                        <br><br>
                        <button class="btn btn-primary" style="border-radius: 4px;font-size: 18px;padding: 10px 39px;">CHECK OUT</button>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a class="btn btn-info" style="padding: 10px 25px;font-size: 18px">MORE SERVICE</a>
                        </label>
                    </div>
            </form>
            <br>
        </div>
        <jsp:include page="../homepagefooter.jsp" >
            <jsp:param name ="active" value="reservation"/>
        </jsp:include>

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
