package com.training.ref;

import java.util.Arrays;

public class RefDemo {

	public static void main(String[] args) {
		IShow showref=()->{
			return "Good Day";
		};
		System.out.println(showref.print());

		IEmpDetails detailsref=(int amount)->{
			return amount*2;
		};
		System.out.println(detailsref.calcBonus(5));
	
	
	IMetricsChanger metricchanger=(double grams)->{
		return grams/1000;
	};
	System.out.println(metricchanger.convertGmstokgs(200));
	
	IShape shape=(length)->{
		return length*length;
	};
	System.out.println(shape.areaOfSquare(10));
	
	ICourseDetails coursedatails=()-> Arrays.asList("Java","Java Script");
	System.out.println(coursedatails.showCourses());
}
}