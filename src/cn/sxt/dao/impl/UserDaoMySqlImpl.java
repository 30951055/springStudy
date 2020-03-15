package cn.sxt.dao.impl;

import cn.sxt.dao.UserDao;
/**
 * ioc--inversion of control控制反转
 * 通过此案例1：
 * 对象由原来程序本身创建，变为了程序接受对象。
 * 程序员主要精力集中于业务实现。
 * 实现了service 和 dao 的解耦工作。services层和dao 层实现了分离。
 * 没有直接依赖关系。
 * 如果dao的实现发生改变，应用程序本身不用改变。
 * 
 * @author YANGGUANGYI
 *
 */

public class UserDaoMySqlImpl implements UserDao {
	public void getUser() {
		System.out.println("MySql获取用户数据");
	}

}
