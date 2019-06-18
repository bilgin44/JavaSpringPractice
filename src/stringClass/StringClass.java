package stringClass;

import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub

		System.out.println("Muhammed Seyfullah Bilgin ");
		
//		Scanner user=new Scanner (System.in);
//		
//		
//		String  n1,n2;
//		
//		System.out.println("Put two Name");
//		n1=user.next();
//		n2=user.next();
//	     
//		System.out.println("is it same>:"+n1.equalsIgnoreCase(n2));
//		
//		int count1=n1.length();
//		int count2=n2.length();
//		
//		if (count1>count2)
//			System.out.println(n1.charAt(1));
//		else
//			System.out.println(n2.charAt(2));
//		System.out.println( (count1>count2)? n1.charAt(1): n2.charAt(2));
		
		
		  // s1.contains("something")  ---> check for part of string inside another string
	    // s1.indexOf("s")  ---> this will give you position of certain part of the string
	    
	    
	   
 
	    String s1 = "Zuhkra" ; 
	    boolean uExistsOrNot = s1.contains("u")  ; 
	    
	    System.out.println(  "does name contains u : " +   s1.contains("u")     );		
	    System.out.println("What is the position of u:"+ s1.indexOf("u"));
		
	    String partOfString = s1.substring(1, 4) ; 
	    System.out.println(  partOfString);
		

 		
	    String name="muhammed";
		System.out.println(name.substring(4));
		System.out.println(name.substring(1,2));
		System.out.println(name.substring(3));	
		
		
		String name2="Dilara";
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
