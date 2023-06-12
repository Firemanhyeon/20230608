package com.yedam.polymorphism;

public class AppleSpeaker implements Speaker{
	AppleSpeaker(){
		System.out.println("AppleSpeaker객체생성");
	}
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker소리올림");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker소리내림");
		
	}

}
