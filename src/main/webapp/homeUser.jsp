<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
<html>
<head>
	<title>Bike Uff</title>
	<meta charset="utf-8">
   	<meta name="viewport" content="width=device-width, initial-scale=1">
   		
   	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
       integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
   	<meta name="viewport" content="width=device-width, initial-scale=1"> 
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<div class=title>Estações </div>
	<div class=ListaEstacoes>
		 <c:forEach var="estacao" items="${estacoes}">
	    	<tr data-toggle="collapse" data-target="#tableestacao${estacao.getId()}" class="accordion-toggle">
	        	<div class=estacao>
		        	<td><a href="/listaBicicletas?id=${estacao.getId()}">
		        	${estacao.getNome()}</a></td>
		        	<div class= info>
			       		<td>Capacidade: ${estacao.getCapacidade()}</td><br>
			        	<td>Vagas: ${estacao.getQtdSlotsDisponiveis()}</td>
			        </div>
		           	<div class=local><td>${estacao.getLocalizacao()}</td></div>
		        </div><br>
	          
	                        
		      </tr>
	                
	    </c:forEach>
	</div>
    
</body>
</html>