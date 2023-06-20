package array;

import java.util.Scanner;

public class Namearray {

	public static void main(String[] args) {
		String[]s=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter names");
		for(int i=0;i<5;i++)
		{
			s[i]=sc.next();
		}
		System.out.println("entered names:");
		for(int i=0;i<5;i++)
		{
			System.out.println(s[i]);
		}

//	for(String v:s)
//	{	
//		System.out.println(v);
//	}
	}

}
