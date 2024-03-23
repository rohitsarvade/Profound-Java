package Assignment05;

class Employee2
{
	String name;
	int empid;
	double baseSal;

	public Employee2()
	{
		// default constructor
	}
	public Employee2(int empid,String name,double baseSal)
	{
		this.empid=empid;
		this.name=name;
		this.baseSal=baseSal;
	}
}

class Manager extends Employee2
{
	double incentives;
	public Manager()
	{
		super();
		incentives=0;
	}
	public Manager(int empid,String name,double baseSal)
	{
		super(empid,name,baseSal);
		this.incentives=0.2*baseSal;
	}
	double computeSal()
	{
		return(baseSal+incentives);
	}
	void printemp()
	{
		System.out.println("Employee Id= "+empid);
		System.out.println("Employee Name= "+name);
		System.out.println("Employee Basic Salary= "+baseSal);
		System.out.println("Employee Incentives= "+incentives);
		System.out.println("Manager Salary= "+this.computeSal());
	}
}

public class Progrm04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1=new Manager();
		m1.printemp();
		Manager m2=new Manager(24,"Om",1000);
		m2.printemp();
	}
}
