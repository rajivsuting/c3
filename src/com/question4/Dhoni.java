package com.question4;

public class Dhoni extends Thread {
	
	int sum=0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for(int i=1;i<=20;i++) {
				sum+=i;
			}
			this.notify();
		}
		
	}

}
