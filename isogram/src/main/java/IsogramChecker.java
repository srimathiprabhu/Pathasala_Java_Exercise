class IsogramChecker {

    boolean isIsogram(String phrase) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	String newPhrase = phrase.toLowerCase();
    	boolean isPhraseIsogram = true;
        for(int i=0; i<newPhrase.length(); i++) {
        	
        	if(newPhrase.charAt(i) == ' ' || newPhrase.charAt(i) == '-') {
        		continue;
        	}
        	if(newPhrase.indexOf(newPhrase.charAt(i), (i+1))>0) {
        		isPhraseIsogram = false;
        		break;
        	}
        	
        }
        return isPhraseIsogram;
    }

}
