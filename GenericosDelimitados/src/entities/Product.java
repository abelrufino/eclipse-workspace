package entities;

public class Product implements Comparable<Product> {

	private String name;
	private Double Price;

	public Product(String name, Double price) {
		this.name = name;
		Price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", Price);
	}

	@Override
	public int compareTo(Product other) {
		// TODO Auto-generated method stub
		return Price.compareTo(other.getPrice());
	}

}
