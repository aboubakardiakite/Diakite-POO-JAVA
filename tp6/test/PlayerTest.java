import pfc.strategy.*;
import pfc.*;
import org.junit.*;
import static org.junit.Assert.*;

public class PlayerTest {


	@Test
	public void testChoose(){
	Player player = new Player("abou",new PlayFeuille());
	Choice choix = Choice.FEUILLE;
	assertEquals(choix,player.choose());

	}






	public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(PlayerTest.class);
    	}

}
