package com.question2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculate c = new Calculate();
		c.start();
		
		synchronized (c) {
			try {
				c.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The product is "+c.sum);
		}

	}

}
