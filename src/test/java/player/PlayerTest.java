package player;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void loosesWhenDiceNumberIsTooLow(){
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 5);
        Assert.assertEquals(false, player.play());
    }

    @Test
    public void winsWhenDiceNumberIsBig(){
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        Assert.assertEquals(true, player.play());
    }


}