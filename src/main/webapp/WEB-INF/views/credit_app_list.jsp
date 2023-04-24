<html>
<head>
    <%@include file="./base.jsp" %>
    <title>Заявки на кредит</title>
</head>
<body>
<div class="container mt-3">

    <h1>Заявки на кредит</h1>
    <div class="row">

        <table class="table table-hover">
            <thead>
            <tr>
                <th scope="col">Имя</th>
                <th scope="col">Фамилия</th>
                <th scope="col">Сумма</th>
                <th scope="col">Статус</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="crt" items="${credit}">
                <tr>
                    <td>${crt.customer.firstName}</td>
                    <td>${crt.customer.lastName}</td>
                    <td>${crt.sum}</td>
                    <td>${crt.approve==1 ? 'Одобрен' : 'Не одобрен'}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <a href="${pageContext.request.contextPath}/main" class="btn btn-warning">На главную</a>
</div>

</body>
</html>
