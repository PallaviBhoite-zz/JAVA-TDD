import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore("Remove this line when you're ready to run the tests")
public class RockPaperScissorsGameTest {

    private RockPaperScissorsGame game;

    @Before
    public void setUp() {
        game = new RockPaperScissorsGame();
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
}
