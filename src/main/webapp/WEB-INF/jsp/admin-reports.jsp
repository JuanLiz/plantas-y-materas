<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Reportes - Plantas y Materas</title>
    
        <!--Vendor files-->
        <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700&family=Playfair+Display:wght@700;800&display=swap">
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.11.3/css/dataTables.bootstrap5.min.css">

        <!--Main CSS file-->
        <link href="css/main.css" rel="stylesheet">
    
</head>
<body>  
  
  <div class="d-flex">

    <!--Sidebar-->
    <div class="sidebar p-3 bg-light fw-bold" style="width: 280px;">
      <ul class="nav mb-auto">
        <a href="/" class=" px-3 py-2 me-auto  text-decoration-none">
          <img src="img/logo.svg" width="160" alt="">
        </a>
        <hr>
        <li class="nav-item">
          <a href="admin-home" class="nav-link" aria-current="page">
            <i class="me-2 uil uil-estate"></i> 
            <span>Inicio</span> 
          </a>
        </li>
        <li>
          <a href="admin-users" class="nav-link">
            <i class="me-2 uil uil-user-square"></i>
            <span>Usuarios</span> 
          </a>
        </li>
        <li>
          <a href="admin-clients" class="nav-link">
            <i class="me-2 uil uil-smile-beam"></i>
            <span>Clientes</span>
          </a>
        </li>
        <li>
          <a href="admin-providers" class="nav-link">
            <i class="me-2 uil uil-truck"></i>
            <span>Proveedores</span>
          </a>
        </li>
        <li>
          <a href="admin-products" class="nav-link ">
            <i class="me-2 uil uil-box"></i>
            <span>Productos</span>
          </a>
        </li>
        <li>
          <a href="admin-sales" class="nav-link ">
            <i class="me-2 uil uil-shop"></i>
            <span>Ventas</span>
          </a>
        </li>
        <li>
          <a href="admin-reports" class="nav-link active">
            <i class="me-2 uil uil-chart"></i>
            Reportes 
          </a>
        </li>
      </ul>
    </div><!--End Sidebar-->

    <div class="w-100">

      <!--Navbar-->
      <nav class="navbar sticky-top navbar-expand-lg navbar-light bg-light fw-bold p-3">
        <div class="container-fluid">
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <!--Logo for small devices-->
          <a href="/" class="little p-1 me-auto ms-2 text-decoration-none">
            <img src="img/logo.svg" width="120" alt="">
          </a>
          
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            
            <!--Menu for small devices-->
            <ul class="little d-block nav mb-auto">
              <hr>
              <li class="nav-item">
                <a href="admin-home" class="nav-link" aria-current="page">
                  <i class="me-2 uil uil-estate"></i> 
                  <span>Inicio</span> 
                </a>
              </li>
              <li>
                <a href="admin-users" class="nav-link">
                  <i class="me-2 uil uil-user-square"></i>
                  <span>Usuarios</span> 
                </a>
              </li>
              <li>
                <a href="admin-clients" class="nav-link">
                  <i class="me-2 uil uil-smile-beam"></i>
                  <span>Clientes</span>
                </a>
              </li>
              <li>
                <a href="admin-providers" class="nav-link">
                  <i class="me-2 uil uil-truck"></i>
                  <span>Proveedores</span>
                </a>
              </li>
              <li>
                <a href="admin-products" class="nav-link ">
                  <i class="me-2 uil uil-box"></i>
                  <span>Productos</span>
                </a>
              </li>
              <li>
                <a href="admin-sales" class="nav-link ">
                  <i class="me-2 uil uil-shop"></i>
                  <span>Ventas</span>
                </a>
              </li>
              <li>
                <a href="admin-reports" class="nav-link active">
                  <i class="me-2 uil uil-chart"></i>
                  Reportes 
                </a>
              </li>
            </ul>
          
          </div>
          <ul class="navbar-nav ms-auto mt-1">
            <li class="nav-item">
                <img src="img/user.jpg" class="rounded-circle mx-2" width="35">
                Admin
            </li>
          </ul>
        </div>
      </nav><!--End Navbar-->

      <!--Main content-->
      <div class="content p-4">
        <section class="mainc">
            
            <!--Welcome-->
            <div class="row pb-5 align-items-center">
              <div class="col-md-8 align-items-center align-middle">
                <h1 class="mb-0">Panel de reportes</h1>
              </div>
              <div class="col-md-4 g-0 my-auto">
                <!--Illustration-->
                <div class=" d-flex me-2 justify-content-end">
                  <img class="big" src="img/undraw_reports.svg" alt="" width="300" >
                </div>
              </div>
            </div>

            <!--Cards-->
            <div class="row pb-3">
              <!--Users-->
              <div class="col-lg-4 col-xl-4 col-xxl-2 pb-3">
                <div class="card h-100 shadow">
                  <div class="card-body">
                    <div class="row align-items-center g-0">
                      <div class="col me-1">
                        <h6 class="fw-normal card-title pcolor">Usuarios</h6>
                        <h2>${count_users}</h2>
                      </div>
                      <div class="col-auto mx-auto">
                        <img src="img/i-users.svg" alt="" width="70">
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <!--Clients-->
              <div class="col-lg-4 col-xxl-2 pb-3">
                <div class="card h-100 shadow">
                  <div class="card-body">
                    <div class="row align-items-center g-0">
                      <div class="col me-1">
                        <h6 class="fw-normal card-title pcolor">Clientes</h6>
                        <h2>${count_clients}</h2>
                      </div>
                      <div class="col-auto mx-auto">
                        <img src="img/i-shopping.svg" alt="" width="70">
                      </div>
                    </div>
                  </div>
                </div>
              </div>                
              <!--Providers-->
              <div class="col-lg-4 col-xxl-2 pb-3">
                <div class="card h-100 shadow">
                  <div class="card-body">
                    <div class="row align-items-center g-0">
                      <div class="col me-1">
                        <h6 class="fw-normal card-title pcolor">Proveedores</h6>
                        <h2>${count_providers}</h2>
                      </div>
                      <div class="col-auto mx-auto">
                        <img src="img/i-boxes.svg" alt="" width="70">
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <!--Products-->
              <div class="col-lg-4 col-xxl-2 pb-3">
                <div class="card h-100 shadow">
                  <div class="card-body">
                    <div class="row align-items-center g-0">
                      <div class="col me-1">
                        <h6 class="fw-normal card-title pcolor">Productos</h6>
                        <h2>${count_products}</h2>
                      </div>
                      <div class="col-auto mx-auto">
                        <img src="img/i-plant.svg" alt="" width="70">
                      </div>
                    </div>
                  </div>
                </div>
              </div>               
              <!--Sales-->
              <div class="col-lg-4 col-xxl-2 pb-3">
                <div class="card h-100 shadow">
                  <div class="card-body">
                    <div class="row align-items-center g-0">
                      <div class="col me-1">
                        <h6 class="fw-normal card-title pcolor">Ventas</h6>
                        <h2>${count_sales}</h2>
                      </div>
                      <div class="col-auto mx-auto">
                        <img src="img/i-sales.svg" alt="" width="70">
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <!--Earnings-->
              <div class="col-lg-4 col-xxl-2 pb-3">
                <div class="card h-100 shadow">
                  <div class="card-body">
                    <div class="row align-items-center g-0">
                      <div class="col me-1">
                        <h6 class="fw-normal card-title pcolor">Ganancias</h6>
                        <h5>$${count_earnings}</h5>
                      </div>
                      <div class="col-auto mx-auto">
                        <img src="img/i-money.svg" alt="" width="70">
                      </div>
                    </div>
                  </div>
                </div>
              </div>                
            </div>      
          
            <!--Chart and Items-->
            <div class="row pb-5">
              <!--Users added last week chart-->
              <div class="col-md-6">
                <div class="card p-2 h-100 shadow">
                  <div class="card-body">
                    <h5 class="card-title pcolor fw-normal">Usuarios inscritos, últimos 7 días</h5>
                    <div class="chart-area">
                      <canvas id="myBarChart"></canvas>
                    </div>
                  </div>
                </div>
              </div>
              <!--Last week sales chart-->
              <div class="col-md-6">
                <div class="card p-2 h-100 shadow">
                  <div class="card-body">
                    <h5 class="card-title pcolor fw-normal">Ventas, últimos 7 días</h5>
                    <div class="chart-area">
                      <canvas id="myAreaChart"></canvas>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <!--Users table-->            
            <div class="p-2 mx-auto">
              <h1 class="py-5">Listado de usuarios</h1>
              <table id="dataTable" class="table table-responsive table-striped"  style="width:100%">
                <thead>
                    <tr>
                        <th>Cédula</th>
                        <th>Nombre</th>
                        <th>E-mail</th>
                        <th>Usuario</th>
                        <th>Contraseña</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${userlist}" var="itemu">
  					<tr>      
			        	<td>${itemu.getIdusers()}</td>  
			        	<td>${itemu.getName()}</td>  
			        	<td>${itemu.getEmail()}</td>  
			        	<td>${itemu.getUser()}</td>  
			        	<td>${itemu.getPassword()}</td>			  
			    	</tr>
				</c:forEach>	
                </tbody>
              </table><!--End Users table-->
            </div>

            <!--Clients table-->            
            <div class="p-2 mx-auto">
              <h1 class="py-5">Listado de clientes</h1>
              <table id="dataTablea" class="table table-responsive table-striped"  style="width:100%">
                <thead>
                    <tr>
                        <th>Cédula</th>
                        <th>Nombre</th>
                        <th>Email</th>                        
                        <th>Dirección</th>
                        <th>Teléfono</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${clientlist}" var="itemc">
  					<tr>      
			        	<td>${itemc.getIdclients()}</td>  
			        	<td>${itemc.getName()}</td>  
			        	<td>${itemc.getEmail()}</td>  
			        	<td>${itemc.getAddress()}</td>  
			        	<td>${itemc.getPhone()}</td>			  
			    	</tr>
				</c:forEach>	
                </tbody>
              </table><!--End Users table-->
            </div>

            <!--Sales per client table-->            
            <div class="p-2 mx-auto">
              <h1 class="py-5">Listado de ventas por cliente</h1>
              <table id="dataTableb" class="table table-responsive table-striped"  style="width:100%">
                <thead>
                    <tr>
                        <th>Cédula</th>
                        <th>Nombre</th>
                        <th>Total en ventas</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${salesclient}" var="items">
  					<tr>      
			        	<td>${items.getIdclients()}</td>  
			        	<td>${items.getName()}</td>  
			        	<td>${items.getTotal()}</td>	  
			    	</tr>
				</c:forEach>
              </table><!--End Users table-->
            </div>

        </section>
      </div><!--End Main content-->

    </div>

  </div>
  
  <!--JS Scripts-->
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
  <script src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js" ></script>
  <script src="https://cdn.datatables.net/1.11.3/js/dataTables.bootstrap5.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.5.1/chart.min.js"></script> 
  <script src="js/data-table.js"></script>     
  <script>
  function number_format(number, decimals, dec_point, thousands_sep) {
    // *     example: number_format(1234.56, 2, ',', ' ');
    // *     return: '1 234,56'
    number = (number + '').replace(',', '').replace(' ', '');
    var n = !isFinite(+number) ? 0 : +number,
      prec = !isFinite(+decimals) ? 0 : Math.abs(decimals),
      sep = (typeof thousands_sep === 'undefined') ? ',' : thousands_sep,
      dec = (typeof dec_point === 'undefined') ? '.' : dec_point,
      s = '',
      toFixedFix = function(n, prec) {
        var k = Math.pow(10, prec);
        return '' + Math.round(n * k) / k;
      };
    // Fix for IE parseFloat(0.55).toFixed(0) = 0;
    s = (prec ? toFixedFix(n, prec) : '' + Math.round(n)).split('.');
    if (s[0].length > 3) {
      s[0] = s[0].replace(/\B(?=(?:\d{3})+(?!\d))/g, sep);
    }
    if ((s[1] || '').length < prec) {
      s[1] = s[1] || '';
      s[1] += new Array(prec - s[1].length + 1).join('0');
    }
    return s.join(dec);
  }

  // Area Chart Example
  var ctx = document.getElementById("myAreaChart");
  var myLineChart = new Chart(ctx, {
    type: 'line',
    data: {
      labels: [<c:forEach items="${dates}" var="date">"${date}", </c:forEach>],
      datasets: [{
        label: "Earnings",
        lineTension: 0.3,
        backgroundColor: "rgba(57, 170, 54, 0.1)",
        borderColor: "rgba(57, 170, 51, 1)",
        pointRadius: 3,
        pointBackgroundColor: "rgba(57, 170, 51, 1)",
        pointBorderColor: "rgba(57, 170, 51, 1)",
        pointHoverRadius: 3,
        pointHoverBackgroundColor: "rgba(57, 170, 51, 1)",
        pointHoverBorderColor: "rgba(57, 170, 51, 1)",
        pointHitRadius: 10,
        pointBorderWidth: 2,
        fill: true,
        data: [<c:forEach items="${sales}" var="sale">${sale}, </c:forEach>, 0],
      }],
    },
    options: {
      maintainAspectRatio: false,
      layout: {
        padding: {
          left: 10,
          right: 25,
          top: 25,
          bottom: 0
        }
      },
      scales: {
        xAxes: [{
          time: {
            unit: 'date'
          },
          gridLines: {
            display: false,
            drawBorder: false
          },
          ticks: {
            maxTicksLimit: 7
          }
        }],
        yAxes: [{
          ticks: {
            maxTicksLimit: 5,
            padding: 10,
            // Include a dollar sign in the ticks
            callback: function(value, index, values) {
              return '$' + number_format(value);
            }
          },
          gridLines: {
            color: "rgb(234, 236, 244)",
            zeroLineColor: "rgb(234, 236, 244)",
            drawBorder: false,
            borderDash: [2],
            zeroLineBorderDash: [2]
          }
        }],
      },
      legend: {
        display: false
      },
      tooltips: {
        backgroundColor: "rgba(57, 170, 54, 0.2)",
        bodyFontColor: "#858796",
        titleMarginBottom: 10,
        titleFontColor: '#6e707e',
        titleFontSize: 14,
        borderColor: '#dddfeb',
        borderWidth: 1,
        xPadding: 15,
        yPadding: 15,
        displayColors: false,
        intersect: false,
        mode: 'index',
        caretPadding: 10,
        callbacks: {
          label: function(tooltipItem, chart) {
            var datasetLabel = chart.datasets[tooltipItem.datasetIndex].label || '';
            return datasetLabel + ': $' + number_format(tooltipItem.yLabel);
          }
        }
      }
    }
  });
  </script>
  <script>
//Bar chart
  new Chart(document.getElementById("myBarChart"), {
      type: 'bar',
      data: {
        labels: [<c:forEach items="${dates}" var="datet">"${datet}", </c:forEach>],
        datasets: [
          {
            label: "Usuarios inscritos",
            borderColor: "#39aa36",
            borderWidth: 2,
            backgroundColor: "rgba(57, 170, 54, 0.2)",
            data: [<c:forEach items="${lastusers}" var="usr">${usr}, </c:forEach>, 0]
          }
        ]
      },
      options: {
    	maintainAspectRatio: false,
        legend: { display: false },
        title: {
          display: true,
          text: 'Usuarios inscritos, últimos 7 días'
        }
      }
  });
  </script>


</body>
</html>