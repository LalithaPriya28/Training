package assignment3problem1;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1=new Customer(); //creating a default constructor
		customer1.setCustomerName("Lalitha"); //using setter with default constructor object
		Address address=new Address("Kapra","Hyderabad"); // using parameterized constructor
		
		System.out.println(address.getStreetName()); //using getters
		System.out.println(address.getCity());
		System.out.println(customer1.getCustomerName());
		
		address.getAddressDetails(); //calling method
		
		Customer customer2=new Customer("Sindhu",address);
		System.out.println(customer2.getCustomerName());
		//System.out.println(customer2.getAd());
		
		customer2.getCustomerDetails();// calling customer details method
		
		customer2.setCustomerName("Priya");
		System.out.println(customer2.getCustomerName());
		
		

		
		
		
		
		

	}

}
