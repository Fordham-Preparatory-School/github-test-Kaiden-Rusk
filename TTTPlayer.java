import java.util.Scanner;
public class TTTPlayer 
{
    public String playerName;
    public String team;
    public int score;

    public TTTPlayer(String playerName, String team)
    {
        this.playerName = playerName;
        this.team = team;
        this.score = 0;
    }

    public void incrementScore()
    {
        score++;
    }
    public int getScore()
    {
        return score;
    }
    public String getName()
    {
        return playerName;
    }

    Scanner scanner = new Scanner(System.in);
    public void makeMove(TTTBoard b)
    {
        boolean validMove = false;
        while(!validMove)
        {
            System.out.println("Hello "+ playerName + " on team " + team + " it is your turn, please enter the row, then the column where you would like to place your "+ team);
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            if(row >=0 && row < 3 && column >=0 && column < 3)
            {
                validMove = b.addStringToPosition(team,row,column);
                
                if(!validMove)
                {
                    System.out.println("This spot has already been taken, try again");
                }
                
            }
            else
            {
                System.out.println("Please enter a number between 0 and 2");
            }
            
        }
        
    }
}
