<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div>“classpath:” 介绍，及案例 </div>
		<div>2016-4-22</div>
		<pre>
			classpath就是代表  /WEB-INF /classes/  这个路径（如果不理解该路径，就把一个web工程发布为war包，然后用winrar查看其包内路径就理解啦）
			常用的场景：
			在SSH架构中，配置spring的上下文环境：
			<!-- Spring Configures -->
			    <context-param>
			        <param-name>contextConfigLocation</param-name>
			        <param-value>
			            classpath:applicationContext.xml
			        </param-value>
			    </context-param>
			
			里面的
			classpath:applicationContext.xml  
			也可以使用  /WEB-INF /classes/ applicationContext.xml  代替
			
			注意：
			classpath 和 classpath* 区别：
			classpath：只会到你的class路径中查找找文件;
			classpath*：不仅包含class路径，还包括jar文件中(class路径)进行查找 ---- 够深入的吧
		</pre>
	</div>
</body>
</html>