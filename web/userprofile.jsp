<%-- 
    Document   : userprofile
    Created on : Sep 24, 2021, 9:26:05 AM
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
        <link rel="stylesheet" href="css/userprofile.css">
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class="content">
            <div class="container rounded bg-white mt-5 mb-5">
                <div class="row">
                    <div class="col-md-3 border-right">
                        <div class="d-flex flex-column align-items-center text-center p-3 py-5">
                            <img class="rounded-circle mt-5" style="width: 150px" src="${data.img}">
                            <span class="font-weight-bold">${data.name}</span>
                            <!--<span class="text-black-50">${data.name}</span>-->
                        </div>
                    </div>
                    <div class="col-md-5 border-right">
                        <div class="p-3 py-5">
                            <div class="d-flex justify-content-between align-items-center mb-3">
                                <h4 class="text-right">User Profile Editing</h4>
                            </div>
                            <div class="row mt-2">
                                <div class="col-md-6" style="margin-top: 20px"><label class="labels">Full Name: </label><h5>${data.name}</h5></div>
                                <!-- <div class="col-md-6"><label class="labels">Last Name: </label><h5>Duc</h5></div> -->
                            </div>
                            <div class="usercontent row mt-3">
                                <div class="col-md-12" style="margin-top: 20px"><label class="labels" style="text-decoration: none">Mobile Number: </label>
                                    <h5>${data.phone}</h5>
                                </div>
                                <div class="col-md-12" style="margin-top: 20px"><label class="labels" style="text-decoration: none">Email: </label>
                                    <h5>${data.email}</h5>
                                </div>
                                <div class="col-md-12" style="margin-top: 20px"><label class="labels" style="text-decoration: none">Address: </label>
                                    <h5>${data.address}</h5>
                                </div>                            
                                <div class="col-md-12" style="margin-top: 20px"><label class="labels" style="text-decoration: none">Birthday: </label>
                                    <h5>${data.dob}</h5>
                                </div>
                                <div class="col-md-12" style="margin-top: 20px"><label class="labels" style="text-decoration: none">Role: </label>
                                    <h5>${data.role}</h5>
                                </div>                                                         
                                <div class="col-md-12" style="margin-top: 20px"><label class="labels" style="text-decoration: none">Gender: </label>
                                    <h5>${data.gender}</h5>
                                </div>                             
                                <div class="col-md-12" style="margin-top: 20px"><label class="labels" style="text-decoration: none">Status: </label>
                                    <h5>${data.status}</h5>
                                </div>                             
                            </div>                                                                    
                        </div>                  
                    </div>
                    <div class="mt-5 text-center col-md-10">
                        <a href="userlist"><button class="btn btn-primary profile-button" type="button">Back to List</button></a>
                    </div>
                </div>
            </div>
        </div>


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>
