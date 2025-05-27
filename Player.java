import java.util.Scanner;

public class Player
{
  private String name;

  public Player()
  {
    System.out.println("Enter player name: ");
    Scanner input = new Scanner(System.in);
    name = input.nextLine();
    System.out.println("Welcome to Hangman, " + name + "!" + " First to 5 wins!\n");
  }

  public String getName()
  {
    return name;
  }
}