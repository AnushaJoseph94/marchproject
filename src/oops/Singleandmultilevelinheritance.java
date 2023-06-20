package oops;
class Animal
{
	public void animalfood()
	{
		System.out.println("animalfood");
	}
	
}
class Dog extends Animal
{
	public void breed()
	{
		System.out.println("lab");
	}
}
class Babydog extends Dog
{
	public void babydogfeature()
	{
		System.out.println("babydogfeature");
	}
}


public class Singleandmultilevelinheritance {

	public static void main(String[] args) {
		Dog ob=new Dog();
		ob.animalfood();
		ob.breed();
		
		System.out.println("Multi level inheritance");
		Babydog obb=new Babydog();
		obb.animalfood();
		obb.breed();
		obb.babydogfeature();

	}

}
