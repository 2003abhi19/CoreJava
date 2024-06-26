package com.tns.constructor;

public class CommissionMain {
	public static void main(String[] args) {
	
		
		Commission ob=new Commission();
		ob.setName("abhi");
		ob.setAddress("banglore");
		ob.setPhone(123);
		ob.setSales_amount(75000);
		System.out.println(ob);
		
		
		ob.commission();

	
	}

}
