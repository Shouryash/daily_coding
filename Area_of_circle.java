import java.util.Scanner;
public class Area_of_circle {
	public static void main(String args[]) {
		
		double PI=3.14;
		double areaOfCircle;
		double radius;
		double circumference;
		Scanner Sc=new Scanner(System.in);
				
		System.out.print("Enter the Radius:-");
		radius=Sc.nextDouble();
		
		areaOfCircle= PI * radius * radius;
		circumference= 2 * PI * radius;
		
		System.out.println("Area Of Circle is: " +areaOfCircle);
		
		System.out.println("circumference of circle  is : " +areaOfCircle);
			}
	
}
