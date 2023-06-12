package com.yedam.memo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoListImpl implements MemoList {

	List<Memo> list = new ArrayList<Memo>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void input(Memo memo) {
		// 동일여부 체크
		for (int i = 0; i < list.size(); i++) {
			Memo memo1 = list.get(i);
			if (memo1.getNo() == memo.getNo() && memo1.getDate().equals(memo.getDate())
					&& memo1.getContent().equals(memo.getContent())) {
				System.out.println("중복입니다");
				return;
				
			}
		}
	//정렬
	for(int i =0 ; i < list.size();i++) {
	
		if(Integer.parseInt(list.get(i).getDate())> Integer.parseInt(memo.getDate())) {
			list.add(i,memo);
			return;
		}
	}
	list.add(memo);

	}
	@Override
	public void update(Memo memo) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == memo.getNo() && list.get(i).getDate().equals(memo.getDate())) {
				list.get(i).setContent(memo.getContent());
				System.out.println("수정완료");
				break;
			} else {
				System.out.println("해당 번호가 없ㅅ습니다");
				break;
			}
		}
	}

	@Override
	public void delete(int no) {
		for (int i = 0; i < list.size(); i++) {
			Memo m = list.get(i);
			if (m.getNo() == no) {
				list.remove(i--);
				System.out.println("삭제완료");
			}
		}

	}

	@Override
	public void delete(String date) {
		for (int i = 0; i < list.size(); i++) {
			Memo m = list.get(i);
			if (m.getDate().equals(date)) {
				list.remove(i--);
				System.out.println("삭제완료");
			}
		}

	}

	@Override
	public void search(int no) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == no) {
				System.out.printf("번호: %d 날짜: %s 내용: %s\n ", list.get(i).getNo(), list.get(i).getDate(),
						list.get(i).getContent());

			}
		}

	}

	@Override
	public void search(String date) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDate().equals(date)) {
				System.out.printf("번호: %d 날짜: %s 내용: %s\n ", list.get(i).getNo(), list.get(i).getDate(),
						list.get(i).getContent());

			}
		}

	}

	@Override
	public void print() {
		for (int i = 0; i < list.size(); i++) {
//			Memo m = (Memo)list.get(i);
			System.out.printf("번호: %d 날짜: %s 내용: %s\n ", list.get(i).getNo(), list.get(i).getDate(),
					list.get(i).getContent());

		}

	}
}
