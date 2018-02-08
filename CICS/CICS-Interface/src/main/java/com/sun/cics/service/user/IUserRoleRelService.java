package com.sun.cics.service.user;

import java.util.List;

import com.sun.cics.bean.RelUserRole;
import com.sun.cics.bean.TBasUser;

public interface IUserRoleRelService {

	public List<RelUserRole> getRoleByUser(TBasUser user);

}
