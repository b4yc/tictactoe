import java.util.Scanner;

public class RandomPlayer extends Player{

	RandomGenerator rg;

	public RandomPlayer (String name, char mark) {
		super(name, mark);
	}
	@Override
	protected void play (){


		if (this.board.xWins()) {
			if(this.mark == 'x')
				System.out.println("The game is over. " + this.name + " has won the game!\n");
			else
				System.out.println("The game is over. " + opponent.name + " has won the game!\n");
		}
		else if (this.board.oWins()) {
			if(this.mark == 'o')
				System.out.println("The game is over. " + this.name + " has won the game!\n");
			else
				System.out.println("The game is over. " + opponent.name + " has won the game!\n");
		}
		else if (this.board.isFull())
			System.out.println("The game is over. It is a tie.\n");
		else
			this.makeMove();

	}
	@Override
	protected void makeMove (){
		rg = new RandomGenerator();
		int row, col;
		while (true) {
			row = rg.discrete(0, 2);
			col = rg.discrete(0, 2);
			if (board.getMark(row, col) == ' ')
				break;
		}
		this.board.addMark(row, col, mark);
		this.board.display();
		opponent.play();
	}
}
