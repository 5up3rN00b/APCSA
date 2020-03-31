package Diag2020FRE.Diag2020FRE1;

public class MechanicalArm {
    private int currentPos;
    private boolean facesRight;

    public MechanicalArm() {
        currentPos = 0;
        facesRight = true;
    }

    public int getCurrentPos() {
        return currentPos;
    }

    public boolean isFacingRight() {
        return facesRight;
    }

    public void changeDirection() {
        facesRight = !facesRight;
    }

    public void moveForward(int numLocs) {
        if (facesRight) currentPos += numLocs;
        else currentPos -= numLocs;
    }
}
