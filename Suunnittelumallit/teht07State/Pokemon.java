package teht07State;

public class Pokemon {
	private PokemonState state;

	public Pokemon() {
		state = Charmander.getState();
	}

	public void evolve() {
		state.evolve(this);
	}

	public void meleeAttack() {
		state.meleeAttack();
	}

	public void rangedAttack() {
		state.rangedAttack();
	}

	public void dodge() {
		state.dodge();
	}

	protected void setState(PokemonState newState){
		state = newState;
	}



}
