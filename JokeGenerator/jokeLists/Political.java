package jokeLists;

import java.util.ArrayList;
import java.util.Random;

public class Political {
	
	public static void main(String[] args) {
		ArrayList<String> political = new ArrayList<>(); // Array with the jokes that go under this topic.
		
		political.add("A liberal can understand everything besides people who don’t understand them.");
		political.add("2");
		political.add("3");
		political.add("4");
		political.add("5");
		political.add("6");
		political.add("7");
		political.add("8");
		political.add("9");
		political.add("10");
		political.add("11");
		political.add("12");
		political.add("13");
		political.add("14");
		political.add("15");
		political.add("16");
		political.add("17");
		political.add("18");
		political.add("19");
		political.add("20");
		
		
		Random randomPolitical = new Random();
		
		for (int i = 0; i < 1; i++) {
			System.out.println(political.get(randomPolitical.nextInt(political.size()))); // Iterate a random joke from the array list.
		
		}
	}
}
