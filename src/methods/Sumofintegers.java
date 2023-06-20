package methods;

import java.util.Scanner;


public class Sumofintegers {
	

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Sumofintegers ob=new Sumofintegers();
		int sumint=ob.sum(n);
		System.out.println("sumofintegers="+sumint);

	}
	
	public int sum(int n)
	{
		int s=0;
	
		while(n>0)
		{
		int r=n%10;
		s=s+r;
		 n=n/10;
		}
		return s;
	}

}
