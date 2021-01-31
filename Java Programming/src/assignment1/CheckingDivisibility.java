package assignment1;

import java.util.Scanner;

public class CheckingDivisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String temp="";
        for(int i=1;i<=200;i++)
        {
        	if(i%2==0 && i%3==0 && i%5==0)
        	{
        		temp=temp + " " + i;
        	}
        	else {
        		
        		continue;
        	}
        }
        
        System.out.println(temp);
	}

}
