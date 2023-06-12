package com.yedam.memo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemoApp {

	public static void main(String[] args) {
//		List<Memo> list = new ArrayList<>();
//		list.add(new Memo(1,"20230503","내용"));
		MemoList app = new MemoListImpl();//ArrayList
											//파일저장
										  //디비에 저장 여러가지 할수있는데 지금은 ArrayList에 저장
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			
			//1.추가 2.수정(번호기준,날짜기준) 3.삭제(번호기준,날짜기준2개0)4.조회(번호기준,날짜기준2개)5.전체목록6.종료
			System.out.println("1.추가 2.수정 3.삭제(번호기준,날짜기준2개) 4.조회(번호기준,날짜기준2개) 5.전체목록 6.종료");
			int num=0;
			int selectNum;
			try {
				selectNum = Integer.parseInt(sc.nextLine());					
			}
			catch(NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
				continue;
				
			}
			
			switch(selectNum) {
			case 1:
				System.out.println("번호를 입력하세요");
				try {
					num = Integer.parseInt(sc.nextLine());					
				}
				catch(NumberFormatException e) {
					System.out.println("숫자를 입력하세요");
					continue;
					
				}
				System.out.println("날짜를 입력하세요");
				String date = sc.nextLine();
				System.out.println("내용을 입력하세요");
				String memo = sc.nextLine();
				if(date.equals("")) {//날짜값에 아무것도없으면 현재날짜를 가져온다
					SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
					date = sdf.format(new Date());
				}
				Memo memo1 = new Memo(num,date,memo);
				app.input(memo1);
				break;
				
			case 2:

				System.out.println("번호 입력하세요");
				int a = Integer.parseInt(sc.nextLine());
				System.out.println("날짜 입력하세요");
				String b = sc.nextLine();
				System.out.println("변경할 내용을 입력하세요");
				String c = sc.nextLine();
				Memo memo2 = new Memo(a,b,c);
				app.update(memo2);
				break;
				
			
			
				
			case 3:
				System.out.println("선택해주세요 1.번호 2.날짜");
				int num2 = Integer.parseInt(sc.nextLine());
				if(num2 == 1 ) {
					System.out.println("번호를 입력해주세요");
					int num3 = Integer.parseInt(sc.nextLine());
					app.delete(num3);
					break;
				}
				
				else if (num2 == 2) {
					System.out.println("날짜를 입력해주세요");
					String num3 = sc.nextLine();
					app.delete((String)num3);
					break;
				}
				
			case 4:
				System.out.println("선택해주세요 1.번호 2.날짜");
				int num4 = Integer.parseInt(sc.nextLine());
				if(num4 == 1 ) {
					System.out.println("번호를 입력해주세요");
					int num5 = Integer.parseInt(sc.nextLine());
					app.search(num5);
					break;
				}
				
				else if (num4 == 2) {
					System.out.println("날짜를 입력해주세요");
					String num5 = sc.nextLine();
					app.search(num5);
					break;
				}
			case 5:
				app.print();
				break;
			case 6:
			run=false;
			break;
			
			
			}
		}
		System.out.println("end of prog");
		app.input(null);

	}

}
