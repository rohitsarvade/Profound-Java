package assignment04;

public class Progrm03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" HELLO EVERYONE ";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.replace("Y","S"));
		System.out.println(s.replaceFirst("L", "*"));
		System.out.println(s.substring(1,5));
		System.out.println(s.concat("\thii"));
		System.out.println(s.startsWith("el"));
		System.out.println(s.endsWith(" "));
		System.out.println(s.trim());
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
