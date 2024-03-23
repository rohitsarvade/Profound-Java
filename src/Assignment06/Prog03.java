package Assignment06;

abstract class Shape
{
	public abstract void area();
}

class Circle extends Shape
{
	Double pi=3.14,r=4.3;
	Double area=pi*r*r;
	public void area()
	{
		System.out.println("AREA OF CIRCLE: "+area);
	}
}
class Square extends Shape
{
	int side=4;
	int area=side*side;
	public void area()
	{
		System.out.println("AREA OF Square: "+area);
	}
}
class Cylinder extends Shape
{
	Double pi=3.14,r=4.3,h=5.5;
	Double area=2*pi*r*h+2*pi*r*r;
	public void area()
	{
		System.out.println("AREA OF Cylinder: "+area);
	}
}
class Rectangle extends Shape
{
	int w=2,l=4;
	int area=l*w;
	public void area()
	{
		System.out.println("AREA OF Rectangle: "+area);
	}
}

public class Prog03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s=new Shape[4];
		s[0]=new Circle();
		s[1]=new Square();
		s[2]=new Cylinder();
		s[3]=new Rectangle();
		for(int i=0;i<4;i++)
		{
			s[i].area();
		}

	}

}
