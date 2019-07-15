package powerball;

import java.util.Set;

public class UtilMatcher {

    public static int matchWhiteBalls(Set<Integer> userTicket, Set<Integer> powerballNumbers) throws IllegalArgumentException {
        if (userTicket.size() != powerballNumbers.size()) {
            throw new IllegalArgumentException("Arguments invalid");
        }
        userTicket.addAll(powerballNumbers);
        return powerballNumbers.size() * 2 - userTicket.size();
    }

    public static boolean matchRedBall(int userRedBall, int powerballRedBall){
        return userRedBall == powerballRedBall;
    }
}
