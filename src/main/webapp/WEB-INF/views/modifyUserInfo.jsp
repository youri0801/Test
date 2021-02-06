<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저 정보 수정</title>
</head>
<body>
<form action="updateUserInfo">
아이디 : ${dto.id} <br>
<input type="hidden" name="id" value="${dto.id}">
비밀번호 : <input type="password" name="password" value="${dto.password}"> <br>
이름 : <input type="text" name="name" value="${dto.name}"> <br>
주소 : <input type="text" name="address" value="${dto.address}"> <br>
나이 : <input type="number" name="age" value="${dto.age}"> <br>
성별 : <input type="radio" name="gender" value=1 <c:if test="${dto.gender eq '1'}">checked</c:if>>남
<input type="radio" name="gender" value=2 <c:if test="${dto.gender eq '2'}">checked</c:if>>여<br><br>
<input type="submit" value="회원 정보 수정">

</form>

</body>
</html>