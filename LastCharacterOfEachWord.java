package com;

import java.util.Scanner;

public class LastCharacterOfEachWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println(getLastCharacterOfEachWord(str));
	}
	public static String getLastCharacterOfEachWord(String str) {
		String st="";
		int length=str.length();

		for(int i=0;i<str.length();i++) {
			if(i==length-1||str.charAt(i+1)==' ') {
				st=st+str.charAt(i);
			}
		}
		return st;
	}

}

