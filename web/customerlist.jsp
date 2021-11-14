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
                                <h2 style="color: #1290f8">Customers List</h2>
                            </div>                             
                            <div style="margin-top: 20px; margin-left: 20px">
                                <form class="form-inline my-2 my-lg-0" style="float: left; padding-bottom: 20px; " action="customerlist?page=1&word=${word}"> 
                                    <input class="form-control mr-sm-2" type="search" placeholder="${word}" aria-label="Search" name="word">
                                    <input class="btn  my-2 my-sm-0" type="submit" value="Search">
                                </form>
                                <div class="dropdown" style="float: left; margin-left: 50px">
                                    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Filter
                                        <span class="caret"></span></button>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Sort by Name</a></li>
                                        <li><a href="#">Sort by Status</a></li>
                                        <li><a href="#">Sory by ...</a></li>
                                    </ul>
                                </div>
                            </div>
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

                            <div class="container text-center">
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
                                    <!--                                    If page != Last display Next             -->
                                    <c:if test="${page lt numberPage}">
                                        <li class="icon">
                                            <a  href="customerlist?page=${page+1}&word=${word}">Next</a>
                                        </li>
                                    </c:if>
                                </ul>
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

