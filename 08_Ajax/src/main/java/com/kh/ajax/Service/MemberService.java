package com.kh.ajax.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.ajax.member.DAO.MemberDAO;
import com.kh.ajax.model.vo.Member;

// Spring Security에서 제공하는 UserDetailsService 인터페이스 상속
@Service
public class MemberService {
	@Autowired
	private MemberDAO dao;	
	// 회원가입
	public Member idCheck(String id) {
		// 비밀번호 암호화 처리한 후 멤버 정보 다시 담아서 DAO에게 전달!
		return dao.idCheck(id);
	}
	
	public int register (Member member) {
		// 비밀번호 암호화 처리한 후 멤버 정보 다시 담아서 DAO에게 전달!
		return dao.register(member);
	}
}
