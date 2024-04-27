<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>edit</title>
</head>
<body>
<sf:form action="/nhan-vien/update/${nv.ma}" method="POST" modelAttribute="nv" >
    <div>
        <label>Mã</label>
        <sf:input path="ma" type="text" name="ma" value=""/>

    </div>
    <div>
        <label>Họ</label>
        <sf:input path="ho" type="text" name="ho" value=""/>
    </div>
    <div>
        <label>Tên đệm</label>
        <sf:input path="tenDem" type="text" name="tenDem" />
    </div>
    <div>
        <label>Tên</label>
        <sf:input path="ten" type="text" name="ten" />
    </div>
    <div>
        <label>Giới tính</label>
        <input type="radio" name="gioiTinh" value="1" /> <label>Nam</label>
        <input type="radio" name="gioiTinh" value="0" /> <label>Nữ</label>
    </div>
    <div>
        <label>Ngày sinh</label>
        <sf:input path="ngaySinh" type="date" name="ngaySinh" />
    </div>
    <div>
        <label>Địa Chỉ</label>
        <sf:input path="diaChi" type="text" name="diaChi" />
    </div>
    <div>
        <label>SDT</label>
        <sf:input path="sdt" type="text" name="sdt" />
    </div>
    <div>
        <button>update</button>
    </div>
</sf:form>
</body>
</html>