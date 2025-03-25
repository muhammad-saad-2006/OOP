package com.School;

import com.ClassRoom.ClassRoom;
import com.Principal.Principal;

public class School{
    	private String name;
    	private String address;
    	private Principal principal;
    	private ClassRoom[] classRooms;
	private int classCount = 0;

    	public School(String name, String address, Principal principal){
        	this.name = name;
        	this.address = address;
        	this.principal = principal;
        	this.classRooms = new ClassRoom[5];
    	}

    	public void addClassRoom(ClassRoom classRoom){
        	if (classCount < classRooms.length){
            		classRooms[classCount++] = classRoom;
        	} 
		else{
            		System.out.println("Sorry, cannot add more classes.");
        	}
    	}

    	@Override
    	public String toString(){
        	StringBuilder sb = new StringBuilder();
        	sb.append("\n===== School Details =====\n");
        	sb.append("School Name: ").append(name).append("\n");
        	sb.append("School Address: ").append(address).append("\n");    
        	sb.append("Principal: \n").append(principal.toString()).append("\n");
        	for (int i = 0; i < classCount; i++){
            		sb.append(classRooms[i].toString()).append("\n");
        	}
        	return sb.toString();
    	}
}
