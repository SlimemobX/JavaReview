package com.syntax.class07;

public class Forest {
	
	public static void main(String[] args) {
		
		Bear b1 = new Bear();
		b1.name = "Yogi";
		b1.age++;
		Bear.count++;
		
		Bear b2 = new Bear();
		b2.name = "Pooh";
		b2.age++;
		Bear.count++;
		
		Bear b3 = new Bear();
		b3.name = "Baba";
		b3.age++;
		Bear.count++;
		
		
		Wolf w1 = new Wolf();
		w1.name = "Fenrir";
		Wolf.count++;
		
		Wolf w2 = new Wolf();
		w2.name = "Cerberus";
		Wolf.count++;
		
		Wolf w3 = new Wolf();
		w3.name = "Bolt";
		Wolf.count++;
		
		
		System.out.println("In the forest:");
		System.out.println("There are " + Bear.count + " bears");
		System.out.println("There are " + Wolf.count + " wolves");
		
		System.out.println(b3.name + " is " + b3.age + " years old");
		
		
	}
}
