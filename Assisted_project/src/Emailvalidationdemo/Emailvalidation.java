package Emailvalidationdemo;

	import java.util.regex.*;    
	import java.util.*;    
	public class Emailvalidation{  
	    public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("rishuku190@gmail.com");  
	        emails.add("rishu@domain.com");  
	        emails.add("rishR#@domain.co.in");  
	        emails.add("avi2000point@gmail.com");  
	        emails.add("rIshu@190gmail.com");  
	        //Add invalid emails in list  
	        emails.add("@yahoo.com");  
	        emails.add("12javaTpoint#domain.com");  
	        //Regular Expression   
	        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex);  
	        //Iterate emails array list  
	        for(String email : emails){  
	            //Create instance of matcher   
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  
	}  