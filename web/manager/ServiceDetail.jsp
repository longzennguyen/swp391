<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Service Detail</title>
        <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
              rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
              rel="stylesheet">
        <!-- //Web-Fonts -->
        <!-- Bootsrap -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">

        <!-- Font awesome -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">

        <!-- Owl carousel -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl.carousel.css">

        <!-- Template main Css -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

        <!-- Modernizr -->
        <script src="${pageContext.request.contextPath}/js/modernizr.js"></script>
    </head>
    <body onload="onLoad()">
        <%@include file="../homepageheader.jsp"%>

    <center>
        <div style="padding: 20px; margin-bottom: 50px">
            <div class="text-center">
                <h2 >Service Detail</h2>
            </div>
            <form method="POST" action="${pageContext.request.contextPath}/manager/service/edit">
                <input type="hidden" value="${data.service_id}" name="id"/>
                <div class="container rounded bg-white mt-5 mb-5">
                    <div class="col-md-12" style="margin-top: 20px;"><label style="float: left">Thumbnail:</label>
                        <img id="output" src="${pageContext.request.contextPath}/${data.img}" alt="" width="200px" height="200"/>
                        <input type="file" name="image" class="form-control " value="${data.img}" onchange="loadFile(event)">
                    </div>
                    <div class="col-md-12" style="margin-top: 20px;"><label style="float: left">Category:</label>
                        <input type="text" id = "Input" class="form-control" placeholder="${data.category_id}" value="${data.category_id}" name="category">
                    </div>
                    <div class="col-md-12" style="margin-top: 20px;"><label style="float: left">Title</label>
                        <input type="text" id = "Input"  name="title" class="form-control" placeholder="${data.title}"  value="${data.title}"   >
                    </div>
                    <div class="col-md-12" style="margin-top: 20px;"><label style="float: left">Sale Price</label>
                        <input type="number" id = "Input"  name="price" class="form-control" placeholder="${data.price}" value="${data.price}"  >
                    </div>
                    <div class="col-md-12" style="margin-top: 20px;"><label style="float: left">Featured</label>
                        <select  class="form-control" id="Input"  name="featured" >
                            <option value="1" ${data.featured == 1 ? 'selected' :''}>True</option>
                            <option value="0"  ${data.featured == 0 ?'selected' :''}>False</option>
                        </select>
                    </div>                                
                    <div class="col-md-12" style="margin-top: 20px;"><label style="float: left">Status</label>
                        <select  class="form-control" id="Input"  name="status" >
                            <option value="1" ${data.status == 1 ?'selected' :''}>Available</option>
                            <option value="0"  ${data.status == 0 ?'selected' :''}>Unavailable</option>
                        </select>
                    </div>   
                </div>
                <div class="text-center" style="margin-top: 50px">
                    <input class="btn btn-primary" type="submit" id="submit" value="Submit"> 
                    <a class="btn btn-primary" href="#">Add New</a> 
                </div>  
            </form>                
            <div class="text-center" style="margin-top: 50px">
                <a href="customerlist?page=1&word=" class="btn btn-primary">Go Back</a>
                <button class="btn btn-primary" onclick = "Run()" id="edit">Edit Service</button>                
            </div>



        </div>

    </center>







    <%@include file="../homepagefooter.jsp"%>
    <!--  Scripts
================================================== -->

    <!-- jQuery -->
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script>
                    window.jQuery || document.write('<script src="assets/js/jquery-1.11.1.min.js"><\script>');
    </script>

    <!-- Bootsrap javascript file -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    <!-- owl carouseljavascript file -->
    <script src="${pageContext.request.contextPath}/js/owl.carousel.min.js"></script>

    <!-- Template main javascript -->
    <script src="${pageContext.request.contextPath}/js/main.js"></script>


    <script>
                    $(document).ready(function () {
                        $("#edit").click(function () {
                            $('input').attr('readonly', false);
                            $('select').attr('disabled', false);
                        });
                    });
                    var loadFile = function (event) {
                        var output = document.getElementById('output');
                        output.src = URL.createObjectURL(event.target.files[0]);
                        output.onload = function () {
                            URL.revokeObjectURL(output.src) // free memory
                        }
                    };
    </script>

    <script>
        function Run() {
            var x = document.getElementById("submit");
            if (x.style.display === "none") {
                x.style.display = "inline-block";
                x.className = "text-center btn btn-primary";
            }
        }
        function updateFilename(path) {
            var name = extractFilename(path);
            document.getElementById('filename').textContent = name;
        }
    </script>

</body>
</html>
