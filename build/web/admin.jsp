<%-- 
    Document   : admin
    Created on : Sep 20, 2021, 3:27:07 PM
    Author     : ROG STRIX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Administrator</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
        <!-- Custom Theme files -->
        <link href="css/newstyle.css" rel="stylesheet" type="text/css" media="all"/>
        <!--js-->
        <script src="js/jquery-2.1.1.min.js"></script> 
        <!--icons-css-->
        <link rel="stylesheet" href="css/fontawesome-all.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/font-awesome.css">
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
                    <%@include file="header.jsp"%>
                    <!--inner block start here-->
                    <div class="inner-block">
                        <div class="blank">
                                <section class="section dashboard">
                                    <div class="row">
                                        <!-- Left side columns -->
                                        <div class="col-lg-8">
                                            <div class="row">
                                                

                                                
                                               

                                                <!-- Customers Card -->
                                                
                                                <!-- Reports -->
                                                

                                                <!-- Recent Sales -->
                                                <div class="col-12">
                                                    <div class="card recent-sales">

                                                        <div class="filter">
                                                            <a class="icon" href="#" data-bs-toggle="dropdown"><i class="bi bi-three-dots"></i></a>
                                                            <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow">
                                                                <li class="dropdown-header text-start">
                                                                    <h6>Filter</h6>
                                                                </li>

                                                                <li><a class="dropdown-item" href="#">Today</a></li>
                                                                <li><a class="dropdown-item" href="#">This Month</a></li>
                                                                <li><a class="dropdown-item" href="#">This Year</a></li>
                                                            </ul>
                                                        </div>

                                                        <div class="card-body">
                                                            <h5 class="card-title">Recent Sales <span>| Today</span></h5>

                                                            <table class="table table-borderless datatable">
                                                                <thead>
                                                                    <tr>
                                                                        <th scope="col">#</th>
                                                                        <th scope="col">Customer</th>
                                                                        <th scope="col">Product</th>
                                                                        <th scope="col">Price</th>
                                                                        <th scope="col">Status</th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody>
                                                                    <tr>
                                                                        <th scope="row"><a href="#">#2457</a></th>
                                                                        <td>Brandon Jacob</td>
                                                                        <td><a href="#" class="text-primary">At praesentium minu</a></td>
                                                                        <td>$64</td>
                                                                        <td><span class="badge bg-success">Approved</span></td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th scope="row"><a href="#">#2147</a></th>
                                                                        <td>Bridie Kessler</td>
                                                                        <td><a href="#" class="text-primary">Blanditiis dolor omnis similique</a></td>
                                                                        <td>$47</td>
                                                                        <td><span class="badge bg-warning">Pending</span></td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th scope="row"><a href="#">#2049</a></th>
                                                                        <td>Ashleigh Langosh</td>
                                                                        <td><a href="#" class="text-primary">At recusandae consectetur</a></td>
                                                                        <td>$147</td>
                                                                        <td><span class="badge bg-success">Approved</span></td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th scope="row"><a href="#">#2644</a></th>
                                                                        <td>Angus Grady</td>
                                                                        <td><a href="#" class="text-primar">Ut voluptatem id earum et</a></td>
                                                                        <td>$67</td>
                                                                        <td><span class="badge bg-danger">Rejected</span></td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th scope="row"><a href="#">#2644</a></th>
                                                                        <td>Raheem Lehner</td>
                                                                        <td><a href="#" class="text-primary">Sunt similique distinctio</a></td>
                                                                        <td>$165</td>
                                                                        <td><span class="badge bg-success">Approved</span></td>
                                                                    </tr>
                                                                </tbody>
                                                            </table>

                                                        </div>

                                                    </div>
                                                </div><!-- End Recent Sales -->

                                                <!-- Top Selling -->
                                                <div class="col-12">
                                                    <div class="card top-selling">

                                                        <div class="filter">
                                                            <a class="icon" href="#" data-bs-toggle="dropdown"><i class="bi bi-three-dots"></i></a>
                                                            <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow">
                                                                <li class="dropdown-header text-start">
                                                                    <h6>Filter</h6>
                                                                </li>

                                                                <li><a class="dropdown-item" href="#">Today</a></li>
                                                                <li><a class="dropdown-item" href="#">This Month</a></li>
                                                                <li><a class="dropdown-item" href="#">This Year</a></li>
                                                            </ul>
                                                        </div>

                                                        <div class="card-body pb-0">
                                                            <h5 class="card-title">Top Selling <span>| Today</span></h5>

                                                            <table class="table table-borderless">
                                                                <thead>
                                                                    <tr>
                                                                        <th scope="col">Preview</th>
                                                                        <th scope="col">Product</th>
                                                                        <th scope="col">Price</th>
                                                                        <th scope="col">Sold</th>
                                                                        <th scope="col">Revenue</th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody>
                                                                    <tr>
                                                                        <th scope="row"><a href="#"><img src="assets/img/product-1.jpg" alt=""></a></th>
                                                                        <td><a href="#" class="text-primary fw-bold">Ut inventore ipsa voluptas nulla</a></td>
                                                                        <td>$64</td>
                                                                        <td class="fw-bold">124</td>
                                                                        <td>$5,828</td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th scope="row"><a href="#"><img src="assets/img/product-2.jpg" alt=""></a></th>
                                                                        <td><a href="#" class="text-primary fw-bold">Exercitationem similique doloremque</a></td>
                                                                        <td>$46</td>
                                                                        <td class="fw-bold">98</td>
                                                                        <td>$4,508</td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th scope="row"><a href="#"><img src="assets/img/product-3.jpg" alt=""></a></th>
                                                                        <td><a href="#" class="text-primary fw-bold">Doloribus nisi exercitationem</a></td>
                                                                        <td>$59</td>
                                                                        <td class="fw-bold">74</td>
                                                                        <td>$4,366</td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th scope="row"><a href="#"><img src="assets/img/product-4.jpg" alt=""></a></th>
                                                                        <td><a href="#" class="text-primary fw-bold">Officiis quaerat sint rerum error</a></td>
                                                                        <td>$32</td>
                                                                        <td class="fw-bold">63</td>
                                                                        <td>$2,016</td>
                                                                    </tr>
                                                                    <tr>
                                                                        <th scope="row"><a href="#"><img src="assets/img/product-5.jpg" alt=""></a></th>
                                                                        <td><a href="#" class="text-primary fw-bold">Sit unde debitis delectus repellendus</a></td>
                                                                        <td>$79</td>
                                                                        <td class="fw-bold">41</td>
                                                                        <td>$3,239</td>
                                                                    </tr>
                                                                </tbody>
                                                            </table>

                                                        </div>

                                                    </div>
                                                </div><!-- End Top Selling -->

                                            </div>
                                        </div><!-- End Left side columns -->

                                        <!-- Right side columns -->
                                        <div class="col-lg-4">

                                            <!-- Recent Activity -->
                                            <div class="card">
                                                <div class="filter">
                                                    <a class="icon" href="#" data-bs-toggle="dropdown"><i class="bi bi-three-dots"></i></a>
                                                    <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow">
                                                        <li class="dropdown-header text-start">
                                                            <h6>Filter</h6>
                                                        </li>

                                                        <li><a class="dropdown-item" href="#">Today</a></li>
                                                        <li><a class="dropdown-item" href="#">This Month</a></li>
                                                        <li><a class="dropdown-item" href="#">This Year</a></li>
                                                    </ul>
                                                </div>

                                                <div class="card-body">
                                                    <h5 class="card-title">Recent Activity <span>| Today</span></h5>

                                                    <div class="activity">

                                                        <div class="activity-item d-flex">
                                                            <div class="activite-label">32 min</div>
                                                            <i class='bi bi-circle-fill activity-badge text-success align-self-start'></i>
                                                            <div class="activity-content">
                                                                Quia quae rerum <a href="#" class="fw-bold text-dark">explicabo officiis</a> beatae
                                                            </div>
                                                        </div><!-- End activity item-->

                                                        <div class="activity-item d-flex">
                                                            <div class="activite-label">56 min</div>
                                                            <i class='bi bi-circle-fill activity-badge text-danger align-self-start'></i>
                                                            <div class="activity-content">
                                                                Voluptatem blanditiis blanditiis eveniet
                                                            </div>
                                                        </div><!-- End activity item-->

                                                        <div class="activity-item d-flex">
                                                            <div class="activite-label">2 hrs</div>
                                                            <i class='bi bi-circle-fill activity-badge text-primary align-self-start'></i>
                                                            <div class="activity-content">
                                                                Voluptates corrupti molestias voluptatem
                                                            </div>
                                                        </div><!-- End activity item-->

                                                        <div class="activity-item d-flex">
                                                            <div class="activite-label">1 day</div>
                                                            <i class='bi bi-circle-fill activity-badge text-info align-self-start'></i>
                                                            <div class="activity-content">
                                                                Tempore autem saepe <a href="#" class="fw-bold text-dark">occaecati voluptatem</a> tempore
                                                            </div>
                                                        </div><!-- End activity item-->

                                                        <div class="activity-item d-flex">
                                                            <div class="activite-label">2 days</div>
                                                            <i class='bi bi-circle-fill activity-badge text-warning align-self-start'></i>
                                                            <div class="activity-content">
                                                                Est sit eum reiciendis exercitationem
                                                            </div>
                                                        </div><!-- End activity item-->

                                                        <div class="activity-item d-flex">
                                                            <div class="activite-label">4 weeks</div>
                                                            <i class='bi bi-circle-fill activity-badge text-muted align-self-start'></i>
                                                            <div class="activity-content">
                                                                Dicta dolorem harum nulla eius. Ut quidem quidem sit quas
                                                            </div>
                                                        </div><!-- End activity item-->

                                                    </div>

                                                </div>
                                            </div><!-- End Recent Activity -->

                                            <!-- Budget Report -->
                                            <div class="card">
                                                <div class="filter">
                                                    <a class="icon" href="#" data-bs-toggle="dropdown"><i class="bi bi-three-dots"></i></a>
                                                    <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow">
                                                        <li class="dropdown-header text-start">
                                                            <h6>Filter</h6>
                                                        </li>

                                                        <li><a class="dropdown-item" href="#">Today</a></li>
                                                        <li><a class="dropdown-item" href="#">This Month</a></li>
                                                        <li><a class="dropdown-item" href="#">This Year</a></li>
                                                    </ul>
                                                </div>

                                                <div class="card-body pb-0">
                                                    <h5 class="card-title">Budget Report <span>| This Month</span></h5>

                                                    <div id="budgetChart" style="min-height: 400px;" class="echart"></div>

                                                    <script>
                                                        document.addEventListener("DOMContentLoaded", () => {
                                                            var budgetChart = echarts.init(document.querySelector("#budgetChart")).setOption({
                                                                legend: {
                                                                    data: ['Allocated Budget', 'Actual Spending']
                                                                },
                                                                radar: {
                                                                    // shape: 'circle',
                                                                    indicator: [{
                                                                            name: 'Sales',
                                                                            max: 6500
                                                                        },
                                                                        {
                                                                            name: 'Administration',
                                                                            max: 16000
                                                                        },
                                                                        {
                                                                            name: 'Information Technology',
                                                                            max: 30000
                                                                        },
                                                                        {
                                                                            name: 'Customer Support',
                                                                            max: 38000
                                                                        },
                                                                        {
                                                                            name: 'Development',
                                                                            max: 52000
                                                                        },
                                                                        {
                                                                            name: 'Marketing',
                                                                            max: 25000
                                                                        }
                                                                    ]
                                                                },
                                                                series: [{
                                                                        name: 'Budget vs spending',
                                                                        type: 'radar',
                                                                        data: [{
                                                                                value: [4200, 3000, 20000, 35000, 50000, 18000],
                                                                                name: 'Allocated Budget'
                                                                            },
                                                                            {
                                                                                value: [5000, 14000, 28000, 26000, 42000, 21000],
                                                                                name: 'Actual Spending'
                                                                            }
                                                                        ]
                                                                    }]
                                                            });
                                                        });
                                                    </script>

                                                </div>
                                            </div><!-- End Budget Report -->

                                            <!-- Website Traffic -->
                                            <div class="card">
                                                <div class="filter">
                                                    <a class="icon" href="#" data-bs-toggle="dropdown"><i class="bi bi-three-dots"></i></a>
                                                    <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow">
                                                        <li class="dropdown-header text-start">
                                                            <h6>Filter</h6>
                                                        </li>

                                                        <li><a class="dropdown-item" href="#">Today</a></li>
                                                        <li><a class="dropdown-item" href="#">This Month</a></li>
                                                        <li><a class="dropdown-item" href="#">This Year</a></li>
                                                    </ul>
                                                </div>

                                                <div class="card-body pb-0">
                                                    <h5 class="card-title">Website Traffic <span>| Today</span></h5>

                                                    <div id="trafficChart" style="min-height: 400px;" class="echart"></div>

                                                    <script>
                                                        document.addEventListener("DOMContentLoaded", () => {
                                                            echarts.init(document.querySelector("#trafficChart")).setOption({
                                                                tooltip: {
                                                                    trigger: 'item'
                                                                },
                                                                legend: {
                                                                    top: '5%',
                                                                    left: 'center'
                                                                },
                                                                series: [{
                                                                        name: 'Access From',
                                                                        type: 'pie',
                                                                        radius: ['40%', '70%'],
                                                                        avoidLabelOverlap: false,
                                                                        label: {
                                                                            show: false,
                                                                            position: 'center'
                                                                        },
                                                                        emphasis: {
                                                                            label: {
                                                                                show: true,
                                                                                fontSize: '18',
                                                                                fontWeight: 'bold'
                                                                            }
                                                                        },
                                                                        labelLine: {
                                                                            show: false
                                                                        },
                                                                        data: [{
                                                                                value: 1048,
                                                                                name: 'Search Engine'
                                                                            },
                                                                            {
                                                                                value: 735,
                                                                                name: 'Direct'
                                                                            },
                                                                            {
                                                                                value: 580,
                                                                                name: 'Email'
                                                                            },
                                                                            {
                                                                                value: 484,
                                                                                name: 'Union Ads'
                                                                            },
                                                                            {
                                                                                value: 300,
                                                                                name: 'Video Ads'
                                                                            }
                                                                        ]
                                                                    }]
                                                            });
                                                        });
                                                    </script>

                                                </div>
                                            </div><!-- End Website Traffic -->

                                            <!-- News & Updates Traffic -->
                                            <div class="card">
                                                <div class="filter">
                                                    <a class="icon" href="#" data-bs-toggle="dropdown"><i class="bi bi-three-dots"></i></a>
                                                    <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow">
                                                        <li class="dropdown-header text-start">
                                                            <h6>Filter</h6>
                                                        </li>

                                                        <li><a class="dropdown-item" href="#">Today</a></li>
                                                        <li><a class="dropdown-item" href="#">This Month</a></li>
                                                        <li><a class="dropdown-item" href="#">This Year</a></li>
                                                    </ul>
                                                </div>

                                                <div class="card-body pb-0">
                                                    <h5 class="card-title">News &amp; Updates <span>| Today</span></h5>

                                                    <div class="news">
                                                        <div class="post-item clearfix">
                                                            <img src="assets/img/news-1.jpg" alt="">
                                                            <h4><a href="#">Nihil blanditiis at in nihil autem</a></h4>
                                                            <p>Sit recusandae non aspernatur laboriosam. Quia enim eligendi sed ut harum...</p>
                                                        </div>

                                                        <div class="post-item clearfix">
                                                            <img src="assets/img/news-2.jpg" alt="">
                                                            <h4><a href="#">Quidem autem et impedit</a></h4>
                                                            <p>Illo nemo neque maiores vitae officiis cum eum turos elan dries werona nande...</p>
                                                        </div>

                                                        <div class="post-item clearfix">
                                                            <img src="assets/img/news-3.jpg" alt="">
                                                            <h4><a href="#">Id quia et et ut maxime similique occaecati ut</a></h4>
                                                            <p>Fugiat voluptas vero eaque accusantium eos. Consequuntur sed ipsam et totam...</p>
                                                        </div>

                                                        <div class="post-item clearfix">
                                                            <img src="assets/img/news-4.jpg" alt="">
                                                            <h4><a href="#">Laborum corporis quo dara net para</a></h4>
                                                            <p>Qui enim quia optio. Eligendi aut asperiores enim repellendusvel rerum cuder...</p>
                                                        </div>

                                                        <div class="post-item clearfix">
                                                            <img src="assets/img/news-5.jpg" alt="">
                                                            <h4><a href="#">Et dolores corrupti quae illo quod dolor</a></h4>
                                                            <p>Odit ut eveniet modi reiciendis. Atque cupiditate libero beatae dignissimos eius...</p>
                                                        </div>

                                                    </div><!-- End sidebar recent posts-->

                                                </div>
                                            </div><!-- End News & Updates -->

                                        </div><!-- End Right side columns -->

                                    </div>
                                </section>




                        </div>
                    </div>

                    <!--inner block end here-->
                </div>
            </div>
            <!--slider menu-->
            <%@include file="adminsidebar.jsp"%>
            <div class="clearfix"> </div>
        </div>

        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!--//scrolling js-->
        <script src="js/bootstrap.js"></script>
        <script>
                                                        function sortTable(n) {
                                                            var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
                                                            table = document.getElementById("myTable");
                                                            switching = true;
                                                            // Set the sorting direction to ascending:
                                                            dir = "asc";
                                                            /* Make a loop that will continue until
                                                             no switching has been done: */
                                                            while (switching) {
                                                                // Start by saying: no switching is done:
                                                                switching = false;
                                                                rows = table.rows;
                                                                /* Loop through all table rows (except the
                                                                 first, which contains table headers): */
                                                                for (i = 1; i < (rows.length - 1); i++) {
                                                                    // Start by saying there should be no switching:
                                                                    shouldSwitch = false;
                                                                    /* Get the two elements you want to compare,
                                                                     one from current row and one from the next: */
                                                                    x = rows[i].getElementsByTagName("TD")[n];
                                                                    y = rows[i + 1].getElementsByTagName("TD")[n];
                                                                    /* Check if the two rows should switch place,
                                                                     based on the direction, asc or desc: */
                                                                    if (dir == "asc") {
                                                                        if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
                                                                            // If so, mark as a switch and break the loop:
                                                                            shouldSwitch = true;
                                                                            break;
                                                                        }
                                                                    } else if (dir == "desc") {
                                                                        if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
                                                                            // If so, mark as a switch and break the loop:
                                                                            shouldSwitch = true;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                if (shouldSwitch) {
                                                                    /* If a switch has been marked, make the switch
                                                                     and mark that a switch has been done: */
                                                                    rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
                                                                    switching = true;
                                                                    // Each time a switch is done, increase this count by 1:
                                                                    switchcount++;
                                                                } else {
                                                                    /* If no switching has been done AND the direction is "asc",
                                                                     set the direction to "desc" and run the while loop again. */
                                                                    if (switchcount == 0 && dir == "asc") {
                                                                        dir = "desc";
                                                                        switching = true;
                                                                    }
                                                                }
                                                            }
                                                        }
        </script>

        <!-- mother grid end here-->
    </body>
</html>