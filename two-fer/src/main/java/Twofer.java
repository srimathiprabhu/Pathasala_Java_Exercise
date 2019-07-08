import java.util.Optional;

class Twofer {
	
    String twofer(String name) {
    	
    	String returnVAlue = Optional.ofNullable(name).isEmpty() ? "you" : name;
    	return String.format("One for %s, one for me.", returnVAlue);
    	
    }
    
}
