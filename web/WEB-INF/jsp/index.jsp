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
        </style>
    </head>

    <body>
        <table action="servlet1" method="post" class =tableStyle  >  
            <td width=100 height=900 bgcolor="white" align="center">
                <h1>Đăng nhập</h1>
                <a>Chưa có tài khoản?</a>
                <a href="http://google.com.vn">Đăng ký</a>
                <h1></h1>
                <table >
                    <tr>
                        <td>
                            <input type="email" id="email" name="checkUser" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2, 4}$">
                            
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="password">
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
         <p id="GFG" style="font-size:20px;color:green;"></p> 
        <script>
            function checkUser() {
                var status = document.getElementById("email").pattern;
                document.getElementById("GFG").innerHTML = status;
            }
        </script>
    </body>
</html>
