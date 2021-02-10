package day11;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="priya";
		String firstLetter=name.substring(0, 1).toUpperCase();
		String remainingLetters=name.substring(1);
		System.out.println(firstLetter);
		System.out.println(remainingLetters);
		System.out.println(firstLetter.concat(remainingLetters));
		
	}

}
