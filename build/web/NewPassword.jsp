<%-- 
    Document   : NewPassword
    Created on : Sep 28, 2021, 9:47:06 PM
    Author     : Admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dao.DBContext_Postgresql"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String code = request.getAttribute("code_reset").toString();
    System.out.println("Code eeee e e e e : " + code + "email : " + request.getAttribute("emailr"));
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <script src="https://smtpjs.com/v3/smtp.js"></script>  
        <script src=
                "https://smtpjs.com/v3/smtp.js">
        </script>
    </head>

    <body>
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Reset Mật Khẩu</h5>
                </div>
                <div class="modal-body">
                    <form action="ResetPass" method="POST">
                        <div>
                            <p style="color: red; width: 90%; margin-left: 19%">${error_code}</p>
                            <div class="form-group row">
                                <input hidden="true" name="codere" value="${code_reset}">
                                <input hidden="true" name="emailr1" value="${emailr}">
                                <label class="col-2 col-form-label">Mã Code</label>
                                <div class="col-10">
                                    <input placeholder="Mã code" class="form-control" type="number" name="code">
                                </div>
                                <!--<div class="row">-->

                                <!--</div>-->
                            </div>
                            <div class="form-group row">
                                <label class="col-2 col-form-label">Mật khẩu mới</label>
                                <div class="col-10">
                                    <input placeholder="Mật khẩu mới" class="form-control" type="password" name="passwordr" id="passwordr" onkeyup="validatePasswordr()">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-2 col-form-label">Xác thực mật khẩu</label>
                                <div class="col-10">
                                    <input placeholder="Xác thực" class="form-control" type="password" name="repasswordr" id="repasswordr" onkeyup="validatePasswordr()">
                                    <small id="validatePasswordr" class="form-text text-muted"></small>
                                </div>
                            </div>
                        </div>
                        <!--                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                    <button type="submit" class="btn btn-primary">Register</button>-->
                        <div class="modal-footer" >
                            <button type="submit" class="btn btn-secondary" data-dismiss="modal" name="service" value="close">Quay lại</button>
                            <button type="submit" class="btn btn-primary" name="service" value="reset_p"
                                    >Khôi phục</button>
                        </div>
                </div>
                </form>
            </div>
        </div>
        <script>
            var validatePasswordr = function () {
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
