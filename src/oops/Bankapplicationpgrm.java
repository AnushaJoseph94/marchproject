package oops;

import java.util.Scanner;

interface Bank1
{
	public void showdetails(String username);
	public void balance();
	public void deposit();
	public void withdraw();
}
class SBT implements Bank1
{
	int accountno;
	String username;
	static String bankname="sbi";
	int bal=20000;
	Scanner sc=new Scanner(System.in);
	@Override
	public void showdetails(String username) {
		System.out.println("enter your accountno");	
		 accountno=sc.nextInt();
		System.out.println(bankname);
		username="arun";
		System.out.println("name:"+username);
		System.out.println("accountno:"+accountno);
	}

	@Override
	public void balance() {
		System.out.println("balance="+bal);		
	}

	@Override
	public void deposit() {
		System.out.println("enter your deposit amount");
		int d=sc.nextInt();
		bal=bal+d;
		System.out.println("total balance="+bal);
	}

	@Override
	public void withdraw() {
		System.out.println("enter your withdraw amount");
		int w=sc.nextInt();
		bal=bal-w;
		System.out.println("total balance="+bal);	
	}
}		

public class Bankapplicationpgrm {

	public static void main(String[] args) {
		SBT ob=new SBT();
		ob.showdetails("arun");
		ob.balance();
		ob.deposit();
		ob.withdraw();
		

	}

}
