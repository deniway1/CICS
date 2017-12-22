package com.sun.cics.service.user;

import com.sun.cics.bean.TBasUser;

public interface IUserService {

	public TBasUser findUserByAccount(String account);

}
