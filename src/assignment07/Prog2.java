package assignment07;

import java.util.Scanner;

interface Relational
{
	public abstract void greaterThan();
	public abstract void lessThan();
	public abstract void greaterThaneq();
	public abstract void lessThaneq();
}

class ImplRel implements Relational
{
	int a,b;
	ImplRel(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void greaterThan()
	{
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else
		{
			System.out.println("A is not greater than B");
		}
	}
	public void lessThan()
	{
		if(a<b)
		{
			System.out.println("A is less than B");
		}
		else
		{
			System.out.println("A is not less than B");
		}
	}
	public void greaterThaneq()
	{
		if(a>=b)
		{
			System.out.println("A is greater than and equal to B");
		}
		else
		{
			System.out.println("A is not greater than and equal to B");
		}
	}
	public void lessThaneq()
	{
		if(a<=b)
		{
			System.out.println("A is less than and not equal to B");
		}
		else
		{
			System.out.println("A is not less than and equal to B");
		}
	}
}

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter A value: ");
		a=sc.nextInt();
		System.out.println("Enter B value: ");
		b=sc.nextInt();
		ImplRel i=new ImplRel(a,b);
		i.greaterThan();
		i.lessThan();
		i.greaterThaneq();
		i.lessThaneq();

	}

}
