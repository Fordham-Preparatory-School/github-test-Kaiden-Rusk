
import java.util.Scanner;

public class TTTGame 
{
    TTTPlayer playerX;
    TTTPlayer playerO;
    TTTBoard board;

    public TTTGame(String nameX, String nameO) 
    {
        playerX = new TTTPlayer(nameX, "X");
        playerO = new TTTPlayer(nameO, "O");
        board = new TTTBoard();
    }
    
    public void play()
    {
        
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        
        
        while(playAgain)
        {
            TTTPlayer currentPlayer = playerX;
            board = new TTTBoard();
            String state = "None";

            while(state.equals("None"))
            {
                board.printBoard();
                currentPlayer.makeMove(board);
                state = board.checkWinState();
                if(currentPlayer == playerX)
                {
                    currentPlayer = playerO;
                }
                else
                    currentPlayer = playerX;
            }
            board.printBoard();
            if(state.equals("Tie"))
            {
                System.out.println("The game ended in a tie");
            }
                else
                {
                    if(currentPlayer == playerX)
                    {
                        currentPlayer = playerO;
                    }
                    else
                    {
                        currentPlayer = playerX;
                    }
                    System.out.println(currentPlayer.playerName +" is the ultimate tic tac toe champion!!");
                    currentPlayer.incrementScore();
            }

            System.out.println("The current score is "+ playerX.getName() + " with a score of "+playerX.getScore()+" and " +playerO.getName() + " with a score of "+playerO.getScore());
            System.out.println("Would you like to play again? (yes or no)");
            if(scanner.nextLine().equals("no"))
            {
                playAgain = false;
            }

        }
    }
}
