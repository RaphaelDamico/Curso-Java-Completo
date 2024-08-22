package entities;

public class Product {
	public String name;
	public double price;
	public Integer quantity;
	
	public Product() {
	}

	public Product(String name, double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}



	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(Integer quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(Integer quantity) {
		this.quantity -= quantity;
	}
	
	@Override
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
