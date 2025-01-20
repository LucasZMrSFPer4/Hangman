/*
 * Activity 2.5.2
 *
 * A Board class the WordSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class Board
{
  public static String solvedWord;
  public static String word;
  private int length;

  public Board()
  {
    word = WordProvider.getWord();
    solvedWord = "";
    length = word.length();
  }
  
  public String wordLength()
  {
    for (int i = 0; i < length; i++)
    {
      solvedWord += "_";
    }
    return "Solved word:" + solvedWord;
  }

  public String guessWord()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a letter: ");
    String letter = input.nextLine();
    for (int i = 0; i < length; i++)
    {
      if (word.charAt(i) == letter.charAt(0))
      {
        solvedWord = solvedWord.substring(0, i) + letter + solvedWord.substring(i + 1);
      }
    }
    return "Solved word:" + solvedWord;
  }
} 