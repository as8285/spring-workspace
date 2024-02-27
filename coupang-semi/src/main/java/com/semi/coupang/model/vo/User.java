package com.semi.coupang.model.vo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor
public class User implements UserDetails{
private String id;
private String password;
private String name;
private String phone;
private String address;
private String email;
private String role;
@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
	ArrayList<GrantedAuthority> authList = new ArrayList<>();
	authList.add(new SimpleGrantedAuthority(role));
	return authList;
	
}
@Override
public String getUsername() {	
	return id;
}
// true 사용해야지 잠금 해제
@Override
public boolean isAccountNonExpired() {
	return true;
}
@Override
public boolean isAccountNonLocked() {
	return true;
}
@Override
public boolean isCredentialsNonExpired() {
	return true;
}
// 회원탈퇴 할경우 따로 만들어서 enabled
@Override
public boolean isEnabled() {
	return true;
}

}
