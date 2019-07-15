package powerball;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class PowerBallApplicationTest {

    @Test
    public void compareEngineResultWithTheoreticalProbability() {
        Map<WinTickets, Integer> winsStatistic = PowerBallApplication.getWinsStatistic();
        Map<WinTickets, Double> winsOddsPerOne = PowerBallApplication.getWinsOddsPerOne(winsStatistic);
        Map<WinTickets, Double> theoreticalProbabilityFromWikipedia = new HashMap<>();
        theoreticalProbabilityFromWikipedia.put(WinTickets.NO_WIN, 1.0);
        theoreticalProbabilityFromWikipedia.put(WinTickets.THREE_WHITE_BALLS, 579.76);
        theoreticalProbabilityFromWikipedia.put(WinTickets.FOUR_WHITE_BALLS, 36525.17);
        theoreticalProbabilityFromWikipedia.put(WinTickets.FIVE_WHITE_BALLS, 11_688_053.52);
        theoreticalProbabilityFromWikipedia.put(WinTickets.RED_BALL, 38.32);
        theoreticalProbabilityFromWikipedia.put(WinTickets.ONE_WHITE_RED_BALLS, 91.98);
        theoreticalProbabilityFromWikipedia.put(WinTickets.TWO_WHITE_RED_BALLS, 701.33);
        theoreticalProbabilityFromWikipedia.put(WinTickets.THREE_WHITE_RED_BALLS, 14_494.11);
        theoreticalProbabilityFromWikipedia.put(WinTickets.FOUR_WHITE_RED_BALLS, 913_129.18);
        theoreticalProbabilityFromWikipedia.put(WinTickets.GRAND_PRIZE, 292_201_338.00);
        System.out.println("MY POWERBALL STATISTIC  VS THEORETICAL PROBABILITY ");
        for (Map.Entry<WinTickets, Double> entry : winsOddsPerOne.entrySet()) {
            System.out.println(entry.getKey() + " : 1 per " + entry.getValue()
                    + " VS " + theoreticalProbabilityFromWikipedia.get(entry.getKey()));
        }
    }
}
