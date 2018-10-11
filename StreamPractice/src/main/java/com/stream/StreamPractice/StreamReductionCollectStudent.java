package com.stream.StreamPractice;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamReductionCollectStudent {

	public static void main(String[] args)
	{
		ArrayList<Student>stuList=new ArrayList<>();
		stuList.add(new Student("Swagata",22));
		stuList.add(new Student("Ashwini",23));
		stuList.add(new Student("Abhrak",22));
		stuList.add(new Student("Sanu",23));
		List<String> st=stuList.stream().map(Student::getName).collect(Collectors.toList());
		System.out.println("converting stream to collection");
		st.forEach(System.out::println);
		
		
		
		
		System.out.println("-------------------------");
		System.out.println("converting stream to string ");
		String st1=stuList.stream().map(Student::getName).collect(Collectors.joining(",..,.."));
		System.out.println(st1);
		
		
		
		System.out.println("-------------------------");
		System.out.println("Average of age" );
		Double averageAge=stuList.stream().collect(Collectors.averagingInt(Student::getAge));
		System.out.println(averageAge);
		
		
		
		System.out.println("-------------------------");
		System.out.println("Sum of age" );
		Integer sumAge=stuList.stream().collect(Collectors.summingInt(Student::getAge));
		System.out.println(sumAge);
		
		System.out.println("-------------------------");
		System.out.println("Statistics of age" );
		IntSummaryStatistics summary=
				stuList.stream().collect(Collectors.summarizingInt(Student::getAge));
		System.out.println(summary);
		
		
		System.out.println("-------------------------");
		System.out.println("Group By age" );
		Map<Integer, List<Student>> map=
				stuList.stream().collect(Collectors.groupingBy(Student::getAge));
		System.out.println(map);
		
		
		
		System.out.println("-------------------------");
		System.out.println("Partition By age" );
		Map<Boolean, List<Student>> map1=stuList.stream().collect(Collectors.partitioningBy(p->p.getAge()>22));
		map1.forEach((k,v)->{
		System.out.println(k);
		System.out.println(v);
		});
		
		
		
	}

}
