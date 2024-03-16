package com.semi.coupang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.coupang.model.vo.Pick;

@Service
public class PickService {
	@Autowired
	private PickService dao;

	public Pick select(Pick pick) {
		return dao.select(pick);
	}

	public int insert(Pick pick) {
		return dao.insert(pick);
	}

	public int delete(int code) {
		return dao.delete(code);
	}
}
