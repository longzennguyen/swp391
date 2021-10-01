<%-- 
    Document   : useredit
    Created on : Sep 30, 2021, 8:46:49 PM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">    
        <link rel="stylesheet" href="css/admin.css">
    </head>
    <body>
        <%@include file="header.jsp"%>
        <div class="content">
            <div class="container rounded bg-white mt-5 mb-5">
                <div class="row">
                    <div class="col-md-6 border-right">
                        <div class="p-3 py-5">
                            <div class="d-flex justify-content-between align-items-center mb-3">
                                <h4 class="text-right">User Profile</h4>
                            </div>
                            <div class="row mt-2">
                                <div class="col-md-6"><label class="labels">Full Name</label>
                                    <input type="text" class="form-control" placeholder="${data.name}" value="" disabled>
                                </div>
                            </div>
                            <div class="row mt-3">
                                <div class="col-md-12"><label class="labels">Mobile Number</label>
                                    <input type="text" class="form-control" placeholder="${data.phone}" value="" disabled>
                                </div>
                                <div class="col-md-12"><label class="labels">Email</label>
                                    <input type="text" class="form-control" placeholder="${data.email}" value="" disabled>
                                </div>
                                <div class="col-md-12"><label class="labels">Address</label>
                                    <input type="text" class="form-control" placeholder="${data.address}" value="" disabled>
                                </div>
                                <div class="col-md-12"><label class="labels">Birthday</label>
                                    <input type="text" class="form-control" placeholder="${data.dob}" value="" disabled>
                                </div>                                

                            </div>
                        </div>
                    </div>
                                 
                    <div class="col-md-6">
                        <div class="p-3 py-5">
                            <div class="d-flex justify-content-between align-items-center mb-3">
                                <h4 class="text-right">User Edit</h4>
                            </div>
                            <form method="POST" action="useredit">
                                
                                <div class="col-md-12"><label class="labels">User ID: </label>
                                    <input type="text" class="form-control " name="user_id" value="${data.user_id}" readonly>
                                </div>
                                
                                <div class="col-md-12" style="margin-top: 20px;"><label class="labels">Old Role: </label>
                                    <input type="text" class="form-control" value="${data.role}" readonly>
                                </div>
                                <div class="col-md-12" style="margin-top: 20px;"><label class="labels">Select New Role: </label>
                                    <select name="role_id">
                                        <option value="1">Administrator</option>
                                        <option value="2">Manager</option>
                                        <option value="3">Doctor</option>
                                        <option value="4">Nurse</option>
                                        <option value="5">Customer</option>
                                    </select>
                                </div>
                                <div class="col-md-12"><label class="labels">Old Status: </label>
                                    <input type="text" class="form-control"  value="${data.status}" readonly>
                                </div>
                                <div class="col-md-12" style="margin-top: 20px;"><label class="labels">New Status: </label>
                                    <input type="radio" name="status_id" value="1" ${data.status == "Active"? "checked":"" } /> Active
                                    <input type="radio" name="status_id" value="2" ${data.status == "Disable"? "checked":"" }}/> Disable
                                </div>
                                <input type="submit" value="Save" >
                            </form>                               
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>