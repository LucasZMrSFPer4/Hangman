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
    Scanner input = new Scanner(System.in);
    String currentPlayer = player1Name;
    
    while (player1Score < 5 && player2Score < 5)
    {
      System.out.println(board.wordLength());
      System.out.println(board.hangman());
      System.out.println(Board.usedWrongLetters);
      System.out.println();

      while (!board.solvedWord.equals(board.word))
      {
        System.out.println("It's your turn, " + currentPlayer + ".");
        System.out.println(board.guessWord());

        if (board.letter.length() != 1 || "abcdefghijklmnopqrstuvwxyz".indexOf(board.letter) == -1 || board.usedWrongLetters.contains(board.letter))
        {
          System.out.println("\nInvalid answer! Try again!");
          System.out.println(board.guessWord());
        }

        while (board.solvedWord.indexOf(board.letter) != -1 && !board.solvedWord.equals(board.word))
        {
          System.out.println(board.hangman());
          System.out.println(Board.usedWrongLetters);
          System.out.println();
          System.out.println("It's still your turn, " + currentPlayer + ".");
          System.out.println(board.guessWord());
        }

        if (currentPlayer.equals(player1Name) && !board.solvedWord.equals(board.word))
        {
          currentPlayer = player2Name;
          board.wrongGuessesLeft --;
          System.out.println(board.hangman());
          Board.usedWrongLetters.add(board.letter);
          System.out.println(Board.usedWrongLetters);
          System.out.println();
        }
        else if (currentPlayer.equals(player2Name) && !board.solvedWord.equals(board.word))
        {
          currentPlayer = player1Name;
          board.wrongGuessesLeft --;
          System.out.println(board.hangman());
          Board.usedWrongLetters.add(board.letter);
          System.out.println(Board.usedWrongLetters);
          System.out.println();
        }

        if (board.wrongGuessesLeft == 0)
        {
          System.out.println("Word failed!");
          System.out.println("\n" + player1Name + "'s score: " + player1Score);
          System.out.println(player2Name + "'s score: " + player2Score + "\n");
          board = new Board();
          System.out.println(board.hangman());
          System.out.println(Board.usedWrongLetters);
          System.out.println();
          System.out.println(board.wordLength());
        }
      }

      if (board.solvedWord.equals(board.word))
      {
        if (currentPlayer.equals(player1Name))
        {
          player1Score ++;
          System.out.println("\n" + player1Name + "'s score: " + player1Score);
          System.out.println(player2Name + "'s score: " + player2Score + "\n");
        }
        else
        {
          player2Score ++;
          System.out.println("\n" + player1Name + "'s score: " + player1Score);
          System.out.println(player2Name + "'s score: " + player2Score + "\n");
        }
      }
      board = new Board();
    }

    if (player1Score == 5 || player2Score == 5)
    {
      System.out.println(currentPlayer + " wins!");
    }
  } 
}