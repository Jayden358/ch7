package ch7;

public class test {

	public static void main(String[] args) {
		int i = 1;

	    while (i <= 4) {

	      int num = 1;

	      for (int j = 1; j <= i; j++) {

	        System.out.print(num + "bb");

	        num *= 3;

	      }

	     

	      System.out.println();

	      i++;

	    }

	  }

	}