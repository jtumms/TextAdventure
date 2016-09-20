import java.beans.Customizer;
import java.util.Scanner;

/**
 * Created by john.tumminelli on 9/14/16.
 */
public class Game {
    static Scanner scanner = new Scanner(System.in); //moved scanner method to static
    static Player player = new Player();

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, Traveller!");

        boolean keepRunning = true;
        while (keepRunning) {


            player.chooseName();
            player.chooseWeapon();
            player.chooseLocation();
            player.findItem("shield");
            player.findItem("sword");

            Enemy ogre = new Enemy("Ogre", 10, 10);
            player.battle(ogre);

            System.out.println("You win!");
            System.out.println("Would you like to play again? tpe y or n");

            String answer = customtLine();
            if (answer.equalsIgnoreCase("n")) {
                keepRunning = false;
            }
        }

        System.out.println("Game Over");
    }

    static String customtLine() {
        String line = scanner.nextLine();
        while (line.startsWith("/")) {
            switch (line) {
                case "/exit":
                    System.exit(0);
                    break;
                case "/inv":
                    for (String item : player.items) {
                        System.out.println(item);
                    }
                    if (player.items.isEmpty()) {
                        System.out.println("You have no items.");
                    }
                    break;
                default:
                    System.out.println("Invlid command!");
                    break;




            }
            line = scanner.nextLine();
        }
        return line;
    }
}

