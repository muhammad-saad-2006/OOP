public class Incharge{
	private String designation;
	private Person person;
	
	public Incharge(String designation, Person person){
		this.designation = designation;
		this.person = new Person(person);
	}
	public Incharge(Incharge other){
		this.designation = other.designation;
		this.person = new Person(other.person);
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;

		Incharge other = (Incharge) obj;
		return this.designation.equals(other.designation) && this.person.equals(other.person);
	}

	public String toString(){
    		return person.toString() + "\n" + "Designation: " + designation + "\n";
	}
		
	public void setDesignation(String designation){
		this.designation = designation;	
	}
	public String getDesignation(){
		return designation;
	}
	
}