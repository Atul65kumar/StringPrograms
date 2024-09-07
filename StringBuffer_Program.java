package String;

public class StringBuffer_Program {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Once upon a time, ");
		s1.append("there was a dragon. ");
		s1.insert(30, "Brave ");
		s1.append("Who guarded a treasure");
		System.out.println(s1);	
	}
}
