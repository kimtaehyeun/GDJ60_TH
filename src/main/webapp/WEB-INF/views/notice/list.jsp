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

	<table>
		<thead>
			<tr>
				<td>NOTICENUM</td>
				<td>NOTICETITLE</td>
				<td>NOTICECONTENTS</td>
				<td>NOTICEWRITER</td>
				<td>NOTICEREGDATE</td>
				<td>NOTICEHIT</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<c:forEach items="${list}" var="dto">
					<td>${dto.noticeNum}</td>
					<td>${dto.noticeTitle}</td>
					<td>${dto.noticeContents}</td>
					<td>${dto.noticeWriter}</td>
					<td>${dto.noticeRegDate}</td>
					<td>${dto.noticeHit}</td>
				</c:forEach>
			</tr>
		</tbody>

	</table>
</body>
</html>