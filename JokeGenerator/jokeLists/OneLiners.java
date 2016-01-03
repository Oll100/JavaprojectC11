package jokeLists;

import java.util.ArrayList;
import java.util.Random;

public class OneLiners {
	
	public static void main(String[] args) {
		ArrayList<String> oneLiners = new ArrayList<>(); // Array with the jokes that go under this topic.
		
		oneLiners.add("I don't think there's intelligent life on other planets. Why should they be any different from this one?");
		oneLiners.add("The comedian's friends laughed at him when he said he wanted to be a comedian. They're not laughing now.");
		oneLiners.add("Real happiness is when you marry someone for love and later find out they have money.");
		oneLiners.add("How can we expect politicians to believe in the wisdom of the people when they know it was the people who voted them in?");
		oneLiners.add("Light travels faster than sound. This is why some people appear bright until you hear them speak.");
		oneLiners.add("Never hit a man with glasses. Hit him with a stick.");
		oneLiners.add("A clear conscience is usually the sign of a bad memory.");
		oneLiners.add("Money talks. I wish mine would stop saying bye.");
		oneLiners.add("To make mistakes is human, to blame them on somebody else shows management potential.");
		oneLiners.add("It’s hard to explain puns to kleptomaniacs because they always take things literally.");
		oneLiners.add("The dyslexic devil worshipper sold his soul to Santa.");
		oneLiners.add("Regular naps prevent old age, especially if you take them while driving.");
		oneLiners.add("I went to the zoo the other day. There was only one dog in it. It was a shitzu.");
		oneLiners.add("No one is completely useless. They can always serve as a bad example.");
		oneLiners.add("My grandfather has the heart of a lion and a lifetime ban at the zoo.");
		oneLiners.add("The soldier who survived mustard gas and pepper spray is now a seasoned veteran.");
		oneLiners.add("You can't lose a homing pigeon - if your homing pigeon doesn't come back, what you've lost is just a pigeon.");
		oneLiners.add("Child's experience: if your mom is laughing at your dad's jokes, they have guests.");
		oneLiners.add("A camel can work 10 days without drinking. I can drink 10 days without working.");
		oneLiners.add("A clean house is the sign of a broken computer.");
		
	
		Random randomOneLiner = new Random();
		System.out.println(oneLiners.get(4));
	
		for (int i = 0; i < 1; i++) {
			System.out.println(oneLiners.get(randomOneLiner.nextInt(oneLiners.size()))); // Iterate a random joke from the array list.
	
		}
	}
		
}
