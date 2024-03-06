<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous"/>
<title>Insert title here</title>
</head>
<body>
	<!-- localhost:8080/list
		스키마 : sakila
		테이블 : film_text
		데이터들 리스트로 가져와서 여기 페이지에 보여주기!
		
		1.마이바이티스 세팅 : pom.xml,driver.properties
					   root-context.xml, mybatis-config.xml
		2. VO -> Film mapper : film = mapper.xml -> my batis-config.xml
		3. Controller : FimlController - > @GetMapping("/")메서드 추가
		4.fiml-mapper.xml : namespace-filmMapper - >
		                    <select id="showFilm"> <resultMap>
		                    <resultMap> 컬럼명이 다를 때
		                  
		
     -->
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">제목</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="item">
					<tr>
						<td>${item.id}</td>
						<td>${item.title}</td>
						<td>${item.desc}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<nav>
			<ul class="pagination">
				<li class="page-item ${paging.pre ? '' : 'disabled'}">
				<a class="page-link" href="list?page=${paging.startPage-1}">Previous</a>
				</li>
				
				<c:forEach begin="${paging.startPage}" end ="${paging.endPage}" var ="page">			
					<li class="page-item disabled"><a class="page-link ${paging.page == page ? 'active':''}" href="/list?page=${page}">${page}
					</a></li>			
						</c:forEach>	
				<li class="page-item"${paging.next ? '' : 'disabled'}">
				<a class="page-link" href="/list?page=${paging.endPage+1}">Next</a></li>
			</ul>
		</nav>
	</div>
</body>
</html>