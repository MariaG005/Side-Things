import java.util.Scanner;

public class PlayTest {

	public static void main(String [] args) {
		Pikachu pika = new Pikachu();
		Caterpie cat = new Caterpie();
		WinLose wL = new WinLose();
		Timing time = new Timing();
		Story story = new Story();
		Scanner scan = new Scanner(System.in);
		
		//intro
		System.out.println("In the world of Pokemon, you are rustling through a patch of tall grass. Your Pokeballs rattle at your hip. What is your name, trainer?");
		String playerName = scan.nextLine();
		System.out.println(playerName + " hears something in the distance..." + '\n');
		time.waitLong();
		
		int turn = 0;
		
		System.out.println("Woah, a wild Caterpie appeared! Go, Pikachu!");
		time.waitShort();
		System.out.println(playerName + " throws a Pokeball." + '\n');
		System.out.println("Pikachu (.•ﻌ•.)⚡               HP: " + pika.getHP() + '\n');
		System.out.println(pika.moveSet() + '\n');
		
		//turn system
		while(pika.getHP() > 0 && cat.getHP() > 0) {		
			if(turn % 2 == 0) {
				//flavor text
				story.chance();
				if(story.chance() == true) {
					time.waitShort();
					System.out.println(story.dialog(pika, cat) + '\n');
				}
				
				//combat
				time.waitShort();
				System.out.println(pika.useMove(cat));
				cat.fixHP();
				if(pika.miss == false)
					System.out.println("Caterpie's hp fell to " + cat.getHP() + '!' + '\n');
				if(cat.getHP() == 0) {
					time.waitShort();
					System.out.println(wL.victory());
				}
			}
			else {
				//flavor text
				story.chance();
				if(story.chance() == true) {
					time.waitShort();
					System.out.println(story.dialog(pika, cat) + '\n');
				}
				
				//combat
				time.waitShort();
				System.out.println(cat.hit(pika));
				pika.fixHP();
				if(cat.miss = false) 
					System.out.println("Pikachu's hp fell to " + pika.getHP() + '!');
				System.out.println("Pikachu (.•ﻌ•.)⚡               HP: " + pika.getHP() + '\n');
				if(pika.getHP() > 0)
					System.out.println(pika.moveSet() + '\n');
				if(pika.getHP() == 0) {
					time.waitShort();
					System.out.println(wL.loss());
					}
				}
			turn++;
		}
	}
}
