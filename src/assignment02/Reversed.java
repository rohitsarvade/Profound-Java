package assignment02;

import java.util.Scanner;

public class Reversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no. to Reverse= ");
		int num=s.nextInt();
		int rv=0;
		 while (num != 0) 
		 {
	            int d = num % 10;
	            rv = rv * 10 + d;
	            num /= 10;
	      }
			System.out.println("Reversed no is= "+rv);
	}

}
