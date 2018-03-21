package java8;
import java.util.*;
public class Empimpl {
	public static void main(String args[])
	{
	ArrayList<Employee> a1=new ArrayList<Employee>();
	a1.add(new Employee(1,"sai","hyd",123));
	a1.add(new Employee(2,"sai2","hyd",133));
	a1.add(new Employee(3,"sai3","hyd",133));
	a1.forEach(e->System.out.println(e.id+" "+e.name+" "+e.address+" "+e.salary));
	}
}
