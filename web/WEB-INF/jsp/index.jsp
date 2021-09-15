<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<style>
    
</style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <table action="servlet1" method="post">  
            <tr>
                <td>Name:</td>
                <td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <td>
                    Password:
                </td>
                <td>
                    <input type="password" name="userpass"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="login"/>  
                </td>
            </tr>
        </table>  
    </body>
</html>
