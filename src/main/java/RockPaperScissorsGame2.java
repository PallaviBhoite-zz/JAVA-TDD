public class RockPaperScissorsGame2 {
    private enum RockPaperScissorsMove {
        rock("scissors"),
        scissors("paper"),
        paper("rock");

        private String loser;

        RockPaperScissorsMove(String loser) {
            this.loser = loser;
        }

        public static String getWinner(String gesture1, String gesture2) {
            if (gesture1.equalsIgnoreCase(gesture2)) {
                return "That's a tie!";
            }
            final RockPaperScissorsMove move = RockPaperScissorsMove.valueOf(gesture1);
            return getWinnerForMoves(move, gesture1, gesture2);
        }

        private static String getWinnerForMoves(RockPaperScissorsMove move, String gesture1, String gesture2) {
            if (gesture2.equals(move.loser)) {
                return gesture1 + " beats " + gesture2;
            }
            return gesture2 + " beats " + gesture1;
        }
    }

    public String determineWinner(String gesture1, String gesture2) {
        return RockPaperScissorsMove.getWinner(gesture1, gesture2);
    }

}
