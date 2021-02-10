package assignment3problem3;

public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCard tc=new TravelCard();
		System.out.println("The reward points you earned are "+tc.getRewardPoints(200));
		System.out.println("Congratulations,you have successfully recharged with "+tc.rechrgeCard(20000));
		System.out.println(tc.swipeCard(20));
		System.out.println(tc.travelSwipe(10));
		
		tc.setCardNo(1523547484);
		tc.setSwipeLimit(25000);
	
		System.out.println("Your Card Number is "+tc.getCardNo());
		System.out.println("Your Daily Swipe limit is "+tc.getSwipeLimit());
	}

}
