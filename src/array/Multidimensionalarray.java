package array;

import java.util.Scanner;

public class Multidimensionalarray {

	public static void main(String[] args) {
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		int ar[][]=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
        System.out.println("entered numbers:");
//       for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<2;j++)
//			{
//		System.out.print(ar[i][j]+" ");
//			}
//	System.out.println();
//		}
       for(int s[]:ar)
       {
    	   for(int s1:s)
    	   {
    		   System.out.print(s1+" ");
    	   }
    	   System.out.println();
    	   
       }
	}
}


