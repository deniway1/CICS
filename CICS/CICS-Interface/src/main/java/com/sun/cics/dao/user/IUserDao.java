package com.sun.cics.dao.user;

import java.util.List;

import com.sun.cics.base.BaseRepository;
import com.sun.cics.bean.TBasUser;

public interface IUserDao extends BaseRepository<TBasUser, Long>{

	public List<TBasUser> findByfAccount(String account);
}
