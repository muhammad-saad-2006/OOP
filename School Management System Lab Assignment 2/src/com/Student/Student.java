package com.Student;
import com.Person.*;

public class Student extends Person{
	private String rollNum;

	public Student(String name, int age, String rollNum){
		super(name, age);
		this.rollNum = rollNum;
	}

	public void setRollNum(String rollNum){
		this.rollNum = rollNum;
	}
	public String getRollNum(){
		return rollNum;
	}

	@Override
	public String toString(){
		return super.toString()+ "\n" + "Roll Number: " + rollNum;
	}

	public  boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj.getClass() != this.getClass()){
			return false;
		}
		Student other = (Student) obj;
		return this.getName().equals(other.getName()) && this.getAge() == other.getAge() && this.rollNum.equals(other.rollNum);
	}
}