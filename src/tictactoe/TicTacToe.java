package tictactoe;
import java.util.Scanner;
import java.util.ArrayList;

public class TicTacToe
{
    private static final int rows = 3;
    private static final int columns = 3;
    String board[][];
    String r = "";
    String str = "";
    boolean finalDecision = false; 



    public TicTacToe()
    {
        board = new String[rows][columns];

    for (int i = 0; i < rows; i++)
    {
            for (int j = 0; j < columns; j++)
            {
                board[i][j] = " ";
            }
        }
    }

    public void set(int i, int j, String player)
    {
        if (board[i][j].equals(" "))
        {
            board[i][j] = player;
        }
    }

    public boolean gameOver()
    {

        for (int i = 0; i <= 2; i++)
        {
            for (int j = 0; j <= 2; j++)
            {
                if (board[i][j].equalsIgnoreCase("x") || board[i][j].equalsIgnoreCase("o")) //if the board is full
                {
                    finalDecision = true;
                }

                else
                {
                    break;
                }
            }
        }
        return finalDecision;
    }

    public boolean winRow() //A method to test if a player wins by a row
    {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= 2; i++)
        {
            for (int j = 0; j <= 2; j++)
            {
                if (board[i][j].equalsIgnoreCase("x"))
                {
                    list.add(board[i][j]);
                }
            }
        }

        if (list.size() == 3) //This will return true if 3 x's have been added in the row
        {
            return true;
        }

        return false;
    }

    public boolean winCol() //A method to test if a player wins by a column
    {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= 2; i++)
        {
            for (int j = 0; j <= 2; j++)
            {
                if (board[j][i].equalsIgnoreCase("x"))
                {
                    list.add(board[j][i]);
                }
            }
        }

        if (list.size() == 3)
        {
            return true;
        }

        return false;
    }

    public boolean finalWin()
    {
        if (gameOver())
        {
            if (winCol() && winRow())
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString()
    {
        System.out.println("");
        System.out.println("Valid inputs range from 0,0 to 2,2!");
        System.out.println("");
        str = str + "-------\n";
        for (int i = 0; i < rows; i++)
        {
            r = "|";
            for (int j = 0; j < columns; j++)
            {
                str = str + r + board[i][j];
            }
            str = str + "|\n";
            str = str + "-------\n";
        }

        return str;
    }

}
