package teht07State;

public class Charmander implements PokemonState {
	private static Charmander state = null;

	private Charmander() {

	}

	public static Charmander getState() {
		if(state == null) {
			state = new Charmander();
		}
		return state;
	}

	@Override
	public void evolve(Pokemon pokemon) {
		pokemon.setState(Charmeleon.getState());
		System.out.println("");
	}

	@Override
	public void meleeAttack() {
		System.out.println(this.getClass().getSimpleName() + " attacks with Scratch.");

	}

	@Override
	public void rangedAttack() {
		System.out.println(this.getClass().getSimpleName() + " attacks with Ember.");

	}

	@Override
	public void dodge() {
		System.out.println(this.getClass().getSimpleName() + " rolls on the ground.");
	}

}
