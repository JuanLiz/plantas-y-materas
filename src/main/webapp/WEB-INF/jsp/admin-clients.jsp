<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Gestión de clientes - Plantas y Materas</title>
    
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
          <a href="admin-clients" class="nav-link active">
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
                <a href="admin-clients" class="nav-link active">
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
                <h1 class="mb-0">Gestión de clientes</h1>
              </div>
              <div class="col-md-4 g-0 my-auto">
                <!--Illustration-->
                <div class=" d-flex me-2 justify-content-end">
                  <img class="big" src="img/undraw_people_tax5.svg" alt="" width="230" >
                </div>
              </div>
            </div>
			<!-- Notifications -->
            <c:if test="${successc}">
				<div class="alert alert-success alert-dismissible d-flex align-items-center fade show" role="alert">
					<i class="uil uil-check-circle lead me-3" style="font-size: 2.2rem;"></i>
					<strong>${clienttype} tuvo éxito</strong>
					<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
				</div>
			</c:if>
            <c:if test="${errorc}">
				<div class="alert alert-danger alert-dismissible d-flex align-items-center fade show" role="alert">
					<i class="uil uil-exclamation-triangle lead me-3" style="font-size: 2.2rem;"></i>
					<strong>Hubo un error en <strong class="text-lowercase">${clienttype}</strong>.</strong> 
					<span class="ms-1">Verifica la información e intenta de nuevo</span>
					<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
				</div>
			</c:if>		
            <!--Buttons-->
            <div class="d-flex justify-content-center pb-5">
              <button class="mx-2 align-items-center  btn btn-outline-primary" data-bs-toggle="modal" data-bs-target="#createModal">
                <span class="d-block me-1">
                  <i class="uil uil-plus-circle fs-3 lead"></i>
                </span>
                <span class="d-block align-middle fw-bold">
                  Agregar cliente
                </span>
              </button>
              <button class="mx-2 align-items-center  btn btn-outline-primary" data-bs-toggle="modal" data-bs-target="#updateModal">
                <span class="d-block me-1">
                  <i class="uil uil-check-circle fs-3 lead"></i>
                </span>
                <span class="d-block align-middle fw-bold">
                  Actualizar cliente
                </span>
              </button>
              <button class="mx-2 align-items-center btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#deleteModal">
                <span class="d-block me-1">
                  <i class="uil uil-times-circle fs-3 lead"></i>
                </span>
                <span class="d-block align-middle fw-bold">
                  Eliminar cliente
                </span>
              </button>
            </div><!--End Buttons-->

            <!-- Modals-->
            <!--Create Modal-->
            <div class="modal fade" id="createModal" tabindex="-1" aria-labelledby="createModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Agregar cliente</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                  </div>
                  <form action="create-clients" method="POST" class="needs-validation" novalidate autocomplete="off" modelAttribute="create_client">                                     
                    <!--Form fields-->
                    <div class="modal-body">
                      <!--ID-->
                      <div class="form-floating mb-3">
                        <input type="number" class="form-control align-middle" id="idclients" name="idclients" placeholder="70041053" required>
                        <label for="floatingId">Cédula de ciudadanía</label>
                        <div id="emailHelp" class="form-text">Este dato no se podrá cambiar mas adelante</div>
                        <div class="invalid-feedback">
                          Proporciona la cédula del cliente
                        </div>
                      </div>
                      <!--Name-->
                      <div class="form-floating mb-3">
                        <input type="text" class="form-control" id="name" name="name" placeholder="John Doe" required>
                        <label for="floatingName">Nombre completo</label>
                        <div class="invalid-feedback">
                          Proporciona el nombre completo
                        </div>
                      </div>
                      <!--Email-->
                      <div class="form-floating mb-3">
                        <input type="email" class="form-control" id="email" name="email" placeholder="name@example.com" required>
                        <label for="floatingEmail">Correo electrónico</label>
                        <div class="invalid-feedback">
                          Proporciona un correo electrónico válido
                        </div>
                      </div>
                      <!--Address-->
                      <div class="form-floating mb-3">
                        <input type="text" class="form-control" id="address" name="address" placeholder="JohnDoe" required>
                        <label for="floatingUser">Dirección</label>
                        <div class="invalid-feedback">
                          Proporciona una dirección válida
                        </div>
                      </div>
                      <!--Phone-->
                      <div class="form-floating mb-3">
                        <input type="text" class="form-control" id="phone" name="phone" placeholder="3002485723" required>
                        <label for="floatingPhone">Número de teléfono</label>
                        <div class="invalid-feedback">
                          Proporciona una número de teléfono válido
                        </div>
                      </div>               
                    </div><!--End Form fields-->
                    <!--Submit buttons-->
                    <div class="modal-footer">
                      <button type="button" class="mx-1 align-items-center btn btn-outline-secondary" data-bs-dismiss="modal">
                        <span class="d-block me-2">
                          <i class="uil uil-times fs-4"></i>
                        </span>
                        <span class="d-block align-middle fw-bold">
                          Cancelar
                        </span>
                      </button>
                      <button type="submit" class="mx-1 align-items-center btn btn-outline-primary">
                        <span class="d-block me-2">
                          <i class="uil uil-check fs-4"></i>
                        </span>
                        <span class="d-block align-middle fw-bold">
                          Aceptar
                        </span>
                      </button>
                    </div>
                  </form>
                </div>
              </div>
            </div><!--End Create Modal-->

            <!--Update Modal-->
            <div class="modal fade" id="updateModal" tabindex="-1" aria-labelledby="updateModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Actualizar cliente</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                  </div>
                  <form action="update-clients" method="POST" class="needs-validation" novalidate autocomplete="off" modelAttribute="update_client">                                     
                    <!--Form fields-->
                    <div class="modal-body">
                      <!--ID-->
                      <div class="form-floating mb-3">
                        <input type="number" class="form-control align-middle" id="idclients" name="idclients" placeholder="70041053" required>
                        <label for="floatingId">Cédula de ciudadanía</label>
                        <div class="invalid-feedback">
                          Proporciona la cédula del cliente
                        </div>
                      </div>
                      <!--Name-->
                      <div class="form-floating mb-3">
                        <input type="text" class="form-control" id="name" name="name" placeholder="John Doe" required>
                        <label for="floatingName">Nombre completo</label>
                        <div class="invalid-feedback">
                          Proporciona el nombre completo
                        </div>
                      </div>
                      <!--Email-->
                      <div class="form-floating mb-3">
                        <input type="email" class="form-control" id="email" name="email" placeholder="name@example.com" required>
                        <label for="floatingEmail">Correo electrónico</label>
                        <div class="invalid-feedback">
                          Proporciona un correo electrónico válido
                        </div>
                      </div>
                      <!--Address-->
                      <div class="form-floating mb-3">
                        <input type="text" class="form-control" id="address" name="address" placeholder="JohnDoe" required>
                        <label for="floatingUser">Dirección</label>
                        <div class="invalid-feedback">
                          Proporciona una dirección válida
                        </div>
                      </div>
                      <!--Phone-->
                      <div class="form-floating mb-3">
                        <input type="text" class="form-control" id="phone" name="phone" placeholder="3002485723" required>
                        <label for="floatingPhone">Número de teléfono</label>
                        <div class="invalid-feedback">
                          Proporciona una número de teléfono válido
                        </div>
                      </div>               
                  </div><!--End Form fields-->
                    <!--Submit buttons-->
                    <div class="modal-footer">
                      <button type="button" class="mx-1 align-items-center btn btn-outline-secondary" data-bs-dismiss="modal">
                        <span class="d-block me-2">
                          <i class="uil uil-times fs-4"></i>
                        </span>
                        <span class="d-block align-middle fw-bold">
                          Cancelar
                        </span>
                      </button>
                      <button type="submit" class="mx-1 align-items-center btn btn-outline-primary">
                        <span class="d-block me-2">
                          <i class="uil uil-check fs-4"></i>
                        </span>
                        <span class="d-block align-middle fw-bold">
                          Aceptar
                        </span>
                      </button>
                    </div>
                  </form>
                </div>
              </div>
            </div><!--End Update Modal-->
            
            <!--Delete Modal-->
            <div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="deleteModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Eliminar cliente</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                  </div>
                  <form action="delete-clients" method="POST" class="needs-validation" novalidate autocomplete="off" modelAttribute="delete_client">                                     
                    <!--Form fields-->
                    <div class="modal-body">
                      <!--ID-->
                      <div class="form-floating mb-3">
                        <input type="number" class="form-control align-middle" id="id" name="id" placeholder="70041053" required>
                        <label for="floatingId">Cédula de ciudadanía</label>
                        <div class="invalid-feedback">
                          Proporciona la cédula del cliente
                        </div>
                      </div>
                      <p class="text-danger m-1">Esta acción no se puede deshacer. Procede con cuidado</p>              
                  </div><!--End Form fields-->
                    <!--Submit buttons-->
                    <div class="modal-footer">
                      <button type="button" class="mx-1 align-items-center btn btn-outline-secondary" data-bs-dismiss="modal">
                        <span class="d-block me-2">
                          <i class="uil uil-times fs-4"></i>
                        </span>
                        <span class="d-block align-middle fw-bold">
                          Cancelar
                        </span>
                      </button>
                      <button type="submit" class="mx-1 align-items-center btn btn-outline-danger">
                        <span class="d-block me-2">
                          <i class="uil uil-check fs-4"></i>
                        </span>
                        <span class="d-block align-middle fw-bold">
                          Aceptar
                        </span>
                      </button>
                    </div>
                  </form>
                </div>
              </div>
            </div><!--End Delete Modal-->            
            <!--End modals-->

            <!--Users table-->            
            <div class="p-2 mx-auto">
              <table id="dataTable" class="table table-responsive table-striped"  style="width:100%">
                <thead>
                    <tr>
                        <th>Cédula</th>
                        <th>Nombre</th>
                        <th>E-mail</th>
                        <th>Dirección</th>
                        <th>Teléfono</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="item">
  					<tr>      
			        	<td>${item.getIdclients()}</td>  
			        	<td>${item.getName()}</td>  
			        	<td>${item.getEmail()}</td>  
			        	<td>${item.getAddress()}</td>  
			        	<td>${item.getPhone()}</td>			  
			    	</tr>
				</c:forEach>	
                </tbody>
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
  <script src="js/data-table.js"></script>
  <script src="js/validation.js"></script>
     
</body>
</html>