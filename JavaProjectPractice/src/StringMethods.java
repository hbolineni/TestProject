import java.net.StandardSocketOptions;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Welcome";
		System.out.println(s.length());
		
		//concatenation
		
		String s1="Welcome to ";
		String s2="training";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//Equals
		
		String s3="WELCOME";
		String s4= "welcome";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//contains
		System.out.println(s3.contains("COME"));
		//substring
		// 0123456 ---> starting index
		// WELCOME  
		// 1234567 ---> Ending index
		System.out.println(s3.substring(0,4));
		System.out.println(s3.substring(0, 3));
		s.substring(4, 7);
		
		//replace 
		System.out.println(s.replace('e', 'a'));
		
				

	}

}
