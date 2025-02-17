import java.util.Scanner;
import java.util.Random;

public class Pikachu {

	protected String name = "Pikachu";
	protected int hp = 100;
	protected String m1 = "Thunderbolt";
	protected String m2 = "IronTail";
	protected String m3 = "Electroball";
	protected String m4 = "Discharge";
	protected final int d1 = 20;
	protected final int d2 = 15;
	protected final int d3 = 30;
	protected final int d4 = 15;
	protected boolean miss = true;
	
	public Pikachu() {

	}
	
	public int getHP() {
		return hp;
	}
	
	public void fixHP() {
		if(hp < 0)
			hp = 0;
	}
	
	public String name() {
		return name;
	}
	
	public String moveSet() {
		String list = m1 + "   " + m2 + "   " + m3 + "   " + m4;
		return list;
	}
	
	public String useMove(Caterpie cat) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		String move = scan.next();
		int num = rand.nextInt(10) + 1;
		String text = "";
		
		if((move.equals(m1) || move.equals(m2) || move.equals(m3) || move.equals(m4)) && num == 3) {
			text = "Pikachu flinched and couldn't move!" + '\n';
			miss = true;
		}
		else if(move.equals(m1)) {
			cat.hp -= d1;
			text = name + " used " + m1 + '!';
			miss = false;
		}
		else if(move.equals(m2)) {
			cat.hp -= d2;
			text = name + " used " + m2 + '!';
			miss = false;
		}
		else if(move.equals(m3)) {
			cat.hp -= d3;
			text = name + " used " + m3 + '!';
			miss = false;
		}
		else if(move.equals(m4)) {
			cat.hp -= d4;
			text = name + " used " + m4 + '!';
			miss = false;
		}
		else {
			text = "Pikachu's attack missed!" + '\n';
			miss = true;
		}
		return text;
	}
}
