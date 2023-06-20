package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgrm {

	public static void main(String[] args) throws FileNotFoundException {
	
		FileInputStream f=new FileInputStream("E://Book1.xlsx");
		
		try
		{
			int a=40,b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("arithmetic exception");
		}
		System.out.println("hello");
		
		
		try
		{
			int []a=new int[2];
			a[0]=23;
			a[1]=45;
			System.out.println(a[3]);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("array index out of bound exception");
		}
		
		try
		{
		String s=null;
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("null pointer exception");
		}

}
}
