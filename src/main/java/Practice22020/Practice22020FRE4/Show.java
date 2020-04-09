package Practice22020.Practice22020FRE4;

public class Show {
    private int[][] seats;

    private final int SEATS_PER_ROW = 6;
    private final int NUM_ROWS = 3;

    public boolean twoTogether() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < SEATS_PER_ROW - 1; j++) {
                if (seats[i][j] == 0 && seats[i][j + 1] == 0) {
                    seats[i][j] = 1;
                    seats[i][j + 1] = 1;
                    return true;
                }
            }
        }

        return false;
    }

    public int findAdjacent(int row, int seatsNeeded) {
        for (int i = 0; i < SEATS_PER_ROW - seatsNeeded + 1; i++) {
            boolean works = true;
            for (int j = 0; j < seatsNeeded; j++) {
                if (seats[row][i + j] == 1) {
                    works = false;
                    break;
                }
            }

            if (works) {
                return i;
            }
        }

        return -1;
    }
}
