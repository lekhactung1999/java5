<%@page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<header>
    <title>chuc vu</title>
</header>
<style>

    form{

        width: auto;

    }
</style>
<body>
<sf:form method="post" action="/cua-hang/update/${ch.ma}" modelAttribute="ch"  >

    <p>mã:<sf:input path="ma" type="text" name="ma"/></p>
    <p>Tên:<sf:input path="ten" type="text" name="ten"/></p>
    <p>địa chỉ :<sf:input path="diaChi" type="text" name="diachi"/></p>
    <p>thành phố:
        <sf:select path="thanhPho" name="thanhPho">
            <sf:option value="ql">quang ninh</sf:option>
            <sf:option value="hn">hà nội</sf:option>
            <sf:option value="hcm">hcm</sf:option>
            <sf:option value="hp">hải phòng</sf:option>
        </sf:select>
    </p>
    <p>quốc gia:
        <sf:select path="quocGia" name="quocGia">
            <sf:option value="vn">viet nam</sf:option>
            <sf:option value="tl">thai lan</sf:option>
            <sf:option value="lao">lào</sf:option>

        </sf:select>
    </p>

    <button style="color: red">update</button>

</sf:form>

</body>

</html>