package com.stream.StreamPractice;

import java.util.stream.Stream;

public class StreamBuilder {

	public static void main(String[] args) 
	{
		Stream<String> build=Stream.<String>builder().add("sk").add("ad").build();
		build.forEach(System.out::println);
	}

}
