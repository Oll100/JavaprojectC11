package jokeLists;

import java.util.ArrayList;
import java.util.Random;

public class Stereotypes {
	
	public static void main(String[] args) {
		ArrayList<String> stereotypes = new ArrayList<>(); // Array with the jokes that go under this topic.
		
		stereotypes.add("A Canadian asks his friend: 'Who was that woman I saw you with last night at the bar?'"
				+ " 'My wife', answers the friend.");
		stereotypes.add("What’s the best part about living in Switzerland? Not sure, but the flag is a big plus.");
		stereotypes.add("One thing you'll never hear a Hindu say: 'You only live once!'");
		stereotypes.add("A classic joke from the Faroe Islands: 'A seal walks into a club...'");
		stereotypes.add("I asked my North Korean friend how it was there, he said he couldn't complain.");
		stereotypes.add("6");
		stereotypes.add("7");
		stereotypes.add("8");
		stereotypes.add("9");
		stereotypes.add("10");
		stereotypes.add("11");
		stereotypes.add("12");
		stereotypes.add("13");
		stereotypes.add("14");
		stereotypes.add("15");
		stereotypes.add("16");
		stereotypes.add("17");
		stereotypes.add("18");
		stereotypes.add("19");
		stereotypes.add("20");
		
		Random randomStereotype = new Random();
		System.out.println(stereotypes.get(3));
		
		for (int i = 0; i < 1; i++) {
			System.out.println(stereotypes.get(randomStereotype.nextInt(stereotypes.size()))); // Iterate a random joke from the array list.
			
		}
	
	}
	
	
	

}
