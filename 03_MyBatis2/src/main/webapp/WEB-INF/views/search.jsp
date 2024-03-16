<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원검색 </h1>
<form action="find">
<select id="select">
<option value="all">전체</option>
<option value="id">아이디</option>
<option value="name">이름</option>

</select>
<input type="text" name="keyword">
<input type="submit" value="조회">
</form>

<h2>foreach 동적쿼리 테스트</h2>
<form action="find2">
<input type="checkbox" name="checkId" value="cake1">cake1
<input type="checkbox" name="checkId" value="user1">user1
<input type="checkbox" name="checkId" value="test1">test1
<input type="submit" value="조회">

</form>
</body>
</html>