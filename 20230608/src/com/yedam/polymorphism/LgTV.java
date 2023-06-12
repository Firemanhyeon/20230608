package com.yedam.polymorphism;

public class LgTV implements TV{
	private Speaker speaker;
	
	LgTV(Speaker speaker){
		this.speaker = speaker;
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV power on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV power Off");
		
	}

	@Override
	public void volumeUp() {
		this.speaker.volumeUp();
		
	}

	@Override
	public void volumeDown() {
		this.speaker.volumeDown();
		
	}

}
