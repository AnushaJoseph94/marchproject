package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add();
		ob.add(30,40);
		ob.add(20,10.7);
		ob.add(43.6,32);

	}
	public void add()
	{
		int a=20,b=30;
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}

}
