package com.yedam.memo;

//하나의 메모를 저장하기위한클래스
public class Memo {
	private int no; // 순번
	private String date;// 작성 시간
	private String content; // 메모내용

	// 생성자
	public Memo(int no, String date, String content) { // 초기값을 다 지정해주는 생성자
		this.no = no;
		this.date = date;
		this.content = content;
	}

//	public Memo(String date, String content) {// 매개값이 두개밖에 없는 경우
//		this.date = date;
//		this.content = content;
//	}
	public Memo(int no , String content) {//매개값이 한개밖에 없는경우
		this.no = no;
		this.date = null; 
		this.content=content; 
	}

	
	
	
	@Override
	public String toString() {
		return "Memo [no=" + no + ", date=" + date + ", content=" + content + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
