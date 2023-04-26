package Assignment6;

public class Triangle {
	    int side1;
	    int side2;
	    int side3;
	    public Triangle() {
	        this.side1 = 2;
	        this.side2 = 4;
	        this.side3 = 5;
	    }
	    public double calculateArea() {
	        double s = (side1 + side2 + side3) / 2.0;
	        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	    }
	    public int calculatePerimeter() {
	        return side1 + side2 + side3;
	    }

	    public static void main(String[] args) {
	        Triangle triangle = new Triangle();
	        double area = triangle.calculateArea();
	        int perimeter = triangle.calculatePerimeter();
	        System.out.println("Area: " + area);
	        System.out.println("Perimeter: " + perimeter);
	    }
	}

