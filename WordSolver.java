import java.util.Scanner;
  
public class WordSolver
{
  Board board = new Board();
  Player player1 = new Player();
  Player player2 = new Player();
  private String player1Name = player1.getName();
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

    String currentPlayer = player1Name;
    
    while (!board.solvedWord.equals(board.word)) 
    {
      System.out.println("It's your turn, " + currentPlayer + ".");
      System.out.println(board.guessWord());

      while (board.solvedWord.indexOf(board.letter) != -1 && !board.solvedWord.equals(board.word))
      {
        System.out.println("It's still your turn, " + currentPlayer + ".");
        System.out.println(board.guessWord());
      }

      if (currentPlayer.equals(player1Name))
      {
        currentPlayer = player2Name;
      }
      else
      {
        currentPlayer = player1Name;
      }
    }

    while (board.solvedWord.equals(board.word))
    {
      if (currentPlayer.equals(player1Name))
      {
        player1Score++;
      }
      else
      {
        player2Score++;
      }

      if (player1Score == 5 || player2Score == 5)
      {
        System.out.println(currentPlayer + " wins!");
      }
    }
  } 
}