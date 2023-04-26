package com.assignment1;
/*reverse a String*/
import java.lang.*;

public class ReverseString {
 public static void main(String args[]) {
	String in="Consultadd";
	StringBuilder out=new StringBuilder(); //Using stringbuilder for using reverse
	out.append(in);
	out.reverse();
	System.out.println(out);
 }
}
