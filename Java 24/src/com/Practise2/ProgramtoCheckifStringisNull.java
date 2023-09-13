package com.Practise2;

public class ProgramtoCheckifStringisNull {
	 public static boolean isStringNull(String str)
	    {
	  
	       
	        if (str == null)
	            return true;
	        else
	            return false;
	    }
	  
	    public static void main(String[] args)
	    {
	        String str1 = null;
	        String str2 =" Welcome to Vtalent";
	  
	        System.out.println("Is string [" + str1
	                           + "] null? "
	                           + isStringNull(str1));
	        System.out.println("Is string [" + str2
	                           + "] null? "
	                           + isStringNull(str2));
	    }

}
