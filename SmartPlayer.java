
public class SmartPlayer extends BlockingPlayer{

	public SmartPlayer(String name, char mark) {
		super(name, mark);
	}
	@Override
	protected void makeMove() {
		boolean madeMove = false;
		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0; j < 3 ; j++) {
				if (testForWinning(i, j)) {
					madeMove = true;
					this.board.addMark(i, j, mark);
					this.board.display();
					break;
				}
				if (madeMove)
					break;
			}
		}
		if (!madeMove)
			super.makeMove();
		else
			opponent.play();
	}
	
	protected boolean testForWinning(int row, int col) {
		
		Board simulate = new Board();
		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0; j < 3 ; j++) {
				simulate.getTheBoard()[i][j] = this.board.getTheBoard()[i][j];
			}
		}

		if (simulate.getMark(row, col) == ' ')
			simulate.addMark(row, col, mark);
		if (simulate.checkWinner(mark) == 1) {
			return true;
		}
		return false;
	}
}
