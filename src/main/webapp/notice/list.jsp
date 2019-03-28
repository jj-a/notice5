<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html lang="ko">

<head>
<meta charset="UTF-8">
<title>notice5/list.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>
	<div id="playlist">
		<div class="title">게시판</div>
		<hr>
		<div class="list">
			<table style="width:100%">
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>등록일</th>
					<th>수정/삭제</th>
				</tr>
				<c:forEach var="article" items="${list }">
					<c:set var="rdate" value="${fn:substring(article.rdate,0,10)}"/>
					<tr>
						<td>${article.noticeno }</td>
						<td class="link" onclick="location.href='./read.do?noticeno=${article.noticeno }'" onmouseover="style='cursor:pointer;'">
							${article.title }
						</td>
						<td>${article.rname }</td>
						<td>${rdate }</td>
						<td><input type="button" value="수정" onclick="location.href='./update.do?noticeno=${article.noticeno }'">
						&nbsp;<input type="button" value="삭제" onclick="location.href='./delete.do?noticeno=${article.noticeno }'"></td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan=5>
						<div class="bottom">
							<input type="button" value="글쓰기" onclick="window.location.href='./create.do'">
						</div>
					</td>
				</tr>
			</table>
		</div>
	</div>
	
</body>

</html>