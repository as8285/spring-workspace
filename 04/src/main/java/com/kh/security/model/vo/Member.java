package com.kh.security.model.vo;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.Data;
import lombok.NoArgsConstructor;
// Spring Security에서 제공하는 UserDetails 인터페이스 상속
@Data @NoArgsConstructor // vo 기본 세팅
public class Member implements UserDetails {
	private String id;
	private String password;
	private String name;
	private String auth; // security 시 필수!
	private int enabled; // 선택
	
	//회원 권한 관련 메서드, 역할에 따른 권한부여
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		ArrayList<GrantedAuthority> authList = new ArrayList<>();
		authList.add(new SimpleGrantedAuthority(auth));
		return authList;
	}
	
	@Override
	public String getUsername() {
		return id;
	}
	
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
	
	// 탈퇴여부
	@Override
	public boolean isEnabled() {
		return enabled == 1 ? true : false;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPassword(String encodePw) {
		// TODO Auto-generated method stub
		
	}
	
}


