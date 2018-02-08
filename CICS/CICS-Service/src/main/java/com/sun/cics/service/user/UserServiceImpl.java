package com.sun.cics.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.cics.bean.TBasUser;
import com.sun.cics.constant.Constants;
import com.sun.cics.core.exception.BusinessException;
import com.sun.cics.dao.user.IUserDao;
import com.sun.cics.utils.WebTool;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public TBasUser queryUserByAccount(String account) {
		if(WebTool.isNull(account)) {
			throw new BusinessException(Constants.Common.ERROR_NULL_VALUE,
					Constants.getErrMsg(Constants.Common.ERROR_NULL_VALUE,account)
					);
		}
		
		List<TBasUser> users = userDao.findByfAccount(account);
		if(WebTool.isNull(users) || users.size() < 1) {
			throw new BusinessException(Constants.User.ERROR_ACCOUNT_NOT_FOUND,
					Constants.getErrMsg(Constants.User.ERROR_ACCOUNT_NOT_FOUND,account));
		}
		return users.get(0);
	}
}
