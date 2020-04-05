package Practice12020.Practice12020FRE4;

import java.util.*;

public class ContestOrganizer {
    public static final int NUM_ROWS = 2;
    public static final int CONTESTANTS_PER_ROW = 3;

    private Contestant[][] contestants;

    private void sort(Contestant[] arr) {
        Arrays.sort(arr, new Comparator<Contestant>() {
            @Override
            public int compare(Contestant o1, Contestant o2) {
                return o2.getScore() - o1.getScore();
            }
        });
    }

    public void sortAllRows() {
        for (int i = 0; i < NUM_ROWS; i++) {
            sort(contestants[i]);
        }
    }

    public String findWinnerName() {
        sortAllRows();

        Contestant maxContestant = contestants[0][CONTESTANTS_PER_ROW - 1];
        for (int i = 1; i < NUM_ROWS; i++) {
            if (contestants[i][CONTESTANTS_PER_ROW - 1].getScore() > maxContestant.getScore()) {
                maxContestant = contestants[i][CONTESTANTS_PER_ROW - 1];
            }
        }

        return maxContestant.getName();
    }
}
