package com.ObjectExample2;

public class Driver {
	void print(Player p1) {
		System.out.println(p1.id+"--"+p1.name+"--"+p1.age);
	}
	public static void main(String[] args) {
		Driver d = new Driver();
		Player p2 = new Player();
		d.print(p2);
	}

}
