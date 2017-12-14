package teht14Builder;

public class Chef {
	private BurgerBuilder builder;

	public void setBuilder(BurgerBuilder builder) {
		this.builder = builder;
	}

	public Burger getBurger() {
		return builder.getBurger();
	}

	public void buildBurger() {
		builder.buildBun();
		builder.buildPatty();
		builder.buildCheese();
		builder.buildSauce();
	}

}
