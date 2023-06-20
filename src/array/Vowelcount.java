package array;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
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

	}

}
