package assignment04;

public class Progrm07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		String s="14abc9kj3";
		String s1="abcd";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				int b=Integer.parseInt(String.valueOf(ch));
				sum=sum+b;
			}
		}
		System.out.println("THE SUM OF THE DIGITS IN THE STRING= "+sum);
		int sum1=0;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				sum1=sum1+Character.getNumericValue(s1.charAt(i));
			}
		}
		System.out.println("THE SUM OF THE DIGIYS IN THE STRING= "+sum);
	}
}
