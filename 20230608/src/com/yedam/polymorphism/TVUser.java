package com.yedam.polymorphism;

public class TVUser {

	public static void main(String[] args) {
//		Speaker speaker = new SonySpeaker();//new SonySpeaker
//		TV tv = new SamSungTV(speaker);//new LgTV
		BeanFactory factory = new BeanFactory();
		TV tv=(TV)factory.getBean(args[0], args[1]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}

}
