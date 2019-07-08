class ReverseString {

    String reverse(String inputString) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	StringBuilder reversedString = new StringBuilder();
        for(int i = inputString.length()-1; i>=0; i--) {
        	reversedString.append(inputString.charAt(i));
        }
        return reversedString.toString();
    }
  
}