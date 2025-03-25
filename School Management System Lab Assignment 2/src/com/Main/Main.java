package com.Main;

import com.School.School;
import com.ClassRoom.ClassRoom;
import com.Principal.Principal;
import com.Teacher.Teacher;
import com.Student.Student;

public class Main{
    	public static void main(String[] args){

        	Principal p1 = new Principal("Sir Yamin", 50, 20);

        	Teacher t1 = new Teacher("Sir Imtiaz", 30, "Chemistry");
        	Teacher t2 = new Teacher("Sir Mudassar", 32, "Islamic Studies");

        	Student s1 = new Student("Muhammad Saad", 19, "FA24-001");
        	Student s2 = new Student("Muhammad Awaim", 21, "FA24-002");
        	Student s3 = new Student("Abdullah Saleem", 19, "FA24-003");
        	Student s4 = new Student("Muhammad Adeel Azhar", 20, "FA24-004");
        	Student s5 = new Student("Muhammad Ali", 18, "FA24-005");

        	Student[] studentGroup1 = {s1, s2, s3};
        	Student[] studentGroup2 = {s4, s5};

        	School school = new School("APS", "Chunian Cantt", p1);

        	ClassRoom c1 = new ClassRoom("Grade 12", "T-1", t1, studentGroup1);
        	ClassRoom c2 = new ClassRoom("Grade 11", "D-1", t2, studentGroup2);

        	school.addClassRoom(c1);
        	school.addClassRoom(c2);

        	System.out.println(school);
    	}
}
