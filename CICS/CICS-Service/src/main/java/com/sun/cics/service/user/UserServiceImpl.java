package com.sun.cics.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.cics.bean.TBasUser;
import com.sun.cics.dao.user.IUserDao;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public TBasUser findUserByAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}
}
