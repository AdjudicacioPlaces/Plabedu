<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Portal dels Interins">
<meta name="author" content="Govern de les Illes Balears.">

<title>Resultats de les adjudicacions</title>
<!-- Scripts -->
<!-- Bootstrap JS -->
<script type="text/javascript"
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
	crossorigin="anonymous"></script>
<!-- JQuery -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<!-- Ajax -->
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- JS externo -->
<script type="text/javascript" src="js/newLogear.js"></script>
<!-- Scripts -->
<!-- Estilos -->
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<!-- Iconos -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!-- CSS externo -->
<link rel="stylesheet" href="css/style.css">
<!-- Estilos -->
</head>
<body onLoad="buildHtmlTable('#excelDataTable')">
	<!-- Barra Navegación -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<!-- LOGO GOIB -->
			<a class="navbar-brand" href="index.html"><img
				src="files\logo_caib.es.png" class="logo" /></a>
			<button class="navbar-toggler collapsed" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarCollapse"
				aria-controls="navbarCollapse" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<!-- LOGO GOIB -->
			<!-- Items Navegación -->
			<div class="container-fluid">
				<div class="navbar-collapse collapse justify-content-end"
					id="navbarCollapse">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link active"
							href="inici.do">Inici</a></li>
						<li class="nav-item dropdown  active"><a
							class="nav-link dropdown-toggle active" href="#"
							id="navbarDarkDropdownMenuLink" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Interins
								Disponibles </a>
							<ul class="dropdown-menu dropdown-menu-dark"
								aria-labelledby="navbarDarkDropdownMenuLink">
								<li><a class="dropdown-item" href="#">per Personal de
										Neteja</a></li>
							</ul></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle active" href="#"
							id="navbarDarkDropdownMenuLink" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Utilitats </a>
							<ul class="dropdown-menu dropdown-menu-dark"
								aria-labelledby="navbarDarkDropdownMenuLink">
								<li><a class="dropdown-item" href="#">Pressa de
										possesió</a></li>
								<li><a class="dropdown-item" href="#">Canvi de
										disponibilitat</a></li>
								<li><a class="dropdown-item" href="#">Autoritzacions</a></li>
								<li><a class="dropdown-item" href="#">Renúncies i
										ajornaments</a></li>
								<li><a class="dropdown-item" href="#">Comprova la teva
										titulació</a></li>
							</ul>
						<li class="nav-item"><a class="nav-link active" href="">Dades
								prèvies 21/22</a></li>
					</ul>
				</div>
			</div>
			<!-- Items Navegación -->
		</div>
	</nav>
	<!-- Barra Navegación -->
	<!-- Cabecera -->
	<header class="py-5 mb-5">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-12">
					<h1 id="cabeceraLlistes" class="display-4 text-white mb-2">Convocatòria
						setmanal de places</h1>
				</div>
			</div>
		</div>
	</header>
	<!-- Cabecera -->
	<!-- Contenido -->
	<div id="contentContainer" class="container">
		<div class="card-group text-center">
			<div class="card mb-4 border-info">
				<h4 class="card-header text-center">388 - PLACES DEL 7 AL 9
					D'ABRIL DE 2021</h4>
				<div class="card-body">
					<h4  class="card-title text-info">Resultats publicats</h4><br>
					<p class="card-text d-inline-flex justify-content-center">
						<i class="material-icons text-info">event</i>Data publicació: 07/04/2021
					</p><br>
					<p class="card-text d-inline-flex justify-content-center">
						<i class="material-icons text-success">event_available</i>Data
						començament: 07/04/2021 12:30
					</p><br>
					<p class="card-text d-inline-flex justify-content-center">
						<i class="material-icons text-danger">event_busy</i>Data
						finalització: 09/04/2021 12:00
					</p><br>
					<p class="card-text d-inline-flex justify-content-center"><i class="material-icons text-black ">date_range</i>Data
						resultats: 09/04/2021 12:35
					</p>
				</div>
				<div class="card-footer text-center">
					<a href="iniciResultatsAdjudicacio.do?convocatoria=388"
						class="btn btn-primary btn-block text-center" role="button">Veure
						resultats</a>
				</div>
			</div>
			<div class="card mb-4 border-info">
				<h4 class="card-header text-center">387 - PLACES DEL 19 AL 22
					DE MARÇ DE 2021</h4>
				<div class="card-body">
					<h4 class="card-title text-info";">Resultats publicats</h4><br>
					<p class="card-text d-inline-flex justify-content-center">
						<i class="material-icons text-info">event</i>Data publicació: 07/04/2021
					</p><br>
					<p class="card-text d-inline-flex justify-content-center">
						<i class="material-icons text-success">event_available</i>Data
						començament: 07/04/2021 12:30
					</p><br>
					<p class="card-text d-inline-flex justify-content-center">
						<i class="material-icons text-danger">event_busy</i>Data
						finalització: 09/04/2021 12:00
					</p><br>
					<p class="card-text d-inline-flex justify-content-center"><i class="material-icons text-black ">date_range</i>Data
						resultats: 09/04/2021 12:35
					</p>
				</div>
				<div class="card-footer text-center">
					<a href="iniciResultatsAdjudicacio.do?convocatoria=388"
						class="btn btn-primary btn-block text-center" role="button">Veure
						resultats</a>
				</div>
			</div>
			<div class="card mb-4 border-info">
				<h4 class="card-header text-center">387 - PLACES DEL 19 AL 22
					DE MARÇ DE 2021</h4>
				<div class="card-body">
					<h4 class="card-title text-info";">Resultats publicats</h4><br>
					<p class="card-text d-inline-flex justify-content-center">
						<i class="material-icons text-info">event</i>Data publicació: 07/04/2021
					</p><br>
					<p class="card-text d-inline-flex justify-content-center">
						<i class="material-icons text-success">event_available</i>Data
						començament: 07/04/2021 12:30
					</p><br>
					<p class="card-text d-inline-flex justify-content-center">
						<i class="material-icons text-danger">event_busy</i>Data
						finalització: 09/04/2021 12:00
					</p><br>
					<p class="card-text d-inline-flex justify-content-center"><i class="material-icons text-black ">date_range</i>Data
						resultats: 09/04/2021 12:35
					</p>
				</div>
				<div class="card-footer text-center">
					<a href="iniciResultatsAdjudicacio.do?convocatoria=388"
						class="btn btn-primary btn-block text-center" role="button">Veure
						resultats</a>
				</div>
			</div>
		</div>
	</div>
	<!-- Contenido -->
