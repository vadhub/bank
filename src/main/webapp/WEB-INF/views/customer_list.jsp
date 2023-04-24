<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <%@include file="./base.jsp" %>
    <title>Список клиентов</title>
</head>
<body>

<div class="container mt-3">

    <h1>Список клиентов</h1>

    <div class="row">
        <form:form action="search" method="GET">
            Поиск клиента: <input type="text" name="param" class="form-control" placeholder="Введите данные клиента"/>
            <input type="submit" value="Поиск" class="btn btn-warning" />
        </form:form>
        <table class="table table-hover">
            <thead>
            <tr>
                <th scope="col">Имя</th>
                <th scope="col">Фамилия</th>
                <th scope="col">Отчество</th>
                <th scope="col">Адрес</th>
                <th scope="col">Серия</th>
                <th scope="col">Номер</th>
                <th scope="col">Семейное положение</th>
                <th scope="col">Контактный телефон</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="ctm" items="${customer}">
                <tr>
                    <td>${ctm.firstName}</td>
                    <td>${ctm.lastName}</td>
                    <td>${ctm.patronymic}</td>
                    <td>${ctm.address}</td>
                    <td>${ctm.seria}</td>
                    <td>${ctm.number}</td>
                    <td>${ctm.familyStatus}</td>
                    <td>${ctm.phoneNumber}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <a href="${pageContext.request.contextPath}/main" class="btn btn-primary">На главную</a>
</div>

</body>
</html>
