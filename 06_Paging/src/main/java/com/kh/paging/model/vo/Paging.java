package com.kh.paging.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor
public class Paging {
	private int page = 1;
	private int offset = 0; // 시작 위치
	private int limit = 10; // 레코드 수

	private int pageSize = 10; // 한 페이지 당 페이지 개수
	private int endPage = this.pageSize; // 한페이지의 마지막 페이지 (end페이지를 먼저 계산추천)
	private int startPage = this.endPage - this.pageSize+1 ; // 한페이지의 첫 페이지 
	
	private boolean pre;
	private boolean next;
	
	/*
	 * page : 1~10 -> endpage:10  10  + d == 10 
	 * page : 11~20 -> endpage : 20   10 + d == 20
	 * page : 21~30 -> endpage : 30 10 + d == 30
	 * */
	public Paging(int page,int total) {
		this.page = page;
		this.endPage = (int)(Math.ceil((double)page/this.pageSize))*this.pageSize;
		this.startPage = this.endPage - this.pageSize+1;
		int lastPage =(int)(Math.ceil((double)total/this.limit));
		if(lastPage < this.endPage) {
			this.endPage = lastPage;
		}
		this.pre = this.startPage>1;
		this.next = this.endPage<lastPage;
		
	}
}


