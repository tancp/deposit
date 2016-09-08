package cn.tancp.framework.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.tancp.framework.springmvc.utils.ConstUtil;

public class CommonInterceptor implements HandlerInterceptor  {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
		
		//获取当前用户名
		String userName = (String) session.getAttribute(ConstUtil.SESSION_KEY_USER_NAME);
		if(StringUtils.isBlank(userName)) {
			request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
//			response.sendRedirect(request.getContextPath() + "/WEB-INF/jsp/login.jsp");
			return false;
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("Post-Handle");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("After-Completion");
	}
}
