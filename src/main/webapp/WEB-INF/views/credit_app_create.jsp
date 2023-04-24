<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <%@include file="./base.jsp" %>
    <title>Оформление заявки</title>
</head>
<body>

<div class="container mt-3">

    <h1>Оформление заявки на кредит</h1>

    <%--@elvariable id="credit" type="com.testtask.bank.entity.CreditApp"--%>
    <form:form action="save_credit" modelAttribute="credit" method="POST">

        <div class="row">
            <div class="col">
                <div class="form-group">
                    <label for="firstName">Имя</label>
                    <input type="text" class="form-control" id="firstName" name="customer.firstName"
                           placeholder="Введите имя" required="required">
                </div>

                <div class="form-group">
                    <label for="lastName">Фамилия</label>
                    <input type="text" class="form-control" id="lastName" name="customer.lastName"
                           placeholder="Введите фамилию" required="required">
                </div>
                <div class="form-group">
                    <label for="patronymic">Отчество</label>
                    <input type="text" class="form-control" id="patronymic" name="customer.patronymic"
                           placeholder="Введите отчество" required="required">
                </div>

                <div class="form-group">
                    <label for="phone_number">Номер телефона</label>
                    <input type="text" class="form-control" id="phone_number" name="customer.phoneNumber" data-mdb-input-mask="+7 (999)-999-99-99"
                           placeholder="Номер телефона" required="required">
                </div>
            </div>
            <div class="col">

                <div class="form-group">
                    <label for="seria">Серия</label>
                    <input type="number" class="form-control" id="seria" name="customer.seria"
                           min="1000" max="9999"
                           placeholder="Введите серию" required="required">
                </div>

                <div class="form-group">
                    <label for="number">Номер</label>
                    <input type="number" class="form-control" id="number" name="customer.number"
                           min="100000" max="999999"
                           placeholder="Введите номер" required="required">
                </div>

                <div class="form-group">
                    <label for="familyStatus">Семейный статус</label>
                    <select class="form-control" id="familyStatus" name="customer.familyStatus">
                        <option>Одинок(а)</option>
                        <option>В гражданском браке</option>
                        <option>Женат(а)</option>
                    </select>
                </div>
            </div>
        </div>

        <div class="col">
            <div class="form-group">
                <label for="address">Адрес</label>
                <textarea class="form-control" id="address" name="customer.address" rows="2"
                          placeholder="Введите адрес" required="required"> </textarea>
            </div>
        </div>

        <div class="row">
            <div class="col">
                <div class="form-group">
                    <label for="period_from">Период работы с</label>
                    <input type="date" class="form-control" id="period_from" name="customer.work.periodFrom" required="required">
                </div>

                <div class="form-group">
                    <label for="position_job">Должность</label>
                    <input type="text" class="form-control" id="position_job"
                           name="customer.work.positionJob" placeholder="Введите должность" required="required">
                </div>

            </div>
            <div class="col">

                <div class="form-group">
                    <label for="period_to">Период работы до</label>
                    <input type="date" class="form-control" id="period_to" name="customer.work.periodTo" required="required">
                </div>

                <div class="form-group">
                    <label for="org_name">Название организации</label>
                    <input type="text" class="form-control" id="org_name" name="customer.work.nameOrg"
                           placeholder="Введите название организации" required="required">
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col">
                <div class="form-group">
                    <label for="sum_credit">Сумма кредита</label>
                    <input type="number" class="form-control" id="sum_credit" name="sum"
                           min="50000" max="100000000"
                           placeholder="Введите сумму кредита" required="required">
                </div>
            </div>
        </div>
        <a href="${pageContext.request.contextPath}/main" class="btn btn-warning">На главную</a>
        <button type="submit" class="btn btn-primary">Оформить</button>
    </form:form>

</div>


</body>
</html>
