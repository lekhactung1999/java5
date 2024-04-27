<%@page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<header>
    <title>khach hang</title>
</header>
<style>

    form{

        width: auto;

    }
</style>
<body>
<sf:form method="post" action="/khach-hang/update/${kh.ma}" modelAttribute="kh">

    <p>
        <span style="color: red">*</span>
        mã:<sf:input path="ma" type="text" name="ma"/>
        <sf:errors path="ma" cssStyle="color: red" /></p>
    <p> </p>
    <p>Tên:<sf:input path="ten" type="text" name="ten"/></p>
    <p>ngaysinh:<sf:input path="ngaySinh" type="date" name="ngaySinh"/></p>
    <p>SĐt:<sf:input path="sdt" type="number" name="sdt"/></p>
    <p>Địa chỉ:<sf:input path="diaChi" type="text" name="diaChi"/></p>
    <p>pass:<sf:password path="password" name="password"/></p>

    <button style="color: red">update</button>

</sf:form>

</body>

</html>