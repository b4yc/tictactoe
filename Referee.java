
public class Referee {
	
	private Player xPlayer;
	private Player oPlayer;
	private Board board;
	
	public Referee() {
		
	}
	/*
	 * gets the referee to start the game.
	 * sets opponents, display board, and gets xPlayer to start the game
	 */
	public void runTheGame() {
		xPlayer.setOpponent(oPlayer);
		oPlayer.setOpponent(xPlayer);
		board.display();
		xPlayer.play();
	}
	/*
	 * sets this.board to the board passed
	 * @param board the board that referee sees
	 */
	public void setBoard(Board board) {
		this.board = board;
		
	}
	/*
	 * sets the xPlayer so the referee knows
	 * @param xPlayer the x player to be set
	 */
	public void setxPlayer(Player xPlayer) {
		this.xPlayer = xPlayer;
	}
	/*
	 * sets the oPlayer so the referee knows
	 * @param oPlayer the o player to be set
	 */
	public void setoPlayer(Player oPlayer) {
		this.oPlayer = oPlayer;
	}
	
	
}
