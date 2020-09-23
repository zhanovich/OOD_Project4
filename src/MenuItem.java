public class MenuItem {
	String name;
	String description;
	boolean isAlcoholic;
	double price;

	public MenuItem(
			String name, 
			String description, 
			boolean isAlcoholic, 
			double price
		) {
		this.name = name;
		this.description = description;
		this.isAlcoholic = isAlcoholic;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isAlcoholic() {
		return isAlcoholic;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "MenuItem{" +
			"name='" + name + '\'' +
			", description='" + description + '\'' +
			", contains alcohol=" + isAlcoholic +
			", price=" + price +
			'}';
	}
}