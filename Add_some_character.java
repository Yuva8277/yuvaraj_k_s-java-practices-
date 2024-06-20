package java_practice;

public class Add_some_character {

	  public static void main(String[] args) {
	      String a = "yuvaraj k s";
	      System.out.println(a);

	      for (int i=0; i < a.length(); i++){
	        if (i % 2 != 0){
	          a = a.substring(0,i-1) + "#" + a.substring(i, a.length());
	        }
	      }


	      System.out.println(a);
	}
}
