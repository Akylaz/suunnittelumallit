package teht14Builder;

import java.util.ArrayList;
import java.util.List;

public class Hesburger extends BurgerBuilder {
	private List<Ingredient> burger = new ArrayList<Ingredient>();

	@Override
	public void buildCheese() {
		burger.add(new Cheese("goat cheese"));
	}

	@Override
	public void buildSauce() {
		burger.add(new Sauce("mayo"));
	}

	@Override
	public void buildPatty() {
		burger.add(new Patty("beef patty"));
	}

	@Override
	public void buildBun() {
		burger.add(new Bun("wheat bun"));
	}

	public Burger getBurger() {
		return new ListBurger(burger);
	}

}
