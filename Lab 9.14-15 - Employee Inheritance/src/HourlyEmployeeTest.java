
public class HourlyEmployeeTest {
	public static void main(String[] args) 
	   {
			
		System.out.println("\n\nTesting Base Plus Comission Employee\n");
	      // instantiate BasePlusCommissionEmployee object
	      BasePlusCommissionEmployee employee = 
	         new BasePlusCommissionEmployee(
	            "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
	      
	      // get base-salaried commission employee data
	      System.out.println(
	         "Employee information obtained by get methods:");
	      System.out.printf("%n%s %s%n", "First name is",
	         employee.getFirstName());
	      System.out.printf("%s %s%n", "Last name is", 
	         employee.getLastName());
	      System.out.printf("%s %s%n", "Social security number is", 
	         employee.getSocialSecurityNumber());
	      System.out.printf("%s %.2f%n", "Gross sales is", 
	         employee.getGrossSales());
	      System.out.printf("%s %.2f%n", "Commission rate is",
	         employee.getCommissionRate());
	      System.out.printf("%s %.2f%n", "Base salary is",
	         employee.getBaseSalary());

	      employee.setBaseSalary(1000); 
	      
	      System.out.printf("%n%s:%n%n%s%n", 
	         "Updated employee information obtained by toString", 
	         employee.toString());
	      
	      System.out.println("\n\nTesting Comission Employee\n");
	      
	      CommissionEmployee employee2 = 
	 	         new CommissionEmployee(
	 	            "Evan", "Monroe", "123-45-6789", 5000, .04);
	 	      
	 	      System.out.println(
	 	         "Employee information obtained by get methods:");
	 	      System.out.printf("%n%s %s%n", "First name is",
	 	         employee2.getFirstName());
	 	      System.out.printf("%s %s%n", "Last name is", 
	 	         employee2.getLastName());
	 	      System.out.printf("%s %s%n", "Social security number is", 
	 	         employee2.getSocialSecurityNumber());
	 	      System.out.printf("%s %.2f%n", "Gross sales is", 
	 	         employee2.getGrossSales());
	 	      System.out.printf("%s %.2f%n", "Commission rate is",
	 	         employee2.getCommissionRate());

	 	      employee2.setGrossSales(10000); 
	 	      
	 	      System.out.printf("%n%s:%n%n%s%n", 
	 	         "Updated employee2 information obtained by toString", 
	 	         employee2.toString());
	 	      
	 	     System.out.println("\n\nTesting Hourly Employee\n");
		      
	 	    HourlyEmployee employee3 = 
		 	         new HourlyEmployee(
		 	            "Mike", "Dunham", "867-53-0999", 36.5, 7.75);
		 	      
		 	      System.out.println(
		 	         "Employee information obtained by get methods:");
		 	      System.out.printf("%n%s %s%n", "First name is",
		 	         employee3.getFirstName());
		 	      System.out.printf("%s %s%n", "Last name is", 
		 	         employee3.getLastName());
		 	      System.out.printf("%s %s%n", "Social security number is", 
		 	         employee3.getSocialSecurityNumber());
		 	      System.out.printf("%s %.2f%n", "Hours worked", 
		 	         employee3.getHours());
		 	      System.out.printf("%s %.2f%n", "Wage",
		 	         employee3.getWage());
		 	      System.out.printf("%s %.2f%n", "Earnings",
		 	    		  employee3.earnings());

		 	      employee3.setHours(54); 
		 	      
		 	      System.out.printf("%n%s:%n%n%s%n", 
		 	         "Updated employee3 information obtained by toString", 
		 	         employee3.toString());
	   }
}


/*
 

Testing Base Plus Comission Employee

Employee information obtained by get methods:

First name is Bob
Last name is Lewis
Social security number is 333-33-3333
Gross sales is 5000.00
Commission rate is 0.04
Base salary is 300.00

Updated employee information obtained by toString:

base-salaried commission employee: Bob Lewis
social security number: 333-33-3333
gross sales: 5000.00
commission rate: 0.04
base salary: 1000.00


Testing Comission Employee

Employee information obtained by get methods:

First name is Evan
Last name is Monroe
Social security number is 123-45-6789
Gross sales is 5000.00
Commission rate is 0.04

Updated employee2 information obtained by toString:

commission employee: Evan Monroe
social security number: 123-45-6789
gross sales: 10000.00
commission rate: 0.04


Testing Hourly Employee

Employee information obtained by get methods:

First name is Mike
Last name is Dunham
Social security number is 867-53-0999
Hours worked 36.50
Wage 7.75
Earnings 282.88

Updated employee3 information obtained by toString:

hourly employee: Mike Dunham
social security number: 867-53-0999
wage: 7.75
hours worked: 54
total earnings: 472.75

  */