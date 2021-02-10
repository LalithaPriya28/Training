package assignment3problem3;

public class TravelCard extends PrepaidCard {
 double rewardPoints=0;
 int temp;
	
	
	public double getRewardPoints(double amount) {
		temp=(int) (amount/100);
		for(int i=1;i<=temp;i++)
		{
			rewardPoints+=5;
		}
		if(temp==0) {
			rewardPoints=0;
		}
		return rewardPoints;
	}
	
	public double travelSwipe(double amount) {
		if(amount<swipeLimit && amount<availableBalance) {
			amount*=70;
			double processCharge=(5/100)*amount;
			amount=amount-processCharge;
			this.availableBalance=this.availableBalance-amount;
		}
		/*else {
			System.out.println("SWIPE LIMIT EXCEEDED");
		}*/
		return availableBalance;
		
	}



	@Override
	boolean swipeCard(int amount) {
		// TODO Auto-generated method stub
		return true;
	}
	

}
