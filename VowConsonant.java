package com.assignment1;

public class VowConsonant {
	
	   public static void main( String args[] ) {
		   
	      String text = "suranjana";
	      int vowelCount = 0, consonantCount = 0;
	      
	      //length of vowels
	      vowelCount = text.replaceAll("[^aeiouAEIOU]", "").length();
	      System.out.println("The length of vowels is: " + vowelCount);
	      
	      //length of consonants
	      consonantCount = text.replaceAll("[aeiouAEIOU]", "").replaceAll("\\s+", "").length(); //remove whitespace
	      System.out.println("The length of consonants is: " + consonantCount);
	   }
}
