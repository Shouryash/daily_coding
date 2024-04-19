import java.util.Scanner;

public class Hotel_meneu_order 
{

	public static void main(String[] args) 
	{
		
		
		int Select,Select2,Price=0;
		char ans;
		String order="";
		Scanner sc=new Scanner(System.in );
		
	
		
	do {
	
			
			System.out.println("Select Menu::");
			System.out.println("1.Solapur Special");
			System.out.println("2.Pune Special ");
			System.out.println("3.Kolhapur Special");
			System.out.println("4.South Bharat Special");
			Select=sc.nextInt();
	
		switch(Select) 
		{
		case 1:
			System.out.println("_____SOLAPUR-SPICIAL_____");
			System.out.println("Select Items ");
			System.out.println("1.Select Items ");
			System.out.println("2.Cut Bhajji \t\t\t Rs 20");
			System.out.println("3.Dall Chawal \t\t\t Rs 30");
			System.out.println("4.Bhakr with bhaji \t\t Rs 50");
			System.out.println("5.Sangam vada \t\t\t Rs 30 ");
			Select2=sc.nextInt();
			
			switch(Select2) 
			{
			case 1:
				System.out.println("Your order is  Cut Bhajji ");
				Price+=20;
				order="\n Cut Bhajji";
				break;
				
			case 2:
				System.out.println("Your order is  Dall Chawal  ");
				Price+=30;
				order+="\n   Dall Chawal";
				break;
				
			case 3:
				System.out.println("Your order is Kadak Bhakar with Wangyachi bhajii ");
				Price+=50;
				order+="\n Kadak Bhakar with Wangyachi bhajii";
				break;
				
			case 4:
				System.out.println("Your order is Sangam vada ");
				Price+=30;
				order+="\n  Sangam vada";
				break;
			
			}
		    break;
		    
		case 2:
			System.out.println("_____PUNE-SPICIAL____");
			System.out.println("Selcet Items ");
			System.out.println("1. Puneri missal \t\t Rs 150");
			System.out.println("2. Kandha Pohe     \t\t Rs 20");
			System.out.println("3. Bhakre Waddi \t\t Rs 40");
			System.out.println("4.Puneri Upmaa \t\t\t Rs 30 ");
			Select2=sc.nextInt();
			switch(Select2)
			{
			case 1:
				
				System.out.println("Your order is Puneri Missal");
				Price+=150;
				order+="\n Puneri Missal";
				break;
				
			case 2:
				System.out.println("your order is Kandha Pohe");
				Price+=20;
				order+="\n Kandha Pohe";
				break;
				
			case 3:
				System.out.println("Your order is Bhakre Waddi");
				Price+=40;
				order+="\n Your order is Sangam vada";
				break;
				
			case 4:
				System.out.println("Your order is Poneri Upmaa");
				Price+=30;
				order+="\n Poneri Upmaa";
				break;
			}
			break;
			
		case 3:
			System.out.println("____KOLHAPUR-SPECIAL______");
			System.out.println("Select Items ");
			System.out.println("1. Kolhapuri Garva \t\t\t  Rs 50");
			System.out.println("2. Matan Thali \t\t\t\t  Rs 350");
			System.out.println("3. Kolhapuri Dam Biryani\t\t  Rs 200");
			System.out.println("4. Kolhapuri Halwa \t\t\t  Rs 100");
			Select2=sc.nextInt();
			
			switch(Select2)
			{
			case 1:
				
				System.out.println("Your order is Kohlapuri Garva  ");
				Price+=50;
				order+="\n Kohlapuri Garva ";
				break;
				
			case 2:
				System.out.println("your order is Matan Thali ");
				Price+=350;
				order+="\n Matan Thali";
				break;
				
			case 3:
				System.out.println("Your order is Kolhapuri Damm Biryani");
				Price+=200;
				order+="\n  Kolhapuri Damm Biryan";
				break;
				
			case 4:
				System.out.println("Your order is  Kolhapuri Halwa");
				Price+=100;
				order+="\n Kolhapuri Halwa";
				break;
			}
			break;
			
		case 4:
			System.out.println("______SOUTH-BHARAT-SPECIAL______");
			System.out.println("Select Items");
			System.out.println("1. Mendu Vada\t\t\t  Rs 40");
			System.out.println("2. Masala Dosa \t\t\t  Rs 50 ");
			System.out.println("3. Masala Bhat with chatani \t  Rs 50 ");
			System.out.println("4. Ragi Muddi \t\t\t  Rs 100 ");
			Select2=sc.nextInt();
			
			switch(Select2)
			{
			case 1:
				
				System.out.println("Your order is Mendu Vada  ");
				Price+=40;
				order+="\n  Mendu Vada";
				break;
				
			case 2:
				System.out.println("your order is Masala Dosa ");
				Price+=50;
				order+="\n  Masala Dosa";
				break;
				
			case 3:
				System.out.println("Your order is Masala Bhat With Chatani");
				Price+=50;
				order+="\n  Masala Bhat With Chatani";
				break;
				
			case 4:
				System.out.println("Your order is  Regi  Muddi ");
				Price+=100;
				order+="\n   Regi  Muddi";
				break;
			}
		break;
		default :
			System.out.println("____ITEM IS NOT PRESENT_____");
			break;
		}
		System.out.println("Do you want to add any other Items YES/NO");
		ans=sc.next().charAt(0);
			
  
	}
		while(ans=='Y'||ans=='y');
		System.out.println("Thanks for coming :) \nVisit Again");
		System.out.println("Your Orders:\n"+order);
		System.out.println("Your total Bill amount is : "+Price);
		System.out.println("Pay by Gpay or CASH");
	}
}
