package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop>laps=new ArrayList<Laptop>();
		laps.add(new Laptop("Dell",85296,8));
		laps.add(new Laptop("HP",859632,10));
		laps.add(new Laptop("acer",785462,11));
		Collections.sort(laps);
		for(Laptop l:laps) {
			System.out.println(l);
		}
		

	}

}
