package jokeLists;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Political {
	
	public static void main(String[] args) {
		ArrayList<String> political = new ArrayList<>(); // Array with the jokes that go under this topic.
		
		political.add("A liberal can understand everything besides people who don’t understand them.");
		political.add("Politicians and diapers have at least one thing in common - they should be changed regularly. For the same reasons.");
		political.add("What is communism? According to Eastern Europe, it's the longest and most painful of the roads to capitalism.");
		political.add("War is God's way of teaching Americans geography.");
		political.add("McDonald's introduced a new campaign - The Obama Value. You order a meal and the guy behind you has to pay for it.");
		political.add("Bureaucracy explained: You have two cows.  The government takes them both, shoots one, milks the other, pays you for the milk, then pours the milk down the drain.");
		political.add("The word 'politics' is derived from the Greek word 'poly', meaning 'many', and the English word 'ticks', meaning 'blood sucking parasites'.");
		political.add("A politician is a person who will lay down your life for his country.");
		political.add("How do you spot a lying politician? His lips are moving.");
		political.add("Bill Clinton was a fantastic president. He was always hard at work.");
		political.add("Politics - the art of looking for trouble, finding it whether it exists or not, diagnosing it incorrectly, and applying the wrong remedy.");
		political.add("It was so cold this morning that politicians were actually seen with their hands in their own pockets.");
		political.add("Artificial hearts are nothing new.  Politicians have had them for years.");
		political.add("If there's one thing the Parliament excels at, it's overreacting and doing nothing.");
		political.add("Democracy is the fine art of running the circus from the monkey cage.");
		political.add("In politics, two wrongs are only the beginning.");
		political.add("If you believe nobody in the government cares about you, you're wrong. Just try not paying your taxes.");
		political.add("A politician's opinion of you is directly correlated to whether or not you have money");
		
		
		Random randomPolitical = new Random();
		
		JOptionPane.showMessageDialog(null, political.get(randomPolitical.nextInt(political.size())), // Pop up box with a random joke.
		"Political Joke",    JOptionPane.PLAIN_MESSAGE); 
		
		for (int i = 0; i < 1; i++) {
			System.out.println(political.get(randomPolitical.nextInt(political.size()))); // Iterate a random joke from the array list.
		
		}
	}
}
