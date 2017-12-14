package teht14Builder;

import java.util.ArrayList;
import java.util.List;

public class ListBurger implements Burger {
	private List<Ingredient> ingredients = new ArrayList<Ingredient>();


	public ListBurger(List<Ingredient> list) {
		for(int i=0;i<list.size();i++) {
			ingredients.add(list.get(i));
		}
	}

	public void printBurger() {
		System.out.println(ingredients);
		for(int i=0;i<ingredients.size();i++) {
			System.out.print(ingredients.get(i).getType() + ", ");
		}
		System.out.println("\n");
	}

	public Burger getBurger() {
		return this;
	}

}
