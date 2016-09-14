import java.util.Scanner;

/**
 * Created by john.tumminelli on 9/14/16.
 */
public class Game {
    static Scanner scanner = new Scanner(System.in); //moved scnanner method to static

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, Traveller!");

        Player player = new Player();
        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();
    }
}

