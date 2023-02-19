<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>addPage</h1>
	<form action="./add" method="POST"> 
		<label>타이틀</label><input type="text" name="noticeTitle">
		<label>작성자</label><input type="text" name="noticeWriter">
		<textarea rows="3" cols="5" name="noticeContents">내용</textarea>
		<div>
		<label for="files" class="form-label" >이미지</label>
		<input type="file" class="form-control" id="files" name="pic">
		</div>
	<button type="submit">전송</button>
	</form>
	
</body>
</html>