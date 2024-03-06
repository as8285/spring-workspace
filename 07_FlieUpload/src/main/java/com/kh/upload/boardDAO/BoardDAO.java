package com.kh.upload.boardDAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.upload.model.vo.Board;

@Repository
public class BoardDAO{
	@Autowired
	private SqlSessionTemplate session;

	public int insert(Board b) {

		return session.insert("board.insert", b);
	}
	
	public List<Board> selectAll1(){
		
		return session.selectList("board.selectAll");
	}
		
		public Board selectList(int no){
			
			return session.selectOne("board.selectAll",no);
		}
		
		public Board select(int no) {
			
			return session.selectOne("board.select",no);
		}
		public int update(Board b){
		return session.update("board.update",b);
		
		}
		
		public int delete(int no) {
			
			return session.update("board.delete",no);
		}
		}
