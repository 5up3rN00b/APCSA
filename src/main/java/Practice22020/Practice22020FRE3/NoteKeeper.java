package Practice22020.Practice22020FRE3;

import java.util.*;

public class NoteKeeper {
    private ArrayList<Note> noteList;

    public void printNotes() {
        for (int i = 0; i < noteList.size(); i++) {
            int listNum = i + 1;
            System.out.print(listNum + ". " + noteList.get(i).getNote());
        }
    }

    public void removeNotes(String str) {
        for (int i = 0; i < noteList.size(); i++) {
            if (noteList.get(i).getNote().indexOf(str) != -1) {
                noteList.remove(i);
                i--;
            }
        }
    }
}
