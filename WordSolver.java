import java.util.Scanner;
  
public class WordSolver
{
  Board board = new Board();
  Player player1 = new Player();
  private String player1Name = player1.getName();
  Player player2 = new Player();
  private String player2Name = player2.getName();
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

    Scanner input = new Scanner(System.in);
    
    while (!board.solvedWord.equals(board.word)) 
    {
      board.guessWord();
      if (!board.solvedWord.equals(board.word))
      {
        System.out.println("Player 2's turn: ");
      }
      else
      {
        System.out.println("Still Player 1's turn: ");
      }
    } 
  }
  
}