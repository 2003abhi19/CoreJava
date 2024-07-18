package com.tnsif.comparator;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ar=new ArrayList<Student>();
		ar.add(new Student (002,"erfg","poigh"));
		ar.add(new Student (200,"oijq","xcghj"));
		ar.add(new Student (852,"lkjh","mnbvrg"));
		
		System.out.println("--------------");
		Collection.sort(ar,new SortRoll());
		


	}

}
