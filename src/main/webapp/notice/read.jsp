<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html lang="ko">

<head>
<meta charset="UTF-8">
<title>notice/read.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>
	<div id="playlist">
		<div class="title">
			<p class="musictitle">♬&nbsp;&nbsp;${article.title }&nbsp;&nbsp;♬</p>
		</div>
		<hr>
		<div class="list">
			<table style="width: 100%">
				<tr>
					<th>번호</th>
					<td>${article.noticeno }</td>
				</tr>
				<tr>
					<th>제목</th>
					<td>${article.title }</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td>${article.rname }</td>
				</tr>
				<tr>
					<th>등록일</th>
					<td>${article.rdate }</td>
				</tr>

			</table>
		</div>
		<div class="bottom">
			<input type="button" value="목록" onclick="window.location.href='../'">&nbsp;
			<input type="button" value="수정" onclick="window.location.href='./update.do?noticeno=${article.noticeno }'">&nbsp; 
			<input type="button" value="삭제" onclick="window.location.href='./delete.do?noticeno=${article.noticeno }'">
		</div>
	</div>

</body>

</html>