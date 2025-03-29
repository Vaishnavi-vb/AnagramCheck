package com.pro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		boolean res = checkAnagram(str1, str2);
		if (res == true) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Angaram");
		}

	}

	static boolean checkAnagram(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] char1=str1.toCharArray();
		char[] char2=str2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		return Arrays.equals(char1, char2);
	}

}
