package com.lab1;

import java.security.SecureRandom;


public class CredentialService {
	
	Employee e1 = new Employee("harshit","choudary");
	String first_name=e1.getFirstName();
	String last_name=e1.getLastName();
	
	
	
	public String generateEmailAddress(String f1,String l1,String d1){
		return (f1+l1+"@"+d1+".abc.com");
		
	}
	    
	public  String generateRandomPassword(int length){
		
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_=+-/.?<>";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        
 
        for (int i = 0; i < length; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
		  
	   }
		
	
	
	

	void showCredentials(String f1,String l1,String d1){
		int len=8;
		System.out.println("Dear Harshit your generated credentials are as follows");
		System.out.println("Email   ------> "+generateEmailAddress(f1,l1,d1));
		System.out.println("Password------> "+generateRandomPassword(len));
	}

}
