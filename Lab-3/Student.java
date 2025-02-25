class Student{
	private static int rollNumber = 1;
	private String id = "FA24-BCS-";
	private String name;
	private double cgpa;
	private String address;
	private String completeRollnumber;

	Student(String name, double cgpa, String address){
		this.name = name;
		this.cgpa = cgpa;
		this.address = address;
		setCompleteRollnumber();
		
	}
	
	public void setCompleteRollnumber(){
		completeRollnumber = String.format("%s%03d",id, rollNumber);
		rollNumber++;
	}
	public String getCompleteRollnumber(){
		return completeRollnumber;
	}

	public String getName(){
		return name;
	}
	
	public double getCgpa(){
		return cgpa;
	}

	public String getAddress(){
		return address;
	}
}
