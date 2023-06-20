package array;

import java.util.Scanner;

public class Sumandaveragearray {

	public static void main(String[] args) {
		int []a=new int[5];
		int sum=0;
		int avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			// sum=sum+a[i];
			// avg=sum/5;
			
		}
		for(int v:a)
		{
			sum=sum+v;
			
		}
		avg=sum/5;
     System.out.println("sum of numbers="+sum);
     
     System.out.println("avg of numbers="+avg);
	}

}
