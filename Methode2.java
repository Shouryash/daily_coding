import java.util.Scanner;
import java.text.NumberFormat;
// Here numberFormat use 
public class Methode2{
	public static void main(String args[]){
		int principalAmmount=0;
		byte years=0;
		float annualRate=0;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Please Enter Principal Ammount ");
			principalAmmount=sc.nextInt();
			if(principalAmmount>=1000 && principalAmmount<=1_000_000)
				break;
			else
				System.out.println("Enter the principalAmmount in this range 1k to 1Million");
		System.out.println();
		}
		while(true){
			System.out.println("Please Enter Annual Intrest");
			annualRate=sc.nextFloat();
			if(annualRate>=1 && annualRate<=30)
				break;
			System.out.println("Enter the principalAmmount in this range 1 to 30 PERSENTAGE");
		System.out.println();
		}
		while(true){
			System.out.println("Please Enter year of period ");
			years=sc.nextByte();
			if(years>=1 && years<=30)
				break;
			System.out.println("Enter the years in this range 1 to 30 ");
		System.out.println();
		} 
		double mortage=mortagecalculater(principalAmmount,years,annualRate);
        String mortageFormatted= NumberFormat.getCurrencyInstance().format(mortage);
        System.out.print("Mortage "+ mortageFormatted);
        // numberformat.getcurrencyInstance used for $ sign or currency name
	}
	public static double mortagecalculater(int principalAmmount,float annualRate,float annualRate2){
		final byte month=12;
		final byte persent=100;
		short numbersofPayment=(short)(annualRate2*month);
		float monthlyIntrest=annualRate/persent/month;
		double mortage=
        principalAmmount*(monthlyIntrest*Math.pow(1 + monthlyIntrest, numbersofPayment))
        /(Math.pow(1+ monthlyIntrest, numbersofPayment)-1);
		return mortage;
	}
}