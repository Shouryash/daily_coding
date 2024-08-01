public class ForEachloop{
public static void main(String args[]){
	String[] fruits={"apple","Banana","mango"};
	//frisat for loop for simpal or contrast for loop 
	for(int i=0;i<fruits.length;i++)
		System.out.println(fruits[i]);
	
	// this for loop is for each loop  colan is used  
	//in this for loop in this for loop indexing not alowd and its always go to forward ---->
	for(String fruts:fruits)
		System.out.println(fruts);
	}
}