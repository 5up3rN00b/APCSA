package Diag2020FRE.Diag2020FRE3;

import java.util.Arrays;

public class Diag2020FRE3_Driver {
    public static void main(String[] args) {
        Sentence s = new Sentence("The cat sat on the mat.");
        System.out.println(s.getBlankPositions());
        System.out.println(Arrays.toString(s.getWords()));
    }
}
