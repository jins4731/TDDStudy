package tddTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import com.rps.application.RPS;
import com.rps.application.RPSGame;

public class RPSTest {
  @Test
  public void RockCompare() {
    RPSGame game = new RPSGame(0);
    assertEquals(RPS.ROCK, game.executeRPS());
  }

  @Test
  public void PaperCompare() {
    RPSGame game = new RPSGame(1);
    assertEquals(RPS.PAPER, game.executeRPS());
  }

  @Test
  public void ScissorsCompare() {
    RPSGame game = new RPSGame(2);
    assertEquals(RPS.SCISSORS, game.executeRPS());
  }

  @Test
  public void nullCheck() {
    RPSGame game = new RPSGame();
    assertNotNull(game.rendomExecuteRPS());
  }
}
