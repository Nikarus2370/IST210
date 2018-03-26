// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.
import java.util.Scanner;

public class PayrollSystemTest 
{
   public static void main( String[] args ) 
   {
	   Scanner input = new Scanner (System.in);
	   Date[] dates = new Date[4];
	      
	      dates[0] = new Date(6,15,1944);
	      dates[1] = new Date(12,29,1960);
	      dates[2] = new Date(9,8,1954);
	      dates[3] = new Date(3,2,1965);
      // create subclass objects
      SalariedEmployee salariedEmployee = 
         new SalariedEmployee( "John", "Smith", "111-11-1111", dates[0], 800.00 );
      HourlyEmployee hourlyEmployee = 
         new HourlyEmployee( "Karen", "Price", "222-22-2222", dates[1], 16.75, 40 );
      CommissionEmployee commissionEmployee = 
         new CommissionEmployee( 
         "Sue", "Jones", "333-33-3333", dates[2], 10000, .06 );
      BasePlusCommissionEmployee basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee( 
         "Bob", "Lewis", "444-44-4444", dates[3], 5000, .04, 300 );

      
      

      
      System.out.println( "Employees processed individually:\n" );
      
      System.out.printf( "%s\n%s: $%,.2f\n\n", 
         salariedEmployee, "earned", salariedEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         hourlyEmployee, "earned", hourlyEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         commissionEmployee, "earned", commissionEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings() );

      // create four-element Employee array
      Employee[] employees = new Employee[ 4 ]; 

      // initialize array with Employees
      employees[ 0 ] = salariedEmployee;
      employees[ 1 ] = hourlyEmployee;
      employees[ 2 ] = commissionEmployee; 
      employees[ 3 ] = basePlusCommissionEmployee;
      
      int month;
      do
      {
    	 System.out.print("Enter the current month(1-12): "); 
    	 month = input.nextInt();
    	 
      }while(month <= 0 || month > 12);
      
      System.out.println( "Employees processed polymorphically:\n" );
      
      // generically process each element in array employees
      for ( Employee currentEmployee : employees ) 
      {
         System.out.println( currentEmployee ); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if ( currentEmployee instanceof BasePlusCommissionEmployee ) 
         {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               ( BasePlusCommissionEmployee ) currentEmployee;

            employee.setBaseSalary( 1.10 * employee.getBaseSalary() );

            System.out.printf( 
               "new base salary with 10%% increase is: $%,.2f\n",
               employee.getBaseSalary() );
         } // end if

         System.out.printf( 
            "earned $%,.2f", currentEmployee.earnings() );
         
         if(currentEmployee.getBirthDate().getMonth() == month)
         {
        	 System.out.println(" plus $100.00 birthday bonus");
         }
         System.out.print("\n\n");
      } // end for

      // get type name of each object in employees array
      for ( int j = 0; j < employees.length; j++ )
         System.out.printf( "Employee %d is a %s\n", j, 
            employees[ j ].getClass().getName() ); 
   } // end main
} // end class PayrollSystemTest

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/


/*
 Date object constructor for date 6/15/1944
Date object constructor for date 12/29/1960
Date object constructor for date 9/8/1954
Date object constructor for date 3/2/1965
Employees processed individually:

salaried employee: John Smith
social security number: 111-11-1111
birth date: 6/15/1944
weekly salary: $800.00
earned: $800.00

hourly employee: Karen Price
social security number: 222-22-2222
birth date: 12/29/1960
hourly wage: $16.75; hours worked: 40.00
earned: $670.00

commission employee: Sue Jones
social security number: 333-33-3333
birth date: 9/8/1954
gross sales: $10,000.00; commission rate: 0.06
earned: $600.00

base-salaried commission employee: Bob Lewis
social security number: 444-44-4444
birth date: 3/2/1965
gross sales: $5,000.00; commission rate: 0.04; base salary: $300.00
earned: $500.00

Enter the current month(1-12): 3
Employees processed polymorphically:

salaried employee: John Smith
social security number: 111-11-1111
birth date: 6/15/1944
weekly salary: $800.00
earned $800.00

hourly employee: Karen Price
social security number: 222-22-2222
birth date: 12/29/1960
hourly wage: $16.75; hours worked: 40.00
earned $670.00

commission employee: Sue Jones
social security number: 333-33-3333
birth date: 9/8/1954
gross sales: $10,000.00; commission rate: 0.06
earned $600.00

base-salaried commission employee: Bob Lewis
social security number: 444-44-4444
birth date: 3/2/1965
gross sales: $5,000.00; commission rate: 0.04; base salary: $300.00
new base salary with 10% increase is: $330.00
earned $530.00 plus $100.00 birthday bonus


Employee 0 is a SalariedEmployee
Employee 1 is a HourlyEmployee
Employee 2 is a CommissionEmployee
Employee 3 is a BasePlusCommissionEmployee

 */