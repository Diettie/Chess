package domein;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece
{
	public Pawn(boolean color, Square location) 
	{
		super(color, location);
	}

	private List<Square> canAttack = new ArrayList<>();
	private boolean hasMoved = false;
	
	@Override
	public boolean move(Square square) 
	{
		int rowMove;
		int firstMove;
		
		if(color) 
		{
			rowMove = 1;
			firstMove = 2;
		}else
		{
			rowMove = -1;
			firstMove = -2;
		}
		//checken of pawn reeds gemoved heeft zo niet mag 2 bewegen
		if (!hasMoved)
		{
			if (square.getRow() == location.getRow() + firstMove)
			{
				hasMoved = true;
				return super.move(square);
			}
		}

		//Pawn mag slaan diagonaal links of rechts enkel als er een stuk staat
		if(square.getPiece() != null)
		{
			if(square.getRow() == location.getRow() + rowMove)
			{
				if(square.getColumn() == location.getColumn() + 1 || square.getColumn() == location.getColumn() - 1)
				{
					hasMoved = true;
					return super.move(square);
				}
			}
			
		}
		
		//anders mag je maar 1 square naar voor
		if (square.getRow() == location.getRow() + rowMove && square.getColumn() == location.getColumn())
		{
			hasMoved = true;
			return super.move(square);
		}
		throw new IllegalArgumentException("Illegal pawn move!");
	}
	
	@Override
	public String toString() 
	{
		if(color) 
		{
			return "♙";
		}else
		{
			return "♙";
		}
	}
}
