package Assignment7;
import java.util.HashMap;
public class NonRepChar {

	    public static char firstNonRepeatedChar(String str) {
	        HashMap<Character, Integer> charFreq = new HashMap<>();
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
	        }
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (charFreq.get(c) == 1) {
	                return c;
	            }
	        }
	        return '\0'; //no non-repeated character
	    }

	    public static void main(String[] args) {
	        String str = "bananna";
	        char firstNonRepeated = firstNonRepeatedChar(str);
	        System.out.println("The first non-repeated character in is: " + firstNonRepeated);
	    }
	}

