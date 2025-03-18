package com.Management.SystemUnit;

public class SystemUnit{
	private String systemId;
	private String core;
	private String lcdModel;
	private int ram;
	private int diskSize;

	public SystemUnit(String systemId, String core, String lcModel, int ram, int diskSize){
		this.systemId = systemId;
		this.core = core;
		this.lcdModel = lcdModel;
		this.ram = ram;
		this.diskSize = diskSize;
	}

	public void setSystemId(String systemId){
		this.systemId = systemId;
	}
	public String getSystemId(){
		return systemId;
	}

	public void setCore(String core){
		this.core = core;
	}
	public String getCore(){
		return core;
	}

	public void setLcdModel(String lcdModel){
		this.lcdModel = lcdModel;
	}
	public String getLcdModel(){
		return lcdModel;
	}

	public void setRam(int ram){
		this.ram = ram;
	}
	public int getRam(){
		return ram;
	}

	public void setDiskSize(int diskSize){
		this.diskSize = diskSize;
	}
	public int getDiskSize(){
		return diskSize;
	}

	@Override
	public String toString(){
		return String.format("ID: %s\nCore: %s\nGeneration: %s\nRam: %d\nDisk Size: %d\n", systemId, core, lcdModel, ram, diskSize);
	}
}