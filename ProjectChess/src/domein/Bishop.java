package domein;

public class Bishop extends Piece 
{

	public Bishop(boolean color, Square location) 
	{
		super(color, location);
	}

	@Override
	public boolean move(Square square) 
	{
		return super.move(square);
	}
	
	@Override
	public String toString() 
	{
		if(color) 
		{
			return "♗";
		}else
		{
			return "♝";
		}
	}

}
