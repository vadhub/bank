<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
        <strong>${credit_app.customer.address}
        </strong>, паспортные данные -
        серия: <strong>${credit_app.customer.seria}
        </strong>, номер: <strong>${credit_app.customer.number}
        </strong>, заключаю кредитный договор на сумму
        <strong>${credit_app.sum}</strong>.
        Кредит дается на срок: <strong>${credit_app.period}</strong> д.
    </p>
    <div class="row">
        <div class="col">
            ${creadit_agrmt.sign==1 ? 'Подписан' : 'Не подписан'}
        </div>

        <div class="col">
            Дата: ${creadit_agrmt.dateSign!=null ? creadit_agrmt.dateSign : ''}
        </div>

    </div>

    <form:form action="${pageContext.request.contextPath}/save_credit_agreement/${creadit_agrmt.idAgrmt}" method="POST">
        <button id="sign_btn" type="submit" class="btn btn-primary">Подписать</button>
    </form:form>

<%-- disable button if credit agreement already signed --%>
    <script type="text/javascript">
        const sign = ${creadit_agrmt.sign==1}
        if (sign) document.getElementById("sign_btn").disabled = true;
    </script>

    <a href="${pageContext.request.contextPath}/main" class="btn btn-warning">На главную</a>
</div>
</body>
</html>
