package day11;

public class WordAndLetterCount {

	public static void main(String[] args) {
	
		int count=0;
		int wordCount=0;
		
		String str =  " Hello i live in Bangalore"; 
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch==' ')
			{
				wordCount++;
				
			}
			else {
				count++;
			}
			
		}
		System.out.println("The number of letters in the sentence are: "+count);
		System.out.println("No of words : " + wordCount); 



	}

}
