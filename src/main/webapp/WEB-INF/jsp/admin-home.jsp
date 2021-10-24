<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Panel de administración - Plantas y Materas</title>
    
        <!--Vendor files-->
        <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700&family=Playfair+Display:wght@700;800&display=swap">
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

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
          <a href="admin-home" class="nav-link active" aria-current="page">
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
          <a href="admin-reports" class="nav-link ">
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
                <a href="admin-home" class="nav-link active" aria-current="page">
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
                <a href="admin-reports" class="nav-link ">
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
                <h1 class="mb-0">Bienvenido, Admin!</h1>
              </div>
              <div class="col-md-4 g-0 my-auto">
                <!--Illustration-->
                <div class=" d-flex me-2 justify-content-end">
                  <img class="big" src="img/undraw_moving.svg" alt="" width="300" >
                </div>
              </div>
            </div>

            <!--Cards-->
            <div class="row pb-3">
              <!--Users-->
              <div class="col-md-4 pb-3">
                <div class="card h-100 shadow">
                  <div class="card-body">
                    <div class="row align-items-center g-0">
                      <div class="col me-1">
                        <h6 class="fw-normal card-title pcolor">Usuarios</h6>
                        <h2>${count_users}</h2>
                      </div>
                      <div class="col-auto">
                        <img src="img/i-users.svg" alt="" width="70">
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <!--Providers-->
              <div class="col-md-4 pb-3">
                <div class="card h-100 shadow">
                  <div class="card-body">
                    <div class="row align-items-center g-0">
                      <div class="col me-1">
                        <h6 class="fw-normal card-title pcolor">Proveedores</h6>
                        <h2>${count_providers}</h2>
                      </div>
                      <div class="col-auto">
                        <img src="img/i-boxes.svg" alt="" width="70">
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <!--Products-->
              <div class="col-md-4 pb-3">
                <div class="card h-100 shadow">
                  <div class="card-body">
                    <div class="row align-items-center g-0">
                      <div class="col me-1">
                        <h6 class="fw-normal card-title pcolor">Productos</h6>
                        <h2>${count_products}</h2>
                      </div>
                      <div class="col-auto">
                        <img src="img/i-plant.svg" alt="" width="70">
                      </div>
                    </div>
                  </div>
                </div>
              </div>              
            </div>         
          
            <!--Chart and Items-->
            <div class="row pb-5">
              <!--Chart-->
              <div class="col-md-7">
                <div class="card p-2 h-100 shadow">
                  <div class="card-body">
                    <h5 class="card-title pcolor fw-normal">Ventas de los últimos 7 días</h5>
                    <div class="chart-area">
                      <canvas id="myAreaChart"></canvas>
                    </div>
                  </div>
                </div>
              </div>
              <!--Last items added-->
              <div class="col-md-5">
                <div class="card p-2 h-100 shadow">
                  <div class="card-body">
                    <h5 class="card-title pcolor fw-normal">Últimos productos agregados</h5>
                    <div class="py-3">
                      <table class="table table-responsive table-striped">
                        <tbody>
                        	<c:forEach items="${list}" var="item"> 
                          		<tr class="align-middle">
                            	<th scope="row"><i class="me-1 uil uil-tag-alt" style="font-size: 1.8rem;"></i></th>
                           		<td class="fw-bold">${item.getName()}</td>
                            	<td class="pcolor">$${item.getSellprice()}</td>
                          </tr>
                        	</c:forEach>	                        
                        </tbody>
                      </table>
                    </div>
                  </div>
                </div>
              </div>
            </div>

        </section>
      </div><!--End Main content-->

    </div>

  </div>
  
  <!--JS Scripts-->
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.5.1/chart.min.js"></script>      
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
	      label: "Ventas",
	      lineTension: 0.3,
	      backgroundColor: "rgba(57, 170, 51, 0.05)",
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
	      backgroundColor: "rgb(255,255,255)",
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

</body>
</html>