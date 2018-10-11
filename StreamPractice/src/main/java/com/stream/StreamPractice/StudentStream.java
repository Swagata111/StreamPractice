package com.stream.StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

public class StudentStream
{
	public static void main(String[] args)
	{
	ArrayList<Student>stuList=new ArrayList<>();
	stuList.add(new Student("Swagata",22));
	stuList.add(new Student("Ashwini",22));
	stuList.add(new Student("Abhrak",22));
	
	Stream<Student> stuStream=stuList.parallelStream();
	stuStream.forEach(s->doProcess(s));
	/**
	 * Another way of stream creation
	 * 
	//Stream ob=Stream.of("S.K",20);
	//ob.forEach(System.out::println);
	 * 
	 * 
	 * Collection<String> collection=Arrays.asList("sk","rr");
	 	Stream s=collection.stream();
	 	s.forEach(System.out::println);
	 * 
	 */
	
	
	System.out.println("Using filter");
	Stream st=Stream.of(1,2,6,4,9).filter(e->e.equals(2));
	st.forEach(System.out::println);
	
	Stream st1=Stream.of("abhrak","swagata","ashwini").filter(e->e.contains("h"));
	
	
	Optional<String> findAny=st1.findAny();
	System.out.println("Filter criteria has found 'h' and has found any name containing h");
	System.out.println(findAny.get());
	
	
	//st1.forEach(System.out::println);
	
	
	 
	}
	
	
	private static void doProcess(Student s) {
		System.out.println(s);
	}
	
}
