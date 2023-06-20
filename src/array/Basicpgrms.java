package array;

import java.util.Scanner;

public class Basicpgrms {

	public static void main(String[] args) {
		//1
		String s="jmeter";
		String s1="performance testing tool";
		System.out.println(s.concat(s1));
		//2
		String s2="java language is platform dependent";
		if(s2.contains("language"))
		{
		System.out.println("language is present");
		}	
		else
		{
			System.out.println("language is not present");
		}
		//3
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s4=sc.nextLine();
		int c=0;
		int n=s4.length();
		for(int i=0;i<n;i++)
		{
		
			if(s4.charAt(i)=='a'||s4.charAt(i)=='e'||s4.charAt(i)=='i'||s4.charAt(i)=='o'||s4.charAt(i)=='u')
			{
		     c++;
			}
		}
		System.out.println("vowelcount="+c);
		
		//4
		String s3="selenium webdriver is used for webapplication testing";
		String sr[]=s3.split(" ");
		for(String v:sr)
		{
			System.out.println(v);
			if(v.contains("webapplication"))              //or equals
			{
				break;
			}
			
			
			
		}

	}

}
