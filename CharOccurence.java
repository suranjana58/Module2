package com.assignment1;

public class CharOccurence {
	public static void main(String args[]) 
	  {
	      
	  String ip = "suranjana";
	  char term = 'a';             // Character to search is 'a'.
	  
	  int count=0;
	  for(int i=0; i<ip.length(); i++)
	  {
	      if(ip.charAt(i) == term)
	      count++;
	  }
	  
	  System.out.println("The Character appears "+count+" times.");
	  }
}
