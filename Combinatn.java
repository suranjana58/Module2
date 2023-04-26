package Assignment7;
import java.util.ArrayList;
import java.util.List;

public class Combinatn {
	    public static List<String> getCombinations(String str) {
	        List<String> combinations = new ArrayList<>();
	        if (str == null || str.isEmpty()) {
	            return combinations;
	        }
	        combineHelper("", str, combinations);
	        return combinations;
	    }

	    private static void combineHelper(String prefix, String suffix, List<String> combinations) {
	        combinations.add(prefix);
	        for (int i = 0; i < suffix.length(); i++) {
	            String newPrefix = prefix + suffix.charAt(i);
	            String newSuffix = suffix.substring(i + 1);
	            combineHelper(newPrefix, newSuffix, combinations);
	        }
	    }

	    public static void main(String[] args) {
	        String str = "zombie";
	        List<String> combos = getCombinations(str);
	        System.out.println("Combinations of " + str + ": " + combos);
	    }
	}

