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
                        <!--<h2 class="text-info">D???ch v??? ch??m s??c s???c kho??? cho tr???</h2>-->
                        <h2 class="text-info">Login</h2>
                    </div>
                    <form action="login" method="POST">
                        <div class="form-group"><label for="email">Email</label><input placeholder="Email" class="form-control item" type="email" name="uid" required></div>
                        <div class="form-group"><label for="password">Password</label><input placeholder="M???t kh???u" class="form-control" type="password" name="pwd" ></div>
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
                                                            <button type="button" style="margin-top: 10px" class="btn btn-primary btn-block" data-toggle="modal" data-target="#resetpass">Qu??n m???t kh???u</button>
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
                        <h5 class="modal-title">????ng k??</h5>
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
                                    <label class="col-2 col-form-label">M???t kh???u</label>
                                    <div class="col-10">
                                        <input placeholder="M???t kh???u" class="form-control" type="password" name="password" id="password" onkeyup="validatePassword()" required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">X??c th???c m???t kh???u</label>
                                    <div class="col-10">
                                        <input placeholder="X??c th???c" class="form-control" type="password" name="repassword" id="confirm_password" onkeyup="validatePassword()" required>
                                        <small id="validatePassword" class="form-text text-muted"></small>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Ng??y sinh</label>
                                    <div class="col-10">
                                        <input class="form-control" type="date" name="date" required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">S??? ??i???n tho???i</label>
                                    <div class="col-10">
                                        <input placeholder="S??? ??i???n tho???i" class="form-control" type="number" name="phone" required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Gi???i t??nh</label>
                                    <div class="col-10">
                                        <div class="form-check form-check-inline">
                                            <label class="form-check-label">
                                                <input class="form-check-input" type="radio" name="gender" value="1"> ????n ??ng
                                            </label>
                                        </div>
                                        <div class="form-check form-check-inline">
                                            <label class="form-check-label">
                                                <input class="form-check-input" type="radio" name="gender" value="0"> Ph??? n???
                                            </label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-2 col-form-label">?????a ch???</label>
                                <div class="col-10">
                                    <input placeholder="?????a ch???" class="form-control" type="text" name="address" required>
                                </div>
                            </div>
                            <!--                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                        <button type="submit" class="btn btn-primary">Register</button>-->
                            <div class="modal-footer" >
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">????ng</button>
                                <button type="submit" class="btn btn-primary" name="action" value="submit" >????ng k??</button>
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
                        <h5 class="modal-title">Reset M???t Kh???u</h5>
                    </div>
                    <div class="modal-body">
                        <form action="ResetPassword" method="POST">
                            <div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Email</label>
                                    <div class="col-10 input-group">
                                        <input placeholder="Email" class="form-control" type="text" name="email123123" required>
                                        <button class="col-sm-4 " type="submit" style="width: 20px;background-color: forestgreen; color: white;border-radius: 4px;" name="service" value="sendmail">
                                            G???i code
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
                                    <label class="col-2 col-form-label">M?? Code</label>
                                    <div class="col-10">
                                        <input placeholder="M?? code" class="form-control" type="number" name="code" required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">M???t kh???u m???i</label>
                                    <div class="col-10">
                                        <input placeholder="M???t kh???u m???i" class="form-control" type="password" name="passwordr" id="passwordr" onkeyup="validatePasswordr()" required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">X??c th???c m???t kh???u</label>
                                    <div class="col-10">
                                        <input placeholder="X??c th???c" class="form-control" type="password" name="repasswordr" id="confirm_passwordr" onkeyup="validatePasswordr()" required>
                                        <small id="validatePassword" class="form-text text-muted"></small>
                                    </div>
                                </div>-->
                            </div>
                            <!--                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                        <button type="submit" class="btn btn-primary">Register</button>-->
<!--                            <div class="modal-footer" >
                                <button type="button" class="btn btn-secondary" data-dismiss="modal" onclick="document.getElementById('resetpass').style.display = 'none'">????ng</button>
                                <button type="submit" class="btn btn-primary" name="action" value="submit" >????ng k??</button>
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
                        message => alert("G???i m?? x??c th???c th??nh c??ng , vui l??ng ki???m tra email!\n ", res)
//                }
                ).catch(err => {
                    message => alert("Kh??ng th??? g???i mail!")
                });
            }
        </script>
    </body>
</html>
