import java.util.Scanner;
  
public class WordSolver
{
  Board board = new Board();
  private int player1Score;
  private int player2Score;

  public WordSolver()
  {
    player1Score = 0;
    player2Score = 0;
  }

  public void play()
  {
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    while (!board.solvedWord.equals(board.word)) 
    {
      System.out.println(board.wordLength());
      
      
      /* your code here - determine how game ends */
    } 
  }
  
}