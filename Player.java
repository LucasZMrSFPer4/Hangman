import java.util.Scanner;

public class Player
{
  public static Scanner inputScanner = new Scanner(System.in);
  private String name;
  private int score = 0;

  public Player()
  {
    this.name = "Player";
  }

  public Player(String name)
  {
    this.name = name;
  }
}