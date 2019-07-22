package co.grandcircus;

import java.util.Scanner;

public class Capstone1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Pig Latin for beginners");
		System.out.println("Enter a word and I will covert it to Pig Latin");
		String input = scan.nextLine();
		
		
		while(input.equalsIgnoreCase("Yes")) {
			
			if (startsWithVowel(input.charAt(0))) {
				input = (input + "way");
				System.out.println(input);
			}
			else if {
				
			}
		}
			
		
		
		
	}
	
	private static boolean startsWithVowel(char charAt) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean startsWithVowel (String word) {
		
		if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' 
				|| word.charAt(0) == 'o' || word.charAt(0) == 'u') { 
			return true;
		}
		return false;
	}
	
	public static int indexOfFirstVowel (String word) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' 
					|| word.charAt(i) == 'o' || word.charAt(i) == 'u') {
			
				return i;
			}
		
		return -1;
		}
		return 0;
	}
	
		public static String firstConsonant (int vowelIndex, String word) {
			
		
			String consonants = word.substring(0,vowelIndex);
		
			return consonants;
		}
		public static String lastLetters (String word, int vowelIndex) {
			String restOfWords = word.substring(vowelIndex, word.length());
			return restOfWords;
			
		}

}