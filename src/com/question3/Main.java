package com.question3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Call[] c = {new Call(5),new Call(8),new Call(6),new Call(2),new Call(30),new Call(9)};
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		for(Call call:c) {
			Future f= es.submit(call);
			try {
				System.out.println(f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		es.shutdown();

	}

}
