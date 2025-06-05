import java.util.ArrayList;
import java.util.Scanner;

public class Board
{
  public static String solvedWord;
  public String word;
  private int length;
  public String letter;
  public static int wrongGuessesLeft;
  public static ArrayList<String> usedRightLetters;
  public static ArrayList<String> usedWrongLetters;
  public static int numOfGuesses;

  public Board()
  {
    word = WordProvider.getWord();
    solvedWord = "";
    length = word.length();
    letter = "";
    wrongGuessesLeft = 6;
    usedRightLetters = new ArrayList<String>();
    usedWrongLetters = new ArrayList<String>();
    numOfGuesses = 0;
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
    System.out.print("\n");
    for (int i = 0; i < length; i++)
    {
      if (word.substring(i, i + 1).equals(letter))
      {
        solvedWord = solvedWord.substring(0, i) + letter + solvedWord.substring(i + 1);
      }
    }
    return "Solved word: " + solvedWord;
  }

  public String hangman()
  {
    if (wrongGuessesLeft == 6)
    {
      return "__________\n|        |\n|        |\n|        0\n|       \\|/\n|       / \\\n|_________";
    }
    else if (wrongGuessesLeft == 5)
    {
      return "__________\n|        |\n|        |\n|        0\n|       \\|/\n|       /\n|_________";
    }
    else if (wrongGuessesLeft == 4)
    {
      return "__________\n|        |\n|        |\n|        0\n|       \\|/\n|\n|_________";
    }
    else if (wrongGuessesLeft == 3)
    {
      return "__________\n|        |\n|        |\n|        0\n|       \\|\n|\n|_________";
    }
    else if (wrongGuessesLeft == 2)
    {
      return "__________\n|        |\n|        |\n|        0\n|        |\n|\n|_________";
    }
    else if (wrongGuessesLeft == 1)
    {
      return "__________\n|        |\n|        |\n|        0\n|\n|\n|_________";
    }
    else
    {
      return "__________\n|        |\n|        |\n|\n|\n|\n|_________";
    }
  }
} 