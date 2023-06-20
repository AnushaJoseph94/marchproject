package oops;
class Parent
{
	public void phone()
	{
		System.out.println("parent phone");
	}
}
class Child extends Parent
{

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("child phone");
		super.phone();
	}
	
}

public class Anoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ob=new Child();
ob.phone();
	}

}
