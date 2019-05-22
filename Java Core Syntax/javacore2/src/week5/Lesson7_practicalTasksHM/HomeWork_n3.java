package week5.Lesson7_practicalTasksHM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HomeWork_n3 {

	public static void main(String[] args) {
		
		List <Student> studentsList = new ArrayList<>();
		studentsList.add(new Student("Yura", 1));
		studentsList.add(new Student("Vova", 1));
		studentsList.add(new Student("Taras", 2));
		studentsList.add(new Student("Andrew", 3));
		studentsList.add(new Student("Orest", 4));
		System.out.println("Sorting students by name using Collections.sort and Comparable interface");
		Collections.sort(studentsList);
		
		for (Student student : studentsList) {
			System.out.println(student);
		}
		
		
		
		System.out.println();
		System.out.println("Sort student by courseNumber in descending order using Comparator interface ");
		studentsList.sort(new SortByCourseComparator());
		
		for (Student student : studentsList) {
			System.out.println(student);
		}
		System.out.println();
		System.out.println("Sort student by name in descending order by Anonymous inner class Comparator");
		//Anonymous inner comparator sorting by Name in descending order
		studentsList.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o2.getName().compareTo(o1.getName());
			}
		});
		for (Student student : studentsList) {
			System.out.println(student);
		}
		
		// testing printStudent method
		System.out.println("Write down a number of the group you want to know what students are learning there");
		Scanner sc = new Scanner(System.in);
		Integer integ = sc.nextInt();
		
		Student studentTest = new Student();
		
		studentTest.printStudents(studentsList, integ);
		
	}
	
}
