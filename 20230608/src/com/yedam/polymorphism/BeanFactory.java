package com.yedam.polymorphism;

public class BeanFactory {
	public Object getBean(String tv, String speaker) {
		Speaker speakerObj=null;
		
		if(speaker.equals("Sony")) {
			speakerObj = new SonySpeaker();
		}else if(speaker.equals("apple")) {
			speakerObj = new AppleSpeaker();
		}
		
		if(tv.equals("Lg")) {
			return new LgTV(speakerObj);
			
		}else if(tv.equals("Samsung")) {
			return new SamSungTV(speakerObj);
		}
		return null;
	}
}
