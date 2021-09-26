<%-- 
    Document   : HomePage
    Created on : Sep 17, 2021, 1:40:38 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <div class="row" style="height: 35%; width: 100%; background-image: url('https://www.seekpng.com/png/full/762-7626001_footer-img-children-footer.png');background-color:  activeborder" >
                <div class="col-3" style="width: 50%; height: 25% ;">
                    <div class="row" style="height: 10%">
                        <h1 class="form-group" style="margin-top: 3%;font-size: 20px">Tận tâm - Chất lượng vì sức khoẻ trẻ em!</h1>
                    </div>
                    <div class="row" style="height: 10%">

                        <h1 class="form-text" style="font-size: 14px"> <img alt="call" src="https://e7.pngegg.com/pngimages/826/886/png-clipart-iphone-computer-icons-telephone-call-phone-call-icon-blue-call-icon-miscellaneous-text.png" height="20px" width="20px" style="border-radius: 10px">0987654321</h1>
                    </div>
                </div>
                <div class="col-9" style="width: 100%;flex:1" >
                    <nav class="" style="margin: auto;" >
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <a class="navbar-brand" style="color: darkslategrey" href="#">Trang chủ</a>

                        <!--                        <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
                                                    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                                                        <li class="nav-item active">-->
                        <a class="navbar-brand" style="color: darkslategrey" href="#" onclick="">Tin tức<span class="sr-only">(current)</span></a>
                        <!--                                </li>
                                                        <li class="nav-item">-->
                        <a class="navbar-brand" style="color: darkslategrey" href="#">Thanh toán</a>
                        <!--                                </li>
                                                        <li class="nav-item">-->
                        <a class="navbar-brand " style="color: darkslategrey" href="#"><%="Xin chào " + request.getAttribute("Name_of_User")%></a>
                        <!--</li>-->
                        <!--</ul>-->
                        <!--                        <form style="margin-right: 1%;width: 20%">-->
                        <div>
                            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" style="width: 20%">
                            <button class="btn btn-outline-success my-2 my-sm-0" style="margin-right: 5px" type="submit">Search</button>
                            <!--</form>-->
                        </div>
                    </nav>
                </div>
                </nav>
            </div>
        </div>
    </div>
</body>
</html>
