package controlstatements;

public class Calculatorpgrm {

	public static void main(String[] args) {
		int a=5,b=4;
		int operation=3;//case
		switch(operation)
		{
		case 1:System.out.println("addition of a and b="+a+b);
		break;
		case 2:System.out.println("subtraction of a and b="+(a-b));
		break;
		case 3:System.out.println("multiplication of a and b="+(a*b));
		break;
		case 4:System.out.println("division of a and b="+(a/b));
		break;
		default:System.out.println("invalid choice");
		}

	}

}
