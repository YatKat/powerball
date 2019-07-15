package powerball;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class UtilMatcherTest {

    @Test
    public void matchWhiteBalls() {
        Set<Integer> userSet = UtilRandomGenerator.generateWhiteBallsSet();
        Set<Integer> powerballSet = UtilRandomGenerator.generateWhiteBallsSet();
        int count = UtilMatcher.matchWhiteBalls(userSet, powerballSet);
        Assert.assertTrue(count >= 0 && count <= 5);
    }

    @Test
    public void matchRedBallCorrectNonEqulty() {
        Assert.assertFalse(UtilMatcher.matchRedBall(24, 35));
    }

    @Test
    public void matchRedBallCorrectEquelty() {
        Assert.assertTrue(UtilMatcher.matchRedBall(3, 3));
    }
}
