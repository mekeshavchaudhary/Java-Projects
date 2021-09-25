package GuessTheNumberGame;

import java.util.Random;
import java.util.Scanner;

class Game{
	int noofguess=0;
	public int getNoofguess() {
		return noofguess;
	}

	public void setNoofguess(int noofguess) {
		this.noofguess = noofguess;
	}
	int computerchoice;
	int myinput;
	
	Game() {
		Random a=new Random();
		computerchoice= a.nextInt(100);
	}
	
	void takeuserinput() {
		System.out.println("Guess The Number......");
		Scanner random = new Scanner(System.in);
		myinput = random.nextInt();
	}
	boolean iscorrect() {
		noofguess++;
		if (myinput==computerchoice) {
			System.out.println("You guessed the right number");
			System.out.format("it was %d\nand you guessed it in %d attempts", computerchoice,noofguess);
			return true;
		}
		else if (myinput<computerchoice) {
			System.out.println("Low");
		}
		else if (myinput>computerchoice) {
			System.out.println("High");
		}
		return false;
	}
	
}

public class GuesssTheNumber {
	public static void main(String[] args) {
		Game g = new Game();
        boolean b = false;
		
		while(!b) {
		g.takeuserinput();
		b = g.iscorrect();
		
		}
	}

}
