import java.io.*;
import java.util.*;

public class DecemberTwentyFour {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new FileReader("input.txt"));
      PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      System.out.println(st.nextToken());
      System.out.println(st.nextToken());
   }
}