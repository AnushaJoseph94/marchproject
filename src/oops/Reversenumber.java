package oops;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		int r;int s=0;int x;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		x=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		System.out.println("reversed number is "+s);
		if(s==x)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
