package javatesting;

public class Employee {
	
	
	int empid ;
	int salary ;
	String name;
	
	public Employee(int id,int sal,String nam) {
		empid = id ;
		salary = sal;
		name = nam;
		
	}
		

	public static void main(String[] args) {
		Employee emp1 = new Employee(127,26000,"phanee");
		Employee emp2 = new Employee(129,26000,"indra");
		
		
		
		System.out.println(emp1.empid+" "+emp1.salary+" "+emp1.name);
		System.out.println(emp2.empid+" "+emp2.salary+" "+emp2.name);
		
		
			
		}
		

	}


