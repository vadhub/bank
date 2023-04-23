<html>
<head>
    <%@include file="./base.jsp" %>
    <title>Main page</title>
</head>
<body>
<div class="container mt-3">
    <h1>Главное меню</h1>
    <a href="${pageContext.request.contextPath}/take_credit" class="btn btn-warning">Оформить кредит</a>
    <a href="${pageContext.request.contextPath}/customer_list" class="btn btn-warning">Список клиентов</a>
    <a href="${pageContext.request.contextPath}/credit_app_list" class="btn btn-warning">Список заявок</a>
    <a href="${pageContext.request.contextPath}/credit_agrmt_list" class="btn btn-warning">Список договоров</a>
</div>
</body>
</html>
