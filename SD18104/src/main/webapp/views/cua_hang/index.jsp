
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<html>
<head>

</head>
<body>
<h1>danh sach cửa hang hang</h1>
<button><a href="/cua-hang/view-add">add</a> </button>
<br>
<br>
<table border="1" width="70%">
    <thead>
    <tr>

        <td>mã</td>
        <td>tên</td>
        <td>địa chỉ</td>
        <td>thành phố</td>
        <td>quốc gia</td>
        <td colspan="2">action</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${item}" var="ch">
        <tr>

            <td>${ch.ma}</td>
            <td>${ch.ten}</td>
            <td>${ch.diaChi}</td>
            <td>${ch.thanhPho}</td>
            <td>${ch.quocGia}</td>
            <td><a href="/cua-hang/edit/${ch.ma}"> edit</a></td>
            <td><a href="/cua-hang/delete/${ch.ma}"> delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
