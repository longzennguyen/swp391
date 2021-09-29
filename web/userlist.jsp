<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : userlist
    Created on : Sep 22, 2021, 10:56:13 AM
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
            <caption>List of users</caption>
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">User ID</th>
                        <th scope="col">Name</th>
                        <th scope="col">Email</th>
                        <th scope="col">Phone</th>
                        <th scope="col">Role</th>
                        <th scope="col">Status</th>
                        <th scope="col"></th>
                    </tr>
                </thead>
                <tbody>               
                    <c:forEach var="o" items="${userList}">
                        <tr>
                            <th scope="row">${o.user_id}</th>
                            <td>${o.name}</td>
                            <td>${o.email}</td>
                            <td>${o.phone}</td>
                            <td>${o.role}</td>
                            <td>${o.status}</td>
                            <td>
                                <button><a href="userprofile?id=${o.user_id}">Profile</a></button>
                                <button>Active</button>
                                <button>Disable</button>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <div class="mt-5 text-center col-md-10">
                <a href="adduser.jsp"><button class="btn btn-primary profile-button" type="button" >Add New User</button></a>
            </div>
        </div>  




        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>
