package com.tns.lamdaExpression;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Factorial f = (num)-> { 
			int res=1;
			for (int i=1; i<=n; i++) {
				res *= i;
			};
			return res;
		};
		System.out.println(f.fact(n));

	}

}
