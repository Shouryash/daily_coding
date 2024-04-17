// here we are calculating rate of interst accoring to the condition , finding negative or positive number ,finding even or odd numbers, condition wise finding cubes .

import java.util.Scanner;

public class Nestedswitch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int choice,no,res, age ,numberOfYears,gende;
		double principalAmount, accountBalance=0;
        
		System.out.println("choose any one option \n 1:Even odd\n 2:Find out cube if no is between 10 to 50 \n 3:Check the no is postive or negative \n 4.calculate ROI  ");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		
		switch(choice) 
		{

		case 1:
			//Identifying  even or odd number 	
			System.out.print("Enter Number:");
			no=sc.nextInt();
			if(no==0)
				System.out.println("Not even AND NOT odd");
			else if(no%2==0)
				System.out.println(no+"Number is even");
			else
				System.out.println(no+"Number is odd");
			break;
				
			
		case 2:
			// finding cube 	
			System.out.println("Enter Number:");
			no=sc.nextInt();
			if(no>=10 && no<=50) 
			{
			
				res=no*no*no;
				System.out.println("cube is "+res);
			}
			else
				System.out.println("Number is not between 10 to 50");
			break;
				
			
		case 3:
			// Identifying Positive or Negative Numbers	
			System.out.println("Enter Number :");
			no=sc.nextInt();
			if(no==0)
				System.out.println("Not positive not negative");
			else if(no<0)
				System.out.println("Number is Positive");
			else
				System.out.println("Number is Negative");
			break;

				
		case 4:
				
		     	System.out.print("Enter the principal amount: ");
		     	principalAmount = sc.nextDouble();
		     
		    	System.out.print("Enter the number of years: ");
		     	numberOfYears = sc.nextInt();
	
		    	// Set interest rate based on age
		    	System.out.print("Enter your age:");
		     	age=sc.nextInt();
		     
			System.out.print("Enter your gender 1.Male\n2.female");
		        gender=sc.nextInt();
				
		      	// if age is equals or grater than 60 we calculate befor and after Account balance with 7 percentage intres for male
		    	if (age>=60) {
			 if(gender==1)
			 {
			     accountBalance = principalAmount * Math.pow((1 + (7/100)), numberOfYears);
			     System.out.println("Account balance after " + numberOfYears + " years: " + accountBalance);
			 }
			// if age is equals or less than 50 we calculate befor and after Account balance with 7.5 percentage intrest for female	 
			 else 
			 {
			     accountBalance = principalAmount * Math.pow((1 + (7.5/100)), numberOfYears);
			     System.out.println("Account balance after " + numberOfYears + " years: " + accountBalance);
			 }
		    	 // if age is equals or less than 50 we calculate befor and after Account balance with 5 percentage intrest for both male or  female	 
		    	 else if(age <= 50)
		    	  {
			   accountBalance = principalAmount * Math.pow((1 + (5/100)), numberOfYears);
	
		     	  }
			// if age in betwwen 51 to 59 those (malw or female)are not Eligalable 
			 else
		    	 {
			  System.out.print("You are not Eligalable for ROI");
			 }
		     	 break;

		default:
			System.out.println("You choose wrong Option");
		}
		
		

	}

}
