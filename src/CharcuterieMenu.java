import java.util.Iterator;

public class CharcuterieMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public CharcuterieMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem(
			"Cheese Board",
			"4 hard and 2 soft cheeses", 
			false, 
			15.99
		);
		addItem(
			"Meat Platter",
			"3 types of smoked sausages and cured ham", 
			false, 
			20.00
		);
		addItem(
			"Chef's special",
			"Ask waitress", 
			false, 
			9.99
		);
	}

	public void addItem(String name, String description, boolean isAlcoholic, double price) {
		MenuItem menuItem = new MenuItem(name, description, isAlcoholic, price);

		if (MAX_ITEMS <= numberOfItems) {
			System.out.println("Sorry, menu is full. It cannot add new item");
		} 
		else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems += 1;
		}
	}

	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}