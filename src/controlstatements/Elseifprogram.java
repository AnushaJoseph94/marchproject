package controlstatements;

public class Elseifprogram {

	public static void main(String[] args) {
		int a=30,b=40,c=20;
		if(a>b && a>c)
		{
System.out.println("a is greater");
	}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
}
}