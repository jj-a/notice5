<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html lang="ko">

<head>
<meta charset="UTF-8">
<title>notice/delete.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>
	<div class="title">게시물 삭제</div>
	<form name="frm" id="form" method="post" action="./delete.do">
		<input type="hidden" name="noticeno" value="${article.noticeno }">
		<div id="content">
			<table>
				<tr>
					<td><img src="../images/003.gif" width="50%"></td>
				</tr>
				<tr>
					<td>게시물을 삭제하시겠습니까?</td>
				</tr>
				<tr>
					<td>
						<div class="bottom">
							<input type="submit" value="삭제">
							<input type="button" value="목록" onclick="window.location.href='./list.do'">
						</div>
					</td>
				</tr>
			</table>
		</div>
	</form>

</body>

</html>