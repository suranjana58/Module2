package Assignment7;

public class UniqueChar {
	    public static boolean hasUniqueChars(String str) {
	        if (str.length() > 128) { 
	            return false; //string can't have all unique chars
	        }
	        boolean[] charSet = new boolean[128];
	        for (int i = 0; i < str.length(); i++) {
	            int val = str.charAt(i);
	            if (charSet[val]) {
	                return false; //char already encountered,not unique
	            }
	            charSet[val] = true;
	        }
	        return true; //chars in string are unique
	    }

	    public static void main(String[] args) {
	        String str1 = "bananna";
	        System.out.println(str1 + " has all unique characters: " + hasUniqueChars(str1));
	    }
	}


