package assignment04;

import java.util.Scanner;

public class Progrm09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter An Integer");
		int in;
		Scanner sc=new Scanner(System.in);
		in=sc.nextInt();
		System.out.println("Integer= "+in);
		String by=Integer.toBinaryString(in);
		System.out.println("BYTE= "+by);
		String hex=Integer.toHexString(in);
		System.out.println("HEXA DECIMAL= "+hex);
		String oct=Integer.toOctalString(in);
		System.out.println("OCTAL= "+oct);

	}

}
