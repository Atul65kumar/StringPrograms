package String;

public class StringBuffer_Builder {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Testing with Atul");
		StringBuilder s2 = new StringBuilder("Testing with Java");
		s1.append(" Java");
		System.out.println(s1);
		s1.delete(18, 22);
		System.out.println(s1);
		char c1=s1.charAt(3);
		System.out.println(c1);
		s1.delete(18, 22);
		System.out.println(s1);
		boolean e=s1.equals(s2);
		System.out.println(e);
		s1.ensureCapacity(100);
		int cap=s1.capacity();
		System.out.println(cap);
		System.out.println(s1.length());
		s1.insert(12, " Java and");
		System.out.println(s1);
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(13, 27));
		s1.reverse();
		System.out.println(s1);
	}
}
