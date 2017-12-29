package com.sun.cics.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.cics.bean.TBasUser;
import com.sun.cics.core.exception.BusinessException;
import com.sun.cics.dao.user.IUserDao;
import com.sun.cics.exception.ExceptionConstants;
import com.sun.cics.utils.WebTool;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public TBasUser findUserByAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TBasUser queryUser(String account, String pass) {
		if(WebTool.isNull(account)) {
			throw new BusinessException(ExceptionConstants.ERROR_NULL,"账号");
		}
		return null;
	}
}
