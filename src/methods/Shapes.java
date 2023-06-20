package methods;

public class Shapes {

	public static void main(String[] args) {
		Shapes ob=new Shapes();
		ob.triangle();
		System.out.println("area of rectangle="+ob.rectangle());
		System.out.println("area of circle="+ob.circle(10));
		ob.square(20);
		

		
	}
	public void triangle()
	{
		double b=10;
		double h=5;
		double a=0.5*b*h;
		System.out.println("area of triangle="+a);
		
	}
	public double rectangle()
	{
		double l=30;
		double h=10;
		double a=l*h;
		return a;
	}
	public double circle(double r)
	{
		double a=3.14*r*r;
		return a;
	}
	public void square(double a)
	{
		double ar=a*a;
		System.out.println("area of square="+ar);
	}

}
