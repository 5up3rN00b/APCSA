package Practice22020.Practice22020FRE1;

public class Client {
    public static int countA(WordSet s) {
        int index = 0;
        while (s.findkth(index).indexOf("A") == 0) {
            index++;
        }

        return index;
    }

    public static void removeA(WordSet s) {
        int num = countA(s);
        for (int i = 0; i < num; i++) {
            String find = s.findkth(i);
            s.remove(find);
        }
    }
}
