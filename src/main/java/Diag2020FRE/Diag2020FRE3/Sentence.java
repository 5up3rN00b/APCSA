package Diag2020FRE.Diag2020FRE3;

import java.util.ArrayList;

public class Sentence {
    private String sentence;

    public Sentence(String sent) {
        sentence = sent;
    }

    public ArrayList<Integer> getBlankPositions() {
        int wordNum = countWords(), pastIndex = 0;
        ArrayList<Integer> blanks = new ArrayList<Integer>();
        String temp = sentence;
        for (int i = 0; i < wordNum - 1; i++) {
            int index = temp.indexOf(" ");
            blanks.add(index + pastIndex);
            temp = sentence.substring(index + pastIndex + 1);
            pastIndex += index + 1;
        }
        return blanks;
    }

    public int countWords() {
        return sentence.split(" ").length;
    }

    public String[] getWords() {
        int wordNum = countWords();
        ArrayList<Integer> blanks = getBlankPositions();
        String[] words = new String[wordNum];
        words[0] = sentence.substring(0, blanks.get(0));
        for (int i = 0; i < wordNum - 2; i++) {
            words[i + 1] = sentence.substring(blanks.get(i) + 1, blanks.get(i + 1));
        }
        words[wordNum - 1] = sentence.substring(blanks.get(wordNum - 2) + 1);
        return words;
    }
}
