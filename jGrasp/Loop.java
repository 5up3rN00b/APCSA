import java.util.*;

class MyList {
   private ArrayList<Integer> list = new ArrayList<Integer>();
   
   public MyList() {
      list.add(0);
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
   }
   
   public int size() {
      System.out.println("Called during iteration");
      return list.size();
   }
   
   public int get(int i) {
      return list.get(i);
   }
   
   public void remove(int i) {
      list.remove(i);
   }
}

public class Loop {
   public static void main(String[] args) {
      MyList l = new MyList();      
      
      for (int i = 0; i < l.size(); i++) {
         System.out.println("List Index Calling: " + i);
         
         if (i == 0) l.remove(i);
         else System.out.println("Term accessed: " + l.get(i));
      }
   }
}