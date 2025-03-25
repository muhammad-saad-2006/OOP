package com.ClassRoom;

import com.Teacher.Teacher;
import com.Student.Student;

public class ClassRoom{
    	private String className;
   	private String classCode;
    	private Teacher teacher;
    	private Student[] students;
    	private int studentCount;

    	public ClassRoom(String className, String classCode, Teacher teacher, Student[] students){
        	this.className = className;
        	this.classCode = classCode;
        	this.teacher = teacher;
        	this.students = new Student[5];
        	this.studentCount = students.length; 

        	for (int i = 0; i < students.length; i++){
            		this.students[i] = students[i];
        	}
    	}

    	public void addStudent(Student student){
        	if (studentCount < students.length){
            		students[studentCount++] = student;
        	} 
		else{
            		System.out.println("Classroom is full. Cannot add more students.");
        	}
    	}

    	@Override
    	public String toString(){
        	StringBuilder sb = new StringBuilder();
		sb.append("===== Class Room Details =====\n");
        	sb.append("Class Name: ").append(className).append("\n");
		sb.append("Class Code: ").append(classCode).append("\n");
        	sb.append("Teacher: \n").append(teacher.toString()).append("\n");
        	sb.append("\n===== Students Details =====\n");
        	for (int i = 0; i < studentCount; i++){
            		if (students[i] != null){
                		sb.append(students[i].toString()).append("\n");
            		}
        	}
        return sb.toString();
    }
}
