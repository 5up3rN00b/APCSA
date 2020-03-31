public class Phrase {
   private String currentPhrase;
   
   public Phrase (String p) {
      currentPhrase = p;
   }
   
   public int findNthOccurrence(String str, int n) {
      int index = 0;
   
      for (int i = 0; i < n; i++) {
         index = currentPhrase.indexOf(str);
         if (index < 0) break;
      }
      
      return index;
   }
   
   public void replaceNthOccurrence (String str, int n, String repl) {
   	int index = findNthOccurrence(str, n);
      String tempPhrase = currentPhrase;
   	if (index >= 0) {
   		currentPhrase = tempPhrase.substring(0, index) + repl + tempPhrase.substring(index + str.length());
         // A cat ate lat
         // replaceNthOccurrence("at", 1, "rane");
         // index = 3;
         // 0 <-> 3-1 + repl + 5 <-> tempPhrase.length()-1
         // A c + rane +  ate late
         // A crane ate late
      }//  else if (index == 0) {
//       	currentPhrase = repl + tempPhrase.substring(str.length());
//       }
   }
   
   public int findLastOccurrence(String str) {
	   int index = 0;
	   int pastIndex = 0;
      String curtailedPhrase = currentPhrase;
   
      while (curtailedPhrase.indexOf(str) >= 0) {
      	index = curtailedPhrase.indexOf(str) + pastIndex;
         curtailedPhrase = currentPhrase.substring(index + str.length());
         index += str.length();
         pastIndex = index;
      }
      
      if (pastIndex == 0) return -1;
      else return pastIndex - str.length();
   }
   
   public String toString() {
      return currentPhrase;
   }
   
   public static void main(String[] args) {
      Phrase phrase1 = new Phrase("A cat ate late.");
      // phrase1.replaceNthOccurrence("at", 1, "rane");
      //  System.out.println(phrase1);
      System.out.println(phrase1.findLastOccurrence("at"));
      System.out.println(phrase1.findLastOccurrence("cat"));
      System.out.println(phrase1.findLastOccurrence("bat"));
      System.out.println(phrase1.findLastOccurrence("c"));
      String s = "A cat ate lat";
      System.out.println(s.substring(s.length()).length());
      System.out.println(s.substring(1, 1));
   }
}