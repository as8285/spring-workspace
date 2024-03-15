package com.kh.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kh.test.model.dao.UserDAO;
import com.kh.test.model.vo.User;

@Service
public class UserService {
@Autowired
private UserDAO dao;
public User selectUser(int no) {
	return dao.selectUser(no);
	
}
}
