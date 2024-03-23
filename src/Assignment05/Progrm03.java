package Assignment05;

class WageEmployee1
{
	String name;
	int hrs;
	Double wage_sal;
	public WageEmployee1()
	{
		//Default constructor
	}
	public WageEmployee1(String name,Integer hrs)
	{
		this.name=name;
		this.hrs=hrs;
	}
	Double getSal()
	{
		return wage_sal=hrs*100.0;
	}
}

class SalesPerson extends WageEmployee1
{
	double sale_sal;
	int sales;
	int commision;
	
	public SalesPerson()
	{
		super();
		sales=0;
		commision-=0;
	}
	public SalesPerson(String name,Integer hrs,Integer sales,Integer commision)
	{
		super(name,hrs);
		this.sales=sales;
		this.commision=commision;
	}
	Double compute_salary() 
	{
		return sale_sal=sales+commision;
	}
	void printdata()
	{
		System.out.println("Name of the employee= "+this.name);
		System.out.println("Number of hours that a Wage employee worked= "+this.hrs);
		System.out.println("Wage employee Salary= "+this.getSal());
		System.out.println("Sales persons salary= "+this.compute_salary());
	}
}

public class Progrm03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson s=new SalesPerson();
		s.printdata();
		SalesPerson s1=new SalesPerson("Rohit",0,12000,2400);
		s1.printdata();
	}

}
