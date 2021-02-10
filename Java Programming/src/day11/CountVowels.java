package day11;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="apple";
		String vowel="";
		int count=0;
		
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='a'| ch=='e' | ch=='i' | ch=='o'  |  ch=='u') {
				vowel=vowel+ch;
				count++;
				
				}
		}
		System.out.println("Vowels in the above word are "+vowel);
		System.out.println(count);
		
	}

}
