//Write a program to accept a no from the user and check it is prime no or not
import java.util.Scanner;

public class CheckingPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Number;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Nnumber");
		 Number=sc.nextInt();
		 
		 if(Number==0)
			 System.out.println(Number+" "+" is Neither Prime nor Composite");
			 
		 else if(Number>0)
			 System.out.println(Number+" "+"is prime Number ");
		

		 else
			 System.out.println(Number+" "+"is N0t a Prime Number");
	}

}
