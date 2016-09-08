package cn.tancp.framework.springmvc.view;

import java.io.Serializable;
/**
 * 用户传输对象类
 * @author Ripon
 * @date 2016年4月27日 下午3:35:40
 *
 */
public class UserDto implements Serializable {

	private static final long serialVersionUID = 4768931161329211349L;

	//用户名
	private String userName;
	//密码
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
