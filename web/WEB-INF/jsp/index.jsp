<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <style>
            .tableStyle{
                width: 100%;
                height: 100%;
                margin-top: 0px;
            }
            tableStyle.rightPage{
                color: blue;
                text-align: center;
                width: 50%;
                height: 100%;
                background-color: red;
                border: 1px solid black;
                /*background-size: 50% 100%;*/
            }
            tableStyle.leftPage{
                color: white;
                text-align: center;
                width: 50%;
                height: 100%;
                border: 1px solid black;
                /*background-size: 50% 100%;*/
            }
            .style1{
                 width: 100%; height: 100%; background-color: blue;
            }
        </style>
    </head>

    <body>
        <table action="servlet1" method="post" class =style1  >  
            <td width=100 height=400 bgcolor="white" align="center"> <!--width=100 height=400 bgcolor="white" align="center"-->
                <h1 style="margin-top: -50px">Đăng nhập</h1>
                <a>Chưa có tài khoản?</a>
                <a href="http://google.com.vn">Đăng ký</a>
                <h1></h1>
                <table>
                    <tr>
                        <td>
                            <input type="email" id="email" name="checkUser" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2, 4}$" placeholder="Email" 
                                   onkeyup="onChangeEmail()" >
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="password"  placeholder="Password" id="password">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <button onclick="checkUser()"> 
                                Click Here! 
                            </button> 
                        </td>
                    </tr> 
                </table>
            </td>
            <td width=100 height=900 bgcolor="blue"></td>
        </table>  
        <p id="GFG"></p> 
        <script>
            function checkUser() {
                window.alert("hi");
                var status = document.getElementById("email").pattern;
                System.out.printl("hahahahah: " + status);
                document.getElementById("GFG").innerHTML = status;
                
            }
            function onChangeEmail() {
                var textGet = document.getElementById("email").value;
                alert("change...: "+textGet);
            }
        </script>
    </body>
</html>
