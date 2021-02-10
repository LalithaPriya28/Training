package assignment3problem4;
	
	public class Address {
	
	
	private String streetName;
	private String city;
	
	public Address() {
		super();
	}
	public Address(String streetName, String city) {
		super();
		this.streetName = streetName;
		this.city = city;
	}
	public String getStreetName() {
		return streetName;
	}
	public String getCity() {
		return city;
	}
	public void getAddressDetails() {
		System.out.println(streetName +" "+ city);
		
	}


}
