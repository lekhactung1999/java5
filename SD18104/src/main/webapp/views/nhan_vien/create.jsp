<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>

</head>
<body>
<sf:form action="/nhan-vien/store" method="POST" modelAttribute="nv"
>
    <div>
        <label>Mã</label>
        <span style="color: red">*</span>
        <sf:input type="text" name="ma" path="ma" />
        <sf:errors path="ma" cssStyle="color: red" />

    </div>
    <div>
        <label>Họ</label>
        <sf:input path="ho" type="text" name="ho" />
        <sf:errors path="ho" cssStyle="color: red" />
    </div>
    <div>
        <label>Tên đệm</label>
        <sf:input path="tenDem" type="text" name="tenDem" />
        <sf:errors path="tenDem" cssStyle="color: red" />
    </div>
    <div>
        <label>Tên</label>
        <sf:input path="ten" type="text" name="ten" />
        <sf:errors path="ten" cssStyle="color: red" />
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
        <label>mật khẩu</label>
        <sf:input path="matKhau" type="text" name="matKhau" />
    </div>
    <div>
        <button>Submit</button>
    </div>
</sf:form>
</body>

</html>