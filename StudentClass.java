package Assignment6;

public class StudentClass {
	    String name;
	    public StudentClass() {
	        this.name = "Unknown";
	    }

	    public StudentClass(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public static void main(String[] args) {
	        StudentClass student1 = new StudentClass();
	        StudentClass student2 = new StudentClass("Tom");

	        System.out.println("Student 1's name: " + student1.getName());
	        System.out.println("Student 2's name: " + student2.getName());
	    }
	}


