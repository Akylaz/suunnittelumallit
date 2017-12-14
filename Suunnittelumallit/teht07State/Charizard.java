package teht07State;

public class Charizard implements PokemonState {
	private static Charizard state = null;

	private Charizard() {

	}

	public static Charizard getState() {
		if(state == null) {
			state = new Charizard();
		}
		return state;
	}

	@Override
	public void evolve(Pokemon pokemon) {
		System.out.println("");
	}

	@Override
	public void meleeAttack() {
		System.out.println(this.getClass().getSimpleName() + " attacks with Dragon Claw.");
	}

	@Override
	public void rangedAttack() {
		System.out.println(this.getClass().getSimpleName() + " attacks with Flare Blitz.");
	}

	@Override
	public void dodge() {
		System.out.println(this.getClass().getSimpleName() + " jumps up.");
	}

}
