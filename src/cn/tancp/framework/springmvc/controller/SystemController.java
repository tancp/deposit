package cn.tancp.framework.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.tancp.framework.springmvc.utils.ConstUtil;
import cn.tancp.framework.springmvc.view.UserDto;

/**
 * 系统view控制类
 * @author Ripon
 * @date 2016年4月27日 下午2:38:17
 *
 */
@Controller
public class SystemController {

	/**
	 * 系统根路径
	 * @date 2016年4月27日 下午2:40:41
	 * @return
	 */
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	/**
	 * 主页
	 * @date 2016年4月27日 下午2:41:44
	 * @return
	 */
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String home() {
		return "page-home";
	}
	
	
	/**
	 * 实现登录功能
	 * @date 2016年4月27日 下午3:56:09
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, @ModelAttribute UserDto user) {
		String userName = user.getUserName();
		String password = user.getPassword();
		
		String USER_NAME = "ADMIN";
		String PASSWORD  = "ADMIN";
		if(StringUtils.isBlank(userName) || StringUtils.isBlank(password)) {
			request.setAttribute(ConstUtil.COMMON_MESSAGE_NAME, "用户名及密码不能为空");
			return "redirect:/";
		} else {
			
		}
		return "redirect:/";
	}
}