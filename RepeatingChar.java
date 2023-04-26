package com.assignment1;


public class RepeatingChar {
	public static void main(String[] args) {	

String ip="stay";
RepeatingChar rep=new RepeatingChar();
if (rep.RepChar(ip))
    System.out.println(ip + " has all unique characters "+RepChar(ip));
else
    System.out.println(ip + " has duplicate characters "+RepChar(ip));
}

static boolean RepChar(String ip) {
		for(int i=0;i<ip.length();i++) {
			for(int j=i+1;j<ip.length();j++) {
				if(ip.charAt(i)==ip.charAt(j)) {
					return false;
				}
				
			}
		   }
			return true;
		}
}	
	
