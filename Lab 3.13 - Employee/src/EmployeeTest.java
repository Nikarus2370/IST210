
public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Bob", "Jones", 34500.00);
		Employee emp2 = new Employee("Susan", "Baker", 37809.00);
		
		
		System.out.printf("Employee 1: %s %s; Yearly Salary $%,.2f\n",
				emp1.getFirstName(), emp1.getLastName(), emp1.getSalary());
		System.out.printf("Employee 2: %s %s; Yearly Salary $%,.2f\n",
				emp2.getFirstName(), emp2.getLastName(), emp2.getSalary());
		
		System.out.println();
		
		emp1.setSalary(emp1.getSalary()*1.1);
		emp2.setSalary(emp2.getSalary()*1.1);
		
		System.out.println("Increasing employee salaries by 10%");
		System.out.printf("Employee 1: %s %s; Yearly Salary $%,.2f\n",
				emp1.getFirstName(), emp1.getLastName(), emp1.getSalary());
		System.out.printf("Employee 2: %s %s; Yearly Salary $%,.2f\n",
				emp2.getFirstName(), emp2.getLastName(), emp2.getSalary());

	}

}


/*

Employee 1: Bob Jones; Yearly Salary $34,500.00
Employee 2: Susan Baker; Yearly Salary $37,809.00

Increasing employee salaries by 10%
Employee 1: Bob Jones; Yearly Salary $37,950.00
Employee 2: Susan Baker; Yearly Salary $41,589.90

*/