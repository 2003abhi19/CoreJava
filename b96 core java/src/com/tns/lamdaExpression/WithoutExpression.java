package com.tns.lamdaExpression;

public class WithoutExpression {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Object m =()-> {return "hello";};
		Message m = ()-> {return "hello";};
		System.out.println(m.greet());

		Cube c = (a)-> {return a*a*a;};

		System.out.println(c.cal(5));
	}
		

}
