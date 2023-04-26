package Assignment7;
import java.util.ArrayList;
import java.util.List;

public class Permutan {
	    public static List<String> getPermutations(String str) {
	        List<String> permutations = new ArrayList<>();
	        if (str == null || str.isEmpty()) {
	            return permutations;
	        }
	        permuteHelper("", str, permutations);
	        return permutations;
	    }
	    private static void permuteHelper(String prefix, String suffix, List<String> permutations) {
	        if (suffix.isEmpty()) {
	            permutations.add(prefix);
	        } else {
	            for (int i = 0; i < suffix.length(); i++) {
	                char ch = suffix.charAt(i);
	                String newPrefix = prefix + ch;
	                String newSuffix = suffix.substring(0, i) + suffix.substring(i + 1);
	                permuteHelper(newPrefix, newSuffix, permutations);
	            }
	        }
	    }
	    public static void main(String[] args) {
	        String str = "sindbad";
	        List<String> perms = getPermutations(str);
	        System.out.println("Permutations of " + str + ": " + perms);
	    }
	}

