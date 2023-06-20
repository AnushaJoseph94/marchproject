package oops;

import java.util.Scanner;

public class Scannerprintname {

	public static void main(String[] args) {
		System.out.println("enter your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
	//	char c=sc.next().charAt(2);
		System.out.println("my name is "+name);
	//	System.out.println("character at 2nd index position is " +c);
	}

}
