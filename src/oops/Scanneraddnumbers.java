package oops;

import java.util.Scanner;

public class Scanneraddnumbers {

	public static void main(String[] args) {
		System.out.println("enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("sum="+sum);
		
	}

}
