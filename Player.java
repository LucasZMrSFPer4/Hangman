import java.util.Scanner;

public class Player
{
  private String name;
  private int score;

  public Player()
  {
    System.out.println("Enter player name: ");
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();
    System.out.println("Welcome to Hangman, " + name + "!");
  }

  public Player(String inputName)
  {
    name = inputName;
  }
}