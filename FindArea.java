package InheritanceTypes;

import java.util.Scanner;

interface Shape{
	final double pi=3.14;
	void getArea();
	
}
class Rectangle implements Shape{
	double breath;
	double length;
	Rectangle(double b, double l){
		breath=b;
		length=l;
	}
	@Override
	public void getArea() {
		double area=breath*length;
		System.out.println(" Area of Rectangle is "+area);
	}
}
class Triangle implements Shape{
	double base;
	double height;
	Triangle(double b,double h){
		base=b;
		height=h;
	}
	@Override
	public void getArea() {
		double area=(base*height)/2;
		System.out.println("Area of Triangle is "+area);
	}
	
}
class Circle implements Shape{
	double radius;
	Circle(double r){
		radius=r;
	}
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		double area=pi*radius*radius;
		System.out.println("Area of Circle is "+area);
		
	}
	
}
public class FindArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Rectangle\n2.Triangle\n3.Circle");
		System.out.println("Enter number: ");
		int a= sc.nextInt();
		switch(a) {
		case 1: 
			System.out.println("Area of Rectangle");
			System.out.println("Enter Length:"); double x1 = sc.nextDouble();
			System.out.println("Enter Breath:"); double y1 = sc.nextDouble();
			Rectangle rt=new Rectangle(x1, y1);
			rt.getArea();
			break;
			
		case 2:
			System.out.println("Area of Triangle");
			System.out.println("Enter Base:"); double x2 = sc.nextDouble();
			System.out.println("Enter Height:"); double y2 = sc.nextDouble();
			Triangle t = new Triangle(x2,y2);
			t.getArea();
			break;
		
		case 3:
			System.out.println("Area of Circle");
			System.out.println("Enter Radius:"); double x3 = sc.nextDouble();
			Circle c = new Circle(x3);
			c.getArea();
			break;
		
		default :
			System.out.println("Invalid Data");
		}
		
		sc.close();
	}

}
