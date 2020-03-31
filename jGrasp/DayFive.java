import java.util.*;
import java.io.*;

public class DayFive {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new FileReader("input.txt"));
      PrintWriter pw = new PrintWriter(new PrintWriter("output.txt"));
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      String[] strArray = new String[8];
      for (int i = 0; i < 8; i++) {
         strArray[i] = st.nextToken();
      }
      
      for (int i = 1; i <= 100; i++) {
         for (int j = 0; j < i - 1; j++) {
            pw.print("-");
         }
         
         pw.println("-");
      }

      for (int i = 99; i > 0; i--) {
         for (int j = 0; j < i - 1; j++) {
            pw.print("*");
         }
         
         pw.println("*");
      }
      
      pw.close();
   }
}