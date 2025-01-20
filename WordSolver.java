import java.util.Scanner;
  
public class WordSolver
{
  private int player1Score;
  private int player2Score;

  public WordSolver()
  {
    player1Score = 0;
    player2Score = 0;
  }

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!Board.solvedWord.equals(Board.word)) 
    {
      
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}