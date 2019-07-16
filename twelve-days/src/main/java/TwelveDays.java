import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TwelveDays {

	List<String> daysInChristmas = new ArrayList<>(Arrays.asList("first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"));
	Map<String, String> itemsGivenOnEachDay = new HashMap<>();

	public void initializeQuantities() {
		itemsGivenOnEachDay.put("first", "a Partridge in a Pear Tree");
		itemsGivenOnEachDay.put("second", "two Turtle Doves");
		itemsGivenOnEachDay.put("third", "three French Hens");
		itemsGivenOnEachDay.put("fourth", "four Calling Birds");
		itemsGivenOnEachDay.put("fifth", "five Gold Rings");
		itemsGivenOnEachDay.put("sixth", "six Geese-a-Laying");
		itemsGivenOnEachDay.put("seventh", "seven Swans-a-Swimming");
		itemsGivenOnEachDay.put("eighth", "eight Maids-a-Milking");
		itemsGivenOnEachDay.put("ninth", "nine Ladies Dancing");
		itemsGivenOnEachDay.put("tenth", "ten Lords-a-Leaping");
		itemsGivenOnEachDay.put("eleventh", "eleven Pipers Piping");
		itemsGivenOnEachDay.put("twelfth", "twelve Drummers Drumming");
	}

	String verse(int verseNumber) {
		initializeQuantities();
		StringBuilder songForGivenVerse = new StringBuilder();
		songForGivenVerse.append(String.format("On the %s day of Christmas my true love gave to me:", daysInChristmas.get(verseNumber-1)));
		for(int day = verseNumber; day >= 1; day--) {
			songForGivenVerse.append(String.format(" %s", itemsGivenOnEachDay.get(daysInChristmas.get(day-1))));
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
