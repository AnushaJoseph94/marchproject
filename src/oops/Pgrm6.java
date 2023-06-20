package oops;

import java.util.Scanner;

public class Pgrm6 {

	public static void main(String[] args) {
		int n,evensum=0,oddsum=0;
		System.out.println("enter the limit");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		System.out.println("enter the numbers");
		for(int i=1;i<=l;i++)
		
		{
			 n=sc.nextInt();
		
		if(n%2==0)
		{
		  evensum=evensum+n;
		}
		else
		{
			oddsum=oddsum+n;
		}
		}
		System.out.println("sum of even numbers="+evensum);
		System.out.println("sum of odd numbers="+oddsum);
	
	}

		
}
