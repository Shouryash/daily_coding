import java.util.Scanner;
public class Passwordchecking{
public static void main(String aargs[]){
	String password,storedPassword="",renterPassword;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Password");
	password=sc.nextLine();
	storedPassword+=password;
	System.out.println("re-Enter Your  password");
	renterPassword=sc.nextLine();
	while(!renterPassword.equals(storedPassword)){
		System.out.println("enter Correct PassWord");
		renterPassword=sc.nextLine();
	}
		
}

}