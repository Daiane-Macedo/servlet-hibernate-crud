<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="pt-br">
<head>
    <title>estacoes</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<jsp:include page="navbar.jsp" />
<div class="container">
    <form action="/estacoes" method="post" role="form" data-toggle="validator">
        <input type="hidden" id="id" name="id" value="${estacao == null ? "" : estacao.getId()}">
        <div class="form-horizontal col-xs-7">
            <c:if test="${error != null}">
                <div class="alert alert-danger">
                        ${error}
                </div>
            </c:if>
            <div class="form-group">
                <label for="codigo" class="control-label col-xs-3">Nome:</label>
                <div class="col-xs-9">
                    <input type="text" name="nome" id="nome" class="form-control"value="${estacao.getNome()}" disabled/>
                </div>
            </div>
             <div class="form-group">
                <label for="capacidade" class="control-label col-xs-3">Capacidade:</label>
                <div class="col-xs-9">
                    <input type="number" name="capacidade" id="capacidade" class="form-control" value="${estacao.getCapacidade()}"
                           required="true" disabled/>
                </div>
            </div>
            <div class="form-group">
                <label for="qtdSlotsDisponiveis" class="control-label col-xs-3">Slots Disponíveis:</label>
                <div class="col-xs-9">
                    <input type="number" name="qtdSlotsDisponiveis" id="qtdSlotsDisponiveis" class="form-control" value="${estacao.getQtdSlotsDisponiveis()}"
                           required="true" disabled/>
                </div>
            </div>  
            <div class="form-group">
                <label for="ativa" class="control-label col-xs-3">Ativa:</label>
                <div class="col-xs-9">
                    <input type="number" name="ativa" id="ativa" class="form-control"
                           value="${estacao.isAtiva()}"
                           required="true" disabled/>
                </div>
            </div>
            <div class="form-group">
                <label for="localizacao" class="control-label col-xs-3">Localização:</label>
                <div class="col-xs-9">
                    <input type="text" name="localizacao" id="localizacao" class="form-control"
                           value="${estacao.getLocalizacao()} disabled"
                            disabled/>
                </div>
            </div>
        </div>
    </form>
</div>
</body>
</html>
