package tictactoe;
import java.util.Scanner;

public class TicTacToeRunner 
{

    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in); //Instance of the scanner class
        String player = "x"; //Creates a String variable called player
        TicTacToe x = new TicTacToe(); //Instance of the class TicTacToe
        boolean done = false; //Creates a boolean if the game is won, which is set to false
        while (!done)
        {
            System.out.println(x.toString());
            System.out.println("Row for " + player + " (Type -1 to exit program): ");
            int row = in.nextInt();
            
            if (row < 0) 
            {
                System.out.println("Thanks for playing!");
                System.exit(0); 
                
            }
            
            else
            {
                System.out.print("Column for " + player + ": ");
                int column = in.nextInt();
                x.set(row, column, player);
                if (player.equals("x"))
                {
                    player = "o";
                }
                    
                else
                {
                  player = "x";  
                }
                    
                if(x.finalWin())
                {
                     
                    done = true;
                }
            }
        }
        System.out.println(x.toString());
        System.out.println("Congrats, you are the winner!");
        System.out.println("Thanks for playing.");
        
        
        
    }

}
