package oops;

class Emp
{
	private String empname;
	private String empdesignation;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	
}

public class Encapsulationpgrm {

	public static void main(String[] args) {
		Emp ob=new Emp();
		ob.setEmpname("arun");
		ob.setEmpdesignation("developer");
		System.out.println(ob.getEmpname());
		System.out.println(ob.getEmpdesignation());

	}

}
