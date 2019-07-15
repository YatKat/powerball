package powerball;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class UtilRandomGeneratorTest {

    @Test
    public void generateWhiteBallsSetWithoutDuplicates() {
        Set<Integer> set = UtilRandomGenerator.generateWhiteBallsSet();
        boolean isAnyDuplicate = set.stream().distinct().count() < set.size();
        Assert.assertFalse(isAnyDuplicate);
    }

    @Test
    public void generateCorrectSizeOfWhiteBallsSet() {
        Set<Integer> set = UtilRandomGenerator.generateWhiteBallsSet();
        Assert.assertEquals(5,set.size());
    }

    @Test
    public void generateWhiteBallsSetWithNumbersFrom1To69() {
        Set<Integer> set = UtilRandomGenerator.generateWhiteBallsSet();
        long count = set.stream().filter(number -> number < 1 || number > 69).count();
        Assert.assertFalse(count > 0);
    }

    @Test
    public void generateRedBallFrom1To26() {
        int redBall = UtilRandomGenerator.generateRedBall();
        Assert.assertTrue(redBall >=1 && redBall <=26);
    }
}