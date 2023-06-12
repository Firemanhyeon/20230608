package com.yedam.exceptions;

public class NullpointerExe {

	public static void main(String[] args) {
		String msg = "Hello";
		msg = null;
		
		//block 에서 실행예외가 발생하면
		//catch블랙의 코드를 실행한다
		try {
			System.out.println(msg.length());
			
			int no = Integer.parseInt(msg);
			System.out.println(no);
			
		} catch(NullPointerException ne) {//Null 예외
			System.out.println("NullPoint예외발생 msg의 값을 확인하세요");
		} catch(NumberFormatException e) {//Type 예외
			System.out.println("NumberForm예외 msg값확인하세요");
		} catch(Exception e) {//전체 예외처리 
			System.out.println("알수없는예외발생");
		}
		System.out.println("end of prog.");
	}

}
