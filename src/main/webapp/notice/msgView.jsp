<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>msgView.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<div class="title">알림</div>
	<div class="content">
		<dl>
			<dd>${msg1!=null ? img : "" }<p>${msg1 }</p>
			</dd>
			<dd>${msg2!=null ? img : "" }<p>${msg2 }</p>
			</dd>
			<dd>${msg3!=null ? img : "" }<p>${msg3 }</p>
			</dd>
			<dd>${msg4!=null ? img : "" }<p>${msg4 }</p>
			</dd>
			<dd>${msg5!=null ? img : "" }<p>${msg5 }</p>
			</dd>
		</dl>

		<p>${link1 }${link2 }${link3 } ${link4 } ${link5 }</p>
	</div>

</body>
</html>
