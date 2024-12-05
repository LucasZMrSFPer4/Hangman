import java.util.Scanner;

public class PhraseSolver
{
  private Board secret = new Board();
  private Player player1 = new Player("Alice");
  private Player player2 = new Player("Bob");
  private int currentTurn = 1;
  
  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      solved = true;
    } 
  }
}