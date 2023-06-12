package com.yedam.listTest;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList();
		//저장유형이 Object 이니까 결과도 Object 여야함
		list.add("apple");
//		list.add(new Integer(10));
		
		for(int i = 0 ; i <list.size();i++) {
			//결과도 Object
//			Object result = list.get(i);
//			if(result instanceof String) {
//				System.out.println((String)result);
//			}
//			else if (result instanceof Integer) {
//				System.out.println((Integer)result);
//			}
			String result = list.get(i);
			System.out.println(result);
		}
		
		ArrayList<Integer>nList = new ArrayList<Integer>();
		nList.add(10);
		nList.add(20);
		nList.remove(1);
		nList.set(0, 100);
		nList.add(200);
		
		for(Integer num : nList) {
			System.out.println(num);
		}
	}

}
