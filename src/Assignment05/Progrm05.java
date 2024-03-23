package Assignment05;

import assignment04.Employee;

public class Progrm05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj[]=new Employee[3];
		obj[0]=new Employee("ROHIT",462,"30/MARCH/2000");
		obj[1]=new Employee("AJAY",462,"25/JUNE/1997");
		obj[2]=new Employee("OM",462,"16/APRIL/1998");
		System.out.println("\n----FIRST EMPLOYEE DETAILS ARE----");
		System.out.println(obj[0]);
		System.out.println("\n----SECOND EMPLOYEE DETAILS ARE----");
		System.out.println(obj[1]);
		System.out.println("\n----THIRD EMPLOYEE DETAILS ARE----");
		System.out.println(obj[2]);

	}

}
