package assignment04;

public class Progrm06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		String s2="abc";
		String s3=new String ("abc");
		String s4=new String ("abc");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s3.equals(s4));

	}

}
