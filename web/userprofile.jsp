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
        <form action="">
        <div class="container rounded bg-white mt-5 mb-5">
            <div class="row">
                <div class="col-md-3 border-right">
                    <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" width="150px" src="img/avatar.JPEG"><span class="font-weight-bold">Duc</span><span class="text-black-50">Nguyen Tien Duc</span><span> </span></div>
                </div>
                <div class="col-md-5 border-right">
                    <div class="p-3 py-5">
                        <div class="d-flex justify-content-between align-items-center mb-3">
                            <h4 class="text-right">User Profile Editing</h4>
                        </div>
                        <div class="row mt-2">
                            <div class="col-md-6"><label class="labels">First Name</label><input type="text" class="form-control" placeholder="Nguyen Tien" value=""></div>
                            <div class="col-md-6"><label class="labels">Last Name</label><input type="text" class="form-control" value="" placeholder="Duc"></div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-md-12"><label class="labels">Mobile Number</label><input type="text" class="form-control" placeholder="0963974475" value=""></div>
                            <div class="col-md-12"><label class="labels">Email</label><input type="text" class="form-control" placeholder="duc@gmail.com" value=""></div>
                            <div class="col-md-12"><label class="labels">Address</label><input type="text" class="form-control" placeholder="" value="viet nam, viet nam, viet nam"></div>                            
                            <div class="col-md-12"><label class="labels">Birthday (yyyy-MM-dd)</label><input type="text" class="form-control" placeholder="31/07/2001" value=""></div>
                            <div class="col-md-12"><label class="labels">Role</label><input type="text" class="form-control" placeholder="Administrator" value=""></div> 
                            <div class="col-md-12" style="margin-top: 20px"><label class="labels">Gender</label>
                                <input type="radio" name="gender" value="0" checked /> Male
                                <input type="radio" name="gender" value="1" /> Female
                            </div>
                        </div>                                                                    
                    </div>                  
                </div>
                <div class="col-md-4">
                    <div class="p-3 py-5">
                        <div class="d-flex justify-content-between align-items-center experience"><span>Account Edit</span></div><br>
                        <div class="col-md-12"><label class="labels">Username</label><input type="text" class="form-control" placeholder="ducusername" value=""></div> <br>
                        <div class="col-md-12"><label class="labels">Password</label><input type="text" class="form-control" placeholder="ducpassword" value=""></div>
                    </div>
                </div>
                <div class="mt-5 text-center col-md-10"><button class="btn btn-primary profile-button" type="submit">Save Profile</button></div>
            </div>
        </div>
    </form>
</div>


    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
