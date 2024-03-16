package com.kh.ajax.member.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.ajax.model.vo.Member;



@Repository
public class MemberDAO {

	@Autowired
	private SqlSessionTemplate session;
	
	
	public Member idCheck(String id) {
		return session.selectOne("memberMapper.idCheck", id);
	}
	public int register(Member member) {
		return session.insert("memberMapper.register", member);
	}
	
}