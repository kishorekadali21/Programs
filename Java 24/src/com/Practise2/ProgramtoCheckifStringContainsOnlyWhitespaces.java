package com.Practise2;

public class ProgramtoCheckifStringContainsOnlyWhitespaces {
	public static boolean isStringAllWhiteSpace(String str) {
		 if (str.trim().isEmpty())
	            return true;
	        else
	            return false;
	    }
	 public static void main(String[] args)
	    {
	        String str1 = "Welcome To Vtalent";
	        String str2 = "              ";
	  
	        System.out.println("Is string [" + str1
	                           + "] only whitespaces? "
	                           + isStringAllWhiteSpace(str1));
	        System.out.println("Is string [" + str2
	                           + "] only whitespaces? "
	                           + isStringAllWhiteSpace(str2));
	}

}
