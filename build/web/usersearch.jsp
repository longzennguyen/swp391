<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : usersearch
    Created on : Oct 6, 2021, 11:35:11 AM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Admin User List</title>
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
                    <div class="inner-block ">
                        <div class="blank">
                            <div class="content text-center" style="">
                                <h2 style="color: #1290f8">User List</h2>
                            </div>
                            <form class="form-inline my-2 my-lg-0" style="float: right; padding-bottom: 20px;" action="usersearch?page=1" method="POST"> 
                                <input class="form-control mr-sm-2" type="search" placeholder="${word}" aria-label="Search" name="word">
                                <input class="btn  my-2 my-sm-0" type="submit" value="Search">
                            </form>

                            <caption> <a href="userlist"><< Back to User list</a></caption>

                            <table class="table" style="margin-top: 10px">
                                <thead>
                                    <tr>
                                        <th scope="col">User ID</th>
                                        <th scope="col">Name</th>
                                        <th scope="col">Gender</th>
                                        <th scope="col">Email</th>
                                        <th scope="col">Phone</th>
                                        <th scope="col">Role</th>
                                        <th scope="col">Address</th>
                                        <th scope="col">Status</th>
                                        <th scope="col"></th>
                                    </tr>
                                </thead>
                                <c:if test="${empty userList}">
                                    <td>User not found</td>
                                </c:if>
                                <tbody>               
                                    <c:forEach var="o" items="${userList}">
                                        <tr>
                                            <th scope="row">${o.user_id}</th>
                                            <td>${o.name}</td>
                                            <td>${o.gender}</td>
                                            <td>${o.email}</td>
                                            <td>${o.phone}</td>
                                            <td>${o.role}</td>
                                            <td>${o.address}</td>
                                            <td>${o.status}</td>
                                            <td>
                                                <button><a href="userprofile?id=${o.user_id}">Detail</a></button>
<!--                                                <button><a href="useredit?id=${o.user_id}">Edit</a></button>-->
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>

                            <nav aria-label="Page navigation example" class="text-center">
                                <ul class="pagination justify-content-center">
                                    <!-- If page != 1 display Previous -->
                                    <c:if test="${page != 1}">
                                        <li class="page-item">
                                            <a class="page-link" href="usersearch?page=${page-1}&word=${word}">Previous</a>
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
                                                    <a class="page-link"href="usersearch?page=${i}&word=${word}">${i}</a>
                                                </li>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                                    <!-- If page != Last display Next -->            
                                    <c:if test="${page lt numberPage}">
                                        <li class="page-item">
                                            <a class="page-link" href="usersearch?page=${page+1}&word=${word}">Next</a>
                                        </li>
                                    </c:if>
                                </ul>
                            </nav>
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
        <!-- mother grid end here-->
    </body>
</html>
