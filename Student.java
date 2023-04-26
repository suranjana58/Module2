package Assignment6;
public class Student {
	    String name;
	    int enrollmentNo;

	    public Student(String name, int enrollmentNo) {
	        this.name = name;
	        this.enrollmentNo = enrollmentNo;
	    }

	    public static void main(String[] args) {
	        Student amay = new Student("Amay", 132);
	        System.out.println("Name: " + amay.name);
	        System.out.println("Enrollment No: " + amay.enrollmentNo);
	    }
	}


