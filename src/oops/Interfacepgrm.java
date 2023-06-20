package oops;

interface Bank
{
	public void deposit();
	public void withdraw();
	public void balance();
}
interface creditcard
{
	public void creditcarddetails();
}
class SBI implements Bank,creditcard
{

	@Override
	public void creditcarddetails() {
		System.out.println("sbicreditcard");
		
	}

	@Override
	public void deposit() {
		System.out.println("sbideposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("sbiwithdraw");
		
	}

	@Override
	public void balance() {
		System.out.println("sbibalance");
		
	}
	
}
class Federal implements Bank
{

	@Override
	public void deposit() {
		System.out.println("federal deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("federal withdraw");
		
	}

	@Override
	public void balance() {
		System.out.println("federal balance");
		
	}
	
}

public class Interfacepgrm {

	public static void main(String[] args) {
		Bank ob=new SBI();//SBI ob=new SBI();then we get sbicreditcard
		ob.deposit();
		ob.withdraw();
		ob.balance();
	
		
		ob=new Federal();
		ob.deposit();
		ob.withdraw();
		ob.balance();

	}

}
