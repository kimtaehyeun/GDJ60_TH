<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary"
		data-bs-theme="dark">
		<div class="container-fluid">
			<a href="/" class="navbar-brand"><img
				src="/resources/images/logo.png" alt=""></a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav">
					<c:if test="${empty detail.noticeNum}">
						<li class="nav-item"><a class="nav-link"
							href="/s2">홈</a></li>
							<li class="nav-item"><a class="nav-link"
							href="/s2/board/add">추가</a></li>
						
					</c:if>
					<c:if test="${not empty detail.noticeNum}">
						<li class="nav-item"><a class="nav-link"
							href="/s2/board/list">리스트</a></li>
							<li class="nav-item"><a class="nav-link"
							href="/s2/board/update?noticeNum=${detail.noticeNum}">수정</a></li>
							<li class="nav-item"><a class="nav-link"
							href="/s2/board/delete?noticeNum=${detail.noticeNum}">삭제</a></li>
					</c:if>
					
				</ul>
			</div>
		</div>
	</nav>
