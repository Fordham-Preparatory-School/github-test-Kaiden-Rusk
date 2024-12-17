public class Board 
{
    private static int pieces = 0;

    public static void populate()
    {
        pieces = (int)((Math.random()*41)+10);
        System.out.println("The board has been populated with "+pieces+" pieces");
    }
    public static int getNumPieces()
    {
        return pieces;
    }
    public static void removePieces(int takeTurn)
    {
        pieces -= takeTurn;
        System.out.println("You have removed "+takeTurn+" pieces, and "+pieces+" pieces remain");
    }

}
