package jokeLists;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

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
		darkHumour.add("An advertisement for a new German microwave oven: 'It seats ten!'");
		darkHumour.add("It’s a shame that Barrack Obama had to give a speech behind bullet proof glass. Just because he’s black doesn’t mean he’s going to shoot anybody!");
		darkHumour.add("How does a policeman know he's going to have to shoot someone that day? His horoscope says that he's going to meet a tall, dark stranger.");
		darkHumour.add("Yesterday I accidentally hit a little kid with my car. It wasn’t serious — nobody saw me.");
		darkHumour.add("It's sad that a family can be torn apart by something as simple as wild dogs. ");
		darkHumour.add("If four out of five people have suffer from diarrhea, does that mean there's one person who enjoys it?");
		darkHumour.add("I don't trust joggers. They're always the ones that find the bodies.");
		darkHumour.add("People who are afraid of Pedophiles should grow up.");
		darkHumour.add("Father's day. The most confusing day in the ghetto.");
		darkHumour.add("What's the difference between an upset woman and a terrorist? You can reason with the terrorist.");
		darkHumour.add("I know a couple who get on like a house on fire. They both feel trapped and are slowly suffocating to death.");
		
		Random randomDH = new Random();
		
		JOptionPane.showMessageDialog(null, darkHumour.get(randomDH.nextInt(darkHumour.size())), // Pop up box with a random joke.
		"Dark Humour",    JOptionPane.PLAIN_MESSAGE); 
		
		for (int i = 0; i < 1; i++) {
			System.out.println(darkHumour.get(randomDH.nextInt(darkHumour.size())));  // Iterate a random joke from the array list.
		
		}
	}
}
