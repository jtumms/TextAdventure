import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by john.tumminelli on 9/22/16.
 */
public class GameTest {
    @Test
    public void testSaveAndLoad(){
        Player player = new Player();
        player.name = "Test Player";
        player.location = "tunnel";
        player.weapon = "sword";
        player.items.add("potion");
        Game.save(player, "testgame.json");
        Player player2 = Game.load("testgame.json");
        assertTrue(player.equals(player2));

    }

}