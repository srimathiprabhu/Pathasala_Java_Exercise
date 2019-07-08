package anagramPackage;

import java.util.Arrays;

public class TestClass {
	
	public static void main(String[] args) {
		Anagram anagram = new Anagram("allergy");
		System.out.println(anagram.match(Arrays.asList("gallery", "ballerina",
                "regally", "clergy",
                "largely", "leading")));
	}

}
