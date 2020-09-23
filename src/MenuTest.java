import java.util.Arrays;
import java.util.List;

public class MenuTest {
	public static void main(String[] args) {
		List<Menu> menus = Arrays.asList(
			new MartiniMenu(), 
			new CharcuterieMenu(), 
			new DesertMenu()
		);
		
		Waitress waitress = new Waitress(menus);

		waitress.printMenu();
	}
}