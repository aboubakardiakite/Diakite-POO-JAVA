import pfc.*;
import pfc.strategy.*;
import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

	@Test
        public 	void testWhenPlayer1PlayFeuilleAndPlayer2PlayCiseaux(){
		Player player1 = new Player("diakite",new PlayFeuille());
		Player player2 = new Player("abou",new PlayCiseaux());
		Game game = new Game(player1,player2,3);
		int resultat = game.playOneRound(player1,player2);
		assertEquals(-1,resultat);
	}

	@Test
	public  void testWhenPlayer2PlayFeuilleAndPlayer1PlayCiseaux(){
		Player player2 = new Player("diakite",new PlayFeuille());
                Player player1 = new Player("abou",new PlayCiseaux());
                Game game = new Game(player1,player2,3);
		int resultat = game.playOneRound(player1,player2);
                assertEquals(1,resultat);
	}

	@Test
	public  void testWhenPlayer1PlayFeuilleAndPlayer2PlayFeuille(){
		Player player2 = new Player("diakite",new PlayFeuille());
                Player player1 = new Player("abou",new PlayFeuille());
                Game game = new Game(player1,player2,3);
                int resultat = game.playOneRound(player1,player2);
                assertEquals(0,resultat);

	}

	@Test
	public void testWhenPlayer1Win(){
		Player player2 = new Player("diakite",new PlayFeuille());
                Player player1 = new Player("abou",new PlayCiseaux());
                Game game = new Game(player1,player2,3);
		Object winner = game.play(3);
		assertEquals("abou",player1.getName());

	}

	@Test
        public void testWhenPlayer2Win(){
                Player player2 = new Player("diakite",new PlayPierre());
                Player player1 = new Player("abou",new PlayCiseaux());
                Game game = new Game(player1,player2,3);
                Object winner = game.play(3);
                assertEquals("diakite",player2.getName());
        }
	
	@Test
        public void testWhenDraw(){
                Player player2 = new Player("diakite",new PlayFeuille());
                Player player1 = new Player("abou",new PlayFeuille());
                Game game = new Game(player1,player2,3);
                Object winner = game.play(3);
                assertEquals("match nul",winner);

        }


	public static junit.framework.Test suite() {
        	return new junit.framework.JUnit4TestAdapter(GameTest.class);
    	}

}
