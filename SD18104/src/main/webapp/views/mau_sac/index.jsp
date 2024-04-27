<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<html>
<head>

</head>
<body>
<h1>Danh Sách màu :)))
</h1>
<button><a href="/mau-sac/create" style="width: 30px " >Create</a> </button>
<br>

<table border="1" width="70%">
    <thead>
    <tr>

        <td>mã</td>
        <td>tên</td>
        <td colspan="2" style="text-align: center">action</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${item}" var="m">
        <tr>

            <td>${m.ma}</td>
            <td>${m.ten}</td>
            <td><a href="/mau-sac/edit/${m.ma}"> edit</a></td>
            <td><a href="/mau-sac/delete/${m.ma}"> delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>