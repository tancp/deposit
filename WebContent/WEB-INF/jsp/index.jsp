<%@ include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="styles/css/framework/framework.css" />
<link type="text/css" rel="stylesheet" href="styles/css/framework/frameword-page.css" />
<title>deposit-learn</title>
</head>
<body>
	<div class="top">
		<%@ include file="/common/framework/page-header.jsp" %>
	</div>
	<div class="side">
		<%@ include file="/common/framework/page-side.jsp" %>
	</div>
	<div class="main">
		<iframe frameborder="0" src="${ctx}/home"></iframe>
	</div>
	<div class="bottom">
		<%@ include file="/common/framework/page-footer.jsp" %>
	</div>
</body>
</html>