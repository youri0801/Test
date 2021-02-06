<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!
</h1>

<form action="loginCheck">
id : <input type="text" name="id"><br>
pw : <input type="password" name="password"><br>
<input type="submit" value="로그인">
<!-- 여기서 name은 dto에 적혀 있는 그대로 써놔야 함, db의 컬럼명과 dto의 이름도 동일해야 함-->

</form>

${msg}

</body>
</html>
