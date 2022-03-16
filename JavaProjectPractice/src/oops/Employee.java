package oops;

public class Employee {

	int empid;
	String empname;
	int salary;
	int deptno;
	public static void main(String[] args) {
		//Assigning values to class variables using Objects
		
		
		/*Employee emp1 = new Employee();
		
		emp1.empid=10;
		emp1.empname="Hima";
		emp1.salary=100000;
		emp1.deptno=100;
		emp1.display();*/
		
	//assigning values to class variables using constructor
		/*Employee emp1 = new Employee(10,"Hima",10000,20);
		emp1.display();*/
	//assigning values to class variables using method.
		Employee emp = new Employee();
		emp.setdata(10, "Hima",  10000, 20);
		emp.display();
				
	}
	void setdata(int id,String name, int sal, int dno) {
		empid = id;
		empname=name;
		salary=sal;
		deptno=dno;
	}
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}

	/*Employee(int id, String name, int sal, int dno){
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
	}*/
}
