import java.util.Scanner;

public class HumanPlayer extends Player{
	
	public HumanPlayer (String name, char mark) {
		super(name, mark);
	}
	@Override
	protected void play (){

		if (this.board.isFull())
			System.out.println("The game is over. It is a tie.\n");
		else if (this.board.xWins()) {
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
		else
			this.makeMove();
		
	}
	@Override
	protected void makeMove (){
		Scanner input = new Scanner(System.in);
		int row, col;
		while(true) {
			System.out.println(this.name + ", what row should your next " + this.mark + " be?: ");
			row = input.nextInt();
			System.out.println(this.name + ", what column should your next " + this.mark + " be?: ");
			col = input.nextInt();
			if (board.getMark(row, col) != 'X' && board.getMark(row, col) != 'O')
				break;
			System.out.println("Sorry, that spot is already taken.");
		}
		this.board.addMark(row, col, mark);
		this.board.display();
		opponent.play();
	}
}
