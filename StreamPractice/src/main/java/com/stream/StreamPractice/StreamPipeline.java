package com.stream.StreamPractice;

import java.util.stream.Stream;

public class StreamPipeline {

	public static void main(String[] args) {
		
		Stream<String> stream=Stream.of("S.K","A.D","T.R","R.R").skip(1);
		stream.forEach(System.out::println);
		
		System.out.println("--------------------------");
		Stream<String> modifiedStream=
				Stream.of("S.K","A.D","T.R","R.R").skip(1).map(e->e.substring(0,2)).sorted();
		modifiedStream.forEach(System.out::println);
		
		
		System.out.println("--------------------------");
		long mLENGTH=
				Stream.of("S.K","A.D","T.R","R.R").skip(1).map(e->e.substring(0,2)).sorted().count();
		System.out.println("LENGTH:"+mLENGTH);
	}

}
