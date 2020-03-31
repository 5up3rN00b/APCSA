package Diag2020FRE.Diag2020FRE1;

public class Experiment {
    private MechanicalArm arm;
    private Solution s0, s1, s2;

    public Experiment(int PH0, int PH1, int PH2) {
        s0 = new Solution(PH0);
        s1 = new Solution(PH1);
        s2 = new Solution(PH2);
        arm = new MechanicalArm();
    }

    public void reset() {
        if (arm.getCurrentPos() == 0) {
            if (!arm.isFacingRight()) {
                arm.changeDirection();
            }
        } else if (arm.getCurrentPos() == 1) {
            if (arm.isFacingRight()) {
                arm.changeDirection();
            }
            arm.moveForward(1);
            arm.changeDirection();
        } else {
            if (arm.isFacingRight()) {
                arm.changeDirection();
            }
            arm.moveForward(2);
            arm.changeDirection();
        }
    }

    public int mostAcidic() {
        Solution leastPH;
        if (s0.getPH() < s1.getPH()) {
            if (s0.getPH() < s2.getPH()) {
                leastPH = s0;
            } else {
                leastPH = s2;
            }
        } else {
            if (s1.getPH() < s2.getPH()) {
                leastPH = s1;
            } else {
                leastPH = s2;
            }
        }

        if (leastPH.getPH() <= 6) {
            if (arm.getCurrentPos() < leastPH.getPos()) {
                if (!arm.isFacingRight()) {
                    arm.changeDirection();
                }
                arm.moveForward(leastPH.getPos() - arm.getCurrentPos());
            } else if (arm.getCurrentPos() > leastPH.getPos()) {
                if (arm.isFacingRight()) {
                    arm.changeDirection();
                }
                arm.moveForward(arm.getCurrentPos() - leastPH.getPos());
                arm.changeDirection();
            } else {
                if (!arm.isFacingRight()) {
                    arm.changeDirection();
                }
            }
            return leastPH.getPH();
        } else {
            reset();
            return -1;
        }
    }
}
