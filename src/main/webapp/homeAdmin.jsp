<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="pt-br">
	<head>
   		<title>Home-Admin</title>
   	 	<meta charset="utf-8">
   	 	 <meta name="viewport" content="width=device-width, initial-scale=1">
   		
   		 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
   	 	<meta name="viewport" content="width=device-width, initial-scale=1"> 
   	 	<link href="https://fonts.googleapis.com/css?family=Staatliches" rel="stylesheet">
 	   <style>
        	<%@include file="home.css" %>
		</style>  
	</head>
	<body>
	<div class="menu">
		<ul>
			<li><a href="#">Bike UFF</a></li>
			<ul style="float:right;list-style-type:none;">
				<li><a href="#">Perfil</href></a></li>
  				<li><a href="#">Logout
					<img src="images/logout.png" style="width:15px;height:15px;">
				</a></li>
			</ul>
		</ul>
	</div>
	</div>
		<div class="box">
			<a href="/usersList">Usuários</a>
			<a href="/listaEstacoes">Estações</a>
			<a href="/listaBicicletas">Bicicletas</a>	
		</div>
	</body>
</html>
