package com.question4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kohli k = new Kohli();
		Dhoni d = new Dhoni();
		Rohit r = new Rohit();
		
		d.setPriority(10);
		d.setName("Dhoni");
		
		r.setPriority(7);
		r.setName("Rohit");
		
		k.setPriority(1);
		k.setName("Kohli");
		
		d.start();
		
		
		synchronized (d) {
			try {
				d.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(d.getName()+"-"+d.sum);
		}
		r.start();
		synchronized (r) {
			try {
				r.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(r.getName()+"-"+r.sum);
		}
		k.start();

	}

}
