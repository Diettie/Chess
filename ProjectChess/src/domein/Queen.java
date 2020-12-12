package domein;

public class Queen extends Piece 
{

	public Queen(boolean color, Square location) 
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
			return "♕";
		}else
		{
			return "♛";
		}
	}

}
