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
<sf:form method="post" action="/chuc-vu/update/${cv.ma}" modelAttribute="cv" >


    <p>
        mã:<sf:input path="ma" type="text" name="ma"/>
        <sf:errors path="ma" cssStyle="color: red" />
    </p>
    <p>Tên:<sf:input path="ten" type="text" name="ten"/>
        <sf:errors path="ten" cssStyle="color: red" />
    </p>
    <button style="color: red">update</button>

</sf:form>

</body>

</html>