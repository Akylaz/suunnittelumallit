package teht11Memento;

public class Asiakas extends Thread implements Runnable {
	private Arvuuttaja arvuuttaja;

	public Asiakas(Arvuuttaja arvuuttaja) {
		this.arvuuttaja = arvuuttaja;
	}

	@Override
	public void run() {
		boolean correct;
		int arvaus = 0;
		Object mem = arvuuttaja.liityPeliin(this);
		try {
			do {
				arvaus = (int)(Math.random()*20);
				correct = arvuuttaja.tarkistaArvaus(arvaus, mem);
				System.out.println(this.getName() + " arvasi " + arvaus);
				Thread.sleep(100);
			} while(!correct);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(this.getName() + " arvasi oikean luvun (" + arvaus + ")");
	}

}
