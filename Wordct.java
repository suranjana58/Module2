package Assignment7;

public class Wordct {
	    public static int countWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return 0;
	        }
	        String[] words = str.split("\\s+"); //split whitespc
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String str1 = "a good day";
	        System.out.println("String contains " + countWords(str1) + " words");
	       
	    }
	}


