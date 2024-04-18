//Write a program to accept min and max value from the user and display the even no between the range

import java.util.Scanner;

public class Finding_Even_No_between {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



        int Min ,Max,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Min No");
		Min=sc.nextInt();
		System.out.println("Enter Max No");
		Max=sc.nextInt();
		
		while(Min<=Max)
		{
			if(Min%2==0)
			{
			  System.out.println("Even Number is "+Min);
			
			}
			  
			
		Min++;
			
			
			
			
			
		}
		

	}

}
