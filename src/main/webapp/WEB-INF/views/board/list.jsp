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
	<div class="row col-md-7 mx-auto">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>글번호</th>
					<th>글제목</th>
					<th>작성자</th>
					<th>작성날짜</th>
					<th>조회수</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="dto">
					<tr>
						<td><a href="./detail?noticeNum=${dto.noticeNum}">${pageScope.dto.noticeNum}</a></td>
						<td>${dto.noticeTitle}</td>
						<td>${dto.noticeWriter}</td>
						<td>${dto.noticeRegDate}</td>
						<td>${dto.noticeHit}</td>
					</tr>
				</c:forEach>
			</tbody>


		</table>
	</div>
	<!-- paging -->
	<div>
		<nav aria-label="Page navigation example">
			<ul class="pagination">
				<li class="page-item"><a class="page-link" href="#"
					aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
				</a></li>
				<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" step="1"
					var="i">

					<li class="page-item"><a class="page-link"
						href="./list?page=${i}">${i}</a></li>
				</c:forEach>
				<li class="page-item"><a class="page-link" href="#"
					aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</ul>
		</nav>

		<div class="row">
			<form class="row g-3" action="./list" method="get">
				<div class="col-auto">
					<label for="kind" class="visually-hidden">Kind</label> <select
						class="form-select" name="kind" id="kind"
						aria-label="Default select example">
						<option value="title">글제목</option>
						<option value="contents">글내용</option>
						<option value="writer">작가</option>

					</select>
				</div>
				<div class="col-auto">
					<label for="search" class="visually-hidden">search</label> <input
						type="text" class="form-control" id="search" name="search"
						placeholder="검색어를 입력하세요">
				</div>
				<div class="col-auto">
					<button type="submit" class="btn btn-primary mb-3">검색</button>
				</div>
			</form>
		</div>

		<button type="submit">
			<a href="./add">추가</a>
		</button>
		<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>