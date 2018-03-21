package java8;
import java.util.*;
public class Empimpl {
	public static void main(String args[])
	{
	ArrayList<Employee> a1=new ArrayList<Employee>();
	a1.add(new Employee(1,"sai","hyd",133));
	a1.add(new Employee(2,"sai2","hyd",113));
	a1.add(new Employee(3,"sai3","hyd",123));
	class Empsalcomparator implements Comparator<Employee>
	{

		@Override
		public int compare(Employee emp1, Employee emp2) {
			return emp1.getSalary().compareTo(emp2.getSalary());
		}
		
	}
	Collections.sort(a1,new Empsalcomparator());
	Collections.sort(a1,Employee::compareBySal);
	a1.forEach(e->System.out.println(e.id+" "+e.name+" "+e.address+" "+e.salary));
	}
}
