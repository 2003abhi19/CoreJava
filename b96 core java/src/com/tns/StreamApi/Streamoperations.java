package com.tns.StreamApi;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streamoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//map function
		Integer[] values =new Integer[] {1,2,3,4,5};//to get the string
		Stream<Integer> stream=Arrays.stream(values);//create a stream using stream method
		System.out.println("Square of a number"+Arrays.toString(values));
		stream.map(num-> num*num).forEach(System.out::println);
		
		//filter()
		
		System.out.println("even no:");
		Integer[] value =new Integer[] {1,2,3,4,5};//to get the string
		Stream<Integer> streams=Arrays.stream(value);
		streams.filter(ele->ele%2==0).forEach(System.out::println);
		
		//limit()
		System.out.println("limit operation");
		Integer[] valu =new Integer[] {1,2,3,4,5};//to get the string
		Stream<Integer> streamsobj=Arrays.stream(valu);//create a stream using stream method
		
		System.out.println("skip 1st 2 ele");
		Arrays.stream(valu).skip(2).forEach(System.out::println);
		
		//
		
		

	}

}
