<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<html>
<head>

</head>
<body>
<h1>danh sach khach hang</h1>
<button><a href="/khach-hang/view-add">add</a></button>
<br>
<br>
<table border="1" width="70%">
    <thead>
    <tr>
        <td>mã</td>
        <td>tên</td>
        <td>ngày sinh</td>
        <td>sđt</td>
        <td>địa chỉ</td>
        <td>password</td>
        <td colspan="2">action</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${item}" var="kh">
        <tr>
            <td>${kh.ma}</td>
            <td>${kh.ten}</td>
            <td>${kh.ngaySinh}</td>
            <td>${kh.sdt}</td>
            <td>${kh.diaChi}</td>
            <td>${kh.password}</td>
            <td><a href="/khach-hang/edit/${kh.ma}"> edit</a></td>
            <td><a href="/khach-hang/delete/${kh.ma}"> delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
