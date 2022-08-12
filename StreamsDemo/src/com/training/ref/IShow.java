package com.training.ref;
import java.util.List;
public interface IShow {
	String print();   ///return  a welcome message

}
interface IEmpDetails{
	double calcBonus(int amount);   // return amount multiplied by 2
}

interface IStudentDetails{
	int calTotal(int m1,int m2,int m3); //return sum
}

interface NameChecker{
	String checkName(String name);    //if name start with j return welcome else sorry
}

interface IMetricsChanger{
	double convertGmstokgs(double grams);
}

interface IShape{
	double areaOfSquare(double length);
	}

interface ICourseDetails{
	List<String> showCourses();
}