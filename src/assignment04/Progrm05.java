package assignment04;

public class Progrm05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("S-A-R-V-A-D-E.R O H I T");
		System.out.println("THE MAIN STRING IS= "+s);
		String arr[]=s.split(" ");
		System.out.println("AFTER SPLITTING BLANK SPACES= ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		String arr1[]=s.split("-");
		System.out.println("AFTER SPLITTING - SYMBOL= ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr1[i]);
		}

	}

}
