package domein;

import java.util.ArrayList;
import java.util.List;

public class Square 
{
	private int row;
	private int column;
	private Piece piece;
	private List<Piece> attackedBy = new ArrayList<>();
	
	public Square(int row, int column)
	{
		this.row = row;
		this.column = column;
	}
	
	public String toString()
	{
		return piece == null ? "  *" : piece.toString();
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public List<Piece> getAttackedBy() {
		return attackedBy;
	}

	public void setAttackedBy(List<Piece> attackedBy) {
		this.attackedBy = attackedBy;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

}
