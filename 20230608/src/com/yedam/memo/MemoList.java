package com.yedam.memo;
//기능 정의 하기 위한 인터페이스 생성
public interface MemoList {
	//등록. 
	void input(Memo memo);
	//수정
	void update(Memo memo);//매개변수값을 기준으로 번호 ,날짜 -> 내용변경 
	//삭제
	void delete(int no);//번호기준으로 삭제
	void delete(String date);//날짜기준삭제
	//조회
	void search(int no);//번호기준으로 조회
	void search(String date);//날짜 기준으로 모두 조회
	//전체 목록 조회
	void print();
}
