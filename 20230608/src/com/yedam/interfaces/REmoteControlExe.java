package com.yedam.interfaces;

public class REmoteControlExe {

	public static void main(String[] args) {
		RemoteControl remote = new Audio();//리모트컨트롤 오디오클래스로 세팅
		remote = new Television();//텔레비전클래스로 리세팅
		//최대한 코드를 변경하지않고 내가원하는 코드를 구현하고싶다 할때 쓴다
		
		
		
		remote.turnOn();
		remote.setVolume(6);
		remote.turnOff();

	}

}
