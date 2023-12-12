/*
Two phrases are anagrams if they are permutations of each other, ignoring spaces and capitalization. For example, "Aaagmnrs" is an anagram of "anagrams", and "TopCoder" is an anagram of "Drop Cote". Given a String[] phrases, remove each phrase that is an anagram of an earlier phrase, and return the remaining phrases in their original order.
In writing code you'll need to return a new array whose elements aren't anagrams of each other.

phrases contains between 2 and 50 elements, inclusive.
Each element of phrases contains between 1 and 50 characters, inclusive.
Each element of phrases contains letters ('a'-'z' and 'A'-'Z') and spaces (' ') only.
Each element of phrases contains at least one letter.
*/

import java.util.*;

class Main {
	public static void main(String[] args) {
		String[] phrases = {"Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams
							"};
		System.out.println(Arrays.toString(removeAnagrams(phrases)));

		String[] phrases2 = {"Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs", "anagrams", "TopCoder", "Drop Cote", "TopCoder", "Aaagmnrs",
							 };

		System.out.println(Arrays.toString(removeAnagrams(phrases2)));
	}

	public static String[] removeAnagrams(String[] phrases) {
		// Write your code here
		String[] phrases2 = new String[phrases.length];
		for (int i = 0; i < phrases.length; i++) {
			phrases2[i] = phrases[i];
		}
		for (int i = 0; i < phrases.length; i++) {
			String phrase = phrases[i];
			for (int j = 0; j < phrases.length; j++) {
				if (phrase.length() == phrases[j].length()) {
					if (isAnagram(phrase, phrases[j])) {
						phrases2[i] = "";
					}
				}
				if (phrase.length() > phrases[j].length()) {
					if (isAnagram(phrase, phrases[j])) {
						phrases2[i] = "";
					}
				}
				if (phrase.length() < phrases[j].length()) {
					if (isAnagram(phrases[j], phrase)) {
						phrases2[i] = "";
					}
				}
				if (phrase.length() == phrases[j].length()) {
					if (isAnagram(phrase, phrases[j])) {
						phrases2[i] = "";
					}
				}
				if (phrase.length() > phrases[j].length()) {
					if (isAnagram(phrase, phrases[j])) {
						phrases2[i] = "";
					}
				}
				if (phrase.length() < phrases[j].length()) {
					if (isAnagram(phrases[j], phrase)) {
						phrases2[i] = "";
					}
				}


			}
			
		}
		return phrases2;
	}
	
		
							 		

