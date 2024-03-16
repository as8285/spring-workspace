package com.kh.test.model.dao;

import java.sql.SQLException;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.test.model.vo.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@Repository
public class UserDAO {
	@Autowired
	private SqlSessionTemplate session;
	
	public User selectUser(int no) {
		return session.selectOne("userMapper.selectUser",no);
	}
}

