package textAdventure;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	public static void main(String[] args) {
		Helper display = new Helper();
		display.prompt("Welcome to the game!");
		
		display.setOptions(new String[] {"Start game", "End game"});
		display.showOptions();
		
		int menuOption = display.getInt();
		switch (menuOption) {
		case 1: // start game
			display.setOptions(new String[] {"Left", "Right"});
			break;
		case 2: // end game
			break;
		default:
			System.out.println("Invalid Entry...");
		}
	}
	
	

}
