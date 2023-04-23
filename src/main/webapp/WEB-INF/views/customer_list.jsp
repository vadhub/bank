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
            Search customer: <input type="text" name="param" />
            <input type="submit" value="Search" class="btn btn-warning" />
        </form:form>
        <table class="table table-hover">
            <thead>
            <tr>
                <th scope="col">First Name</th>
                <th scope="col">Last Name</th>
                <th scope="col">Patronymic</th>
                <th scope="col">Address</th>
                <th scope="col">Seria</th>
                <th scope="col">Number</th>
                <th scope="col">Family Status</th>
                <th scope="col">Phone Number</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="ctm" items="${customer}">
                <tr>
                    <td>${ctm.firstName}</td>
                    <td>${ctm.lastName}</td>
                    <td>${ctm.patronymic}</td>
                    <td>${ctm.adress}</td>
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
