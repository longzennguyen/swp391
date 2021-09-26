<%-- 
    Created on : Sep 17, 2021, 1:40:38 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login/ Register</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </head>
    <body style="background-image: url('https://images.pexels.com/photos/3662667/pexels-photo-3662667.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940'); background-size: 100%;">

        <main class="page login-page">
            <section class="clean-block clean-form dark">
                <div class="container" style="margin-top: 5%">
                    <div class="block-heading">
                        <!--<h2 class="text-info">Dịch vụ chăm sóc sức khoẻ cho trẻ</h2>-->
                        <h2 class="text-info">Đăng nhập</h2>
                    </div>
                    <form action="LoginSvlet" method="POST">
                        <div class="form-group"><label for="email">Email</label><input placeholder="Email" class="form-control item" type="email" name="uid" required></div>
                        <div class="form-group"><label for="password">Mật khẩu</label><input placeholder="Mật khẩu" class="form-control" type="password" name="pwd" required pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,12}$"></div>
                        <!--<p class="form-group">${loginfail1}</p>-->
                        <p style="color: red"><%=request.getAttribute("loginfail1") == null ? "" : request.getAttribute("loginfail1")%></p>
                        <div class="form-group">
                            <div class="form-check"><label class="form-check-label" for="checkbox">${loginfail}</label></div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <button class="btn btn-primary btn-block" type="submit" style="margin-top: 10px">Đăng nhập</button></div>
                            <div class="col-md-6">
                                <button type="button" style="margin-top: 10px" class="btn btn-primary btn-block" data-toggle="modal" data-target=".bd-example-modal-lg">Đăng ký</button>
                            </div>
                        </div>
                    </form>
                </div>
            </section>
        </main>
        <div class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel" aria-hidden="true" style="width: 90%">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Đăng ký</h5>
                    </div>
                    <div class="modal-body">
                        <form action="RegisterAccount" method="POST">
                            <div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">First Name</label>
                                    <div class="col-10">
                                        <input placeholder="First Name" class="form-control" type="text" name="first_name" required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Last Name</label>
                                    <div class="col-10">
                                        <input placeholder="Last Name" class="form-control" type="text" name="last_name" required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Email</label>
                                    <div class="col-10">
                                        <input placeholder="Email" class="form-control" type="text" name="username" required>
                                        <div class="col-10">
                                            <small id="checkDuplicateUser" class="form-text text-muted"></small>
                                            <c:if test="${not empty duplicateUser}">
                                                if(document.getElementById('checkDuplicateUser').innerHTML == 'Da ton tai');
                                            </c:if>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Mật khẩu</label>
                                    <div class="col-10">
                                        <input placeholder="Mật khẩu" class="form-control" type="password" name="password" id="password" onkeyup="validatePassword()" required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Xác thực mật khẩu</label>
                                    <div class="col-10">
                                        <input placeholder="Xác thực" class="form-control" type="password" name="repassword" id="confirm_password" onkeyup="validatePassword()" required>
                                        <small id="validatePassword" class="form-text text-muted"></small>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Ngày sinh</label>
                                    <div class="col-10">
                                        <input class="form-control" type="date" name="date" required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Số điện thoại</label>
                                    <div class="col-10">
                                        <input placeholder="Số điện thoại" class="form-control" type="number" name="phone" required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Giới tính</label>
                                    <div class="col-10">
                                        <div class="form-check form-check-inline">
                                            <label class="form-check-label">
                                                <input class="form-check-input" type="radio" name="gender" value="1"> Đàn ông
                                            </label>
                                        </div>
                                        <div class="form-check form-check-inline">
                                            <label class="form-check-label">
                                                <input class="form-check-input" type="radio" name="gender" value="0"> Phụ nữ
                                            </label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-2 col-form-label">Địa chỉ</label>
                                <div class="col-10">
                                    <input placeholder="Địa chỉ" class="form-control" type="text" name="address" required>
                                </div>
                            </div>
                            <!--                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                        <button type="submit" class="btn btn-primary">Register</button>-->
                            <div class="modal-footer" >
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
                                <button type="submit" class="btn btn-primary" name="action" value="test">Test</button>
                                <button type="submit" class="btn btn-primary" name="action" value="submit" >Đăng ký</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>

        <script >
            function submitRegister() {
                document.getElementById("register").submit();
            }

            var validatePassword = function () {
                if (document.getElementById('password').value == '' && document.getElementById('confirm_password').value == '') {
                    document.getElementById('validatePassword').innerHTML = '';
                } else if (document.getElementById('password').value == document.getElementById('confirm_password').value) {
                    document.getElementById('validatePassword').innerHTML = 'Password Matching';
                } else {
                    document.getElementById('validatePassword').innerHTML = 'Password Not Matching';
                }
            }
        </script>
    </body>
</html>
