package com.stream.StreamPractice;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreamExample {

	public static void main(String[] args) 
	{
		Stream<Integer> infiniteStream=Stream.iterate(1,i->i*2);
		List<Integer> collect=infiniteStream.limit(5).collect(Collectors.toList());
		System.out.println("Using limit and collect,Limit to finish the program after certain time");
		collect.forEach(System.out::println);
		System.out.println("------------------------------");
		
		Stream<Integer> infiniteStream1=Stream.iterate(0,i->i+2);
		List<Integer> collect1=infiniteStream1.skip(5).limit(5).collect(Collectors.toList());
		System.out.println("Using limit and collect and skip");
		collect1.forEach(System.out::println);
		System.out.println("------------------------------");
		
		
		
		System.out.println("Using generate ,generating a string 5 times");
		Stream<String> infiniteStream2=Stream.generate(()->"Swagata").limit(5);
		infiniteStream2.forEach(System.out::println);
		System.out.println("------------------------------");
		
		
		
		
		
		System.out.println("Different types of Streams");
		Random random=new Random();
		DoubleStream drandom=random.doubles(3);
		drandom.forEach(System.out::println);
		System.out.println("------------------------------");
		
		IntStream irandom=random.ints(5);
		irandom.forEach(System.out::println);
		System.out.println("------------------------------");
		
		IntStream istream=IntStream.range(2, 8);
		System.out.println("exclusive  last parameter");
		istream.forEach(System.out::println);
		System.out.println("------------------------------");
		
		
		IntStream instream=IntStream.rangeClosed(2,5);
		System.out.println("inclusive  last parameter");
		instream.forEach(System.out::println);
		
		IntStream strChars="ABCDF".chars();
		System.out.println("ASCII OF chars");
		 strChars.forEach(System.out::println);
		
		
	}

}
