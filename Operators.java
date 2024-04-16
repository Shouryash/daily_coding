// using all types of operator we develop this code using if else stetment



import java.util.Scanner;


public class Operators {
    public static void main(String args[]){
    int choice ,num1,num2,res;
    
    Scanner sc=new Scanner(System.in);
   
    System.out.print("Select option any one option :- \n 1:Arithmentic Operator \n 2:Assignment \n 3:Conditnal  \n 4:Bitwise \n 5:Logical. \n 6:Ternary Operator");
    choice=sc.nextInt();

    if (choice==1) 
    {
        System.out.print("Enter frist number:");
        num1=sc.nextInt();

        System.out.print("Enter second number :");
        num2=sc.nextInt();
        
        res=num1+num2;
        System.out.println("Addition is "+res);
        
        res=num1-num2;
        System.out.println("subtraction  is "+res);
        
        res=num1*num2;
        System.out.println("Multiplaction is "+res);
        
        res=num1/num2;
        System.out.println("Diviision  is "+res);
        
        res=num1%num2;
        System.out.println("reminder  is "+res);
        
        System.out.println("");
        
        
        System.out.println("All Arithmetic Operators  'Symbols' are used  ");

        
    }
    
    else if(choice==2) 
    {
    	  System.out.print("Enter frist number:");
          num1=sc.nextInt();

          System.out.print("Enter second number:");
          num2=sc.nextInt();
          
          res=num1+=num2;   //num1=num1+num2   
          System.out.println("Assignment Addtion  is "+res);
          
          res=num1=num1-num2;   // num1 =num1-num2
          System.out.println("Assignment subtraction  is "+res);
          
          res=num1*=num2;
          System.out.println("Assignment Multiplaction is "+res);
          
          res=num1/=num2;
          System.out.println("Assignment Diviision  is "+res);
          
          res=num1%=num2;
          System.out.println("Assignment reminder  is "+res);
          
          System.out.println("");
          
          
          System.out.println("All  Assignment Operators  'Symbols' are used  ");

    	
    	
    }
    else if(choice==3)
    {
    	System.out.print("Enter frist number:");
        num1=sc.nextInt();

        System.out.print("Enter second number:");
        num2=sc.nextInt();
        
         if (num1 > num2) 
             System.out.println("num1 is ggrater than num2");

         else if (num1 < num2) 
        	System.out.println("num2 is grater than num1");
         else if (num1 >= num2 && num1==num2) 
          	System.out.println("num2 is less  than or  equals to num1");
         else if (num1 == num2 && num1<=num2) 
          	System.out.println("num2 is Grater than or equals to  num1");
         
         else
        	 System.out.println("None");
         
         System.out.println("Conditnal  symbols are end ");
         
   
    }
    
    else if(choice==4)
    	
    {
    	System.out.print("Enter frist number:");
        num1=sc.nextInt();

        System.out.print("Enter second number:");
        num2=sc.nextInt();
        
        res=num1 & num2;
        System.out.println("Bitwise AND  is "+res);
        
        res=num1 | num2;
        System.out.println("Bitwise or  is "+res);
        
        res=num1 ^ num2;
        System.out.println("Bitwise EX-or  is "+res);
        
        
        res=num1 >> num2;
        System.out.println("Bitwise leftshift  is "+res);
        
        res=num1 << num2;
        System.out.println("Bitwise right shift   is "+res);
        
        System.out.println("");
        
        System.out.println("Bitwise symbols are end ");
        
        
    	
    	
    }

    else if(choice==5)
    {
    	System.out.print("Enter frist number:");
        num1=sc.nextInt();

        System.out.print("Enter second number:");
        num2=sc.nextInt();
        
    	if(num1>num2  && num1 == num2)
    		System.out.println("dek lo bhai both condition shi hai  ");
    	else if(!(num1>num2))  // inside bracket   First solve and come to second bracket if condition is true in first bracket  second bracket condition reverse the answer means it give as false
    		System.out.println();
    	else
    		System.out.println("iska matlab sabje dya both condition galt hai  ");
    	
    	
    	
    	
    	
    }
    
    else if(choice==6)
  
    {
    	
        
    	System.out.print("Enter frist number:");
        num1=sc.nextInt();

        System.out.print("Enter second number:");
        num2=sc.nextInt();
        
    	res=(num1>num2)?num1:num2;
    	System.out.println(num1+" is grater or Not "+res);
    	
    	
    }
    
    else
    	System.out.println("choose correct option ");
    }

 // in this hole code lots  of Bugs are present 

    
}
