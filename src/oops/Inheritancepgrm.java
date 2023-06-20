package oops;

class Member
{
	String name;
	int age;
	String phoneno;
	String address;
	int salary;
	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
	}
}
class Employee extends Member
{
	String specialization;
}
class Manager extends Member
{
	String department;
}

public class Inheritancepgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee();
		ob.name="anu";
		ob.age=24;
		ob.phoneno="8606061971";
		ob.address="ekm";
		ob.salary=20000;
		System.out.println(ob.specialization="tester");
		ob.printdetails();
		Manager obb=new Manager();
		obb.name="arun";
		obb.age=34;
		obb.phoneno="8606061973";
		obb.address="tvm";
		obb.salary=30000;
		System.out.println(obb.department="hr");
		obb.printdetails();
	}

}
