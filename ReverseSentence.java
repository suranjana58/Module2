package com.assignment1;
import java.util.Scanner; 
public class ReverseSentence {
	public static String reverseWord(String s) {
        // Splitting the Sentence into list of words
        String[] w = s.split(" ");
        
        // Reversing each word and creating a new list of words
        // Using List Comprehension Technique
        String[] nw = new String[w.length];
        for (int i = 0; i < w.length; i++) {
            StringBuilder sb = new StringBuilder(w[i]);
            nw[i] = sb.reverse().toString();
        }
        
        // Join new list of words to form a new Sentence
        String ns = String.join(" ", nw);
        return ns;
}
	public static void main(String[] args) {
        // Driver's code
        Scanner scanner = new Scanner(System.in);
        System.out.print("input required sentence:");
        String s = scanner.nextLine();
        System.out.println(reverseWord(s));
    }
}
