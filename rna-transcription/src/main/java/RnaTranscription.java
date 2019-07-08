import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {

    	Map<Character, Character> rnaComplements = new HashMap<>();
    	rnaComplements.put('G', 'C');
    	rnaComplements.put('C', 'G');
    	rnaComplements.put('T', 'A');
    	rnaComplements.put('A', 'U');
    	
       	StringBuilder rnaStrand = new StringBuilder();
    	
    	for(int i=0; i<dnaStrand.length(); i++) {
    		rnaStrand.append(rnaComplements.get(dnaStrand.charAt(i)));
    	}
    	return rnaStrand.toString();
    }

}
