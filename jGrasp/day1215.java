import java.util.*;

public class day1215 {
   public static void main(String[] args) {
      Integer i = new Integer(1);
      Integer j = i;
      System.out.println(j == i);
      
      i++;
      Integer k = i;
      System.out.println(j == k);

      System.out.println(i.intValue() + " i " + j.intValue() + " j " + k.intValue() + " k ");
   }
}