/*
 * Activity 2.5.2
 *
 * A Board class the WordSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class Board
{
  private String solvedWord;
  private String word;
  private int currentLetterValue; 

  public Board()
  {
    word = loadWord();
    solvedWord = "";
    setLetterValue();
  }
  
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */


  /* ---------- provided code, do not modify ---------- */
  public void setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;    
    currentLetterValue = randomInt;
  }

  public boolean isSolved(String guess)
  {
    if (word.equals(guess))
    {
      return true;
    }
    return false;
  }

  private String loadWord()
  {
    String tempWord = "";
    
    int numOfLines = 0;
    try 
    {
      Scanner sc = new Scanner(new File("wordlist.txt"));
      while (sc.hasNextLine())
      {
        tempWord = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing wordlist.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("wordlist.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempWord = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing wordlist.txt"); }
    
    for (int i = 0; i < tempWord.length(); i++)
    {
      if (tempWord.substring(i, i + 1).equals(" "))
      {
        solvedWord += "  ";
      }  
      else
      {
        solvedWord += "_ ";
      }
    }  
    
    return tempWord;
  }  

  public boolean guessLetter(String guess)
  {
    boolean foundLetter = false;
    String newSolvedWord = "";
    
    for (int i = 0; i < word.length(); i++)
    {
      if (word.substring(i, i + 1).equals(guess))
      {
        newSolvedWord += guess + " ";
        foundLetter = true;
      }
      else
      {
        newSolvedWord += solvedWord.substring(i * 2, i * 2 + 1) + " ";  
      }
    }
    solvedWord = newSolvedWord;
    return foundLetter;
  } 
} 