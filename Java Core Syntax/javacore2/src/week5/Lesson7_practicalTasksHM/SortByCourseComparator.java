package week5.Lesson7_practicalTasksHM;

import java.util.Comparator;

public class SortByCourseComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getCourseN()-o1.getCourseN();
	}

	

}
