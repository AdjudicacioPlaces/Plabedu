<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="ca">
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
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- DATATABLE AJAX JS -->
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
<!-- JS externo -->
<script type="text/javascript" src="js/newLogear.js"></script>
<script type="text/javascript" src="js/Adjudicacio.js"></script>
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
	<!-- DATATABLE CSS -->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.css">
	<!-- DATATABLE AJAX CSS -->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.min.css" />
<!-- CSS externo -->
<link rel="stylesheet" href="css/style.css">
<!-- Estilos -->
</head>
<body onLoad="buildHtmlTable('#excelDataTable')">
	<!-- Barra Navegación -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<!-- LOGO GOIB -->
			<a class="navbar-brand" href="index.jsp"><img
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
					<h1 class="display-4 text-white mt-5 mb-2">Resultats de les adjudicacions</h1>
				</div>
			</div>
		</div>
	</header>
	<!-- Cabecera -->
	<!-- Contenido -->
	<div class="container pb-5">
		<div class="row justify-content-center">
			<p id="subtitol" class="text-center">A continuació teniu les places que s'han adjudicat a les
				diferents convocatòries del curs actual així com les places que
				s'assignen en el procés extraordinari</p>
			<!-- Selección Fecha -->
			<form class="form" action="resultatsAdjudicacio.do">
				<div class="form-row pb-3">
					<label for="convocatoria" class="col-form-label col-form-label-lg"><strong>Convocatòria</strong></label>
					<select name="convocatoria" id="convocatoria"
						class="form-control form-control-lg">
						<option value="-1">Places del procés de convocatòria
							setmanal de places</option>
						<option value="388">388 - PLACES DEL 7 AL 9 D'ABRIL DE
							2021</option>
						<option value="387">387 - PLACES DEL 19 AL 22 DE MARÇ DE
							2021</option>
						<option value="385">385 - PLACES DEL 12 AL 15 DE MARÇ DE
							2021</option>
						<option value="384">384 - PLACES DEL 5 AL 8 DE MARÇ DE
							2021</option>
						<option value="382">382 - PLACES DEL 26 DE FEBRER AL 02
							DE MARÇ DE 2021</option>
						<option value="381">381 - PLACES DEL 19 AL 22 DE FEBRER</option>
						<option value="380">380 - PLACES DEL 12 AL 15 DE FEBRER
							DE 2021</option>
						<option value="378">378 - PLACES DEL 5 AL 8 DE FEBRER DE
							2021</option>
						<option value="376">376 - PLACES DEL 29 DE GENER DE 2021
							AL 1 DE FEBRER DE 2021</option>
						<option value="374">374 - PLACES DEL 22 AL 25 DE GENER DE
							2021</option>
						<option value="372">372 - PLACES DEL 15 AL 18 DE GENER DE
							2021</option>
						<option value="371">371 - PLACES DE L´11 AL 13 DE GENER
							DE 2021</option>
						<option value="370">370 - PLACES DEL 8 A L'11 DE GENER DE
							2021</option>
						<option value="369">369 - PLACES DEL 04 AL 07 DE GENER DE
							2021</option>
						<option value="368">368 - PLACES DEL 04 AL 09 DE DESEMBRE
							DE 2020</option>
						<option value="367">367 - PLACES DEL 27 DE NOVEMBRE AL 30
							DE NOVEMBRE</option>
						<option value="366">366 - CONVOCATORIA DEL 20 AL 23 DE
							NOVEMBRE DE 2020</option>
						<option value="364">364 - CONVOCATORIA DEL 13 AL 16 DE
							NOVEMBRE DE 2020</option>
						<option value="363">363 - CONVOCATORIA DEL 6 AL 9 DE
							NOVEMBRE DE 2020</option>
						<option value="361">361 - CONVOCATORIA DEL 30 D'OCTUBRE
							AL 2 NOVEMBRE DE 2020</option>
						<option value="360">360 - CONVOCATORIA DEL 23 AL 26
							D'OCTUBRE DE 2020</option>
						<option value="358">358 - PLACES DEL 16 AL 19 D'OCTUBRE
							DE 2020</option>
						<option value="357">357 - PLACES DEL 9 AL 13 D'OCTUBRE DE
							2020</option>
						<option value="355">355 - PLACES DEL 2 D'OCTUBRE AL 5
							D'OCTUBRE</option>
						<option value="354">354 - PLACES DEL 25 DE SETEMBRE AL 28
							DE SETEMBRE</option>
						<option value="352">352 - PLACES DEL 18 DE SETEMBRE AL 21
							DE SETEMBRE</option>
						<option value="351">351 - PLACES DEL 11 DE SETEMBRE AL 14
							DE SETEMBRE</option>
						<option value="350">350 - PLACES DEL 4 DE SETEMBRE AL 7
							DE SETEMBRE</option>
						<option value="386">386 - CONVOCATÒRIA URGENT DEL 15 DE
							MARÇ DE 2021 AL 17 DE MARÇ DE 2021</option>
						<option value="383">383 - CONVOCATÒRIA URGENT DEL 3 DE
							MARÇ DE 2021 AL 4 DE MARÇ DE 2021</option>
						<option value="379">379 - CONVOCATÒRIA URGENT DEL 8 DE
							FEBRER DE 2021 AL 10 DE FEBRER DE 2021</option>
						<option value="377">377 - CONVOCATÒRIA URGENT DE L'1DE
							FEBRER DE 2021 AL 3 DE FEBRER DEL 2021</option>
						<option value="375">375 - CONVOCATÒRIA URGENT DEL 25 AL
							27 DE GENER</option>
						<option value="373">373 - CONVOCATORIA URGENT DEL 18 AL
							19 DE GENER</option>
						<option value="365">365 - CONVOCATORIA URGENT DEL 16 AL
							17 DE NOVEMBRE</option>
						<option value="362">362 - CONVOCATORIA URGENT DEL 02 DE
							NOVEMBRE A 03 DE NOVEMBRE DE 2020</option>
						<option value="359">359 - CONVOCATORIA URGENT DEL 19
							D'OCTUBRE AL 20 D'OCTUBRE</option>
						<option value="356">356 - CONVOCATORIA URGENT 5/10/2020 A
							6/10/2020</option>
						<option value="353">353 - CONVOCATÒRIA URGENT 24/09/2020
						</option>
					</select>
				</div>
				<div class="form-row pb-3">
					<input type="hidden" id="centre" value="">
					<!-- 
				    <label for="nomcentre" class="col-form-label col-form-label-lg"><strong>Centre</strong></label>
				    <input type="text" class="form-control form-control-lg" id="nomcentre" placeholder="Nom del centre"/>
			  		-->
				</div>
				<div class="form-row pb-3">
					<input type="hidden" id="funcio" value="">
					<!-- 
				    <label for="nomfuncio" class="col-form-label col-form-label-lg"><strong>Funció</strong></label>
				    <input type="text" class="form-control form-control-lg" id="nomfuncio" placeholder="Nom de la funció"/>
					-->
				</div>
				<div id="divButton" class="d-flex justify-content-center">
					<button type="button" class="btn btn-primary btn-lg"
						id="veureResultats">Veure</button>
				</div>
			</form>
			<!-- Selección Fecha -->
		</div>
		<div id="textWarning" class="alert alert-warning" role="alert">
			(*)La finalització indicada és orientativa, no vinculant i està
			supeditada a la incorporació del titular. Si el camp apareix en blanc
			suposa que no és possible concretar cap termini</div>
		<div id="divPlacesContainer" class="container align-items-start text-center">
			<!-- Selección plazas -->
			<div id="divPlacesButtons" class="row align-items-start">
				<a id="a_inici"></a>
				<div id="buttonPlaces" class="col">
					<a class="badge badge-primary bg-primary" href="#placesAdjudicades">Places adjudicades</a>
				</div>
				<div id="buttonPlaces" class="col">
					<a class="badge badge-primary bg-primary" href="#placesDisponibles">Places no adjudicades</a>
				</div>
				<div class="col">
					<a class="badge badge-primary bg-primary"
						href="#placesDisponiblesAnullades">Places eliminades</a>
				</div>
			</div>
			<!-- Selección plazas -->
		</div>
		<!-- Resultados -->
		<div id="classResultatsDIS" class="container pb-3">
			<table id="placesAdjudicades"
				class="table table-striped table-hover table-bordered collapse show">
				<thead class="table-primary text-muted">
					<tr>
						<th colspan="9">
							<h2>
								<small><a href="#a_inici" class="badge badge-secondary"
									title="Anar a l'inici"><i class="material-icons">vertical_align_top</i></a></small>
								Relació d'ajudicacions <small>(Total de places: 102)</small>

							</h2>
						</th>
					</tr>
				</thead>
			</table>
	<section class="container text-center">
		<div class="row">
			<div class="col-lg-12">
				<div class="table-responsive">
					<table id="places_adjudicades" class="display">
        <thead>
            <tr>
                <th>Data adjudicació</th>
                <th>Llocs treball</th>
                <th>Convocatòria</th>
                <th>Funcions</th>
                <th>Tipus</th>
				<th>Mitja jornada</th>
                <th>Itinerant</th>
                <th>Data inici</th>
                <th>Data finalització prevista</th>
                <th>Data petició director</th>
                <th>Motiu</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <th>Data adjudicació</th>
                <th>Llocs treball</th>
                <th>Convocatòria</th>
                <th>Funcions</th>
                <th>Tipus</th>
				<th>Mitja jornada</th>
                <th>Itinerant</th>
                <th>Data inici</th>
                <th>Data finalització prevista</th>
                <th>Data petició director</th>
                <th>Motiu</th>
            </tr>
        </tfoot>
    </table>
				</div>
			</div>
		</div>
	</section>
		</div>
		<div class="container pb-3" id="classResultatsDIS">
			<table id="placesDisponibles"
				class="table table-striped table-hover table-bordered">
				<thead class="table-info text-muted">
					<tr>
						<th colspan="9">
							<h2>
								<small><a href="#a_inici" class="badge badge-secondary"
									title="Anar a l'inici"><i class="material-icons">vertical_align_top</i></a></small>
								Relació de places que no han estat adjudicades <small>(Total
									de places: 33)</small>
							</h2>
						</th>
					</tr>
				</thead>
			</table>
			<section class="container text-center">
		<div class="row">
			<div class="col-lg-12">
				<div class="table-responsive">
					<table id="places_no_adjudicades" class="display">
        <thead>
            <tr>
                <th>Data adjudicació</th>
                <th>Llocs treball</th>
                <th>Convocatòria</th>
                <th>Funcions</th>
                <th>Tipus</th>
				<th>Mitja jornada</th>
                <th>Itinerant</th>
                <th>Data inici</th>
                <th>Data finalització prevista</th>
                <th>Data petició director</th>
                <th>Motiu</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <th>Data adjudicació</th>
                <th>Llocs treball</th>
                <th>Convocatòria</th>
                <th>Funcions</th>
                <th>Tipus</th>
				<th>Mitja jornada</th>
                <th>Itinerant</th>
                <th>Data inici</th>
                <th>Data finalització prevista</th>
                <th>Data petició director</th>
                <th>Motiu</th>
            </tr>
        </tfoot>
    </table>
				</div>
			</div>
		</div>
	</section>
		</div>
		<div class="container pb-3" id="classResultatsANU">
			<table id="placesDisponiblesAnullades"
				class="table table-striped table-hover table-bordered">
				<thead class="table-danger text-muted">
					<tr>
						<th colspan="9">
							<h2>
								<small><a href="#a_inici" class="badge badge-secondary"
									title="Anar a l'inici"><i class="material-icons">vertical_align_top</i></a></small>
								Relació de places eliminades per a l'adjudicació <small>(Total
									de places: 3)</small>
							</h2>
						</th>
					</tr>
				</thead>
			</table>
			<section class="container text-center">
		<div class="row">
			<div class="col-lg-12">
				<div class="table-responsive">
					<table id="places_eliminades" class="display">
        <thead>
            <tr>
                <th>Llocs treball</th>
                <th>Funcions</th>
                <th>Perfils</th>
                <th>Tipus</th>
				<th>Mitja jornada</th>
                <th>Itinerant</th>
                <th>Data inici</th>
                <th>Data finalització prevista</th>
                <th>Data petició director</th>
                <th>Motiu</th>
                <th>Data anul·lació</th>
                <th>Motiu anul·lació</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <th>Llocs treball</th>
                <th>Funcions</th>
                <th>Perfils</th>
                <th>Tipus</th>
				<th>Mitja jornada</th>
                <th>Itinerant</th>
                <th>Data inici</th>
                <th>Data finalització prevista</th>
                <th>Data petició director</th>
                <th>Motiu</th>
                <th>Data anul·lació</th>
                <th>Motiu anul·lació</th>
            </tr>
        </tfoot>
    </table>
				</div>
			</div>
		</div>
	</section>
		</div>
		<!-- Resultados -->
	</div>
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