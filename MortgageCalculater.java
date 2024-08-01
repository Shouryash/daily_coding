import java.util.Scanner;
import java.text.NumberFormat;
// Here numberFormat use 
public class MortgageCalculater{
	public static void main(String args[]){
		int principalAmmount=0,numbersofPayment=0;
		final byte month=12;
		final byte persent=100;
		float monthlyIntrest=0;
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
			float annualRate=sc.nextFloat();
			if(annualRate>=1 && annualRate<=30){
				monthlyIntrest=annualRate/persent/month;
				break;
		}
			System.out.println("Enter the principalAmmount in this range 1 to 30 PERSENTAGE");
		System.out.println();
		}
		while(true){
			System.out.println("Please Enter year of period ");
			byte years=sc.nextByte();
			if(years>=1 && years<=30){
				numbersofPayment=years*month;
				break;
		}
			System.out.println("Enter the years in this range 1 to 30 ");
		System.out.println();
		}
		double mortage=
        principalAmmount*(monthlyIntrest*Math.pow(1 + monthlyIntrest, numbersofPayment))
        /(Math.pow(1+ monthlyIntrest, numbersofPayment)-1);

        // mortage means a argument and pow means power 

        String mortageFormatted= NumberFormat.getCurrencyInstance().format(mortage);
        System.out.print("Mortage "+ mortageFormatted);
        // numberformat.getcurrencyInstance used for $ sign or currency name
		
	}
}