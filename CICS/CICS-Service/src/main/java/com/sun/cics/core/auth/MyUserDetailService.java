package com.sun.cics.core.auth;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.cics.service.user.IUserRoleRelService;
import com.sun.cics.service.user.IUserService;

//@Service
public class MyUserDetailService 
//implements UserDetailsService 
{

	@Autowired
	private IUserService userService;
	
	@Autowired
	private IUserRoleRelService urService;
	
//	@Override
//	public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
//		
//		TBasUser user;
//		try {
//			user = userService.findUserByAccount(account);
//		}catch(Exception e) {
//			throw new UsernameNotFoundException("find user failed",e);
//		}
//		
//		if(user == null || user.getFId() < 0) {
//			throw new UsernameNotFoundException("no user found");
//		}else {
//			try {
//				List<RelUserRole> roles = urService.getRoleByUser(user);
//				return new MyUserDetails(user,roles);
//			} catch (Exception e){
//				throw new UsernameNotFoundException("user role select fail");
//			}
//		}
//	}
}
