package assignment02;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age= ");
		int age=s.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible for voting!");
		}
		else
		{
            System.out.println("Sorry, you are not eligible for voting.");
        }

	}

}
