<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인정보</h1>
	<ul>
		<li>아이디 : ${vo.id}</li>
		<li>이름 : ${vo.name}</li>
		<li>비밀번호 : ${vo.password}</li>
		<a href="/">첫페이지이동</a>
</body>
</html>