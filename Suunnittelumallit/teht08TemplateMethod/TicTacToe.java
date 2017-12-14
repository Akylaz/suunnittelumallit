package teht08TemplateMethod;

import java.util.Scanner;

public class TicTacToe extends Game {
	private Scanner scanner;
	private Board board;

	@Override
	void initializeGame() {
		scanner = new Scanner(System.in);
		board = new Board();
		board.initBoard();
		board.showBoard();
	}

	@Override
	void makePlay(int player) {
		switch(player) {
		case 0:
			System.out.println("X:n vuoro");
			break;
		case 1:
			System.out.println("O:n vuoro");
			break;
		default:
			System.out.println("Error");
			break;
		}

		boolean moveAllowed = false;
		do{
			System.out.print("Valitse pystysarake (1-3): ");
			int col = scanner.nextInt();
			System.out.print("Valitse rivi (1-3): ");
			int row = scanner.nextInt();
			if(!board.spotIsEmpty(row, col)) {
				System.out.println("Valittu ruutu ei ole tyhjä.");
				board.showBoard();
			} else {
				moveAllowed = true;
				switch(player) {
				case 0:
					board.setX(row, col);
					break;
				case 1:
					board.setO(row, col);
					break;
				default:
					System.out.println("Error");
					break;
				}
				board.showBoard();
			}
		} while(!moveAllowed);
	}

	@Override
	boolean endOfGame() {
		if(board.winner() == 'x' || board.winner() == 'o' || board.isFull()) {
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		if(board.winner() == ' ') {
			System.out.println("Tasapeli");
		} else {
			System.out.println("Pelin voitti " + board.winner());
		}


	}

}
