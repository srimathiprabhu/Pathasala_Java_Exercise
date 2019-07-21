import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {
    public boolean check(String sentence) {
    	sentence = removeAllSpacesAndSpecialCharacters(sentence.toUpperCase());
    	StringBuilder stringBuilder = new StringBuilder(sentence);
        return sentence.equals(stringBuilder.reverse().toString());
    }
    
    public String removeAllSpacesAndSpecialCharacters(String inputSentence) {
    	Pattern pattern = Pattern.compile("[^A-Z0-9]");
    	Matcher matchPatternsMatcher = pattern.matcher(inputSentence.toUpperCase());
    	while(matchPatternsMatcher.find()) {
    		inputSentence = inputSentence.replaceAll("\\"+matchPatternsMatcher.group(), "");
    	}
    	return inputSentence;
    }
}
