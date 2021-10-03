<%-- 
    Document   : adduser
    Created on : Sep 24, 2021, 1:12:05 PM
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
        <link rel="stylesheet" href="css/admin.css">
    </head>
    <body>
        <%@include file="header.jsp"%>

        <div class="content">
            <form action="useradd" method="POST">
                <div class="container rounded bg-white mt-5 mb-5">
                    <div class="row">
                        <div class="d-flex justify-content-center">
                            <div class="p-3 py-5">
                                <div class="d-flex justify-content-between align-items-center mb-3">
                                    <h4 class="text-right">User Profile</h4>
                                </div>
                                <div class="row mt-2">
                                    <div class="col-md-6"><label class="labels">First Name</label>
                                        <input type="text" class="form-control" name="first_name" >
                                    </div>
                                    <div class="col-md-6"><label class="labels">Last Name</label>
                                        <input type="text" class="form-control" name="last_name">
                                    </div>
                                </div>
                                <div class="row mt-3">
                                    <div class="col-md-12"><label class="labels">User ID</label>
                                        <input type="text" class="form-control" name="user_id">
                                    </div>
                                    <div class="col-md-12"><label class="labels">Mobile Number</label>
                                        <input type="text" class="form-control" name="phone" >
                                    </div>
                                    <div class="col-md-12"><label class="labels">Email</label>
                                        <input type="text" class="form-control" name="email">
                                    </div>
                                    <div class="col-md-12"><label class="labels">Address</label>
                                        <input type="text" class="form-control" name="address">
                                    </div>                            
                                    <div class="col-md-12"><label class="labels">Birthday</label>
                                        <input type="date" class="form-control" name="dob">
                                    </div>
                                    <div class="col-md-12" style="margin-top: 20px"><label class="labels">Role: </label>
                                        <select name="role_id">
                                            <option value="5">Customer</option>
                                            <option value="4">Nurse</option>
                                            <option value="3">Doctor</option>
                                            <option value="2">Manager</option>
                                            <option value="1">Administrator</option>
                                        </select>                                
                                    </div> 
                                    <div class="col-md-12" style="margin-top: 20px"><label class="labels">Gender: </label>                                
                                        <input type="radio" name="gender" value="0" checked /> Male
                                        <input type="radio" name="gender" value="1" /> Female
                                    </div>
                                    <div class="col-md-12" style="margin-top: 20px"><label class="labels">Status: </label>                                
                                        <input type="radio" name="status_id" value="1" checked /> Active
                                        <input type="radio" name="status_id" value="2" /> Disable
                                    </div>

                                </div>                                                                    
                            </div>                  
                        </div>
                        <div class="mt-5 text-center col-md-12"><button class="btn btn-primary profile-button" type="button" data-toggle="modal" data-target="#exampleModalCenter">Save Profile</button></div>
                        <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                            <div class="modal-dialog modal-dialog-centered" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLongTitle">Confirmation</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                        Do you want to add this user?
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
                                        <button type="submit" class="btn btn-primary">Yes</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>
