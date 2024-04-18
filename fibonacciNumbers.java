//Write a program to display fibonaccion series from 0 to 78 
public class fibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Number1=0;
		int Number2=78;
		int res=1;
		
		while(Number1<=Number2) 
		{
			res=Number1+res;
			System.out.println(Number1);
			
			Number1=res;
			res++;
			
			
			
		}
		

	}

}
