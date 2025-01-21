import java.util.Scanner;
  
public class WordSolver
{
  Board board = new Board();
  Player player1 = new Player();
  Player player2 = new Player();
  private int player1Score;
  private int player2Score;

  public WordSolver()
  {
    player1Score = 0;
    player2Score = 0;
  }

  public void play()
  {
    System.out.println(board.wordLength());
    
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    while (!board.solvedWord.equals(board.word)) 
    {
      board.guessWord();
      
      
      /* your code here - determine how game ends */
    } 
  }
  
}