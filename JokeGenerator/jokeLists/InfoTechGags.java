package jokeLists;

import java.util.ArrayList;
import java.util.Random;

public class InfoTechGags {
	
	public static void main(String[] args) {
		
		ArrayList<String> itGags = new ArrayList<>(); // Array with the jokes that go under this topic.
		
		itGags.add("Windows 95/98, (n): 32 bit extension and a  graphical shell for a 16 bit patch to an 8 bit operating system"
				+ " originally coded for a 4 bit microprossessor, written by a 2 bit company that can't stand 1 bit of competition.");
		itGags.add("Linux is an user friendly operating system. It's simply highly selective who it is friends with.");
		itGags.add("3");
		itGags.add("4");
		itGags.add("5");
		itGags.add("6");
		itGags.add("7");
		itGags.add("8");
		itGags.add("9");
		itGags.add("10");
		itGags.add("11");
		itGags.add("12");
		itGags.add("13");
		itGags.add("14");
		itGags.add("15");
		itGags.add("16");
		itGags.add("17");
		itGags.add("18");
		itGags.add("19");
		itGags.add("20");
		
		
		Random randomItGag = new Random();
		System.out.println(itGags.get(0));
		
		for (int i = 0; i < 1; i++) {
			System.out.println(itGags.get(randomItGag.nextInt(itGags.size()))); // Iterate a random joke from the array list.
		
		}
	}

}
