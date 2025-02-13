import java.util.Scanner;

public class Board
{
  public static String solvedWord;
  public static String word;
  private int length;
  public static String letter;

  public Board()
  {
    word = WordProvider.getWord();
    solvedWord = "";
    length = word.length();
    letter = "";
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
    letter = input.nextLine();
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