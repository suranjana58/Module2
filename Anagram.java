package com.assignment1;
import java.util.Arrays;  

public class Anagram {
	public static void main(String args[]) {
		String a1="ear";
		String a2="are";
		boolean anagram=false;
		
		if(a1.length()!=a2.length()) {
			System.out.println("Not anagrams");
		}
		else {
			char[] arr1 = a1.toLowerCase().toCharArray();  
            char[] arr2 = a2.toLowerCase().toCharArray();  
            Arrays.sort(arr1);  
            Arrays.sort(arr2);  
            anagram = Arrays.equals(arr1, arr2); 
            
		}
		if(anagram) {
		System.out.println("anagrams");
	}else {
		System.out.println("Not anagrams");
	}
}
}
