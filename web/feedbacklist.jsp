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
                                <h2 style="color: #1290f8">Feedback List</h2>
                            </div> 


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


                            <div class="container text-center">
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
                    </div>
                </div>

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

