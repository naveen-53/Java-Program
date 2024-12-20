package JavaProgram;

public class Variables {
	static int a=10; 
	static int b=20;
	int c=30,d=40;
	static void add() {
		int c=a+b;
		System.out.println(c);
		
	}
	void Add() {
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
		
	}
	void addition() {
		int add=c+d;
		System.out.println(add);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables v=new Variables();
		v.add();
		v.Add();
		v.addition();

	}

}
