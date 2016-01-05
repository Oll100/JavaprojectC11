package jokeLists;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Stereotypes {
	
	public static void main(String[] args) {
		ArrayList<String> stereotypes = new ArrayList<>(); // Array with the jokes that go under this topic.
		
		stereotypes.add("A Canadian asks his friend: 'Who was that woman I saw you with last night at the bar?'"
				+ " 'My wife', answers the friend.");
		stereotypes.add("What’s the best part about living in Switzerland? Not sure, but the flag is a big plus.");
		stereotypes.add("One thing you'll never hear a Hindu say: 'You only live once!'");
		stereotypes.add("A classic joke from the Faroe Islands: 'A seal walks into a club...'");
		stereotypes.add("I asked my North Korean friend how it was to live there. He said he couldn't complain.");
		stereotypes.add("What happens if you cross a black man and an octopus? I don't know, but it can sure as hell pick cotton.");
		stereotypes.add("It's easy to make copper wire, you just give one penny to two Jews.");
		stereotypes.add("Heaven is where the cooks are French, the mechanics are British, the teachers are Finnish, the military is American, the lovers are Italian and everything is organized by the Germans. "
				+ "Hell is where the cooks are Finnish, the mechanics are French, the teachers are American, the military is German, the lovers are British, and everything is organized by the Italians.");
		stereotypes.add("There was a fire in a Swedish cemetary. Rescue workers have already found hundreds dead and fear the numbers may keep climbing as the digging continues.");
		stereotypes.add("How can you tell if the Finn you're talking to is an extrovert? He's looking at your shoes instead of his.");
		stereotypes.add("What do you call an Italian with no hands? A mute.");
		stereotypes.add("How do you stop an Albanian tank? You shoot the guy pushing it.");
		stereotypes.add("Polish border guard to a German tourist: 'Occupation?' 'No, just visiting.'");
		stereotypes.add("Why did the French give the Statue of Liberty to the US? She only had one of her arms raised.");
		stereotypes.add("What do you call a Welshman with 300 wives? A shepherd.");
		stereotypes.add("Why does the Pope always kiss the ground after a flight? Anyone who has already traveled with an Italian plane will understand.");
		stereotypes.add("A Scotsman took his girlfriend out to the movies with a taxi. She was so beautiful that he could hardly keep his eye on the meter.");
		stereotypes.add("How does an exchange of opinions work in the Russian parliament? You come to the meeting with your own opinion and leave with Putin's.");
		stereotypes.add("How to spot a thrill-seeking Englishman: He eats his After Eight mints at half past seven.");
		stereotypes.add("How to spot if an American's watching his weight: He orders a diet coke with his giant cheeseburger and fries.");
		
		Random randomStereotype = new Random();
		
		JOptionPane.showMessageDialog(null, stereotypes.get(randomStereotype.nextInt(stereotypes.size())), // Pop up box with a random joke.
		"Stereotype",    JOptionPane.PLAIN_MESSAGE); 
		
		for (int i = 0; i < 1; i++) {
			System.out.println(stereotypes.get(randomStereotype.nextInt(stereotypes.size()))); // Iterate a random joke from the array list.
			
		}
	
	}
	
	
	

}
