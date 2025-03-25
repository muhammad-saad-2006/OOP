package com.Principal;
import com.Person.*;

public class Principal extends Person{
    	private int experience;

    	public Principal(String name, int age, int experience){
        	super(name, age);
        	this.experience = experience;
    	}

    	public void setExperience(int experience){
        	this.experience = experience;
    	}

    	public int getExperience(){
        	return experience;
    	}

    	@Override
    	public String toString(){
        	return super.toString() + "\n" +"Experience: " + experience + " years" + "\n";
    	}
	
	public  boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj.getClass() != this.getClass()){
			return false;
		}
		Principal other = (Principal) obj;
		return this.getName().equals(other.getName()) && this.getAge() == other.getAge() && this.experience == (other.experience);
	}
}
