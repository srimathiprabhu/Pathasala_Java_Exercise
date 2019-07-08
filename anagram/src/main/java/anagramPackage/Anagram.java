package anagramPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
	
	String inputString;
	Map<Character, Integer> characterCount = new HashMap<Character, Integer>();
	
	public Anagram(String input) {
		inputString = input;
	}
	
	public List<String> match(List<String> anagramList){
		List<String> result = new ArrayList<>(); //Array containing the list of anagrams - resultant
		Map<Character, Integer> individualCharCount = new HashMap<Character, Integer>(); // To store the character count of each string in the given list
		characterCount = getCharacterCountForGivenString(inputString.toLowerCase()); //Holds the character count for the given Input string
		int count = 0;
		for(String anagramWord : anagramList) {
			count = 0;
			if(anagramWord.length() == inputString.length() && !anagramWord.equalsIgnoreCase(inputString)) {
				individualCharCount = getCharacterCountForGivenString(anagramWord.toLowerCase());
			}
			else {
				continue;//Skip if the word is longer than the input or the word is same as the given input string
			}
			for(int i=0; i<anagramWord.length(); i++) {
				if(individualCharCount.get(anagramWord.toLowerCase().charAt(i)) == characterCount.get(anagramWord.toLowerCase().charAt(i))) {
					count++;
				}
			}
			if(count == anagramWord.length())
				result.add(anagramWord);
			individualCharCount.clear();
		}
		characterCount.clear();
		return result;
	}

	/**
	 * Method to compute individual character count for the given string
	 * */
	public Map<Character, Integer> getCharacterCountForGivenString(String inputWord){
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		int count = 0;
		for(int i=0; i< inputWord.length(); i++) {
			if(charCount.containsKey(inputWord.charAt(i))){
				count = charCount.get(inputWord.charAt(i));
				count ++;
				charCount.put(inputWord.charAt(i), count);
			}
			else {
				charCount.put(inputWord.charAt(i), 1);
			}
		}
		System.out.println(charCount);
		return charCount;
	}
}
