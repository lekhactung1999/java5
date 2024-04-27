<%@page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<header>
    <title>cua hang</title>
</header>
<style>

    form{

        width: auto;

    }
</style>
<body>
<sf:form method="post" action="/cua-hang/add" modelAttribute="ch"  >
    <p>mã:<sf:input path="ma" type="text" name="ma"/>
        <sf:errors path="ma" cssStyle="color: red" />
    </p>
    <p>Tên:<sf:input path="ten" type="text" name="ten"/>
        <sf:errors path="ten" cssStyle="color: red" />
    </p>
    <p>địa chỉ :<sf:input path="diaChi" type="text" name="diachi"/>
        <sf:errors path="diaChi" cssStyle="color: red" />

    </p>
    <p>thành phố:
        <sf:select path="thanhPho" name="thanhPho">
            <sf:option value=""></sf:option>
            <sf:option value="ql">quang ninh</sf:option>
            <sf:option value="hn">hà nội</sf:option>
            <sf:option value="hcm">hcm</sf:option>
            <sf:option value="hp">hải phòng</sf:option>
        </sf:select>
        <sf:errors path="thanhPho" cssStyle="color: red" />

    </p>
    <p>quốc gia:
        <sf:select path="quocGia" name="quocGia">
            <sf:option value=""></sf:option>
            <sf:option value="vn">viet nam</sf:option>
            <sf:option value="tl">thai lan</sf:option>
            <sf:option value="lao">lào</sf:option>

        </sf:select>
        <sf:errors path="quocGia" cssStyle="color: red" />

    </p>

    <button style="color: red">Create</button>

</sf:form>

</body>

</html>