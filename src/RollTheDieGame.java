import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {

        int boardSpaces = 20;
        int numberOfRolls = 5;
        int maxOptions = 6;
        int currentSpace = 0;

        for (int i = 1; i <= numberOfRolls; i++) {

            Random random = new Random();
            int die = random.nextInt(maxOptions) + 1;
            currentSpace += die;
            System.out.printf("Roll #%d: You have rolled a %d. ", i, die);

            if (currentSpace == boardSpaces) {
                System.out.printf("You are on space %d. Congratulations you have won!%n", currentSpace);
                break;
            } else if (currentSpace > boardSpaces) {
                System.out.println("You went over the maximum number of board spaces. You have lost. Try again!");
                break;
            } else if (currentSpace < boardSpaces && i == numberOfRolls) {
                System.out.printf("You are on space %d. You have lost. Try again!%n", currentSpace);
                break;
            } else {
                int numberOfSpacesNeededToWin = boardSpaces - currentSpace;
                System.out.printf("You are now on space %d and have %d more to go. %n", currentSpace, numberOfSpacesNeededToWin);
            }
        }
    }
}
