package oops;

abstract class Car1
{
abstract public void speedlimit();
public void carengine()
{
	System.out.println("car engine");
}
}
class Maruthi extends Car1
{

	@Override
	public void speedlimit() {
		System.out.println("maruthi speedlimit");
		
	}
	
}
class BMW1 extends Car1
{

	@Override
	public void speedlimit() {
		System.out.println("bmw speedlimit");
		
	}
	
}

	

public class Abstraction {

	public static void main(String[] args) {
       Maruthi m=new Maruthi();
        m.carengine();
        m.speedlimit();
        BMW1 ob=new BMW1();
        ob.carengine();
        ob.speedlimit();
	}

}


