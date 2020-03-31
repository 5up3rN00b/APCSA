public class DayTwo {
   public static void main(String[] args) {
      CartoonCharacter clown = new CartoonCharacter("Hi", "Bye");
      clown.setName("It");
      System.out.println(clown.getName());
      Mickey mouse = new Mickey("4");
      mouse.setName("Mickey");
      System.out.println(mouse.getName());
      System.out.println(mouse.getFingers());
   }
}