public class NimRunner 
{
    public static void main(String[] args)
    {
        Board.populate(); // static method call
        Nim gameOfNim = new Nim();
        gameOfNim.play();
    }
}