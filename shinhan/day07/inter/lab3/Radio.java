package com.shinhan.day07.inter.lab3;

public class Radio implements Volume{
	
	int VolLevel;
	
	Radio(){
		VolLevel = 0;
	}
	@Override
	public void volumeUp(int level) {
		VolLevel += level;
		System.out.println("Radio볼륨 올립니다. " + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		VolLevel -= level;
		System.out.println("Radio볼륨 내립니다. " + VolLevel);
	}
}
