package teht07State;

public class Charmeleon implements PokemonState {
	private static Charmeleon state = null;

	private Charmeleon() {

	}

	public static Charmeleon getState() {
		if(state == null) {
			state = new Charmeleon();
		}
		return state;
	}

	@Override
	public void evolve(Pokemon pokemon) {
		pokemon.setState(Charizard.getState());
		System.out.println("");
	}

	@Override
	public void meleeAttack() {
		System.out.println(this.getClass().getSimpleName() + " attacks with Slash.");

	}

	@Override
	public void rangedAttack() {
		System.out.println(this.getClass().getSimpleName() + " attacks with Inferno.");

	}

	@Override
	public void dodge() {
		System.out.println(this.getClass().getSimpleName() + " failed to dodge.");
	}

}
