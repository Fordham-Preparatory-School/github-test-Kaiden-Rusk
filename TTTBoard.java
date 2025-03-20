public class TTTBoard
{
    private final static int ROWS = 3;
    private final static int COLS = 3;
    public String [][] board;
    
    public TTTBoard()
    {
        board = new String [ROWS][COLS];
        for(int i = 0; i < ROWS; i ++)
        {
            for(int j = 0; j< COLS; j++)
            {
                board [i][j] = " ";
            }
        }

    }
    
    public boolean addStringToPosition(String move, int r, int c)
    {
        if(!move.equals("X") && !move.equals("O"))
        {
            return false;
        }

        if(!board[r][c].equals(" "))
        {
            System.out.println("This move is invalid");
            return false;
        }

            board[r][c] = move;
            return true;
        
        
    }

    public String checkWinState()
    {
        for(int i = 0; i < ROWS; i++) 
        {
            if (!board[i][0].equals(" ") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]))
            {
                return board[i][0];
            }   
        }
        for(int j = 0; j < COLS; j++)
        {
            if(!board[0][j].equals(" ") && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j]))
            {
                return board[0][j];
            }
        }
        if(!board[0][0].equals(" ") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
        {
            return board[0][0];
        }
        if(!board[0][2].equals(" ") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
        {
            return board[0][2];
        }

        for(int m = 0; m < ROWS; m++)
        {
            for(int k = 0; k < COLS; k++)
            {
                if(board[m][k].equals(" "))
                {
                    return "None";
                }
            }
        }
        return "Tie";
            

    }
    public void printBoard()
    {
        for(int i = 0; i < ROWS; i++)
        {
            System.out.print("| ");
            for(int j = 0; j < COLS; j ++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
    }

}


    