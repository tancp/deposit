<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${ctx}/login" method="post">
		<div>
		<div>用户名：</div>
			<div>
				<input type="text" name="userName" />
			</div>
		</div>
		<div>
			<div>密码：</div>
			<div>
				<input type="password" name="password" />
			</div>
		</div>
		<div>
			<div>
				<input type="submit" value="登录" />
				<input type="button" value="注册" />
			</div>
		</div>
	</form>
	<div>
		<c:if test="message==null || message==''">${message}</c:if>
	</div>
</body>
</html>