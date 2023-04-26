package Assignment6;

public class Employee {
	    String name;
	    int yearOfJoining;
	    String address;

	    public Employee(String name, int yearOfJoining,String address) {
	        this.name = name;
	        this.yearOfJoining = yearOfJoining;
	        this.address = address;
	    }

	    public static void main(String[] args) {
	        Employee employee1 = new Employee("Robert",1994,"64C- Walls Street");
	        Employee employee2 = new Employee("Sam", 2000, "68D- Walls Street");
	        Employee employee3 = new Employee("John",1999,"26B- Walls Street");

	        System.out.println("Name\tYear of Joining\tSalary\t\tAddress");
	        System.out.println(employee1.name + "\t" + employee1.yearOfJoining + "\t\t" + employee1.address);
	        System.out.println(employee2.name + "\t" + employee2.yearOfJoining + "\t\t"+ employee2.address);
	        System.out.println(employee3.name + "\t" + employee3.yearOfJoining + "\t\t" + employee3.address);
	    }
	}


