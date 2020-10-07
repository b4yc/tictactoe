import java.util.Scanner;


public abstract class Player {
	/*
	 * The name of the player
	 */
	protected String name;
	/*
	 * the board the player is using
	 */
	protected Board board;
	/*
	 * the opponent of the player
	 */
	protected Player opponent;
	/*
	 * the mark of the player (x or o)
	 */
	protected char mark;
	/*
	 * constructing player and setting the name and mark
	 * @param name the name of the player
	 * @param mark the park of the player
	 */
	public Player(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}
	/*
	 * checks if any player has won and checks if the board is full to declare tie
	 * else, calls makeMove() to continue the game play
	 */
	protected abstract void play();
	/*
	 * Gets user input to insert their mark into the appropriate row and column
	 * calls the opponent to play
	 */
	protected abstract void makeMove();
	
	/*
	 * sets the opponent of the player so the player knows about their opponent
	 * @param player is the Player opponent
	 */
	protected void setOpponent(Player player) {
		this.opponent = player;
	}
	/*
	 * sets the board that the player is playing on
	 * @param theBoard the board being played on
	 */
	protected void setBoard(Board theBoard) {
		this.board = theBoard;
	}

}
