<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<c:import url="../template/common_css.jsp"></c:import>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<form action="./update" method="POST">
		<div class="container-fluid">
			<input type="hidden" name="noticeNum" value="${dto.noticeNum}">
			<div class="my-5 mx-auto">
				<label>타이틀</label><input type="text" name="noticeTitle"
					value="${dto.noticeTitle}"> <label>작성자</label><input
					type="text" name="noticeWriter" value="${dto.noticeWriter}">
				<textarea rows="2" cols="10" name="noticeContents">${dto.noticeContents}</textarea>
			</div>
			<div class="mb-3 my-5">
				<label for="files" class="form-label">이미지</label> <label for="files"
					class="form-label"></label> <input class="form-control" type="file"
					id="files" name="pic">
			</div>
			<button type="submit">수정</button>

		</div>
	</form>
</body>
</html>