package methods;

public class Methodpgrm {

	public static void main(String[] args) {
		Methodpgrm ob=new Methodpgrm();
		ob.add();
		System.out.println("sub="+ob.sub());
		System.out.println("mul="+ob.mul(20,30));
		ob.div(35,12);

	}
	//1.without returntype & without parameter
	
	public void add()
	{
		int a=20,b=10;
		int c=a+b;
		System.out.println("sum="+c);
	}
	
	//2.with returntype & without parameter
	public int sub()
	{
		int a=30,b=20;
		int c=a-b;
		return c;
	}
	
	//3.with returntype & with parameters
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	//4.without returntype & with parameter
	public void div(float a,float b)
	{
		float c=a/b;
		System.out.println("div="+c);
	}

}
