package String;

public class String_Buffer {

	public static void main(String[] args) 
	{
		String s = "Atul";
		String s1 = s.concat(" Kumar");
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("Rohit"); //1st String
		s2.append(" Joshi"); //Modified my 1st string
		System.out.println(s2);		
	}

}
