package controlstatements;

public class Reversenumberusingwhileloop {

	public static void main(String[] args) {
		int n=3456;
		int x=0;
		int num=0;
		while(n>0)
		{
		 x=n%10;
		 num=(num*10)+x;
		n=n/10;
		
	}
		System.out.println("reversed number="+num);
	}
}
