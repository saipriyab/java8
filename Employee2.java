package java8;


public  class Employee2 {
	
	public int id;
	public String name;
	public String address;
	public int salary;
	public Employee(int id,String name,String address,int salary)
	{
	this.id=id;
	this.name=name;
	this.address=address;
	this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public static int compareBySal(Employee emp1, Employee emp2) {
		return emp1.getSalary().compareTo(emp2.getSalary());
	}
}
