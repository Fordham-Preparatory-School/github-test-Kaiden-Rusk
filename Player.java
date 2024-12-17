import java.util.Scanner; 
public class Player 
{
    private String name;
    private int score;

    public Player(String name)
    {
        this.name = name;
        this.score = 0;
    }
    public String getName()
    {
        return this.name;
    }
    public int getScore()
    {
        return this.score;
    }
    public void incrScore()
    {
        this.score ++;
    }
    public String toString()
    {
        return (name+" has a score of: "+ score);
    }

    public int takeTurn()
    {
        if(Board.getNumPieces() >=3)
        {
            System.out.println("Hello "+name+" it is your turn, there are "+Board.getNumPieces()+" pieces, and you can remove either 1, 2, or 3 pieces");
        }
        else if(Board.getNumPieces()==2)
        {
            System.out.println(name+" it is your turn, you can remove either 1, or 2 pieces");
        }
        else if (Board.getNumPieces() ==1)
        {
            System.out.println(name+" it is your turn, you can remove 1 piece");
        }
        Scanner scanner = new Scanner(System.in);
        
        int takeTurn = scanner.nextInt();
        while(takeTurn>3 || takeTurn > Board.getNumPieces() || takeTurn<=0)
        {
            System.out.println("Please try again and input a valid number");
            takeTurn = scanner.nextInt();
        }
        return takeTurn;
    }
}
