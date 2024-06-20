package java_practice;

import java.util.Scanner;

public class String_postive {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String inputString;
	char previousChar;
		do {
		System.out.println("Enter a string to check if it is a positive string:");
		inputString =sc.nextLine().trim();
		if (isPositiveString(inputString)) {
		System.out.println("The string is a positive string.");
		} else { System.out.println("The string is not a positive string.");
		
		}
		
		}while (true);


	}
	public static boolean isPositiveString(String str) {
	if (str == null || str.length() <= 1) {
	return true;
	}
	for (int i = 1; i < str.length(); i++) {
	char currentChar = Character.toUpperCase(str.charAt(i));
	char previousChar = Character.toUpperCase(str.charAt(i - 1));
	if (currentChar< previousChar) {
	return false;
	}
	}
	return true;
	}
}
