package assignment04;

public class Employee {
	String name,dob;
	int id;
	public Employee()
	{
		
	}
	public Employee(String name,int id,String dob)
	{
		this.name=name;
		this.id=id;
		this.dob=dob;
	}
	public String toString()
	{
		return "EMPLOYEE NAME= "+this.name+"\nEMPLOYEE ID= "+this.id+"\nEMPLOYEE DATE OF BIRTH= "+this.dob;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("SNEHA",462,"24/MARCH/2000");
		System.out.println(e);
	}

}
