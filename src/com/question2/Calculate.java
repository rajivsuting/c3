package com.question2;

public class Calculate extends Thread {
	
	int sum=1;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				sum*=i;
			}
			this.notify();
		}
		
	}

}
