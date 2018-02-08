package com.sun.cics.core.auth;

import java.util.List;

import com.sun.cics.bean.RelUserRole;
import com.sun.cics.bean.TBasUser;

public class MyUserDetails 
//implements UserDetails 
{

	private List<RelUserRole> roles;// 用户角色
	private TBasUser user;
	
	public MyUserDetails(TBasUser user, List<RelUserRole> roles){
        this.user = user;
        this.roles = roles;
    }
	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		if(roles == null || roles.size() <1){
//            return AuthorityUtils.commaSeparatedStringToAuthorityList("");
//        }
//        StringBuilder commaBuilder = new StringBuilder();
//        for(RelUserRole role : roles){
//        	// TODO 
//            commaBuilder.append(role.getTBasRole()).append(",");
//        }
//        String authorities = commaBuilder.substring(0,commaBuilder.length()-1);
//        return AuthorityUtils.commaSeparatedStringToAuthorityList(authorities);
//	}
//
//	@Override
//	public String getPassword() {
//		return user.getFPassword();
//	}
//
//	@Override
//	public String getUsername() {
//		return user.getFUsername();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}

}
