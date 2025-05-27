import java.util.Scanner;

public class Board
{
  public static String solvedWord;
  public static String word;
  private int length;
  public static String letter;
  public static int wrongGuessesLeft;

  public Board()
  {
    word = WordProvider.getWord();
    solvedWord = "";
    length = word.length();
    letter = "";
    wrongGuessesLeft = 6;
  }
  
  public String wordLength()
  {
    for (int i = 0; i < length; i++)
    {
      solvedWord += "_";
    }
    return "Solved word: " + solvedWord;
  }

  public String guessWord()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a letter:");
    letter = input.nextLine();
    System.out.println("\n");
    for (int i = 0; i < length; i++)
    {
      if (word.substring(i, i + 1).equals(letter))
      {
        solvedWord = solvedWord.substring(0, i) + letter + solvedWord.substring(i + 1);
      }
    }
    return "Solved word: " + solvedWord;
  }
} 