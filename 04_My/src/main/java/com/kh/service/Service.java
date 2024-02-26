package com.kh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

@Service
public  class Service {
	@Autowired
	private MemberDAO dao;
	public List<Member>showAllMember(){
		return dao.showAllMember();
		
	}
	
}



