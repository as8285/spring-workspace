package com.kh.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.model.dao.MemberDAO;
import com.kh.model.dto.SearchDTO;
import com.kh.model.vo.Member;

@Service
public class MemberService {
@Autowired
private MemberDAO dao;
public List<Member>showAllMember(){
	
	return dao.showAllMember();
}
public int registerMember(Member vo) {
	return dao.registerMember(vo);
}
public Member login(Member vo) {
	return dao.login(vo);
}
public int updateMember(Member vo) {
	return dao.updateMember(vo);
}
public List<Member>findMember(String keyword,String select){
	SearchDTO dto = new SearchDTO();
	dto.setKeyword(keyword);
	dto.setSelect(select);
	
	return dao.findMember(dto);
}
public List<Member>findMember2(String[] checkId){
	List<String>idList=Arrays.asList(checkId);
	return dao.findMember2(idList);
	
}
}
