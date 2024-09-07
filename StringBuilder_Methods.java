package String;

public class StringBuilder_Methods {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Bangalore");
		s1.append(" City");
		System.out.println(s1);
		s1.insert(9, " is a");
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("Manish Tiwari");
		//System.out.println(s2.delete(0, 7));
		System.out.println(s2.substring(7));
		System.out.println(s2.subSequence(4, 9));			
	}
}
