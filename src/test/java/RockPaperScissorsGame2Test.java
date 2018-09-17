import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RockPaperScissorsGame2Test {

    private RockPaperScissorsGame2 game;

    @Before
    public void setUp() {
        game = new RockPaperScissorsGame2();
    }

    @Test
    public void rockCrushesScissors() {
        assertEquals("rock beats scissors", game.determineWinner("rock", "scissors"));
    }

    @Test
    public void paperCoversRock() {
        assertEquals("paper beats rock", game.determineWinner("rock", "paper"));
    }

    @Test
    public void scissorsCutPaper() {
        assertEquals("scissors beats paper", game.determineWinner("scissors", "paper"));
    }

    @Test
    public void rockCrushesScissors_flipped() {
        assertEquals("rock beats scissors", game.determineWinner("scissors", "rock"));
    }

    @Test
    public void paperCoversRock_flipped() {
        assertEquals("paper beats rock", game.determineWinner("paper", "rock"));
    }

    @Test
    public void scissorsCutPaper_flipped() {
        assertEquals("scissors beats paper", game.determineWinner("paper", "scissors"));
    }

    @Test
    public void tieForSameGestures() {
        assertEquals("That's a tie!", game.determineWinner("paper", "paper"));
    }
}
