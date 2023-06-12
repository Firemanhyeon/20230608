package com.yedam.interfaces;

public class SmartTelevision implements RemoteControl, Searchable {
//인터페이스는 다중상속이 가능하다
//부모자식 상속은 한개만가능했었음
	int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");

	}

	@Override
	public void turnOn() {
		System.out.println("Smart TV를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("Smart TV를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {

			this.volume = MAX_VOLUME;
		}

		else {
			this.volume = volume;
		}
		System.out.println("Audio 볼륨 :" + this.volume);

	}

}
