
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body class="constant-values-container">
<button><a href="/san-pham/view-add" class="btn-primary" style="width: 70px">add</a> </button>
<br>
<br>
<table class="table " >
    <thead>
    <tr>
        <td>ma</td>
        <td>ten</td>
        <td colspan="2">ChucNang</td>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${item}" var="sp">
        <tr>

            <td>${sp.ma}</td>
            <td>${sp.ten}</td>
            <td><a href="/san-pham/edit/${sp.ma}" class="btn btn-primary"> edit</a></td>
            <td><a href="/san-pham/delete/${sp.ma}" class="btn btn-primary"> Delete</a></td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
