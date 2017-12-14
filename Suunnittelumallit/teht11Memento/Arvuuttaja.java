package teht11Memento;

public class Arvuuttaja {

	public Object liityPeliin(Asiakas asiakas) {
		int luku = (int)(Math.random() * 20);
		return new Memento(luku);
	}

	public boolean tarkistaArvaus(int arvaus, Object mem) {
		return ((Memento) mem).getLuku() == arvaus ? true : false;
	}



	private class Memento {
		private int arvattuLuku;

		public Memento(int luku) {
			this.arvattuLuku = luku;
		}

		public int getLuku() {
			return arvattuLuku;
		}
	}

}
