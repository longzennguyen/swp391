<%-- 
    Document   : customerlist
    Created on : Oct 29, 2021, 1:05:51 PM
    Author     : ROG STRIX
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Service List</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
        <!-- Custom Theme files -->
        <link href="${pageContext.request.contextPath}/css/newstyle.css" rel="stylesheet" type="text/css" media="all"/>
        <!--js-->
        <script src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js"></script> 
        <!--icons-css-->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/fontawesome-all.min.css" type="text/css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.css">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <!--Google Fonts-->
        <link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <div class="page-container">	
            <div class="left-content">
                <div class="mother-grid-inner">
                    <!--header start here-->
                    <%@include file="../managerheader.jsp"%> 
                    <!--inner block start here-->

                    <div class="inner-block">
                        <div class="blank">
                            <div class="content text-center" style="">
                                <h2 style="color: #1290f8">Service List</h2>
                            </div>                             
                            <div style="margin-top: 20px; margin-left: 20px">
                                <form class="form-inline my-2 my-lg-0" style="float: left; padding-bottom: 20px;width: 70% " action="${pageContext.request.contextPath}/manager/service" method="POST"> 
                                    <input class="form-control mr-sm-2" style="width: 80%" type="text" placeholder="Search by title" value="${keyword}" name="keyword">
                                    <input class="btn  my-2 my-sm-0" type="submit" value="Search">
                                </form>
                                <div class="dropdown" style="float: left; margin-left: 50px">
                                    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Filter
                                        <span class="caret"></span></button>
                                    <ul class="dropdown-menu">
                                        <li><a href="${pageContext.request.contextPath}/manager/service?sort=priceasc&index=${index}">Sort by Sale Price ASC</a></li>
                                        <li><a href="${pageContext.request.contextPath}/manager/service?sort=pricedesc&index=${index}">Sort by Sale Price DESC</a></li>
                                    </ul>
                                </div>
                            </div>
                            <table class="table " style="margin-top: 40px">
                                <thead>
                                    <tr>
                                        <th scope="col" style="width: 5%">ID</th>
                                        <th scope="col" style="width: 20%">Thumbnail</th>
                                        <th scope="col" style="width: 25%">Title</th>
                                        <th scope="col" style="width: 5%">Category</th>
                                        <th scope="col" style="width: 10%">Sale Price</th>
                                        <th scope="col" style="width: 10%">featured</th>
                                        <th scope="col" style="width: 10%">Status</th>
                                        <th scope="col" style="width: 10%"></th>
                                    </tr>
                                </thead>
                                <c:if test="${empty data}">
                                    <td>Customer not found</td>
                                </c:if>
                                <tbody>               
                                    <c:forEach var="item" items="${data}">
                                        <tr>                           
                                            <td>${item.service_id}</td>
                                            <td><image src="${pageContext.request.contextPath}/${item.img}" style="width: 100%; height: 30%"/></td>
                                            <td>${item.title}</td>
                                            <td>${item.category_id}</td>
                                            <td>${item.price}</td>
                                            <td>${item.featured == 1 ? 'True' :'False'}</td>
                                            <td>${item.status == 1 ? 'Available' :'Unavailable'}</td>
                                            <td>
                                                <button><a href="${pageContext.request.contextPath}/manager/service/edit?id=${item.service_id}">Detail</a></button>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                            <br>
                            <c:if test="${totalPage > 0}">
                                <ul class="pagination" style="float: left;font-size: 20px">
                                    <c:forEach var="item" begin="1" end="${totalPage}" step="1" >
                                        <li  class="${item == index ? 'active':''}"><a href="${pageContext.request.contextPath}/manager/service?index=${item}&keyword=${keyword}&sort=${sort}">${item}</a></li>
                                        </c:forEach>
                                </ul>
                            </c:if>




                        </div>
                    </div>
                    <!--inner block end here-->








                </div>
            </div>



            <!--slider menu-->
            <%@include file="../sidermenu.jsp"%>            
            <div class="clearfix"> </div>
        </div>
        <!--scrolling js-->
        <script src="${pageContext.request.contextPath}/js/jquery.nicescroll.js"></script>
        <script src="${pageContext.request.contextPath}/js/scripts.js"></script>
        <!--//scrolling js-->
        <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
        <!-- mother grid end here-->


    </body>
</html>

