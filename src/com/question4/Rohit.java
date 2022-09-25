package com.question4;

public class Rohit extends Thread {
	
	int sum=1;
	
	@Override
	public void run() {
		// TODO Auto-generated method 
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				sum*=i;
			}
			this.notify();
		}
		
		
	}

}
