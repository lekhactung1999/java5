<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<html>
<head>

</head>
<body>
<button><a href="/nhan-vien/create">create</a></button>
<table border="1" width="100%">
    <thead>
    <tr>

        <td>mã</td>
        <td>Họ</td>
        <td>Tên đệm</td>
        <td>tên</td>
        <td>giới tính</td>
        <td>ngày sinh</td>
        <td>địa chỉ</td>
        <td>sđt</td>
        <td>mật khẩu</td>
        <td>action</td>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${data}" var="nv">
        <tr>

            <td>${nv.ma}</td>
            <td>${nv.ho}</td>
            <td>${nv.tenDem}</td>
            <td>${nv.ten}</td>
            <td>${nv.gioiTinh}</td>
            <td>${nv.ngaySinh}</td>
            <td>${nv.diaChi}</td>
            <td>${nv.sdt}</td>
            <td>${nv.matKhau}</td>

            <td><a href="/nhan-vien/delete/${nv.ma}"> delete</a></td>
            <td><a href="/nhan-vien/edit/${nv.ma}"> edit</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>

</html>