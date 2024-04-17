import java.util.Scanner;

public class Nestedswitch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int choice,no,res;
		System.out.println("choose any one option \n 1:Even odd\n 2:Find out cube if no is between 10 to 50 \n 3:Check the no is postive or negative ");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		
		switch(choice) 
		{

		case 1:
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
			System.out.println("Enter Number :");
			no=sc.nextInt();
			if(no==0)
				System.out.println("Not positive not negative");
			else if(no<0)
				System.out.println("Number is Positive");
			else
				System.out.println("Number is Negative");
			
		default:
			System.out.println("You choose wrong Option");
		}
		
		

	}

}
