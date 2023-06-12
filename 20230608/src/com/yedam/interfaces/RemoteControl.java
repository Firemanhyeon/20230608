package com.yedam.interfaces;
//오디오 , 텔레비전은 인터페이스 리모트컨트롤을 구현하고있는 구현클래스들이다
public interface RemoteControl {
	int MAX_VOLUME = 10;
	
	void turnOn();//public abstract의 의미가 담겨있다
	void turnOff();
	void setVolume(int volume);
	
}
