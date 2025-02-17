import java.util.Random;

public class Caterpie {

	protected String name = "Caterpie";
	protected int hp = 100;
	protected String m1 = "Bug Bite";
	protected String m2 = "Pin Missile";
	protected String m3 = "Tackle";
	protected String m4 = "Signal Beam";
	protected final int d1 = 30;
	protected final int d2 = 25;
	protected final int d3 = 45;
	protected final int d4 = 10;
	protected boolean miss = true;
	
	public Caterpie() {
		
	}
	public int getHP() {
		return hp;
	}
	
	public void fixHP() {
		if(hp < 0)
			hp = 0;
	}
	
	public String hit(Pikachu pika) {
		Random rand = new Random();
		
		int move = rand.nextInt(5) + 1;
		String text = "";
		
		if(move == 1) {
			pika.hp -= d1;
			text = name + " used " + m1 + '!';
			miss = false;
		}
		else if(move == 2) {
			pika.hp -= d2;
			text = name + " used " + m2 + '!';
			miss = false;
		}
		else if(move == 3) {
			pika.hp -= d3;
			text = name + " used " + m3 + '!';
			miss = false;
		}
		else if(move == 4) {
			pika.hp -= d4;
			text = name + " used " + m4 + '!';
			miss = false;
		}
		else
			text = "Caterpie's attack missed!" + '\n';
		return text;
	}
}
