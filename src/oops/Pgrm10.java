package oops;

import java.util.Scanner;

public class Pgrm10 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int x=n;
		while(n>0)
		{
		int r=n%10;
		 s=s+r*r*r;
		 n=n/10;
		}
		if(s==x)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
	}

}
