import java.util.Random;

public class Story {
	
	public Story() {
		
	}
	
	public boolean chance() {
		Random rand = new Random();
		int chance = rand.nextInt(3);
		if(chance == 0)
			return true;
		else
			return false;
	}
	
	public String dialog(Pikachu pika, Caterpie cat) {
		Random rand = new Random();
		int message = rand.nextInt(10) + 1;
		String dialog = "";
		
			if(message == 1 && pika.getHP() < 50)
				dialog = "Pikachu is getting antsy!";
			if(message == 2 && cat.getHP() < 50)
				dialog = "Caterpie looks nervous!";
			if(message == 3)
				dialog = "A Staraptor soars above your head.";
			if(message == 4 && pika.getHP() == 100)
				dialog = "Pickachu is raring for a fight!";
			if(message == 5 && cat.getHP() == 100)
				dialog = "Caterpie looks confident.";
			if(message == 6)
				dialog = "Pikachu is happy to be by your side!";
			if(message == 7)
				dialog = "You feel static fizz at your feet.";
			if((message == 8 || message == 3) && pika.getHP() < 20)
				dialog = "Pikachu is losing its balance!";
			if((message == 9 || message == 10) && cat.getHP() < 20)
				dialog = "Finish this, Pikachu!";
			if(message == 10)
				dialog = "Caterpie isn't backing down!";
				return dialog;
	}
}
