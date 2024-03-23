package assignment04;

public class Progrm04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer r=new StringBuffer("HELLO");
		System.out.println("String Length= "+r.length());
		System.out.println("String Capacity= "+r.capacity());
		System.out.println("add name at the last of the String= "+r.append("\tROHIT"));
		System.out.println("String Length= "+r.insert(0, "HII\t"));
		System.out.println("String Length= "+r.delete(7,9));
		System.out.println("String Length= "+r.deleteCharAt(5));
		System.out.println("reversed String = "+r.reverse());

	}

}
