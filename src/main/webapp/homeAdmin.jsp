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
 	   <style>
        	<%@include file="home.css" %>
		</style>  
	</head>
	<body>
	<jsp:include page="navbar.jsp" />
	</div>
		<div class="box">
			<a href="/usersList">Usuários</a>
			<a href="/listaEstacoes">Estações</a>
			<a href="/listaBicicletas">Bicicletas</a>	
		</div>
	</body>
</html>
