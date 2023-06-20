package oops;

import java.util.Scanner;

public class Calculatorscanner {

	public static void main(String[] args) {
		int x,y,op;
		System.out.println("enter 2 numbers");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        
        System.out.println("enter your choice 1.addition 2.subtraction 3.multiplication  4.division");
        op=sc.nextInt();
        double result=0;
        switch(op)
        {
        case 1:result=x+y;
        break;
        case 2:result=x-y;
        break;
        case 3:result=x*y;
        break;
  
        case 4:if(y==0)
        
        {
        	System.out.println("error");
        }
        else
        {
        	result=x/y;
        }
        break;
        
        
        default:System.out.println("invalid choice");
        }
        System.out.println("result="+result);
	}

}
