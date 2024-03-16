<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>

</head>
<body>
	<h2>Encoding 처리하기..</h2>
	닉네임 :
	<input type="text" name="nick"id="nick">
	<input type="button" value="닉네임 보내기" id="btn">
	<div id="result"></div>


	<!-- 자바스크립트 방식 -->
	<!-- get방식으로 / encoding<--- 닉네임 보내서 : 요청 
		 해당 닉네임 받아서 result에 보여주기
	-->
	<!-- <script>
	
	let xhr;
	function startRequest(){
		const nick = document.querySelector("#nick");
		xhr = new XMLHttpRequest(); 
		xhr.onreadystatechange = callback;
		alert(nick.value);
		xhr open("get","/encoding?nick="+encodeURI(encodeURIComponent(xhr.responseText))nick.value);
		xhr.send(null);
	
	}
	function callback(){
		if (xhr.readyState===4){
			(xhr.readyState===200
			const result = document querySelector("#result");
		result.innerHTML = decodeURI(decodeURIComponet(xhr.responseText));
		}
	
	}
	
</script>	
-->
	<!-- jQuery -->
	<script>

    $('#btn').click(()=>{ 
    	// 비동기 시작 
    	const nick = $("#nick").val();
    	//요청
			type:"get",
			url:"/encoding",
			data:"nick="+ encodeURI(encodeURIComponent(nick)),
			
		// 응답 
		success:function(result){
			$("#result").text(decodeURI(decodeURIComponent(result)));
			},
		});
});

</script>
</body>
</html>