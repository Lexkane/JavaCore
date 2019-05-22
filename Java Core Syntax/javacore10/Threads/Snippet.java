package javacore10.Threads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Snippet {
	public static void main(String[] args) {
	String s1 = "Java";
	String s2 = "Java fvbf";
	String s3 = new String("Java");
	System.out.println(s1 + "==" + s2 + " : " 
				+ (s1 == s2)); 		// true
	System.out.println(s1 + "==" + s3 + " : " 
				+ (s1 == s3)); 		// false
	System.out.println(s1 + " equals " + s2 + " : " 
				+ s1.equals(s2));		// true
	System.out.println(s1 + " equals " + s3 + " : " 
				+ s1.equals(s3));		// true
	System.out.println(s1.hashCode());
	}

		public static boolean checkWithRegular(String userNameString){
		Pattern p= Pattern.compile("^[a-z0-9_-]{3,15}$");
		Matcher m=p.matcher(userNameString);
		return m.matches();
	}
}

