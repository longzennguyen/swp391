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
    <div class="sidebar">
        <a class="active" href="admin.jsp">Children Care</a>
        <a href="#general">General</a>
        <a href="userlist.jsp">User List</a>
        <a href="userprofile.jsp">System Management</a>
    </div>

    <nav class="navbar navbar-expand-md navbar-light sticky-top" style="background-color: #373B88;">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>      
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ml-auto">
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn  my-2 my-sm-0" type="submit">Search</button>
            </form>
            <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Administrator
            </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="#">Profile</a>
                <a class="dropdown-item" href="#">Settings</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Logout</a>
              </div>
            </li>
          </ul>
        </div>
      </nav>

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
                <tr>
                <th scope="row">1</th>
                <td>Duc</td>
                <td>duc@gmail.com</td>
                <td>12343512312</td>
                <td>Administrator</td>
                <td>Active</td>
                <td>
                    <button><a href="userprofile.jsp">Profile</a></button>
                    <button>Active</button>
                    <button>Disable</button>
                </td>
              </tr>
              <tr>
                <th scope="row">2</th>
                <td>Larry</td>
                <td>larry@gmail.com</td>
                <td>12343512312</td>
                <td>Staff</td>
                <td>Disable</td>
                <td>
                    <button><a href="userprofile.jsp">Profile</a></button>
                    <button>Active</button>
                    <button>Disable</button>
                </td>
              </tr>
                <c:forEach var="o" items="${ulist}">
                    <tr>
                    <th scope="row">${o.uid}</th>
                    <td>${o.name}</td>
                    <td>${o.email}</td>
                    <td>${o.phone}</td>
                    <td>${o.role_id}</td>
                    <td>${o.status}</td>
                    <td>
                        <button><a href="userprofile.jsp">Profile</a></button>
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
