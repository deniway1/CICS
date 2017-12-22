package com.sun.cics.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.cics.bean.RelUserRole;
import com.sun.cics.bean.TBasUser;
import com.sun.cics.dao.user.IUserRoleRelDao;

@Service
public class UserRoleRelServiceImpl implements IUserRoleRelService {

	@Autowired
	private IUserRoleRelDao urDao;

	@Override
	public List<RelUserRole> getRoleByUser(TBasUser user) {
		return null;
	}
}
