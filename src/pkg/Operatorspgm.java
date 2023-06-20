package pkg;

public class Operatorspgm {

	public static void main(String[] args) {
		//Arithmetic operators
		System.out.println("Arithmeticoperators");
		
		int a=20,b=10;
		System.out.println("a+b="+(a+b));//30
		System.out.println("a-b="+(a-b));//10
		System.out.println("a*b="+(a*b));//200
		System.out.println("a/b="+(a/b));//quotient
		System.out.println("a%b="+(a%b));//reminder
		
		//Assignment operators
		
		System.out.println("Assignmentoperators");
		int c=30,d=20;
		
		System.out.println("c+=d="+(c+=d));//c=c+d  30+20   50
		System.out.println("c-=d="+(c-=d));//c=c-d  50-20   30
		System.out.println("c*=d="+(c*=d));//c=c*d  30*20   600
		System.out.println("c/=d="+(c/=d));//c=c/d  600/20  30
		
		//Relational operators
		
		System.out.println("Relationaloperators");
		
		System.out.println(a>b);//true
		System.out.println(a<b);//false
		System.out.println(a<=b);//false
		System.out.println(a>=b);//true
		System.out.println(a!=b);//true
		System.out.println(a==b);//false
		
		//logical operators
		
		System.out.println("Logicaloperators");
		
		
		String username="abc";
		String password="123";
		
		System.out.println(username=="abc"&&password=="123");//true
		System.out.println(username=="ab"&&password=="12");//false
		System.out.println(username=="abc"&&password=="1234");//false
		System.out.println(username=="ab"&&password=="123");//false
		System.out.println(username=="abc"||password=="1234");//true
		System.out.println(username=="abc"||password=="123");//true
		System.out.println(username=="ab"||password=="123");//true
		System.out.println(username=="ab"||password=="1234");//false
		System.out.println(!(username=="abc"));//false
		System.out.println(!(username=="ab"));//true
		System.out.println(!(password=="123"));//false
		System.out.println(!(password=="1234"));//true
		
		
		//unary operators
		
		System.out.println("Unaryoperators");
		
		//  ++ increment by 1
		//  --decrement by 1
		//x++ post increment
		//++x pre increment
		
		int x=2;
		System.out.println(x++);//2
		System.out.println(x);//3
		System.out.println(x--);//3
		System.out.println(x);//2
		
		int y=5;
		System.out.println(++y);//6
		System.out.println(--y);//5
		
		
		
		
		
	}

}
