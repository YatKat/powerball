package powerball;

import java.util.Set;

/**
 * Class provides User object, initialized by RandomGenerator, simulates user register ticket with his numbers.
 */
public class User {
    private final Set<Integer> userWhiteBallsTicket;
    private final int userRedBallTicket;

    public User() {
        this.userWhiteBallsTicket = UtilRandomGenerator.generateWhiteBallsSet();
        this.userRedBallTicket = UtilRandomGenerator.generateRedBall();
    }

    public Set<Integer> getUserWhiteBallsTicket() {
        return userWhiteBallsTicket;
    }

    public int getUserRedBallTicket() {
        return userRedBallTicket;
    }
}
