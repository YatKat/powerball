package powerball;

/**
 * Enum enumerate win variants. Class provides one static method that return win type according to white balls and red
 * ball win combinations.
 */
public enum WinTickets {
    NO_WIN,
    THREE_WHITE_BALLS,
    FOUR_WHITE_BALLS,
    FIVE_WHITE_BALLS,
    RED_BALL,
    ONE_WHITE_RED_BALLS,
    TWO_WHITE_RED_BALLS,
    THREE_WHITE_RED_BALLS,
    FOUR_WHITE_RED_BALLS,
    GRAND_PRIZE;

    public static WinTickets getWinTicketType(int countWins, boolean redWin) {
        if (redWin) {
            if (countWins == 0) {
                return RED_BALL;
            }
            if (countWins == 1) {
                return ONE_WHITE_RED_BALLS;
            }
            if (countWins == 2) {
                return TWO_WHITE_RED_BALLS;
            }
            if (countWins == 3) {
                return THREE_WHITE_RED_BALLS;
            }
            if (countWins == 4) {
                return FOUR_WHITE_RED_BALLS;
            }
            if (countWins == 5) {
                return GRAND_PRIZE;
            }
        } else {
            if (countWins == 3) {
                return THREE_WHITE_BALLS;
            }
            if (countWins == 4) {
                return FOUR_WHITE_BALLS;
            }
            if (countWins == 5) {
                return FIVE_WHITE_BALLS;
            }
        }
        return NO_WIN;
    }
}
