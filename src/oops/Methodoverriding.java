package oops;

class Car
{
	public void accelator()
	{
		System.out.println("car accelator");
	}
}
class BMW extends Car
{

	@Override
	public void accelator() {
		System.out.println("bmw accelator");
	
		super.accelator();
	}
	
}

public class Methodoverriding {

	public static void main(String[] args) {
	 BMW ob=new BMW();
	 ob.accelator();

	}

}
