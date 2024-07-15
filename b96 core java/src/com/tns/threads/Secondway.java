package com.tns.threads;

public class Secondway implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secondway t=new Secondway();
		Thread th=new Thread(t);
		th.start();//runnable
		//th.start();//illigal thread state exception
		th.run();//acts as normal method
		th.sleep(0);
		
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("creation of thread runnable interface");
		
	}

}
