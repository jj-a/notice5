<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>notice5/createForm.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<div class="title">공지사항 등록</div>
	<form name="frm" id="form" method="post" action="./create.do">
		<table class="writetb">
			<tr>
				<th>공지사항 내용</th>
				<td><textarea rows="3" cols="30" name="title" maxlength="300"></textarea></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="rname" size="20"></td>
			</tr>
		</table>

		<div class="bottom">
			<input type="submit" value="등록"> <input type="button" value="목록" onclick="location.href='./list.do'">
		</div>
	</form>
</body>
</html>
