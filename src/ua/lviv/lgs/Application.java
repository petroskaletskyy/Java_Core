package ua.lviv.lgs;

public class Application {
	
		//Create class Rectangle
		public static class Rectangle {  
		
		private int width;
		private int height;

		//Create constructor without parameters
		public Rectangle() {
			this.width = 12;
			this.height = 8;
		} 
		
		//Create constructor with parameters
		public Rectangle (int a, int b) {
			this.width = a;
			this.height = b;
		}
		
		//Calculate perimeter
		public int getPerimeterRectangle() {
			return (width + height) * 2;
		}
		
		//Calculate area
		public int getAreaRectangle() {
			return width * height;
		}
	}
		
		//Create class Circle
		public static class Circle {  
				
		private double radius;
		private double diameter;

		//Create constructor without parameters
		public Circle() {
			this.radius = 8.4;
			this.diameter = 16.8;
		} 
				
		//Create constructor with parameters
		public Circle (double i, double j) {
			this.radius = i;
			this.diameter = j;
		}
				
		//Calculate length
		public double getLengthCircle() {
			return 2 * 3.14 * radius;
		}
				
		//Calculate area
		public double getAreaCircle() {
			return (3.14 * diameter * diameter) / 4;
			}
		}

	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle();
		System.out.println("Rectangle area = " + rec1.getAreaRectangle());
		System.out.println("Rectangle perimeter = " + rec1.getPerimeterRectangle());
		
		System.out.println("-----");
		
		Rectangle rec2 = new Rectangle(10, 4);
		System.out.println("Rectangle area = " + rec2.getAreaRectangle());
		System.out.println("Rectangle perimeter = " + rec2.getPerimeterRectangle());
		
		System.out.println("--------------------------");
		
		Circle circle1 = new Circle();
		System.out.println("Circle length = " + circle1.getLengthCircle());
		System.out.println("Circle area = " + circle1.getAreaCircle());
		
		System.out.println("-----");
		
		Circle circle2 = new Circle(6.5, 13);
		System.out.println("Circle length = " + circle2.getLengthCircle());
		System.out.println("Circle area = " + circle2.getAreaCircle());
	}

}
