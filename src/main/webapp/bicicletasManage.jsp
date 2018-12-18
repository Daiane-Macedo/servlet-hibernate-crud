<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>bicicletas</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="/bicicletas" method="post" role="form" data-toggle="validator">
        <input type="hidden" id="id" name="id" value="${bicicleta == null ? "" : bicicleta.getId()}">
        <h2 class="col-xs-offset-3">${bicicleta == null ? "Create bicicleta" : "Edit bicicleta"}</h2>
        <div class="form-horizontal col-xs-7">
            <c:if test="${error != null}">
                <div class="alert alert-danger">
                        ${error}
                </div>
            </c:if>
            <div class="form-group">
                <label for="nome" class="control-label col-xs-3">Código:</label>
                <div class="col-xs-9">
                    <input type="text" name="codigo" id="codigo" class="form-control"
                           value="${bicicleta.getCodigo()}" required="true"/>
                </div>
            </div>
            <div class="form-group">
                <label for="idEstacao" class="control-label col-xs-3">Estação:</label>
                <div class="col-xs-9">
                    <input type="text" name="idEstacao" id="idEstacao" class="form-control" value="${bicicleta.getIdEstacao()}"
                   "        required="true"/>
                </div>
            </div>
            <div class="form-group">
                <label for="ativa" class="control-label col-xs-3">Ativa:</label>
                <div class="col-xs-9">
                    <input type="text" name="ativa" id="ativa" class="form-control" value="${bicicleta.isAtiva()}"
                           required="true"/>
                </div>
            </div>
            <div class="form-group">
                <label for="email" class="control-label col-xs-3">Em Uso:</label>
                <div class="col-xs-9">
                    <input type="text" name="emUso" id="emUso" class="form-control"
                           value="${bicicleta.isEmUso()}"
                           required="true"/>
                </div>
            </div>
           
            <div class="form-group">
                <div class="col-xs-offset-3 col-sm-10">
                    <button type="submit" class="btn btn-default">Submit</button>
                </div>
            </div>
        </div>
    </form>
</div>
</body>
</html>
