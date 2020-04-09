package Practice22020.Practice22020FRE1;

import java.util.*;

public class WordSet {
    private int size;
    private ArrayList<String> words;

    public WordSet() {

    }

    public int size() {
        return size;
    }

    public void insert(String word) {
        boolean inside = false;
        for (int i = 0; i < size; i++) {
            if (words.get(i).equals(word)) {
                inside = true;
                break;
            }
        }

        if (!inside) {
            words.add(word);
            size++;
        }
    }

    public void remove(String word) {
        for (int i = 0; i < size; i++) {
            if (words.get(i).equals(word)) {
                words.remove(i);
                size--;
                break;
            }
        }
    }

    public String findkth(int k) {
        Collections.sort(words);
        return words.get(k);
    }

    public boolean contains(String word) {
        boolean inside = false;

        for (String s : words) {
            if (s.equals(word)) {
                inside = true;
                break;
            }
        }

        return inside;
    }
}
