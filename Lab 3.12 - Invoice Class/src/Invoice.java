
public class Invoice {
	
	private String partNumber;
	private String description;
	private int quantity;
	private double price;
	
	public Invoice(String partNumber, String description, int quantity, double price){
		this.partNumber = partNumber;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void setPartNumber(String partNumber){
		this.partNumber = partNumber;
	}
	public String getPartNumber(){
		return this.partNumber;
	}
	
	public void setDescrption(String descrption){
		this.description = descrption;
	}
	public String getDescription(){
		return this.description;
	}
	
	public void setQuantity(int quantity){
		if(quantity >= 0){
			this.quantity = quantity;
		} else {
			this.quantity = 0;
		}
	}
	public int getQuantity(){
		return this.quantity;
	}
		
	public void setPrice(double price){
		if(price >= 0.0){
			this.price = price;
		} else {
			this.price = 0.0;
		}
	}
	public double getPrice(){
		return this.price;
	}
	
	public double getInvoiceAmount(){
		return this.quantity * this.price;
	}
}
