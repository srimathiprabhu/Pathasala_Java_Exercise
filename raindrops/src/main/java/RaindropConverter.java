import java.util.ArrayList;
import java.util.List;

class RaindropConverter {

    String convert(int number) {

    	StringBuilder resultantString = new StringBuilder();
    	List<Integer> factors = new ArrayList<>();
    	
    	factors = getFactorsOfGivenNumberbetween2And8(number);
    	for(Integer factor : factors) {
    		switch(factor) {
    		case 3: resultantString.append("Pling");
    				break;
    		case 5: resultantString.append("Plang");
    				break;
    		case 7: resultantString.append("Plong");
    				break;
    		}
    	}
    	if(factors.isEmpty() || resultantString.length()==0) {
    		resultantString.append(number);
    	}
    	
    	return resultantString.toString();
    }
    
    public List<Integer> getFactorsOfGivenNumberbetween2And8(int number){
    	List<Integer> factorsList = new ArrayList<>();
    	for(int i=3; i<=7; i++) {
    		if(number%i == 0) {
    			factorsList.add(i);
    		}
    	}
    	return factorsList;
    }
}