<!-- Datos de contacto -->
	<section id="contactSection" class="container">
		<div class="row">
			<div class="col-md-8">
				<h3>Govern de las Illes Balears</h3>
			</div>
		</div>
		<div id="addressDiv" class="row d-flex align-items-end">
			<div class="col-md-6">
				<hr>
				<address class="d-flex align-items-start">
					<i class="material-icons text-primary">home</i>&nbsp; Direcció:
					C/Ter, 16 <br>&nbsp;&nbsp;07009 Palma de Mallorca <br>
				</address>
				<address class="d-flex align-items-start">
					<i class="material-icons text-primary">phone</i>&nbsp; 971 177 800
				</address>
			</div>
			<div class="col-md-6">
				<address class="d-flex align-items-start">
					<i class="material-icons text-primary">email</i>&nbsp;
					Example:&nbsp;<a href="mailto:example@caib.es">example@caib.es</a>
				</address>
				<address class="d-flex align-items-start">
					<i class="material-icons text-primary">email</i>&nbsp;
					Example:&nbsp;<a href="mailto:example@caib.es">example@caib.es</a>
				</address>
			</div>
		</div>
	</section>
	<!-- Datos de contacto -->
	<!-- Footer -->
	<footer class="py-5 bg-dark">
		<div class="container">
			<p class="m-0 text-center text-white">©&nbsp;Govern de les Illes
				Balears</p>
		</div>
	</footer>
	<!-- Footer -->
</body>
</html>