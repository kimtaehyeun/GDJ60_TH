<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./update" method="POST">
<input type="hidden" name="noticeNum"value="${dto.noticeNum}">
		<label>타이틀</label><input type="text" name="noticeTitle"value="${dto.noticeTitle}">
		<label>작가</label><input type="text" name="noticeWriter"value="${dto.noticeWriter}">
		
		
		<textarea rows="3" cols="5" name="noticeContents">${dto.noticeContents}</textarea>
	<button type="submit">전송</button>
	</form>
</body>
</html>