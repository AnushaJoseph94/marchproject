package oops;

import java.util.Scanner;

public class Pgrm12 {

	public static void main(String[] args) {
		System.out.println("enter the limit");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		System.out.println("enter the numbers");
		int pc=0,nc=0,zc=0;
		for(int i=1;i<=l;i++)
		{
			int n=sc.nextInt();
			if(n>0)
			{
			pc=pc+1;
			}
			else if(n<0)
			{
			nc=nc+1;
			}
			else
			{
			zc=zc+1;	
			}
		}
     System.out.println("count of positive numbers="+pc);
     System.out.println("count of negative numbers="+nc);
     System.out.println("count of zeros="+zc);
	}

}
