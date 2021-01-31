package assignment1;

import java.util.Scanner;

public class ColorCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the color you wish to display:");
		Scanner scanner =new Scanner(System.in);
		char c=scanner.next().charAt(0);
				switch(c)
				{
				case 'r':
					System.out.println("Red");
					break;
				case 'b':
					System.out.println("Blue");
					break;
				case 'g':
					System.out.println("Green");
					break;
				case 'o':
					System.out.println("Orange");
					break;
				case 'y':
					System.out.println("Yellow");
					break;
				case 'w':
					System.out.println("White");
					break;
				default:
					System.out.println("Invalid");
				}

	}

}
