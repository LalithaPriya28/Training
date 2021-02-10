package assignment3problem4;

public class TestCustomer {

		public static void main(String[] args) {
			
			
			Address address2=new Address("Kapra","Hyderabad"); // using parameterized constructor
			
			//System.out.println(address2.getStreetName()); //using getters
			//System.out.println(address2.getCity());
			
			OfficialAddress o=new OfficialAddress("1st Main HSR Layout","Bangalore");
			//System.out.println(o.getStreetName1());
			//System.out.println(o.getCity1());
			
			
			Customer customer5=new Customer("Sindhu",address2,o);
			//System.out.println(customer5.getCustomerName());
			
			customer5.getCustomerDetails();// calling customer details method
			
			
			
			

			
			
			
			
			

		}
}
