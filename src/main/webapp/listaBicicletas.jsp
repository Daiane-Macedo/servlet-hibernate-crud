<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="pt-br">
<head>
    <title>bicicletas</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<jsp:include page="navbar.jsp" />

<div class="container">

    <div class="panel panel-default">
        <div class="panel-heading" style="height: 73px;">
            <h3 style="float: left;">bicicletas</h3>
            <a class="btn btn-default" href="/bicicletas" style="margin: 16px 0px 0px 17px;">Create bicicleta</a>
        </div>
        <div class="panel-body">
            <table class="table table-condensed" style="border-collapse:collapse;">

                <thead>
                <tr>
                    <th>Código</th>
                    <th>Estação</th>
                    <th>Ativa</th>
                    <th>Em Uso</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="bicicleta" items="${bicicletas}">
                    <tr data-toggle="collapse" data-target="#tablebicicleta${bicicleta.getId()}" class="accordion-toggle">
                        <td>${bicicleta.getCodigo()}</td>
                        <td>${bicicleta.getIdEstacao()}</td>
                        <td>${bicicleta.isAtiva()}</td>
                        <td>${bicicleta.isEmUso()}</td>
                        <td>
                            <a class="btn btn-default" href="/bicicletas?id=${bicicleta.getId()}">Edit</a>
                        </td>
                        <td>
                            <form action="/deleteBicicleta" method="post">
                                <input name="id" type="hidden" value="${bicicleta.getId()}"/>
                                <input name="type" type="hidden" value="bicicleta"/>
                                <button class="btn btn-default" type="submit">Delete</button>
                            </form>
                        </td>
                    </tr>
                 
                </c:forEach>
                </tbody>
            </table>
        </div>

    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>

</body>
</html>
