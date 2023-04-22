<html>
<head>
    <%@include file="./base.jsp" %>
    <title>Кредитные договора</title>
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
                <th scope="col">Срок</th>
                <th scope="col">Дата подписания</th>
                <th scope="col">Статус</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="crt" items="${credit_agreement}">
                <tr>
                    <td>${crt.creditApp.customer.firstName}</td>
                    <td>${crt.creditApp.customer.lastName}</td>
                    <td>${crt.creditApp.sum}</td>
                    <td>${crt.creditApp.period}</td>
                    <td>${crt.dateSigh}</td>
                    <td>${crt.sigh==1 ? 'Подписан' : 'Не подписан'}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <a href="${pageContext.request.contextPath}/main" class="btn btn-warning">На главную</a>
</div>
</body>
</html>
