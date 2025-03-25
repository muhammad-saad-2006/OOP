package com.Teacher;
import com.Person.*;

public class Teacher extends Person{
	private String subject;

	public Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}
	public String getSubject(){
		return subject;
	}

	@Override
	public String toString(){
		return super.toString()+ "\n" +"Subject: " + subject;
	}

	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		if(obj.getClass() != this.getClass()){
			return false;
		}
		Teacher other = (Teacher) obj;
		return this.getName().equals(other.getName()) && this.getAge() == (other.getAge()) && this.subject.equals(other.subject);
		
	}
}