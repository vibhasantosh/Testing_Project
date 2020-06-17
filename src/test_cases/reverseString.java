package com.vibha.amazontest;

public class reverseString {

	public static void main (String[] args) {
		
		
		
		String Name =  reversesentence("My name is Isha!!");
		
	System.out.println(Name);
		
} 

	
	public static String reversesentence(String any){
		 String reverse ="";
		 
		 while (any.isEmpty()|| any== null)
			 System.out.println("Empty and null string are not acceptable.");
		 if   (any.length()<=1) {
			 reverse= any;
		 }
		else {
			String[] arraysentence = any.split("\\s");
			
			for (String Namelist:arraysentence) {
			      reverse=Namelist + " " + reverse;// My+"" name+My is+nameMY Vibha+isnameMy
             
             }
			 
					}
		
		 return reverse.trim();
		
	}
	
	
}
