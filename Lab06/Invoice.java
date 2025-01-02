package Lab06;

public class Invoice {
	private	String	partNumber;
	private	String	partDes;
	private	int 	quantity;
	private	double	price;

	public Invoice() {
		partNumber	= "000000";
		partDes		= "Item not found";
		quantity	= 0;
		price		= 0.00;
	}

	public Invoice(String partNumber, String partDes, int quantity, double price) {
		this.partNumber	= partNumber;
		this.partDes	= partDes;
		this.quantity	= quantity;
		this.price		= price;
	}

	public double invoiceAmount() {
		if (this.quantity <= 0 || this.price <= 0)
			return 0;
		return (this.quantity * this.price);
	}

	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDes() {
		return partDes;
	}
	public void setPartDes(String partDes) {
		this.partDes = partDes;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
