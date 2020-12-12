package cui;

import java.util.Scanner;

import domein.Game;

public class ChessApp 
{
//	public final static void clearConsole()
//	{
//	    try
//	    {
//	        final String os = System.getProperty("os.name");
//
//	        if (os.contains("Windows"))
//	        {
//	            Runtime.getRuntime().exec("cls");
//	        }
//	        else
//	        {
//	            Runtime.getRuntime().exec("clear");
//	        }
//	    }
//	    catch (final Exception e)
//	    {
//	        //  Handle any exceptions.
//	    }
//	}

	public static void main(String[] args) 
	{
		Game game = new Game();
		String chosenPiece;
		String chosenSquare;
		
		System.out.print(game.drawBoard());
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.println();
			System.out.printf("Choose piece to move (x-Coord, y-Coord)     + enter: ");
			chosenPiece = input.next();
			System.out.printf("Choose square to move to (x-Coord, y-Coord) + enter: ");
			chosenSquare = input.next();
			System.out.println();
			System.out.println();
			System.out.println();
//			clearConsole();
			try
			{
				game.makeMove(chosenPiece.charAt(1) - 49, chosenPiece.charAt(0) - 97, chosenSquare.charAt(1) - 49, chosenSquare.charAt(0) - 97);
			}catch (IllegalArgumentException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.print(game.drawBoard());
		} while (game.gameOver != true);
	}
}
