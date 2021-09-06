package M5_¹®ÀÚ¿­_level3;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {

	      Scanner scan = new Scanner(System.in);

	      String text = "Lifoe is too short.";
	      System.out.println(text);
	      String x = "o";
	      int k = 2;
	      for(int i = 0; i < text.length(); i++) {
	    	  if(text.charAt(i) == x.charAt(0) && k == i) {
	    		  System.out.println(text.replace("o",""));
	    	  }
	      }
	      System.out.println(text.replace("o",""));
	   }

}
