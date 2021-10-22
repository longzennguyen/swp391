<%-- 
    Document   : homepage
    Created on : Oct 7, 2021, 9:36:00 PM
    Author     : ROG STRIX
--%>

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
            .grid-container {
                display: grid;
                grid-template-columns: 70% 30%;
                gap: 30px;
            }
        </style>
    </head>
    <body>
        <jsp:include page="../homepageheader.jsp" >
            <jsp:param name ="active" value="reservation"/>
        </jsp:include>
        <div class="container-fluid">
            <label style="font-size: 20px;color:#454545">>>RESERVATION CONTACT</label>
            <br>
            <div class="grid-container">
                <div class="grid-item">
                    <table class="table table-striped" style="border: 2px solid #ddd">
                        <thead>
                            <tr style="background-color: #c4c4c4">
                                <th style="width: 3%">ID</th>
                                <th style="width: 25%">TITLE</th>
                                <th style="width: 8%">PRICE(VND)</th>
                                <th style="width: 8%;text-align: center">QUANTITY</th>
                                <th style="width: 10%">TOTAL COST(VND)</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:set var = "totalAmount" value = "0" />
                            <c:forEach items="${data}" var="item" >
                                <tr>
                                    <td>${item.getId()}</td>
                                    <td>${item.serviceTitle}</td>
                                    <td>${item.servicePrice}</td>
                                    <td style="text-align: center;">${item.quantity}</td>
                                    <td><fmt:formatNumber type = "number" 
                                                      groupingUsed = "false" value = "${item.servicePrice * item.quantity}" /></td>   
                                </tr>
                                <c:set var = "totalAmount" value = "${(item.servicePrice * item.quantity) + totalAmount}" />
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div style="border: 2px solid #ddd;width: 95%;">
                    <label style="text-align: center;padding: 10px 27.5%;background-color:#1f76bd;width: 100%;color: white">RESERVATION CONTRACT</label>
                    <br>
                    <br>
                    <div style="margin-left: 10px;color: black;width: 100%">
                        <table style="width: 100%">
                            <thead>
                                <tr>
                                    <th style="width: 5%"></th>
                                    <th style="width: 10%"></th>

                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><h4 style="margin: 6px">FULL NAME: </h4></td>
                                    <td><h4 style="margin: 6px">Hoang Dinh Duy </h4></td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">GENDER: </h4></td>
                                    <td><h4 style="margin: 6px">MALE </h4></td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">EMAIL ADRESS: </h4></td>
                                    <td><h4 style="margin: 6px">duyhdse05810@fpt.edu.vn </h4></td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">PHONE NUMBER: </h4></td>
                                    <td><h4 style="margin: 6px">0964138498 </h4> </td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">ADDRESS: </h4></td>
                                    <td><h4 style="margin: 6px">Dong Anh, Ha Noi</h4></td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">SELECTED(s):  </h4></td>
                                    <td><h4 style="margin: 6px"> ${data.size()} </td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">NOTE:  </h4></td>
                                    <td><h4 style="margin: 6px"> N/A </td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">TOTAL: </h4></td>
                                    <td><h4 style="margin: 6px"> <fmt:formatNumber type = "number" 
                                                      groupingUsed = "false" value = "${totalAmount}" /> (vnđ) </td>
                                </tr>
                            </tbody>
                        </table>
                        <br>
                        <br>
                        <br>
                        <div style="width: 100%;text-align: center">
                            <a class="btn btn-primary" style="border-radius: 4px;font-size: 18px;padding: 8px 35%" href="${pageContext.request.contextPath}/reservation/finish">Finish</a>
                            <br>
                            <br>
                            <a href="${pageContext.request.contextPath}/reservation" style="font-size: 18px;text-decoration: underline;color:#1f76bd">>> Back To Detail</a>
                        </div>
                    </div>
                </div>
            </div>
            <br>
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
