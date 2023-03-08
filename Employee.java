public class Employee 
{
	private String name;
	private String department;
	private double salary;
	
	//constructor
	public Employee(String employeeName, String department, double salary) {
		this.name = employeeName;
		this.department = department;
		this.salary = salary;
	}

    //To return name
	public String getName()
	{
		return name;
	
	}
	
	//to return department
	public String getDepartment()
	{
		return department;
	
	}
	
	//to return salary
	public double getSalary()
	{
		return salary;
	}
	
	//to calculate increment
	public void increment(double percent)
	{
		double result;
		result = salary + (salary * (percent/100));
		System.out.println("After Increment");
		System.out.println("Salary: " + result);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Before increment");
		Employee emp1 = new Employee("John","Finance",3000);
		System.out.println("Staff name: "+emp1.getName());
		System.out.println("Staff department: "+emp1.getDepartment());
		System.out.println("Staff salary: "+emp1.getSalary());
		emp1.increment(30);
		
		System.out.println("Before increment");
		Employee emp2 = new Employee("Emily","Human Resource",5000);
		System.out.println("Staff name: "+emp2.getName());
		System.out.println("Staff department: "+emp2.getDepartment());
		System.out.println("Staff salary: "+emp2.getSalary());
		emp2.increment(60);
	}
}
