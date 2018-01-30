
public class InvoiceTest {

	public static void main(String[] args) {
	
		Invoice test = new Invoice("1234","Hammer",2,14.95);
		
		System.out.println("Original Invoice");
		System.out.printf("Part number: %s\n", test.getPartNumber());
		System.out.printf("Description: %s\n", test.getDescription());
		System.out.printf("Quantity: %d\n", test.getQuantity());
		System.out.printf("Price: $%.2f\n", test.getPrice());
		System.out.printf("Invoice Amount: $%.2f\n", test.getInvoiceAmount());
		
		System.out.println("\n");
		
		test.setPartNumber("001234");
		test.setDescrption("Yellow Hammer");
		test.setQuantity(3);
		test.setPrice(19.49);

		System.out.println("Updated invoice information");
		System.out.printf("Part number: %s\n", test.getPartNumber());
		System.out.printf("Description: %s\n", test.getDescription());
		System.out.printf("Quantity: %d\n", test.getQuantity());
		System.out.printf("Price: $%.2f\n", test.getPrice());
		System.out.printf("Invoice Amount: $%.2f\n", test.getInvoiceAmount());
		
		System.out.println("\n");
		
		test.setPartNumber("001234");
		test.setDescrption("Yellow Hammer");
		test.setQuantity(-3);
		test.setPrice(-19.49);
		
		System.out.println("With negative quantity and negative price");
		System.out.printf("Part number: %s\n", test.getPartNumber());
		System.out.printf("Description: %s\n", test.getDescription());
		System.out.printf("Quantity: %d\n", test.getQuantity());
		System.out.printf("Price: $%.2f\n", test.getPrice());
		System.out.printf("Invoice Amount: $%.2f\n", test.getInvoiceAmount());
		
		System.out.println("\n");
	}
}
