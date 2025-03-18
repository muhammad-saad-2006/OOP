package com.Management.Lab;
import com.Management.SystemUnit.*;
import com.Management.Employe.*;

public class Lab {
    	private String labName;
    	private Employe labStaff;
    	private int numOfPcs;
    	private SystemUnit pcList[];
    	private boolean hasMultiMedia;

    	public Lab(String labName, Employe labStaff, int numOfPcs, SystemUnit pcList[], boolean hasMultiMedia) {
        	this.labName = labName;
        	this.labStaff = labStaff;
        	this.numOfPcs = numOfPcs;
        	this.pcList = pcList;
        	this.hasMultiMedia = hasMultiMedia;
    	}

    	public void setLabName(String labName) {
        	this.labName = labName;
    	}

    	public String getLabName() {
        	return labName;
    	}

    	public void setLabStaff(Employe labStaff) {
        	this.labStaff = labStaff;
    	}

    	public Employe getLabStaff() {
        	return labStaff;
    	}

    	public void setNumOfPcs(int numOfPcs) {
        	this.numOfPcs = numOfPcs;
    	}

    	public int getNumOfPcs() {
        	return numOfPcs;
    	}

    	public void setPcList(SystemUnit pcList[]) {
        	this.pcList = pcList;
    	}

    	public SystemUnit[] getPcList() {
        	return pcList;
    	}

    	public void setHasMultiMedia(boolean hasMultiMedia) {
        	this.hasMultiMedia = hasMultiMedia;
    	}

    	public boolean getHasMultiMedia() {
        	return hasMultiMedia;
    	}

	@Override
    	public String toString() {
        	StringBuilder sb = new StringBuilder();
        	sb.append("Lab Name: ").append(labName).append("\n");
        	sb.append("Lab Staff: ").append(labStaff).append("\n");
        	sb.append("Number of PCs: ").append(numOfPcs).append("\n");
		//sb.append("PC has MultiMedia: ").append(hasMultiMedia).append("\n");
        	sb.append("Details of PCs in this Lab: ").append("\n");
        	for (SystemUnit pc : pcList) {
            		sb.append(pc).append("\n");
        	}
        	return sb.toString();
    	}
}
