

/**
 * Created by john.tumminelli on 9/14/16.
 */
public class Player {
    String name;
    String weapon;
    String location;

    void chooseName() {
        System.out.println("What is your name?");
        name = Game.scanner.nextLine();
        System.out.println("Welcome, " + name);

    }

    void chooseWeapon() {
        System.out.println("Do you want a sword or mace?");
        weapon = Game.scanner.nextLine();

        if (weapon.equalsIgnoreCase("sword")) {
            System.out.println("Here's your sword!");
        }
        else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("Here's your mace!");
        }
        else {
            //throw new Excpetion("Invalid weapon.")
            System.out.println("Choose weapon again");
            chooseWeapon();
        }
    }

    void chooseLocation() throws Exception {
        System.out.println("Would you like to go to the tunnel or forest?");
        location = Game.scanner.nextLine();

        if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        }
        else if (location.equalsIgnoreCase("forest")){
            System.out.printf("Entering forest...");
        }
        else {
            //throw new Exception("Invalid location");
            System.out.println("location not recognized");
            chooseLocation();
        }
    }
}
