package anonymous;
//익명구현객체 인터페이스를 구현하는 객체인데 굳이 클래스로 선언할필요없고 이름없는 클래스로 만든다.
public class AnonymousEx {
	public static void main(String[] args) {
		RunClass run = new RunClass();
		run.run();//run메소드 다른기능.
		
		Runnable runnable =new Runnable() {
			@Override
			public void run() {
				System.out.println("고양이가 달립니다");
			}
		};
		runnable.run();
		
		//매개값으로 함수사용 람다표현식 괄호안의 매개값을 받아서 화살표 다음의 식을 실행하겠습니다
 		runnable = () -> 
			
		System.out.println("기차가 달립니다");
		
		runnable.run();
	}
}
