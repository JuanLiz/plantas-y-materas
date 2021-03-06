<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Iniciar sesión</title>

    <!--Vendor files-->
    <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css"> 
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700&family=Playfair+Display:wght@700;800&display=swap" rel="stylesheet">

    <!--Main CSS file-->
    <link href="css/main.css" rel="stylesheet">
</head>
<body>

    <!--Background-->
    <div class="background container-fluid">
        <div class="bg-img"></div>
    </div>
    
    <!--Main content-->
    <div class="nomargin row align-items-center vw-100 vh-100" >
        <div class="col-12">
            <div class="container login h-100">
                <div class="row align-items-center">
                    <div class="col-12 pt-5 pb-4">
                        <img class="px-5" src="img/logo-l.png" alt="">
                    </div>             
                    <!--Left login section-->
                    <div class=" col-xl-6 col-md-6 col-sm-12 vh-5 px-4 ">
                        <div class="container justify-content-center pb-5">       
                            <!--Login card-->
                            <div class="noborder card">
                                <div class="card-body h-100" style="margin-bottom: 15%;"> 
                                    <h1 class="card-title pcolor">Iniciar sesión</h1>                                     	                                   
                                    <form action="login" method="POST" class="needs-validation" novalidate="" autocomplete="off" modelAttribute="credentials">
                                        <div class="mt-5">  
            								<c:if test="${error}">
												<div class="alert alert-danger d-flex align-items-center fade show" role="alert">
													<i class="uil uil-exclamation-triangle lead me-3" style="font-size: 2.2rem;"></i>
													<strong>Los datos ingresados son incorrectos. Intenta de nuevo</strong>
												</div>
											</c:if>                                       	 
                                            <label class="mb-2 input-label" for="username">Nombre de usuario</label>
                                            <input id="user" type="text" class="form-control " name="user" value="" required="" autofocus="">
                                            <div class="invalid-feedback">
                                                Ingresa un usuario
                                            </div>
                                        </div>

                                        <div class="mt-4">
                                            <div class="mb-2 w-100">
                                                <label class="input-label" for="password">Contraseña</label>
                                            </div>
                                            <input id="password" type="password" class="form-control" name="password" required="">
                                            <div class="invalid-feedback">
                                                Ingresa una contraseña
                                            </div>
                                        </div>

                                        <div class="d-flex align-items-center mt-5">

                                            <button type="submit" class="pcolorb btn-l btn btn-primary w-100 ms-auto">
                                                <strong>Ingresar</strong>
                                                </button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--Right login section-->
                    <div class="col-md-6">
                        <!--Carrousel-->
                        <div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
                            <div class="carousel-inner">
                                <div class="carousel-item active" data-bs-interval="3000">
                                    <img src="img/i-add.svg " class="d-block mx-auto" width="40%">
                                </div>
                                <div class="carousel-item" data-bs-interval="3000">
                                    <img src="img/i-plant.svg" class="d-block mx-auto" width="40%">
                                </div>
                                <div class="carousel-item" data-bs-interval="3000">
                                    <img src="img/i-inventory.svg" class="d-block mx-auto" width="40%">
                                </div>
                                <div class="carousel-item" data-bs-interval="3000">
                                    <img src="img/i-todo.svg" class="d-block mx-auto" width="40%">
                                </div>
                            </div>
                        </div>
                        <div class="p-5">
                            <h6 class="text-center">
                                Ingresa para acceder a la administración de usuarios, proveedores y productos
                            </h6>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <!--JS Scripts-->
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="js/validation.js"></script>

</body>
</html>