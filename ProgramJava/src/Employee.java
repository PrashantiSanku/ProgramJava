
public class Employee {
	
	static int numOfObjects = 0;
	
	public Employee()
	{
		numOfObjects++;
	}

	public static void main(String[] args) {
		
		// Count Total Number Of Class Objects Created In Java
		
		
		
				Employee e1 = new Employee();
				Employee e2 = new Employee();
				Employee e3 = new Employee();
				Employee e4 = new Employee();
				Employee e5 = new Employee();
				Employee e6 = new Employee();
				Employee e7 = new Employee();
				
				System.out.println(" Total number of Objects: " + numOfObjects);

	}

}
