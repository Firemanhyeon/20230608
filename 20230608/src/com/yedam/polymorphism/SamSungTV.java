package com.yedam.polymorphism;

public class SamSungTV implements TV{
	private Speaker speaker;
	SamSungTV(Speaker speaker){
		this.speaker = speaker;
	}
	@Override
	public void powerOn() {
		System.out.println("SamsungTV power on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV power Off");
		
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
