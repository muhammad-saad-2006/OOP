package com.Library.Staff;
import com.Library.Person.*;

public class Staff{
	private String role;
	private Person person;
	
	public Staff(String role, Person person){
		this.role = role;
		this.person = new Person(person);
	}

	public Staff(Staff other){
		this.role = other.role;
		this.person = new Person(other.person);
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;

		Staff other = (Staff) obj;
		return this.role.equals(other.role) && this.person.equals(other.person);
	}

	public void setRole(String role){
		this.role = role;
	}
	public String getRole(){
		return role;
	}
	
	public String toString(){
    		return person.toString() + "\n" + "Role: " + role;
	}
}