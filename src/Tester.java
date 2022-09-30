
public class Tester {
	public static void main(String[] args) {

		Character char1 = new Character("Zenturon", 100, 20);
		Character char2 = new Character("Valarian", 100, 20);
		Character char3 = new Character("Backpipe", 100, 20);
		Character char4 = new Character("MrFlute", 100, 20);
		Character char5 = new Character("Hancock", 100, 20);
		
		Game game = new Game();
		game.addCharacter(char1);
		game.addCharacter(char2);
		game.addCharacter(char3);
		game.addCharacter(char4);
		game.addCharacter(char5);
		
		System.out.println("Spiel wird mit folgenden Charakteren gestartet:");
		game.printPlayers();

		Character winner = game.start();
		System.out.println(winner.getName() + " hat alle besiegt.");
		
	}
}
