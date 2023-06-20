package oops;

import java.util.Scanner;

public class Pgrm8 {

	public static void main(String[] args) {
		System.out.println("enter 10 numbers");
		Scanner sc=new Scanner(System.in);
		float s=0f;
		int n;
		for(int i=1;i<=10;i++)
		{
			n=sc.nextInt();
			s=s+n;		
		}
		 float avg=s/10;
		 System.out.println("Sum="+s);
		 System.out.println("average="+avg);
	}

}
