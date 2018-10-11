package com.stream.StreamPractice;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReduceDemo {

	public static void main(String[] args) 
	{
		//1+2+3+4
		OptionalInt reduced=IntStream.range(1,5).reduce((a,b)->a+b);
		System.out.println(reduced.getAsInt());
		
		//1+2+3+4  +10(identity value)
		int reduced1=IntStream.range(1,5).reduce(10,(a,b)->a+b);
		System.out.println(reduced1);
		
		
		//10+1   +10+2   +10+3
		int l=Arrays.asList(1,2,3).parallelStream().reduce(10,(a,b)->a+b,(a,b)->{
			System.out.println("Combiner called");
			return a+b;
					
		});
		System.out.println(l);
	}

}
