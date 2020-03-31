import java.util.*;
import java.util.Scanner;
class DayOne {

}

public class Day0105 extends DayOne {
 
    public static void mystery(int n){
      if(n<=0)
         return;
      
      for(int i=0; i<n; i++){
         System.out.print("A");
      }
      
      mystery(n-1);
      
      for(int j=0; j<n; j++){
         System.out.print("B");
      }
       System.out.println();
    }
     public static void main(String args[]){
       mystery(4);
     }    
}
