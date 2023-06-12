package com.yedam.listTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListExe {

	public static void main(String[] args) {
		//인터페이스.(List) -구현클래스.(ArrayList,LinkedList)
		List<String> list = null;
		list = new ArrayList<String>();
		list = new LinkedList<String>();
		
		
		list.add("Apple");
		list.add("Banana");
		
		//Date in java
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");//년월일로 지정
		System.out.println(sdf.format(today)); // Date 객체 => 문자열
		
		String format = sdf.format(today);
		String sdate = "2023-07-22 13:13:13";
		try {
			Date date = sdf.parse(sdate);//문자열-/> Date 객체  바꿔줌 
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
