package java_practice;

import java.util.Arrays;


public class String_operation {
	    static void removeDuplicate(char str[], int length)   
	    {     
	        int index = 0;     
	        for (int i = 0; i < length; i++)   
	        {     
	            int j;   
	            for (j = 0; j < i; j++)    
	            {   
	                if (str[i] == str[j])   
	                {   
	                    break;   
	                }   
	            }   
	     
	            if (j == i)    
	            {   
	                str[index++] = str[i];   
	            }   
	        }   
	        System.out.println("Removing the duplicate elements : "+String.valueOf(Arrays.copyOf(str, index)));   
	    }   
	     
	    public static void main(String[] args)   
	    {   
	        String info = "yuvaj yuvaraj";  
	        System.out.println("enter the string :"+info); 
	        char str[] = info.toCharArray(); 
	        int len = str.length;   
	        removeDuplicate(str, len);   
	    }   
	}  
