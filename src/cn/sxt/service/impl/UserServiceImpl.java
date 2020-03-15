package cn.sxt.service.impl;

import cn.sxt.dao.UserDao;
import cn.sxt.service.UserService;

public class UserServiceImpl implements UserService{
//	private UserDao userDao = new UserDaoMySqlImpl();
//	上面的代码耦合性太强了，不方便以后更改。
	private UserDao userDao = null;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void getUser() {
//		System.out.println("MySQL获取用户数据");
		userDao.getUser();
	}

}
