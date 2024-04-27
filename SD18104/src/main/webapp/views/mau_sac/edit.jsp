<%@page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<header>
    <title>màu</title>
</header>
<style>

    form{

        width: auto;

    }
</style>
<body>
<sf:form method="post" action="/mau-sac/update/${m.ma}" modelAttribute="m">
    <p>mã:<sf:input path="ma" type="text" name="ma"/></p>
    <p>Tên:<sf:input path="ten" type="text" name="ten"/></p>
    <button style="color: red">update</button>

</sf:form>

</body>

</html>