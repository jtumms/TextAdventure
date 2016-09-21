import java.util.ArrayList;

/**
 * Created by john.tumminelli on 9/14/16.
 */
public class Player extends Character{
    String weapon;
    String location;

    ArrayList<String> items = new ArrayList<>();

    Player(){
        this.health = 20;
        this.damage = 20;
    }


    void chooseName() {
        System.out.println("What is your name?");
        name = Game.customtLine();
        System.out.printf("Welcome, %s\n", name);

    }

    void chooseWeapon() {
        System.out.println("Do you want a sword or mace?");
        weapon = Game.customtLine();

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
        location = Game.customtLine();

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

    void findItem(String item) {
        System.out.printf("You found a %s! Press y to pick up.\n", item);
        String answer = Game.customtLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.printf("You picked %s up!\n", item);
        }
    }

    public String getWeapon() {
        return weapon;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<String> getItems() {
        return items;
    }
}
