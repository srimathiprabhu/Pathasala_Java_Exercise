package piglatin;


public class PigLatinTranslator {
	
	
	public String translate(String inputString) {
		
		StringBuilder translatedWordString = new StringBuilder();
		String[] individualWordStrings = inputString.split(" ");
		for(int index=0; index<individualWordStrings.length; index++) {
			if(!checkIfGivenStringStrartWithVowel(individualWordStrings[index])) {
				if(individualWordStrings[index].length()>3 && individualWordStrings[index].substring(0, 3).contains("qu")) {
					String subString = individualWordStrings[index].substring(0, individualWordStrings[index].indexOf('u')+1);
					translatedWordString.append(individualWordStrings[index].substring(subString.indexOf('u')+1));
					translatedWordString.append(subString);
				}
				else {
					String consonantLiteraString = getConsonantLiteralsForGivenString(individualWordStrings[index]);
					translatedWordString.append(individualWordStrings[index].substring(consonantLiteraString.length()));
					translatedWordString.append(consonantLiteraString);
				}
			} else {
				translatedWordString.append(individualWordStrings[index]);
			}
			translatedWordString.append("ay");
			if(index < individualWordStrings.length-1)
				translatedWordString.append(" ");
		}
		return translatedWordString.toString();
	}
	
	public boolean checkIfGivenStringStrartWithVowel(String inputString) {
		
		boolean isWordStartsWithVowel = false;
		
		if(inputString.startsWith("a")|| inputString.startsWith("e") || inputString.startsWith("i") || inputString.startsWith("o") || inputString.startsWith("u")
				|| inputString.startsWith("xr") || inputString.startsWith("yt")) {
			isWordStartsWithVowel = true;
		}
		
		return isWordStartsWithVowel;
	}
	
	public String getConsonantLiteralsForGivenString(String inputString) {
		
		StringBuilder consonantLiteralBuilder = new StringBuilder();
		
		for(int index = 0; index < inputString.length(); index++) {
			if(isVowel(inputString.charAt(index)) || (inputString.charAt(index)=='y' && index>0)) {
				break;
			}
			else {
				consonantLiteralBuilder.append(inputString.charAt(index));
			}
		}
		
		return consonantLiteralBuilder.toString();
	}
	
	public boolean isVowel(Character character) {
		
		boolean isVowel = false;
		if(character == 'a' || character =='e' || character =='i' || character =='o' || character == 'u') {
			isVowel = true;
		}
		return isVowel;
	}
	
	public static void main(String args[]) {
		PigLatinTranslator pigLatinTranslator = new PigLatinTranslator();
		System.out.println(pigLatinTranslator.translate("square"));
	}

}
