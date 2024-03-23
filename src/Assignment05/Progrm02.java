package Assignment05;

import java.util.Scanner;

class Employeee
{
String name;
int empid;
double basSal;
public Employeee()
  {
	// Default Constructor
  }
public Employeee(int empid,String name,double basSal)
{
	this.empid=empid;
	this.name=name;
	this.basSal=basSal;
}
}

class WageEmployee extends Employeee
{
  Integer hrs;	
  Integer rate;	
  Integer wageEmployee_sal;
  public WageEmployee()
  {
	  super();
	  hrs=0;
	  rate=0;
  }
  
  public WageEmployee(int empid,String name,double basSal, Integer hrs,Integer rate)
  {
	  super(empid,name,basSal);
	  this.hrs=hrs;
	  this.rate=rate;
  }
  public String tostring()
  {
	  return "The Employee Id = "+this.empid+"and the employee name is = "+this.name+"and the salary is = "+this.basSal;
  }
  public void get()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter enployee id:");
	  empid=sc.nextInt();
	  System.out.println("enter enployee name:");
	  name=sc.next();
	  System.out.println("enter basic Salary of enployee:");
	  basSal=sc.nextFloat();
	  System.out.println("enter number of hours:");
	  hrs=sc.nextInt();
	  System.out.println("enter rate:");
	  rate=sc.nextInt();
  }
  
  private Integer compute_sal()
  {
	  return wageEmployee_sal=hrs*rate;
  }
  
  public void show()
  {
	  System.out.println("Employee Id= "+empid);
	  System.out.println("Employee Name= "+name);
	  System.out.println("Employee Salary= "+basSal);
	  System.out.println("no. of hours that a wage Employee worked = "+hrs);
	  System.out.println("Wage Employee Salary= "+compute_sal());
  }
}

public class Progrm02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WageEmployee w=new WageEmployee();
		w.show();
		WageEmployee w1=new WageEmployee(19,"Rohit",10000,12,500);
		w1.show();
		WageEmployee w2=new WageEmployee();
		w2.get();
		w2.show();

	}

}
