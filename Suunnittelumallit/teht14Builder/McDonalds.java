package teht14Builder;

public class McDonalds extends BurgerBuilder {
	private String cheese;
	private String bun;
	private String patty;
	private String sauce;

	@Override
	public void buildCheese() {
		cheese = "cheddar";
	}

	@Override
	public void buildSauce() {
		sauce = "ketchup";
	}

	@Override
	public void buildPatty() {
		patty = "tuna patty";
	}

	@Override
	public void buildBun() {
		bun = "sesame seed bun";
	}

	public Burger getBurger() {
		return new StringBurger(cheese,bun,patty,sauce);
	}

}
