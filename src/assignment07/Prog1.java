package assignment07;

import java.util.Scanner;

interface MyMath
{
	double sqr(double a);
	double cube(double a);
	double cosine(double a);
	double sine(double a);
}

class implMath implements MyMath
{
	public double sqr(double a)
	{
		double s=a*a;
		System.out.println("SQUARE= "+s);
		return(s);
	}
	public double cube(double a)
	{
		double c=a*a*a;
		System.out.println("SQUARE= "+c);
		return(c);
	}
	public double cuberoot(double a)
	{
		double cubrt=Math.cbrt(a);
		System.out.println("CUBEROOT VALUE= "+cubrt);
		return(cubrt);
	}
	public double cosine(double a)
	{
		double acos=Math.cos(a);
		System.out.println("COS VALUE IS= "+acos);
		return(acos);
	}
	public double sine(double a)
	{
		double asin=Math.asin(a);
		System.out.println("SINE VALUE IS= "+asin);
		return(asin);
	}
}

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value");
		double a=sc.nextDouble();
		System.out.println("Enter b value");
		double b=sc.nextDouble();
		implMath i=new implMath();
		i.sqr(a);
		i.cube(a);
		i.cuberoot(216);
		i.cosine(b);
		i.sine(b);

	}

}
