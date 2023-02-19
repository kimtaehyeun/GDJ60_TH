<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<c:import url="../template/common_css.jsp"></c:import>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="row col-md-7 mx-auto">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>글번호</th>
					<th>글제목</th>
					<th>작성자</th>
					<th>작성날짜</th>
					<th>조회수</th>
					<th>글내용</th>

				</tr>
			</thead>
			<tbody>

				<tr>
					<td>${detail.noticeNum}</td>
					<td>${detail.noticeTitle}</td>
					<td>${detail.noticeWriter}</td>
					<td>${detail.noticeRegDate}</td>
					<td>${detail.noticeHit}</td>
					<td>${detail.noticeContents}</td>

				</tr>
			</tbody>
		</table>
				<a href="./delete?noticeNum=${detail.noticeNum}">삭제</a>
			<a href="./update?noticeNum=${detail.noticeNum}">삭제</a>
	</div>


	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>