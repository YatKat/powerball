package powerball;

import java.util.Set;

public class PowerballNumbers {
   private final Set<Integer> setOfWhiteBalls;
    private final int redBall;

    public PowerballNumbers() {
        this.setOfWhiteBalls = UtilRandomGenerator.generateWhiteBallsSet();
        this.redBall = UtilRandomGenerator.generateRedBall();
    }

    public Set<Integer> getSetOfWhiteballs() {
        return setOfWhiteBalls;
    }

    public int getRedBall() {
        return redBall;
    }
}
