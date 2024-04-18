//Write a program to accept a no from the user and find out the factorial

import java.util.Scanner;

public class Finding_factors {

	public static void  main(String args[]) 
	
	{
		int Num,factorial=1 ;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		Num=sc.nextInt();
	
		
        for (int i = 1; i <= Num; i++) 
        {
        	factorial*=i;
        }
        System.out.println("The factorial of " + Num + " is " + factorial);
        
	}
}






