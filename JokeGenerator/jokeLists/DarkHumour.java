package jokeLists;

import java.util.ArrayList;
import java.util.Random;

public class DarkHumour {
	
	public static void main(String[] args) {
		
		ArrayList<String> darkHumour = new ArrayList<>();  // Array with the jokes that go under this topic.
		
		darkHumour.add("Build a man a fire, and he'll be warm for a day. Set a man on fire, and he’ll be warm for the rest of his life.");
		darkHumour.add("I'm not worried about the Third World War. That's the Third World's Problem.");
		darkHumour.add("The difference between Hitler and the Boston Bomber is that only one of them managed to finish a race.");
		darkHumour.add("Jokes about women's bodily functions are not funny. Period.");
		darkHumour.add("My friend gave me his Epi-Pen as he was dying. It seemed very important to him that I have it.");
		darkHumour.add("What do you get when you cross Queen Elizabeth and Prince Charles? A car crash.");
		darkHumour.add("What's black on top and white in the bottom? An audition for the Cosby Show.");
		darkHumour.add("8");
		darkHumour.add("9");
		darkHumour.add("10");
		darkHumour.add("11");
		darkHumour.add("12");
		darkHumour.add("13");
		darkHumour.add("14");
		darkHumour.add("15");
		darkHumour.add("16");
		darkHumour.add("17");
		darkHumour.add("18");
		darkHumour.add("19");
		darkHumour.add("20");
		
		Random randomDH = new Random();
		
		for (int i = 0; i < 1; i++) {
			System.out.println(darkHumour.get(randomDH.nextInt(darkHumour.size())));  // Iterate a random joke from the array list.
		
		}
	}
}
