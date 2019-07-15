package powerball;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UtilRandomGenerator {
    public static final int WHITE_BALLS_QUANTITY = 69;
    public static final int RED_BALLS_QUANTITY = 26;

    public static Set<Integer> generateWhiteBallsSet() {
        List<Integer> listOfIntegers;
        Set<Integer> setOfNumbers;
            listOfIntegers = Stream.iterate(1, n -> n + 1).limit(WHITE_BALLS_QUANTITY).collect(Collectors.toList());
            Collections.shuffle(listOfIntegers);
            setOfNumbers = listOfIntegers.stream().limit(5).collect(Collectors.toSet());
        return setOfNumbers;
    }

    public static int generateRedBall () {
        List<Integer> listOfIntegers = Stream.iterate(1, n -> n + 1).limit(RED_BALLS_QUANTITY).collect(Collectors.toList());
        Collections.shuffle(listOfIntegers);
        return listOfIntegers.get(0);
    }
}
