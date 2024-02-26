package com.kh.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.kh.security.model.dao.MeberDAO;
import com.kh.security.model.vo.Member;
// Soring Security에서 제공하는 UserDetailService 인터페이스 상속 
@Service
public class MemberService implements UserDetailsService{
	@Autowired
	private BCryptPasswordEncoder bcpe;
@Autowired
private MeberDAO dao;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		return null;
	}

	// 회원가입 
	public int registerMember(Member vo) {
		// 비밀번호 암호화 처리한 후 멤버 정보 다시 담아서 DAO에게 전달
		String encodePw = bcpe.encode(vo.getPassword());
		vo.setPassword(encodePw);
		return dao.registerMember(vo);
		

	}
	
}

