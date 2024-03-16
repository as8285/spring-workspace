package com.kh.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.model.dto.SearchDTO;
import com.kh.model.vo.Member;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSessionTemplate session;

	public List<Member> showAllMember() {

		return session.selectList("memberMapper.showAllMember");
	}

	public int registerMember(Member vo) {

		return session.insert("memberMapper.registerMember", vo);

	}

	
	public Member login(Member vo) {
		return session.selectOne("memberMapper.login", vo);
	}

	public int updateMember(Member vo) {
		return session.update("memberMapper.updateMember",vo);
	}

	public List<Member> findMember(SearchDTO search) {
		return session.selectList("memberMapper.findMember", search);
	}

	public List<Member>findMember2(List<String> idList){
		return session.selectList("memberMapper.findMember2",idList);
		
		
	}
	
	}


