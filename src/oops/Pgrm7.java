package oops;

import java.util.Scanner;

public class Pgrm7 {

	public static void main(String[] args) {
		System.out.println("enter the limit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("fibonacci series");
		int f1=0,f2=1;
		System.out.print(f1+","+f2);
		
		for(int i=3;i<=n;i++)
		{
			int f3=f1+f2;
			System.out.print(","+f3);
			f1=f2;
			f2=f3;
			
			
		}
		
	
		
	}

}
