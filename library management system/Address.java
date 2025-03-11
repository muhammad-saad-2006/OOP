public class Address{
	private String street;
	private String city;

	public Address(String street, String city){
		this.street = street;
		this.city = city;
	}

	public Address(Address other){
		this.street = other.street;
		this.city = other.city;
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;	
		
		Address other = (Address) obj;
		return  this.street.equals(other.street) && this.city.equals(other.city);
	}

	public String toString(){
		return street + ", " + city ;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	public String getStreet(){
		return street;
	}

	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;
	}
}