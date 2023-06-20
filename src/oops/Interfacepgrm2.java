package oops;

interface basicanimal
{
	public void eat();
	public void sleep();
}
class Monkey
{
	public void jump()
	{
		System.out.println("monkey jumps");
	}
	public void bite()
	{
		System.out.println("monkey bites");
	}
	
}
class Human extends Monkey implements basicanimal
{


	@Override
	public void eat() {
		System.out.println("human eats");
		
	}

	@Override
	public void sleep() {
		System.out.println("human sleeps");
		
	}
	public void speak()
	{
		System.out.println("human speaks");
	}
	
}

public class Interfacepgrm2 {

	public static void main(String[] args) {
		Human ob=new Human();
		ob.eat();
		ob.sleep();
		ob.bite();
		ob.jump();
		ob.speak();

	}

}
