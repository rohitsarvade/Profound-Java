package Assignment06;

class Medicine
{
	String c_name;
	String c_address;
	
	public void displayLable()
	{
		System.out.println("THIS DRUG IS MANUFACTURED BY\n*******'PHARMACIUTIAL COMPANY'*******");
		System.out.println("Address:-8,UDDHAR HOUSING SOCIETY, GANDHI NAGAR, SOLAPUR, 413003");
	}
}

class tablet extends Medicine
{
	public void displayLable()
	{
		System.out.println("*****TABLET SHOULD BE STORED IN A COOL DRY PLACE*****");
	}
}
class Syrup extends Medicine
{
	public void displayLable()
	{
		System.out.println("*****SHAKE WELL BEFORE USE*****");
	}
}
class Oinment extends Medicine
{
	public void displayLable()
	{
		System.out.println("*****FOR EXTERNAL USE OMLY*****");
	}
}

public class Prog02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine m[]=new Medicine[20];
		double i=Math.random() * 4;
		int j=(int)i;
		System.out.println(j);
		switch(j)
		{
		case 1:
			m[0]=new Medicine();
			m[1]=new tablet();
			
			m[0].displayLable();
			m[1].displayLable();
			break;
		case 2:
			m[2]=new Medicine();
			m[3]=new Syrup();
			
			m[2].displayLable();
			m[3].displayLable();
			break;
		case 3:
			m[4]=new Medicine();
			m[5]=new Oinment();
			
			m[4].displayLable();
			m[5].displayLable();
			break;
			
			default:
				System.out.println("INVALID CHOICE");
				break;
		}

	}

}
