package com.semi.coupang.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{

	// 로그인 했을때 얘로 접근한다.
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}

}
