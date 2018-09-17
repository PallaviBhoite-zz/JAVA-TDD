public class RockPaperScissorsGame {
  private enum RockPaperScissorsMove {
    rock, scissors, paper;

    public static String getWinner(String gesture1, String gesture2){
      final RockPaperScissorsMove move = RockPaperScissorsMove.valueOf(gesture1);
      switch (move){
        case rock:
          return getWinnerForMoves(RockPaperScissorsMove.scissors, gesture1, gesture2);
        case scissors:
          return getWinnerForMoves(RockPaperScissorsMove.paper, gesture1, gesture2);
        case paper:
          return getWinnerForMoves(RockPaperScissorsMove.rock, gesture1, gesture2);
      }
      return "";
    }

    private static String getWinnerForMoves(RockPaperScissorsMove move, String gesture1, String gesture2) {
      if (RockPaperScissorsMove.valueOf(gesture2) == move) {
        return gesture1 + " beats " + gesture2;
      }
      return gesture2 + " beats " + gesture1;
    }
  }

  public String determineWinner(String gesture1, String gesture2) {
    return RockPaperScissorsMove.getWinner(gesture1, gesture2);
  }

}
