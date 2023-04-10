
public class Main {
  public static void main(String[] args) {

    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Jimmy", highScorePosition);

    int highScorePosition1 = calculateHighScorePosition(1000);
    displayHighScorePosition("Petr", highScorePosition1);

    int highScorePosition2 = calculateHighScorePosition(500);
    displayHighScorePosition("Pavel", highScorePosition2);

    int highScorePosition3 = calculateHighScorePosition(100);
    displayHighScorePosition("Tomas", highScorePosition3);

    int highScorePosition4 = calculateHighScorePosition(25);
    displayHighScorePosition("Jan", highScorePosition4);

  }

  public static void displayHighScorePosition(String playersName, int playersPosition) {
    System.out.println(playersName + " managed to get into position " + playersPosition
      + " on the high score list.");
  }

  public static int calculateHighScorePosition(int playerScore) {

    if (playerScore >= 1000) {
      return 1;
    }
    else if (playerScore >= 500 ) {
      return 2;
    } else if (playerScore >= 100) {
      return 3;
    }
    return 4;
  }

}

/* Create 2 methods:
The first  method should be named displayHighScorePosition.
- this method should have two parameters, one for a player's name, and one for a player's position in a high score list.
- this should print a message like "Tim managed to get into position 2 on the high score list"

The second method should be named calculateHighScorePosition:
- This method should have only one parameter, the player's score
- This method should return a number between 1 and 4, based on the score values shown in this table:
    Score greater than or equal to 1000: 1
    Score greater than or equal to 500 but less than 1000:2
    Score greater than or equal to 100 but less than 500: 3
    All other scores: 4

   Finally, we'll call both methods and display the results for the following scores: 1500, 1000, 500, 100, and 25
* */
