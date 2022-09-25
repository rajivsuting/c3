package com.question4;

public class Kohli extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
		
	}

}
