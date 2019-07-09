import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Acronym {
	
	String inputString;

    Acronym(String phrase) {
    	inputString = phrase;
    }

    String get() {
    	inputString = inputString.toUpperCase();
    	Pattern pattern = Pattern.compile("[^A-Z']");
    	Matcher matchPatternsMatcher = pattern.matcher(inputString);
    	while(matchPatternsMatcher.find()) {
    		inputString = inputString.replaceAll("\\"+matchPatternsMatcher.group(), " ");
    	}
    	String[] individualWord = inputString.split(" ");
    	StringBuilder acronym = new StringBuilder();
    	for(String word: individualWord) {
    		if(!word.isEmpty() && word.charAt(0)>='A' && word.charAt(0)<='Z')
    			acronym.append(word.charAt(0));
    	}
    	return acronym.toString();
    }
    
    public static void main(String args[]) {
    	System.out.println(new Acronym("Complementary metal-oxide semiconductor").get());
    	System.out.println(new Acronym("Halley's Comet").get());
    	System.out.println(new Acronym("Something - I made up from thin air").get());
    }

}
