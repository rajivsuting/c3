package com.question3;

import java.util.concurrent.Callable;

public class Call implements Callable {
	int num;
	
	public Call(int n) {
		this.num=n;
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		int prod=1;
		
		for(int i=1;i<=num;i++) {
			prod*=i;
		}
		return prod;
	}

}
