package teht08TemplateMethod;

public class Board {
	private Character[][] board;

	public Board() {
		board = new Character[3][3];
	}

	public void initBoard() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j] = ' ';
			}
		}
	}

	public boolean spotIsEmpty(int col, int row) {
		if(board[col-1][row-1] == ' '){
			return true;
		}
		return false;
	}

	public boolean isFull() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(board[i][j] == ' '){
					return false;
				}
			}
		}
		return true;
	}

	public void setX(int col, int row) {
		board[col-1][row-1] = 'x';
	}

	public void setO(int col, int row) {
		board[col-1][row-1] = 'o';
	}

	public void showBoard() {
		System.out.println("\n+---+---+---+");
        System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
        System.out.println("+---+---+---+\n");
	}

	public Character winner() {
		if((board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x')
		|| (board[1][0] == 'x' && board[1][1] == 'x' && board[1][2] == 'x')
		|| (board[2][0] == 'x' && board[2][1] == 'x' && board[2][2] == 'x')
		|| (board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x')
		|| (board[0][1] == 'x' && board[1][1] == 'x' && board[1][2] == 'x')
		|| (board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x')
		|| (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x')
		|| (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x')) {
			return 'x';
		} else if( (board[0][0] == 'o' && board[0][1] == 'o' && board[0][2] == 'o')
				|| (board[1][0] == 'o' && board[1][1] == 'o' && board[1][2] == 'o')
				|| (board[2][0] == 'o' && board[2][1] == 'o' && board[2][2] == 'o')
				|| (board[0][0] == 'o' && board[1][0] == 'o' && board[2][0] == 'o')
				|| (board[0][1] == 'o' && board[1][1] == 'o' && board[1][2] == 'o')
				|| (board[0][2] == 'o' && board[1][2] == 'o' && board[2][2] == 'o')
				|| (board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o')
				|| (board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o')) {
			return 'o';
		} else {
			return ' ';
		}
	}

}
