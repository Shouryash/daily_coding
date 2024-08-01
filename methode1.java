public class methode1{
	public static void main(String args[]){
	callingNames("Arjun");
	fullName("Arjun","Tanaji","Waghmode");
	String name=fullName1("Arjun","Tanaji","Waghmode");
	System.out.println(name);
}
public static void callingNames(String name){
	System.out.println("Hello"+name);
}
//for multipal callingNames
public static void fullName(String fristName, String middalName, String lastName){
	System.out.println("Hello"+" "+fristName+" "+middalName+" "+lastName);
}
//return type string
public static String fullName1(String fristName1, String middalName1, String lastName1){
	return "Hello"+" "+fristName1+" "+middalName1+" "+lastName1;
}
}

