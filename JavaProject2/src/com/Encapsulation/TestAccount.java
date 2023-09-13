package com.Encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.setAcc_no(123456789);
		acc.setName("Kishore");
		acc.setEmail("kishore@gmail");
		acc.setAmount(100000f);
		
		System.out.println(acc.getacc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
	}

}
