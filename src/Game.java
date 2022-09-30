import java.util.ArrayList;
import java.util.Collections;

public class Game {
	private ArrayList<Character> players = new ArrayList<Character>();

	public void addCharacter(Character character) {
		this.players.add(character);
	}

	public Character start() {

		while (this.players.size() > 1) {
			System.out.println("---Neue Begegnung---");
			Collections.shuffle(players);
			
			Character player1 = this.players.get(0);
			Character player2 = this.players.get(1);
			Fight f = new Fight(player1, player2);
			f.fight();
			f.getWinner().heal();
			Character looser = f.getLooser();
			System.out.println(looser.getName() + " hat verloren und scheidet aus.");
			this.players.remove(f.getLooser());
		}
		if (this.players.size() > 0) {
			return this.players.get(0);
		} else {
			return null;
		}
	}
	
	public void printPlayers() {
		for(Character c : this.players) {
			System.out.println(c.getName() + " HP: " + c.getHp() + " AP: " + c.getAp());
		}
	}
}
