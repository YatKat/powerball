package powerball;

import java.util.HashMap;
import java.util.Map;

/**
 * Class responsible for test powerball engine work 1000_000_000 times for statistic.
 * For comparing with theoretical probability See PowerBallApplicationTest class.
 */

public class PowerBallApplication {
    public static int TIMES_COUNT = 0;

    public static void main(String[] args) {
        Map<WinTickets, Integer> winsStatistic = getWinsStatistic();
        System.out.println(winsStatistic);
        System.out.println(getWinsOddsPerOne(winsStatistic));
    }

    public static Map<WinTickets, Integer> getWinsStatistic() {

        Map<WinTickets, Integer> statistics = new HashMap<>();
        PowerballNumbers powerball = new PowerballNumbers();

        for (; TIMES_COUNT < 1000_000_000; TIMES_COUNT++) {
            User userTicket = new User();
            boolean isRedWin = UtilMatcher.matchRedBall(userTicket.getUserRedBallTicket(), powerball.getRedBall());
            int countWins = UtilMatcher.matchWhiteBalls(userTicket.getUserWhiteBallsTicket(), powerball.getSetOfWhiteballs());
            WinTickets winTickets = WinTickets.getWinTicketType(countWins, isRedWin);
            if (statistics.containsKey(winTickets)) {
                int count = statistics.get(winTickets);
                statistics.put(winTickets, ++count);
            } else {
                statistics.put(winTickets, 1);
            }
            if (statistics.size() == WinTickets.values().length) {
                break;
            }
        }
        return statistics;
    }

    public static Map<WinTickets, Double> getWinsOddsPerOne(Map<WinTickets, Integer> stat) {
        Map<WinTickets, Double> odds = new HashMap<>();
        for (Map.Entry<WinTickets, Integer> entry : stat.entrySet()) {
            double coeff = TIMES_COUNT / entry.getValue();
            odds.put(entry.getKey(), coeff);
        }
        return odds;
    }
}

