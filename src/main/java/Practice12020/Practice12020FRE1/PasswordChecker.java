package Practice12020.Practice12020FRE1;

public class PasswordChecker {
    public static int numDigits(String s) {
        return 1; // stub
    }

    public static int numLetters(String s) {
        return 1; // stub
    }

    public static int numSymbols(String s) {
        return s.length() - numDigits(s) - numLetters(s);
    }

    public static String passwordStrength(String p) {
        int letters = numLetters(p), numbers = numDigits(p), symbols = numSymbols(p), characters = p.length();

        if (characters >= 8) {
            if (letters >= 1 && numbers >= 1 && symbols >= 1) {
                return "strong";
            } else {
                return "medium";
            }
        } else if (characters >= 5) {
            if (symbols >= 1) {
                return "medium";
            } else {
                return "weak";
            }
        } else {
            return "weak";
        }
    }
}
