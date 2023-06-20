package array;

import java.util.Scanner;

public class Singledimensionalusingscanner {

	public static void main(String[] args) {
		int[]ar=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("entered numbers:");	
		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);	
		}
		

	}

}
