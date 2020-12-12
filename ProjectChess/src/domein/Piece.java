package domein;

import java.util.ArrayList;
import java.util.List;

abstract public class Piece 
{
	protected boolean color;
	protected Square location;
	private List<Square> canMoveTo = new ArrayList<>();
	
	public Piece(boolean color, Square location)
	{
		this.color = color;
		this.location = location;
	}
	
	
	public boolean move(Square square)
	{ 
		location.setPiece(null);
		location = square;
		location.setPiece(this);
			
		return true;
	}
	
	public List<Square> getCanMoveTo() 
	{
		return canMoveTo;
	}

	public void setCanMoveTo(List<Square> canMoveTo) 
	{
		this.canMoveTo = canMoveTo;
	}


	abstract public String toString();
}
