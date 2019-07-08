public class PangramChecker {

    public boolean isPangram(String input) {
    	
    	boolean isPanagram = false;
    	
    	int totalAsciiValueOfAlphabets = 0;
    	
    	for(int i='a'; i<='z'; i++) {
    		totalAsciiValueOfAlphabets += i;
    	}
    	
    	for(int i=0; i<input.length(); i++) {
    		if(input.toLowerCase().charAt(i)<'a' || input.toLowerCase().charAt(i) > 'z' || input.toLowerCase().indexOf(input.toLowerCase().charAt(i), i+1) > i) {
    			continue;
    		}
    		totalAsciiValueOfAlphabets -= input.toLowerCase().charAt(i);
    	}
    	
    	if(totalAsciiValueOfAlphabets == 0) {
    		isPanagram = true;
    	}
    	return isPanagram;
    }

}
