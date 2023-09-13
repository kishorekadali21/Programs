package com.Practise2;

public class ProgramtoCheckIftheStringisEmpty {
	public static void main(String[] args)
    {
        String str1 = "GeeksforGeeks";
        String str2 = "";
        boolean res1=false;
        boolean res2=false;
        if(str1.length()==0){
            res1=true;
        }
        if(str2.length()==0){
            res2=true;
        }
        System.out.println("Is string \"" + str1+ "\" empty? "+ res1);
        System.out.println("Is string \"" + str2+ "\" empty? "+ res2);
    }

}
