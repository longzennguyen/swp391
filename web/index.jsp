<%-- 
    Created on : Sep 17, 2021, 1:40:38 PM
    Author     : Admin
--%>
<%@ page import = "java.io.*,java.util.*,javax.mail.*"%>
<%@ page import = "javax.mail.internet.*,javax.activation.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
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
        <script src="https://smtpjs.com/v3/smtp.js"></script>  
        <script src=
                "https://smtpjs.com/v3/smtp.js">
        </script>

        <script type="text/javascript">
            function sendEmail1() {
                Email.send({
                    Host: "smtp.gmail.com",
                    Username: "longnvse04068@gmail.com",
                    Password: "zeny@1234",
                    To: 'longzenbiker@gmail.com',
                    From: "longnvse04068@gmail.com",
                    Subject: "Sending Email using javascript",
                    Body: "Well that was easy!!",
                })
                        .then(function (message) {
                            alert("mail sent successfully")
                        });
            }
        </script>
    </head>
    <body style="background-image: url('https://images.pexels.com/photos/3662667/pexels-photo-3662667.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940'); background-size: 100%;">

        <main class="page login-page">
            <section class="clean-block clean-form dark">
                <div class="container" style="margin-top: 5%">
                    <div class="block-heading">
                        <!--<h2 class="text-info">Dịch vụ chăm sóc sức khoẻ cho trẻ</h2>-->
                        <h2 class="text-info">Login</h2>
                    </div>
                    <form action="login" method="POST">
                        <div class="form-group"><label for="email">Email</label><input placeholder="Email" class="form-control item" type="email" name="uid" required></div>
                        <div class="form-group"><label for="password">Password</label><input placeholder="Mật khẩu" class="form-control" type="password" name="pwd" ></div>
<!--                        required pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,12}$"-->

<!--<p class="form-group">${loginfail1}</p>-->
                        <p style="color: red"><%=request.getAttribute("loginfail1") == null ? "" : request.getAttribute("loginfail1")%></p>
                        <div class="form-group">
                            <div class="form-check"><label class="form-check-label" for="checkbox">${loginfail}</label></div>
                        </div>
                        <div class="row" style="margin-top: 10px">
                            <div class="col-10" style="text-align: right" >
                                <p style="margin-right: 10%">Already have an account?<a onclick="document.getElementById('resetpass').style.display = 'block'" style="color: blue">Forgot password?</a></p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <button class="btn btn-primary btn-block" type="submit" style="margin-top: 10px">Log In</button></div>
                            <div class="col-md-6">
                                <button type="button" style="margin-top: 10px" class="btn btn-primary btn-block" data-toggle="modal" data-target=".bd-example-modal-lg">Create new Account</button>
                            </div>
                            <!--                            <div class="col-md-6">
                                                            <button type="button" style="margin-top: 10px" class="btn btn-primary btn-block" data-toggle="modal" data-target="#resetpass">Quên mật khẩu</button>
                                                        </div>-->
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
                                <button type="submit" class="btn btn-primary" name="action" value="submit" >Đăng ký</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>
        <!--modal reset password-->
        <div class="modal" id="resetpass" aria-hidden="true" style="width: 90%">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Reset Mật Khẩu</h5>
                    </div>
                    <div class="modal-body">
                        <form action="ResetPassword" method="POST">
                            <div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Email</label>
                                    <div class="col-10 input-group">
                                        <input placeholder="Email" class="form-control" type="text" name="email123123" required>
                                        <button class="col-sm-4 " type="submit" style="width: 20px;background-color: forestgreen; color: white;border-radius: 4px;" name="service" value="sendmail">
                                            Gửi code
                                        </button>
<!--                                        <div class="col-10">
                                            <small id="checkDuplicateUser" class="form-text text-muted"></small>
                                            <c:if test="${not empty duplicateUser}">
                                                if(document.getElementById('checkDuplicateUser').innerHTML == 'Da ton tai');
                                            </c:if>
                                        </div>-->
                                    </div>
                                </div>

<!--                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Mã Code</label>
                                    <div class="col-10">
                                        <input placeholder="Mã code" class="form-control" type="number" name="code" required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Mật khẩu mới</label>
                                    <div class="col-10">
                                        <input placeholder="Mật khẩu mới" class="form-control" type="password" name="passwordr" id="passwordr" onkeyup="validatePasswordr()" required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Xác thực mật khẩu</label>
                                    <div class="col-10">
                                        <input placeholder="Xác thực" class="form-control" type="password" name="repasswordr" id="confirm_passwordr" onkeyup="validatePasswordr()" required>
                                        <small id="validatePassword" class="form-text text-muted"></small>
                                    </div>
                                </div>-->
                            </div>
                            <!--                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                        <button type="submit" class="btn btn-primary">Register</button>-->
<!--                            <div class="modal-footer" >
                                <button type="button" class="btn btn-secondary" data-dismiss="modal" onclick="document.getElementById('resetpass').style.display = 'none'">Đóng</button>
                                <button type="submit" class="btn btn-primary" name="action" value="submit" >Đăng ký</button>
                            </div>-->
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
            var validatePassword4 = function () {
                if (document.getElementById('passwordr').value == '' && document.getElementById('confirm_passwordr').value == '') {
                    document.getElementById('validatePasswordr').innerHTML = '';
                } else if (document.getElementById('passwordr').value == document.getElementById('confirm_passwordr').value) {
                    document.getElementById('validatePasswordr').innerHTML = 'Password Matching';
                } else {
                    document.getElementById('validatePasswordr').innerHTML = 'Password Not Matching';
                }
            }
            function sendEmail() {
                let code = 12345;
//                console.log("Email input: ", document.getElementById("email123123").value, " - ", document.getElementById("email123123").value);
                console.log("run mail");
                Email.send({
                    Host: "smtp.gmail.com",
                    Username: "longnvse04068@gmail.com",
                    Password: "zeny@1234",
                    To: "longzenbiker@gmail.com",
                    From: "longnvse04068@gmail.com",
                    Subject: "Code Reset Password",
                    Body: "hi",
                }).then(
                        message => alert("Gửi mã xác thực thành công , vui lòng kiểm tra email!\n ", res)
//                }
                ).catch(err => {
                    message => alert("Không thể gửi mail!")
                });
            }
        </script>
    </body>
</html>
