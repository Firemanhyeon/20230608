package com.yedam.exceptions;

public class ThrowExe {
//3을 0으로 나누면 by zero라는 에러 발생 
	public static void main(String[] args) throws ClassNotFoundException {
		int result = divide(3,0);
		System.out.println(result);
		
		try {
			method("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			
			System.out.println("알수없는 예외");
		}

	}
	public static void method(String cls) throws ClassNotFoundException,Exception {//예외떠넘기기
		Class.forName(cls);
		System.out.println("end of method");
	}
	public static int divide(int a , int b ) {
		return a/b;
	}

}
