<html>
<head>
    <%@include file="./base.jsp" %>
    <title>Одобрен кредит</title>
</head>
<body>
<div class="container mt-3">
    <h1>Вам одобрен кредит!</h1>

    <h2>Кредитный договор</h2>
    <p>Я <strong>
        ${credit_app.customer.firstName}
        ${credit_app.customer.lastName}
        ${credit_app.customer.patronymic}
    </strong>, проживающий по адресу
        <strong>${credit_app.customer.adress}
        </strong>, паспортные данные -
        серия: <strong>${credit_app.customer.seria}
        </strong>, номер: <strong>${credit_app.customer.number}
        </strong>, заключаю кредитный договор на сумму
        <strong>${credit_app.sum}</strong>.
        Кредит дается на срок: <strong>${credit_app.period}</strong> дней.
    </p>
</div>
</body>
</html>
