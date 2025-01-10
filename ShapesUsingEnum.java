package JavaTopics;

public class ShapesUsingEnum {
	
	enum Shapes{SQUARE,RECTANGLE,CIRCLE,TRIANGLE,HEXAGON;}

	public static void main(String[] args) {
		
		Shapes s = Shapes.CIRCLE;
		
		System.out.println(s);

	}

}
