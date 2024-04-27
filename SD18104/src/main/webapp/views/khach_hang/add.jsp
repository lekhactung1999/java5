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
<sf:form method="post" action="/khach-hang/add" modelAttribute="kh">

    <p>
        <span style="color: red">*</span>
        mã:<sf:input path="ma" type="text" name="ma"/>
        <sf:errors path="ma" cssStyle="color: red" />
    </p>

    <p>Tên:<sf:input path="ten" type="text" name="ten"/>
        <sf:errors path="ten" cssStyle="color: red" />

    </p>
    <p>
        ngaysinh:<sf:input path="ngaySinh" type="date" name="ngaySinh"/>
        <sf:errors path="ngaySinh" cssStyle="color: red" />
    </p>


    <p>SĐt:<sf:input path="sdt" type="number" name="sdt"/>
        <sf:errors path="sdt" cssStyle="color: red" />
    </p>
    <p>Địa chỉ:<sf:input path="diaChi" type="text" name="diaChi"/>
        <sf:errors path="diaChi" cssStyle="color: red" />
    </p>
    <p>pass:<sf:password path="password" name="password"/>
        <sf:errors path="password" cssStyle="color: red" />
    </p>

    <button style="color: red">Create</button>

</sf:form>

</body>

</html>