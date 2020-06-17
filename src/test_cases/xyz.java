package com.vibha.amazontest;

public class xyz {
	 
	public static  void main (String[]args) {
		
		checking("Unamed", 1 );
		
	}
	
	
     public static void checking(String Name ,int age) {
        	String status;
        	
    	if(age < 20 && age > 12){
        		
        		status=" a Teenager";	
        	}
        	else if(age <=12 && age >=11){
	    	   status ="a Preteen";
	       }
        	else if(age < 11 && age >= 5) {
        		
        		status ="a Big fat kid";
        	}
        	else if(age >20) {
        		status="an Adult but still young at heart!!";
        	
        	}
        		
        	else{
        		status ="Baby";
        	}
	     
	       System.out.println("My name is " + Name + " and I am " + age + " years old ");
	       System.out.println("I am  "+ status  );
     }     

}
