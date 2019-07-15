package powerball;

import java.util.Set;

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
