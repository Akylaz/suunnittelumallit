package teht14Builder;

public class StringBurger implements Burger {
	private String cheese;
	private String bun;
	private String patty;
	private String sauce;

	public StringBurger(String cheese, String bun, String patty, String sauce) {
		this.cheese = cheese;
		this.bun = bun;
		this.patty = patty;
		this.sauce = sauce;
	}

	public void printBurger() {
		System.out.println(bun + ", " + patty + ", " + cheese + ", " + sauce);
	}

	public Burger getBurger() {
		return this;
	}


}
