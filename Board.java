

//STUDENTS SHOULD ADD CLASS COMMENTS, METHOD COMMENTS, FIELD COMMENTS 
/* 
 * Provides the board for the players to play the game on. It displays the board
 * and populates it when players make a move, and checks for a winner.
 * 
 * @author Baylee Cheung
 * @version 1.0
 * @since Feb 6, 2020
 */

public class Board implements Constants {
	/*
	 * The 2d array to represent the board
	 */
	private char theBoard[][];
	/*
	 * Counts the number of spaces filled
	 */
	private int markCount;

	/*
	 * Constructs the new empty board and sets markCount to 0
	 */
	public Board() {
		markCount = 0;
		theBoard = new char[3][];
		for (int i = 0; i < 3; i++) {
			theBoard[i] = new char[3];
			for (int j = 0; j < 3; j++)
				theBoard[i][j] = SPACE_CHAR;
		}
	}
	/*
	 * Returns the mark at a specified row and column
	 * @param row the row of the mark
	 * @param col the column of the mark
	 * @return the mark at the row and column
	 */
	public char getMark(int row, int col) {
		return theBoard[row][col];
	}
	/* 
	 * Makes board full
	 * @return 9 
	 */
	public boolean isFull() {
		return markCount == 9;
	}
	/*
	 * Check if xPlayer wins
	 * @return true if checkWinner(LETTER_X)==1 and false otherwise
	 */
	public boolean xWins() {
		if (checkWinner(LETTER_X) == 1)
			return true;
		else
			return false;
	}
	/*
	 * Check if oPlayer wins
	 * @return true if checkWinner(LETTER_O)==1 and false otherwise
	 */
	public boolean oWins() {
		if (checkWinner(LETTER_O) == 1)
			return true;
		else
			return false;
	}
	/*
	 * Displays the board
	 */

	public void display() {
		displayColumnHeaders();
		addHyphens();
		for (int row = 0; row < 3; row++) {
			addSpaces();
			System.out.print("    row " + row + ' ');
			for (int col = 0; col < 3; col++)
				System.out.print("|  " + getMark(row, col) + "  ");
			System.out.println("|");
			addSpaces();
			addHyphens();
		}
	}
	/*
	 * Adds a mark to the board and increments markCount by 1
	 * @param row the row to add a mark to
	 * @param col the column to add a mark to
	 * @param mark the mark to add
	 */
	public void addMark(int row, int col, char mark) {
		
		theBoard[row][col] = mark;
		markCount++;
	}

	/*
	 * Clears the board and sets markCount to 0
	 */
	public void clear() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				theBoard[i][j] = SPACE_CHAR;
		markCount = 0;
	}
	/*
	 * Checks for Winner of mark
	 * @param mark checks for winner of this type mark
	 * @return 1 for winner and 0 for non-winner
	 */
	int checkWinner(char mark) {
		int row, col;
		int result = 0;

		for (row = 0; result == 0 && row < 3; row++) {
			int row_result = 1;
			for (col = 0; row_result == 1 && col < 3; col++)
				if (theBoard[row][col] != mark)
					row_result = 0;
			if (row_result != 0)
				result = 1;
		}

		
		for (col = 0; result == 0 && col < 3; col++) {
			int col_result = 1;
			for (row = 0; col_result != 0 && row < 3; row++)
				if (theBoard[row][col] != mark)
					col_result = 0;
			if (col_result != 0)
				result = 1;
		}

		if (result == 0) {
			int diag1Result = 1;
			for (row = 0; diag1Result != 0 && row < 3; row++)
				if (theBoard[row][row] != mark)
					diag1Result = 0;
			if (diag1Result != 0)
				result = 1;
		}
		if (result == 0) {
			int diag2Result = 1;
			for (row = 0; diag2Result != 0 && row < 3; row++)
				if (theBoard[row][3 - 1 - row] != mark)
					diag2Result = 0;
			if (diag2Result != 0)
				result = 1;
		}
		return result;
	}
	/*
	 * Displays column headers
	 */

	void displayColumnHeaders() {
		System.out.print("          ");
		for (int j = 0; j < 3; j++)
			System.out.print("|col " + j);
		System.out.println();
	}
	/*
	 * Adds the hyphens to the board
	 */

	void addHyphens() {
		System.out.print("          ");
		for (int j = 0; j < 3; j++)
			System.out.print("+-----");
		System.out.println("+");
	}
	/*
	 * Adds the spaces to the board
	 */

	void addSpaces() {
		System.out.print("          ");
		for (int j = 0; j < 3; j++)
			System.out.print("|     ");
		System.out.println("|");
	}
	public char [][] getTheBoard (){
		return this.theBoard;
	}
}
