import java.util.*;

public class Boxing {
   public static void main(String[] args) {
      Integer intOb1 = 4;
      Integer intOb2 = new Integer(4);
      System.out.println(intOb1 == intOb2);
      
      int primitive = 4;
      Integer intOb3 = 4;
      System.out.println(intOb3 == primitive);
      
      System.out.println(intOb1 == intOb2 && intOb3 == primitive);
   }
}