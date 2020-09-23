import java.util.Hashtable;
import java.util.Iterator;

public class MartiniMenu implements Menu {
	Hashtable<String, MenuItem> menuItems = new Hashtable<>();

	public MartiniMenu() {
		addItem(
			"Dry Martini",
			"With Vermouth", 
			true, 
			8.99
		);
		addItem(
			"Dirty Martini",
			"With Olive Juice", 
			true, 
			8.50
		);
		addItem(
			"Kids Dirty Martini",
			"Water with Olives", 
			false, 
			1.50
		);
	}

	public void addItem(
			String name, 
			String description, 
			boolean isAlcoholic, 
			double price
		) {
		MenuItem menuItem = new MenuItem(name, description, isAlcoholic, price);
		menuItems.put(menuItem.getName(), menuItem);
	}

	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
}