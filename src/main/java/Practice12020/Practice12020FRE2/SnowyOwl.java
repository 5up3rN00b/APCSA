package Practice12020.Practice12020FRE2;

import java.lang.*;

public class SnowyOwl extends Owl {
    private boolean gender;

    public SnowyOwl(String genderStr) {
        super("Snowy owl");

        if (genderStr.equals("male")) {
            gender = true;
        } else if (genderStr.equals("female")) {
            gender = false;
        }
    }

    public String getColor() {
        if (gender) {
            return "white";
        } else {
            return "speckled";
        }
    }

    public String getFood() {
        int randInt = (int) Math.random() * 3;

        if (randInt == 0) {
            return "hare";
        } else if (randInt == 1) {
            return "lemming";
        } else {
            return "small bird";
        }
    }
}
