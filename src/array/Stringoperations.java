package array;

public class Stringoperations {

	public static void main(String[] args) {
		String s="hello";
		String s1="welcome";
		String s2="Hello";
		String s3="Hello how are you";
		String s4="       welcome";
		// 1.concatenation
		
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		System.out.println(1+2+s+4+5);
		
		//2.equals
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//3.contains
		
		System.out.println(s3.contains("how"));
		
		//4.touppercase & to lowercase
		
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//5.trim
		
		System.out.println(s4.trim());
		
		//6.length
		
		System.out.println(s.length());
		
		//7.startswith
		
		System.out.println(s3.startsWith("Hello"));
		
		//8.endswith
		
		System.out.println(s3.endsWith("you"));
		
		//9.substring
		
		System.out.println(s3.substring(2,6));
		String a="abcdefg hi";
		System.out.println(a.substring(2,6));		
		
		//10.charAt
		
		System.out.println(s.charAt(1));
		
		//11.split
		
		String[] sr=s3.split(" ");
		for(String v:sr)
		{
			System.out.println(v);
		}

	}

}
