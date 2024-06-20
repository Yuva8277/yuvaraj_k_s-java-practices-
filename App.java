package java_practice;

import java.util.Scanner;

public class App {

	public static void main(String[] args)   
	{  
	int i; 
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter a number: ");    
		i = sc.nextInt();
	}  
	if(i>0)  
	{  
	System.out.println("The number is positive.");  
	}   
	else if(i<0)  
	{  
	System.out.println("The number is negative.");  
	}   
	else  
	{  
	System.out.println("is zero.");  
	}  
	 
	
	}

}
