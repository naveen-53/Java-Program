package JavaProgram;

public class Operators1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13,b=4;
		
		//Arithmetic Operators
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//unary operators
		System.out.println("% values is "+(a++));
		System.out.println("% values is "+(++a));
		System.out.println("% values is "+(a--));
		System.out.println("% values is "+(--a));
		
		//Assignment Operator with Arithmetic Operator
		System.out.println(b+=3);
		System.out.println(b-=3);
		System.out.println(b*=3);
		System.out.println(b/=3);
		
		
		//Comparison Operators
		int e=20,f=30,g=40;
		System.out.println("f>e : "+(f>e));     
		System.out.println("f<e : "+(f<e));     
		System.out.println("f==e : "+(f==e));
		System.out.println("g>=e : "+(g>=e));
		System.out.println("f<=e : "+(f<=e));
		
		// Ternary Operators
		int a1=20, b1=10, c1=30, result1;
		result1= ((a1>b1)?(a1>c1)?a1:c1:(b1>c1)?b1:c1);
		System.out.println("max of three nos "+ result1);
		
		
		//bitwise operators
		int a2= 0b1010;
		int b2= 0b1100;
		System.out.println("a2 & b2: "+(a2&b2));
		System.out.println("a2 | b2: "+(a2|b2));
		System.out.println("a2 ^ b2: "+(a2^b2));
		
		//instance of operator
		Operators1 o1=new Operators1();
		Operators1 o2 =new Operators1();
		System.out.println(o1 instanceof Operators1);
		
				

	}


}
