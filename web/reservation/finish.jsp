<%-- 
    Document   : homepage
    Created on : Oct 7, 2021, 9:36:00 PM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.List" %>
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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">

        <!-- Font awesome -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">

        <!-- Owl carousel -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl.carousel.css">

        <!-- Template main Css -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

        <!-- Modernizr -->
        <script src="${pageContext.request.contextPath}/js/modernizr.js"></script>
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
            form input[type="text"],input[type="email"]{
                font-size: 22px;
            }
            form input[type=email],select{
                box-sizing: border-box;
                border: 2px solid #ccc;
                border-radius: 4px;
                font-size: 22px;
                background-color: white;
                background-image: url(searchicon.png);
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
            <br>
            <div style="border: 2px solid #ddd;width: 95%;">
                <label style="text-align: center;padding: 10px 27.5%;width: 100%;color: black;font-size: 20px">RESERVATION Completion</label>
                <br>
                <br>
                <div style="margin-left: 10px;color: black;width: 100%">
                    <form>
                        <table style="width: 100%">
                            <thead>
                                <tr>
                                    <th style="width: 5%"></th>
                                    <th style="width: 10%"></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><h4 style="margin: 6px">STATUS: </h4></td>
                                    <td><h4 style="margin: 6px;color: green">SUBMITTED </h4></td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">ASSIGNED TO (Doctor): </h4></td>
                                    <td><h4 style="margin: 6px;color: green">
                                            <select>
                                                <c:forEach var="item" items="${userDoctor}">
                                                    <option>${item.getName()}</option>
                                                </c:forEach>
                                            </select></h4></td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">ASSIGNED TO (Nurse): </h4></td>
                                    <td><h4 style="margin: 6px;color: green">
                                            <select>
                                                <c:forEach var="item" items="${userNurse}">
                                                    <option>${item.getName()}</option>
                                                </c:forEach>
                                            </select></h4></td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">SELECTED(s):  </h4></td>
                                    <td><h4 style="margin: 6px"> ${data.size()} </td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">NOTE:  </h4></td>
                                    <td><h4 style="margin: 6px"> ${note} </td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">TOTAL: </h4></td>
                                    <td><h4 style="margin: 6px"> <fmt:formatNumber type = "number" 
                                                      groupingUsed = "false" value = "${total}" /> (vnđ) </td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">------------------------------------------------ RECEIVER INFORMATION: </h4></td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">CUSTOMER NAME: </h4></td>
                                    <td><h4 style="margin: 6px">${logginedUser.getName()} </h4></td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">GENDER: </h4></td>
                                    <td><h4 style="margin: 6px">MALE </h4></td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">EMAIL ADRESS: </h4></td>
                                    <td><h4 style="margin: 6px"><input style="    width: 60%;" type="email" value="${logginedUser.getEmail()}" name="email" value="" required/></h4></td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">PHONE NUMBER: </h4></td>
                                    <td><h4 style="margin: 6px"><input type="text" value="${logginedUser.getPhone()}" name="phone" maxlength="10" required/> </h4> </td>
                                </tr>
                                <tr>
                                    <td><h4 style="margin: 6px">SHIP ADDRESS: </h4></td>
                                    <td><h4 style="margin: 6px"><input type="text" value="${logginedUser.getAddress()}" name="address" required/></h4></td>
                                </tr>
                                <tr>
                                    <td>&nbsp;</td>
                                    <td>&nbsp;</td>
                                </tr>
                                <tr><td><h4 style="margin: 6px;">OUR BANKING ACCOUNT: </h4></td>
                                    <td>
                                        <select id="bank_dropdown" style="font-size: 17px; width: 60%; font-size: 22px;" onchange="changeaBank()">
                                            <c:forEach var="item" items="${bank}">
                                                <option value="${item.getId()}">${item.getBankName()} (${item.getBankNameShort()})</option>
                                            </c:forEach>
                                        </select>
                                        <div style="margin-top: 10px;font-size: 18px">
                                            <label id="bank_display"></label>
                                        </div>
                                    </td>
                                </tr>

                            </tbody>
                        </table>
                        <br/>
                        <br/>
                        <br/>
                        <div style="width: 100%;text-align: center">
                            <button class="btn btn-primary" style="border-radius: 4px;font-size: 18px;padding: 8px 35%">CONFIRM & PAYMENT</button>   
                            <br>       
                        </div>
                    </form>
                    <br/>
                    <div style="text-align: center; font-size: 15px;"><span style="color: black; font-size: 18px;font-weight: bold;">*Note: </span> After CONFIRM & PAYMENT, Your Reservation information and the Payment guides will be send to your email automatically. Please check your email.
                        <br>Thank you so much!</div>
                    <br>
                </div>
            </div>
        </div>
        <jsp:include page="../homepagefooter.jsp" >
            <jsp:param name ="active" value="reservation"/>
        </jsp:include>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script>
                                            window.jQuery || document.write('<script src="assets/js/jquery-1.11.1.min.js"><\script>');
        </script>

        <!-- Bootsrap javascript file -->
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

        <!-- owl carouseljavascript file -->
        <script src="${pageContext.request.contextPath}/js/owl.carousel.min.js"></script>

        <!-- Template main javascript -->
        <script src="${pageContext.request.contextPath}/js/main.js"></script>
        <script type="text/javascript">

                                            var jsonText = ${jsonBank};
                                            document.getElementById("bank_display").innerHTML = "STK: " + jsonText[0].accountNumber + " - Người Nhận: " + jsonText[0].owner;
                                            function changeaBank() {
                                                var x = document.getElementById("bank_dropdown").value;
                                                document.getElementById("bank_display").innerHTML = "STK: " + jsonText[x - 1].accountNumber + " - Người Nhận: " + jsonText[x - 1].owner;
                                            }
        </script>
    </body>
</html>
