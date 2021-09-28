<%-- 
    Document   : reservationContact.jsp
    Created on : Sep 27, 2021, 2:47:27 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/reservation.css">
    </head>
    <body>
        <div class="header" style="background-image: url(img/foot1_1.jpg)"></div>
        <div class="bodyLayout1">
            <button id="backToHomepage">Về trang thanh toán </button>
            <table>
                <tr>
                    <td class="col-1">STT</td>
                    <td class="col-2">Dịch vụ</td>
                    <td class="col-3">Bác sĩ chỉ định</td>
                    <td class="col-4">Thay đổi/Xem thông tin</td>
                </tr>
                <tr>
                    <td class="col-1">1</td>
                    <td class="col-2">
                        <img src="img/service-image1.png" style="width: 60%">
                        </br>
                        <p>Dịch vụ chăm sóc trẻ sơ sinh</p>
                    </td>
                    <td class="col-3">Nguyễn Văn A</td>
                    <td class="col-4">
                        <button><img src="img/change.png" style="width: 30px;height: 30px"></button>
                        <button><img src="img/search.png" style="width: 30px;height: 30px"></button>
                    </td>

                </tr>
                <tr>
                    <td class="col-1">2</td>
                    <td class="col-2">
                        <img src="img/service-image2.jpg" style="width: 60%">
                        </br>
                        <p>Dịch vụ lấy mẫu xét nghiệm tại nhà</p></td>
                    <td class="col-3">Nguyễn Văn B</td>
                    <td class="col-4">
                        <button><img src="img/change.png" style="width: 30px;height: 30px"></button>
                        <button><img src="img/search.png" style="width: 30px;height: 30px"></button>
                    </td>
                </tr>
            </table>
        </div>
        <div class="bodyLayout3">
            <h3 style="text-align: center">Hóa đơn thanh toán</h3>
            <h3 style="text-align: center">Lưu ý: tên người mua, địa chỉ, điện thoại bắt buộc phải điền vào</h3>
            <div class="pay">
            <div>
                <label>Tên người mua:</label></br>
                <input type="text" class="inputField" value="">
            </div>
            <div>
                <label>Email:</label></br>
                <input type="text" class="inputField" value="">
            </div>
            <div>
                <label>Địa chỉ:</label></br>
                <input type="text" class="inputField" value="">
            </div>
            <div>
                <label>Số điện thoại:</label></br>
                <input type="text" class="inputField" value="">
            </div>
            <div><label>Tổng giá tiền dịch vụ:</label><p></p></div>
            <div>
                <label>Hình thức thanh toán:</label>
                <select name="type">
                    <option>Thanh toán COD</option>
                    <option>Chuyển khoản BIDV</option>
                </select>
            </div>
             <button id="confirm" class="confirm">Xác nhận</button>
            </div>
           
        </div>
    </body>
</html>

