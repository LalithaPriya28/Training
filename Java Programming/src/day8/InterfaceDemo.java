package day8;

interface Banks {
	void rateOfInterest();
	

}
interface Entertainment extends Banks{
	void travel();
	void movieVoucher();
	
}
 class Icici implements Banks,Entertainment
 {

	@Override
	public void rateOfInterest() {
		System.out.println("The roi is 5%");
		
	}

	@Override
	public void travel() {
		System.out.println("Book Now to get 50% Discount");
	}
	@Override
	public void movieVoucher() {
		
		System.out.println("Book Now to get 60% Discount");
	}
		
	}
 public class InterfaceDemo {

		public static void main(String[] args) {
			Icici ic =new Icici();
			ic.rateOfInterest();
			ic.travel();
			ic.movieVoucher();
			
			
		}

	
		}