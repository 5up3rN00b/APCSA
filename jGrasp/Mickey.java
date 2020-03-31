public class Mickey extends CartoonCharacter {
   private String fingers;
   
   public static void main(String[] args) {
      System.out.println("M I C K E Y");
   }
   
   public Mickey(String f) {
      fingers = f;
   }
   
   public String getFingers() {
      return fingers;
   }
}