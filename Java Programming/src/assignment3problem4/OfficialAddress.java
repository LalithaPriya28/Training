package assignment3problem4;

public class OfficialAddress {
	
	private String streetName1;
	private String city1;
	
	public OfficialAddress() {
		super();
	}
	public OfficialAddress(String streetName1, String city1) {
		super();
		this.streetName1 = streetName1;
		this.city1 = city1;
	}
	public String getStreetName1() {
		return streetName1;
	}
	public String getCity1() {
		return city1;
	}
	public void getAddressDetails1() {
		System.out.println(streetName1 +" "+ city1);
		
	}

}
