public class DayThree {
   public static void main(String[] args) {
      System.out.println(multiply(4,5));
      System.out.println(multiply(4.0, 5.0));
   }
   
   public static int multiply(int a, int b) {
      System.out.println("Integer");
      return a*b;
   }
   
   public static double multiply(double a, double b) {
      System.out.println("Double");
      return a*b;
   }
}