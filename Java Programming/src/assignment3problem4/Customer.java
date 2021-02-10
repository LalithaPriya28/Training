package assignment3problem4;



public class Customer {
	public String customerName;
	Address ad;
	OfficialAddress od;
	public Customer() {
		super();
	}

public Customer(String customerName, Address ad, OfficialAddress od) {
		super();
		this.customerName = customerName;
		this.ad = ad;
		this.od = od;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}

	
	public OfficialAddress getOd() {
		return od;
	}

	public void setOd(OfficialAddress od) {
		this.od = od;
	}

	public void getCustomerDetails() {
		System.out.println("Customer:"+" "+customerName);
		System.out.println("Residential Address: "+ad.getStreetName()+" "
		+ad.getCity());
		System.out.println("Official Address: "+od.getStreetName1()+" "+od.getCity1());
		
		
		
	}
	
	
}
