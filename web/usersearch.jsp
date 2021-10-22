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
        <title>Document</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">    
        <link rel="stylesheet" href="css/userlist.css">
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class="content">
            <form class="form-inline my-2 my-lg-0" style="float: right; padding-bottom: 20px;" action="usersearch?page=1" method="POST"> 
                <input class="form-control mr-sm-2" type="search" placeholder="Search name, email, phone" aria-label="Search" name="word">
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
                                <button><a href="useredit?id=${o.user_id}">Edit</a></button>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <nav aria-label="Page navigation example">
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


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>
