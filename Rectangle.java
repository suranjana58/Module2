package Assignment6;

public class Rectangle {
	    private double length;
	    private double breadth;

	    public Rectangle() {
	        this.length = 0;
	        this.breadth = 0;
	    }

	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    public Rectangle(double side) {
	        this.length = side;
	        this.breadth = side;
	    }

	    public double getArea() {
	        return length * breadth;
	    }

	    public static void main(String[] args) {
	        Rectangle rect1 = new Rectangle();
	        Rectangle rect2 = new Rectangle(5, 100);
	        Rectangle rect3 = new Rectangle(2);

	        System.out.println("Area of rect1: " + rect1.getArea());
	        System.out.println("Area of rect2: " + rect2.getArea());
	        System.out.println("Area of rect3: " + rect3.getArea());
	    }
	}


