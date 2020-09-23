import java.util.ArrayList;
import java.util.Iterator;

public class DesertMenu implements Menu {
	ArrayList<MenuItem> menuItems;

	public DesertMenu() {
		menuItems = new ArrayList<>();

		addItem(
			"Tiramisu",
			"With Khalula liquor", 
			true, 
			6.95
		);
		addItem(
			"Jello Shots",
			"Watermellon flavor", 
			true, 
			3.99
		);
	}

	public void addItem(
			String name, 
			String description, 
			boolean isAlcoholic, 
			double price
		) {
		menuItems.add(
			new MenuItem(
				name, 
				description, 
				isAlcoholic, 
				price
			)
		);
	}

	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
}