<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원 정보 수정<h2>
<form action="updateMember" method="post">
아이디 :<input type="text" name="id" value=${vo.id} readonly><br>
비밀번호 :<input type="password" name="password" value="${vo.password}"> <br>
이름 :<input type=text name="name" value=${vo.name}><br>
<input type="submit" value="정보수정">



<h2>비밀번호만 변경<h2>
<form action="updateMember" method="post">
아이디 :<input type="hidden" name="id" value=${vo.id} readonly><br>
비밀번호 :<input type="password" name="password" value="${vo.password}"> <br>
<input type="submit" value="정보수정">
</form>

</body>
</html>