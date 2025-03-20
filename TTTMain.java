import  java.util.Scanner;
public class TTTMain 
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of Player 1: ");
        String playerX = scanner.nextLine();
        System.out.println("Now enter in the name of Player 2: ");
        String playerO = scanner.nextLine();
        TTTGame game = new TTTGame(playerX, playerO);
        game.play();
        System.out.println("Thanks for playing");
    }
}
