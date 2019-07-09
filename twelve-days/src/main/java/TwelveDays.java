import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TwelveDays {
	
	List<String> daysInChristmas = new ArrayList<>(Arrays.asList("first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"));
	Map<String, String> quantityOfItemsOnEachDay = new HashMap<String, String>();
	Map<String, String> itemsGivenOnEachDay = new HashMap<>();
	
	public void initializeQuantities() {
		for(String day : daysInChristmas) {
			switch(day) {
			case "first": 	quantityOfItemsOnEachDay.put(day, "a");
						  	itemsGivenOnEachDay.put(day, "Partridge in a Pear Tree");
						  	break;
			case "second": 	quantityOfItemsOnEachDay.put(day, "two");
			  			   	itemsGivenOnEachDay.put(day, "Turtle Doves");
			  			   	break;
			case "third": 	quantityOfItemsOnEachDay.put(day, "three");
			  			  	itemsGivenOnEachDay.put(day, "French Hens");
			  			  	break;
			case "fourth": 	quantityOfItemsOnEachDay.put(day, "four");
						   	itemsGivenOnEachDay.put(day, "Calling Birds");
						   	break;
			case "fifth": 	quantityOfItemsOnEachDay.put(day, "five");
			  			  	itemsGivenOnEachDay.put(day, "Gold Rings");
			  			  	break;
			case "sixth": 	quantityOfItemsOnEachDay.put(day, "six");
			  			  	itemsGivenOnEachDay.put(day, "Geese-a-Laying");
			  			  	break;
			case "seventh": quantityOfItemsOnEachDay.put(day, "seven");
			  				itemsGivenOnEachDay.put(day, "Swans-a-Swimming");
			  				break;
			case "eighth": 	quantityOfItemsOnEachDay.put(day, "eight");
			  			   	itemsGivenOnEachDay.put(day, "Maids-a-Milking");
			  			   	break;
			case "ninth": 	quantityOfItemsOnEachDay.put(day, "nine");
			  				itemsGivenOnEachDay.put(day, "Ladies Dancing");
			  				break;
			case "tenth": 	quantityOfItemsOnEachDay.put(day, "ten");
			  				itemsGivenOnEachDay.put(day, "Lords-a-Leaping");
			  				break;
			case "eleventh":quantityOfItemsOnEachDay.put(day, "eleven");
			  				itemsGivenOnEachDay.put(day, "Pipers Piping");
			  				break;
			case "twelfth":quantityOfItemsOnEachDay.put(day, "twelve");
			  				itemsGivenOnEachDay.put(day, "Drummers Drumming");
			  				break;
			}
		}
	}
	
    String verse(int verseNumber) {
    	initializeQuantities();
    	StringBuilder songForGivenVerse = new StringBuilder();
    	songForGivenVerse.append(String.format("On the %s day of Christmas my true love gave to me:", daysInChristmas.get(verseNumber-1)));
    	for(int day = verseNumber; day >= 1; day--) {
    		songForGivenVerse.append(String.format(" %s %s", quantityOfItemsOnEachDay.get(daysInChristmas.get(day-1)), itemsGivenOnEachDay.get(daysInChristmas.get(day-1))));
    		if(day >= 2) {
    			songForGivenVerse.append(",");
    		}
    		if(day == 2) {
    			songForGivenVerse.append(" and");
    		}
    		if (day == 1) {
				songForGivenVerse.append(".\n");
			}
    	}
    	return songForGivenVerse.toString();
    }

    String verses(int startVerse, int endVerse) {
    	initializeQuantities();
    	StringBuilder song = new StringBuilder();
        for(int startDay = startVerse; startDay <= endVerse; startDay++) {
        	song.append(verse(startDay));
        	if(startDay < endVerse)
        		song.append("\n");
        }
        return song.toString();
    }
    
    String sing() {
        return verses(1, 12);
    }
    
}
