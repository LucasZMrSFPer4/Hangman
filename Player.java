import java.util.Scanner;

public class Player
{
  private String name;

  public Player()
  {
    System.out.println("Enter player name: ");
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();
    System.out.println("Welcome to Hangman, " + name + "!" + "First to 5 wins!");
  }

  public String getName()
  {
    return name;
  }
}