package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList ob=new ArrayList();
		//System.out.println("the size of the arraylist "+ob.size());
		//ob.add(2);
		//ob.add('a');
		//ob.add(22.35);
		//System.out.println("the elements are "+ob);
		//System.out.println("the elements to be checked "+ob.contains(22.35));
		//System.out.println("the elements to be removed is "+ob.remove(0));
		//System.out.println("the elements are "+ob);
		ArrayList <String>ob=new ArrayList<String>();
		ob.add("banglore");
		ob.add("mysuru");
		ob.add("hassan");
		System.out.println("the elements are "+ob);
		Collections.sort(ob);
		System.out.println("sorted is"+ob);
		//for()
		Iterator<String> i=ob.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			//ob.remove(0);
			//String s=i.remove(0);
			System.out.println(nm);
			
		}

	}

}
