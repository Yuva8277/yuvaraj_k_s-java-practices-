package java_practice;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
		String str,rev="";
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a string");
			str=sc.nextLine();
		}
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		rev=rev+str.charAt(i);
		if(str.equals(rev))
		System.out.println(str+"is a polindrom");
		else
		System.out.println(str+"is not a polindrom");
	}

}
