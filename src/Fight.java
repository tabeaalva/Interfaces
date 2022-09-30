
public class Fight {
	private Character player1 = null;
	private Character player2 = null;
	private boolean played = false;
	
	public Fight(Character player1, Character player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void fight() {
		this.played = false;
		while(player1.getHp() > 0 && player2.getHp() > 0) {
			
			this.player1.attack(this.player2);
			this.newRound();
			System.out.println("---");
		}
		played = true;
	}

	public Character getWinner() {
		if(played) {
			if(this.player1.getHp() > 0) {
				return player1;
			} else {
				return player2;
			}
		}
		return null;
	}
	
	public Character getLooser() {
		if(played) {
			if(this.player1.getHp() <= 0) {
				return player1;
			} else {
				return player2;
			}
		}
		return null;
	}
	
	private void newRound() {
		Character tmp = this.player1;
		this.player1 = player2;
		this.player2 = tmp;
	}
}
