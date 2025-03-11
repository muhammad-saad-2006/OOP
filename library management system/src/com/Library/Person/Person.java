package com.Library.Person;
import com.Library.Address.*;

public class Person{
	private String name;
	private Address address;
	
	public Person(String name, Address address){
		this.name = name;
		this.address = new Address(address);
	}
	
	public Person(Person other){
		this.name = other.name;
		this.address = new Address(other.address);
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return this.name.equals(other.name) && this.address.equals(other.address);
	}

	public String toString() {
    		return "Name: " + name + "\n" +
           		"Address: " + address.toString();
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}