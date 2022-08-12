package com.training.sample;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterStream {

	public static void main(String[] args) {
		// Create List
//		List<String> courses=Arrays.asList("Html","Css","Java","Java Script","JSon","Angular")
//		.stream()
//		.filter(str->str.length()>3)
//		.sorted()
//		.skip(3)
//		.collect(Collectors.toList());
//		System.out.println(courses);
//		
         
		Arrays.asList("Java","Java Script","CSS","Json","Angular")
		.forEach(courseName->System.out.println(courseName.toUpperCase()));
		
		Arrays.asList("Java","Java Script","CSS","Json","Angular")
		.forEach(System.out::println);
		
		Stream.generate(()->"Priya").limit(5).forEach(str->System.out.println(str.toUpperCase()));
		
		
	}

}
