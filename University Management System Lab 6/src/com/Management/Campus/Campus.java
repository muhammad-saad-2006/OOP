package com.Management.Campus;
import com.Management.Department.*;

public class Campus {
    	private String campusName;
    	private String directorName;
    	private String campusAddress;
    	private Department[] departmentList;

    	public Campus(String campusName, String directorName, Department[] departmentList) {
        	this.campusName = campusName;
        	this.directorName = directorName;
        	this.departmentList = departmentList;
    	}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Campus Name: ").append(campusName).append("\n");
        sb.append("Campus Director: ").append(directorName).append("\n");
        sb.append("Departments Detials:\n");
        for (Department department : departmentList) {
            sb.append(department).append("\n");
        }
        return sb.toString();
    }
}
