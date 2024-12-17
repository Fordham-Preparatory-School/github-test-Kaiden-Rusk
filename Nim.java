import java.util.Scanner;

public class Nim
{
    private Player player1;
    private Player player2;

    public Nim()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter player 1's name"); 
        String name = scanner.nextLine();
        player1 = new Player(name);

        System.out.println("Now enter player 2's name");
        String name2 = scanner.nextLine();
        player2 = new Player(name2);
    }

    public void play()
    {
        Player currentPlayer;
        if(Math.random()>0.5)
        {
            currentPlayer = player1;
        }
        else
        {
            currentPlayer = player2;
        }

        boolean shouldPlay = true;
        
        while(Board.getNumPieces()>0 && shouldPlay)
        {
            System.out.println(currentPlayer.getName()+"'s turn.");
            int piecesRemoved = currentPlayer.takeTurn();
            Board.removePieces(piecesRemoved);

            if(currentPlayer == player2)
            {
                currentPlayer = player1;
            }
            else
            {
                currentPlayer = player2;
            }
        
            if (Board.getNumPieces() == 0)
            {
                System.out.println("Game Over, "+currentPlayer.getName()+" loses!");
                shouldPlay = playAgain();
            }
            
        }
        if(currentPlayer == player2)
        {
            currentPlayer = player1;
        }
        else
        {
            currentPlayer = player2;
        }

        currentPlayer.incrScore();
        System.out.println("The score is "+player1.getName()+": "+player1.getScore()+ " "+player2.getName()+": "+player2.getScore());
        if(shouldPlay)
        {
            Board.populate();
            play();
        }
    }

    private boolean playAgain()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play again? (Enter yes or no)");
        while(true)
        {
            String repeat = scanner.nextLine();
            if(repeat.equals("yes"))
            {
                return true;
            }
            else if (repeat.equals("no"))
            {
                return false;
            }
            else
            {
                System.out.println("Please enter an acceptable value");
            }
        }
        
    }
    
}
