package domein;

public class Game 
{
	private Square[][] board = new Square[8][8];
	public boolean gameOver = false;
	
	public Game()
	{
		for (int row = 0; row < board.length; row++)
		{
			for (int column = 0; column < board[row].length; column++)
			{
				board[row][column] = new Square(row, column);
			}
		}
		
		board[0][0].setPiece(new Rook(true, board[0][0]));
		board[0][1].setPiece(new Horse(true, board[0][1]));
		board[0][2].setPiece(new Bishop(true, board[0][2]));
		board[0][3].setPiece(new Queen(true, board[0][3]));
		board[0][4].setPiece(new King(true, board[0][4]));
		board[0][5].setPiece(new Bishop(true, board[0][5]));;
		board[0][6].setPiece(new Horse(true, board[0][6]));
		board[0][7].setPiece(new Rook(true, board[0][7]));
		
		for (Square plaatsVoorPawn : board[1])
		{
			plaatsVoorPawn.setPiece(new Pawn(true, plaatsVoorPawn));
		}
		
		board[7][0].setPiece(new Rook(false, board[7][0]));
		board[7][1].setPiece(new Horse(false, board[7][1]));
		board[7][2].setPiece(new Bishop(false, board[7][2]));
		board[7][3].setPiece(new Queen(false, board[7][3]));
		board[7][4].setPiece(new King(false, board[7][4]));
		board[7][5].setPiece(new Bishop(false, board[7][5]));;
		board[7][6].setPiece(new Horse(false, board[7][6]));
		board[7][7].setPiece(new Rook(false, board[7][7]));
		
		for (Square plaatsVoorPawn : board[6])
		{
			plaatsVoorPawn.setPiece(new Pawn(false, plaatsVoorPawn));
		}
	}
	
	public String drawBoard()
	{
		String boardDrawn = "";
		boardDrawn += "       A  B  C  D  E  F  G  H";
		boardDrawn += String.format("%n%n");
		
		for (int row = board.length - 1; row >= 0; row--)
		{
			boardDrawn += String.format("%d   ", row + 1);
			for (int column = 0; column < board[row].length; column++)
			{
				boardDrawn += String.format("%3s", board[row][column].toString());
			}
			boardDrawn += String.format("%n");
		}
		return boardDrawn;
	}
	
	public boolean makeMove(int row, int column, int row2, int column2)
	{
		Piece pieceToMove = board[row][column].getPiece();
		
		if(pieceToMove == null)
		{
			throw new IllegalArgumentException("There is no piece on the square you chose!");
		}
		
		pieceToMove.move(board[row2][column2]);
		
		return true;
	}
}
