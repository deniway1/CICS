package com.sun.cics.core.auth;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class MyAuthenticationProvider 
//implements AuthenticationProvider 
{
	
	@Autowired
	private MyUserDetailService userService;

//	@Override
//	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//		String username = authentication.getName();
//        String password = (String) authentication.getCredentials();
//        MyUserDetails user = (MyUserDetails) userService.loadUserByUsername(username);
//        if(user == null){
//            throw new BadCredentialsException("Username not found.");
//        }
//
//        //加密过程在这里体现
//        if (!password.equals(user.getPassword())) {
//            throw new BadCredentialsException("Wrong password.");
//        }
//
//        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
//        return new UsernamePasswordAuthenticationToken(user, password, authorities);
//	}
//
//	@Override
//	public boolean supports(Class<?> authentication) {
//		return true;
//	}

}
