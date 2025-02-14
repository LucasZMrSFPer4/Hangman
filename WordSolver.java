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

    String currentPlayer = player1Name;
    
    while (!Board.solvedWord.equals(Board.word)) 
    {
      System.out.println("It's your turn," + currentPlayer + ".");
      board.guessWord();

      if (Board.solvedWord.indexOf(Board.letter) != -1)
      {
        System.out.println("It's still your turn, " + currentPlayer + ".");
        board.guessWord();
      }
      else
      {
        if (currentPlayer.equals(player1Name))
        {
          currentPlayer = player2Name;
        }
        else
        {
          currentPlayer = player1Name;
        }
      }
    } 
  } 
}