/*
 * Activity 2.5.2
 *
 * A Board class the WordSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class Board
{
  private static String solvedWord;
  private static String word;
  private int currentLetterValue; 

  public Board()
  {
    word = WordProvider.getWord();
    solvedWord = "";
  }
  
  public String wordLength()
  {
    int length = word.length();
    for (int i = 0; i < length; i++)
    {
      solvedWord += "_";
    }
    return "Solved word:" + solvedWord;
  }

  public void guessWord()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a letter: ");
    String letter = input.nextLine();
    int length = word.length();
    for (int i = 0; i < length; i++)
    {
      if (word.charAt(i) == letter.charAt(0))
      {
        solvedWord = solvedWord.substring(0, i) + letter + solvedWord.substring(i + 1);
      }
    }
  }
} 