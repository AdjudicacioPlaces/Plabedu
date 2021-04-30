<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Portal dels Interins">
<meta name="author" content="Govern de les Illes Balears.">

<title>Portal del personal de neteja inter�</title>
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
	<!-- Barra Navegaci�n -->
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
			<!-- Items Navegaci�n -->
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
										possesi�</a></li>
								<li><a class="dropdown-item" href="#">Canvi de
										disponibilitat</a></li>
								<li><a class="dropdown-item" href="#">Autoritzacions</a></li>
								<li><a class="dropdown-item" href="#">Ren�ncies i
										ajornaments</a></li>
								<li><a class="dropdown-item" href="#">Comprova la teva
										titulaci�</a></li>
							</ul>
						<li class="nav-item"><a class="nav-link active" href="">Dades
								pr�vies 21/22</a></li>
					</ul>
				</div>
			</div>
			<!-- Items Navegaci�n -->
		</div>
	</nav>
	<!-- Barra Navegaci�n -->
	<!-- Cabecera -->
	<header class="py-5 mb-5">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-12">
					<h1 class="display-4 text-white mt-5 mb-2">Portal del personal
						de neteja inter�</h1>
					<p id="subtitolPortal" class="lead mb-5">
						<em>Benvinguts al portal del personal de neteja inter�</em>
					</p>
				</div>
			</div>
		</div>
	</header>
	<!-- Cabecera -->
	<!-- Contenido -->
	<div class="container">
		<div class="row pb-5">
			<div class="card-deck">
				<!-- Convocat�ries setmanals -->
				<div id="cardContainer" class="card text-center">
					<img id="calendar" src="files/6.png"
						class="rounded" alt="Convocat�ria setmanal de places">
					<div id="cardBody" class="card-body text-center">
						<h4 class="card-title">Convocat�ria setmanal de places</h4>
						<p class="card-text">En aquest apartat podreu comprovar les
							places disponibles a la convocat�ria setmanal</p>
					</div>
					<div class="card-footer">
						<a href="iniciConvocatories.do?tipus=S"
							class="btn btn-primary btn-lg btn-block position-relative"
							role="button">Veure convocat�ries</a>
					</div>
				</div>
				<!-- Convocat�ries places COVID (di�ries) -->
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
					<i class="material-icons text-primary">home</i>&nbsp; Direcci�:
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
			<p class="m-0 text-center text-white">�&nbsp;Govern de les Illes
				Balears</p>
		</div>
	</footer>
	<!-- Footer -->
</body>
</html>