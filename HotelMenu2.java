import java.util.Scanner;

public class HotelMenu2 
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
	do {
		switch(Select) 
		{
		case 1:
			System.out.println("SOLAPUR-SPICIAL");
			System.out.println("Select Items ");
			System.out.println("1.Select Items ");
			System.out.println("2.Cut Bhajji \t\t\t Rs 20");
			System.out.println("3.Dall Chawal \t\t\t Rs 30");
			System.out.println("4.Bhakr with bhaji \t\t Rs 50");
			System.out.println("5.Sangam vada \t\t\t Rs 30 ");
			Select2=sc.nextInt();
			
			// Switch case to handle the selection of items from the Solapur Special menu
			switch(Select2) {
			    case 1:
			        // If the user selects option 1, add Cut Bhajji to the order
			        System.out.println("Your order is Cut Bhajji ");
			        Price += 20; // Add the price of Cut Bhajji to the total
			        order += "\n Cut Bhajji"; // Append Cut Bhajji to the order summary
			        break;
			        
			    case 2:
			        // If the user selects option 2, add Dall Chawal to the order
			        System.out.println("Your order is Dall Chawal  ");
			        Price += 30; // Add the price of Dall Chawal to the total
			        order += "\n Dall Chawal"; // Append Dall Chawal to the order summary
			        break;
			        
			    case 3:
			        // If the user selects option 3, add Kadak Bhakar with Wangyachi bhajii to the order
			        System.out.println("Your order is Kadak Bhakar with Wangyachi bhajii ");
			        Price += 50; // Add the price of Kadak Bhakar with Wangyachi bhajii to the total
			        order += "\n Kadak Bhakar with Wangyachi bhajii"; // Append Kadak Bhakar with Wangyachi bhajii to the order summary
			        break;
			        
			    case 4:
			        // If the user selects option 4, add Sangam vada to the order
			        System.out.println("Your order is Sangam vada ");
			        Price += 30; // Add the price of Sangam vada to the total
			        order += "\n Sangam vada"; // Append Sangam vada to the order summary
			        break;
			    
			    // Add additional cases for other menu items if necessary
			}

		    break;
		    
		case 2:
			System.out.println("PUNE-SPICIAL_");
			System.out.println("Selcet Items ");
			System.out.println("1. Puneri missal \t\t Rs 150");
			System.out.println("2. Kandha Pohe     \t\t Rs 20");
			System.out.println("3. Bhakre Waddi \t\t Rs 40");
			System.out.println("4.Puneri Upmaa \t\t\t Rs 30 ");
			Select2=sc.nextInt();
			// Switch case to handle the selection of items from the Pune Special menu
			switch(Select2) {
			    case 1:
			        // If the user selects option 1, add Puneri Missal to the order
			        System.out.println("Your order is Puneri Missal");
			        Price += 150; // Add the price of Puneri Missal to the total
			        order += "\n Puneri Missal"; // Append Puneri Missal to the order summary
			        break;
			        
			    case 2:
			        // If the user selects option 2, add Kandha Pohe to the order
			        System.out.println("Your order is Kandha Pohe");
			        Price += 20; // Add the price of Kandha Pohe to the total
			        order += "\n Kandha Pohe"; // Append Kandha Pohe to the order summary
			        break;
			        
			    case 3:
			        // If the user selects option 3, add Bhakre Waddi to the order
			        System.out.println("Your order is Bhakre Waddi");
			        Price += 40; // Add the price of Bhakre Waddi to the total
			        order += "\n Bhakre Waddi"; // Append Bhakre Waddi to the order summary
			        break;
			        
			    case 4:
			        // If the user selects option 4, add Poneri Upmaa to the order
			        System.out.println("Your order is Poneri Upmaa");
			        Price += 30; // Add the price of Poneri Upmaa to the total
			        order += "\n Poneri Upmaa"; // Append Poneri Upmaa to the order summary
			        break;
			}
			
			break;

			
		case 3:
			System.out.println("_KOLHAPUR-SPECIAL_");
			System.out.println("Select Items ");
			System.out.println("1. Kolhapuri Garva \t\t\t  Rs 50");
			System.out.println("2. Matan Thali \t\t\t\t  Rs 350");
			System.out.println("3. Kolhapuri Dam Biryani\t\t  Rs 200");
			System.out.println("4. Kolhapuri Halwa \t\t\t  Rs 100");
			Select2=sc.nextInt();
			
			switch(Select2) {
		    case 1:
		        // If Select2 is 1, print Kohlapuri Garva and update the price and order
		        System.out.println("Your order is Kohlapuri Garva");
		        Price += 50; // Add 50 to the total price
		        order += "\n Kohlapuri Garva"; // Append Kohlapuri Garva to the order string
		        break;

		    case 2:
		        // If Select2 is 2, print Matan Thali and update the price and order
		        System.out.println("Your order is Matan Thali");
		        Price += 350; // Add 350 to the total price
		        order += "\n Matan Thali"; // Append Matan Thali to the order string
		        break;

		    case 3:
		        // If Select2 is 3, print Kolhapuri Damm Biryani and update the price and order
		        System.out.println("Your order is Kolhapuri Damm Biryani");
		        Price += 200; // Add 200 to the total price
		        order += "\n Kolhapuri Damm Biryani"; // Append Kolhapuri Damm Biryani to the order string
		        break;

		    case 4:
		        // If Select2 is 4, print Kolhapuri Halwa and update the price and order
		        System.out.println("Your order is Kolhapuri Halwa");
		        Price += 100; // Add 100 to the total price
		        order += "\n Kolhapuri Halwa"; // Append Kolhapuri Halwa to the order string
		        break;
		}
		break;	

			
		case 4:
			System.out.println("_SOUTH-BHARAT-SPECIAL_");
			System.out.println("Select Items");
			System.out.println("1. Mendu Vada\t\t\t  Rs 40");
			System.out.println("2. Masala Dosa \t\t\t  Rs 50 ");
			System.out.println("3. Masala Bhat with chatani \t  Rs 50 ");
			System.out.println("4. Ragi Muddi \t\t\t  Rs 100 ");
			Select2=sc.nextInt();
			
			switch(Select2) {
		    case 1:
		        // Case 1: The customer orders Mendu Vada
		        System.out.println("Your order is Mendu Vada");
		        Price += 40; // The price of Mendu Vada is added to the total
		        order += "\n Mendu Vada"; // Mendu Vada is added to the order details
		        break; // Breaks out of the switch statement

		    case 2:
		        // Case 2: The customer orders Masala Dosa
		        System.out.println("Your order is Masala Dosa");
		        Price += 50; // The price of Masala Dosa is added to the total
		        order += "\n Masala Dosa"; // Masala Dosa is added to the order details
		        break; // Breaks out of the switch statement

		    case 3:
		        // Case 3: The customer orders Masala Bhat With Chatani
		        System.out.println("Your order is Masala Bhat With Chatani");
		        Price += 50; // The price of Masala Bhat With Chatani is added to the total
		        order += "\n Masala Bhat With Chatani"; // Masala Bhat With Chatani is added to the order details
		        break; // Breaks out of the switch statement

		    case 4:
		        // Case 4: The customer orders Regi Muddi
		        System.out.println("Your order is Regi Muddi");
		        Price += 100; // The price of Regi Muddi is added to the total
		        order += "\n Regi Muddi"; // Regi Muddi is added to the order details
		        break; // Breaks out of the switch statement
		}

		break;
		default :
			System.out.println("_ITEM IS NOT PRESENT");
			break;
		}
	
	    System.out.println("Do you want to add more items from the same menu? (y/n): ");
	    ans = sc.next().charAt(0);
		} while (ans == 'y' || ans == 'Y'); // Continue if the user answers 'y'
	
		// Ask the user if they want to go back to the main menu
		System.out.println("Do you want to select from the main menu? (y/n): ");
		ans = sc.next().charAt(0);
		} while (ans == 'y' || ans == 'Y'); // Continue if the user answers 'y'
		
			// Display the final order and total price
			System.out.println("Your order is: " + order);
			System.out.println("Total Price: " + Price);
		
		
	}
}